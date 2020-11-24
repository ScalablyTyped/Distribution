package typings.twineSugarcube.macroMod

import typings.twineSugarcube.extensionsMod.global.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MacroAPI extends js.Object {
  
  /**
    * Add new macro(s).
    * @param name Name, or array of names, of the macro(s) to add.
    * @param definition Definition of the macro(s) or the name of an existing macro whose definition to copy.
    * Definition object:
    * A macro definition object should have some of the following properties (only handler is absolutely required):
    * skipArgs: (optional, boolean) Disables parsing argument strings into discrete arguments. Used by macros which
    * only use the raw/full argument strings.
    * tags: (optional, null | string array) Signifies that the macro is a container macro—i.e. not self-closing. An
    * array of the names of the child tags, or null if there are no child tags.
    * handler: (function) The macro's main function. It will be called without arguments, but with its this set to a
    * macro context object.
    * @param deep Enables deep cloning of the definition. Used to give macros separate instances of the same
    * definition.
    * @since 2.0.0
    * @example
    * // Example of a very simple/naive <<if>>/<<elseif>>/<<else>> macro implementation.
    * Macro.add('if', {
    *    skipArgs: true,
    *    tags: ['elseif', 'else'],
    *    handler: function () {
    *        try {
    *            for (var i = 0, len = this.payload.length; i < len; ++i) {
    *                if (
    *                    this.payload[i].name === 'else' ||
    *                    !!Scripting.evalJavaScript(this.payload[i].args.full)
    *                ) {
    *                    jQuery(this.output).wiki(this.payload[i].contents);
    *                    break;
    *                }
    *            }
    *        }
    *        catch (ex) {
    *            return this.error('bad conditional expression: ' + ex.message);
    *        }
    *    }
    * });
    */
  def add(name: String, definition: MacroDefinition): Unit = js.native
  def add(name: String, definition: MacroDefinition, deep: Boolean): Unit = js.native
  def add(name: Array[String], definition: MacroDefinition): Unit = js.native
  def add(name: Array[String], definition: MacroDefinition, deep: Boolean): Unit = js.native
  
  /**
    * Remove existing macro(s).
    * @param name Name, or array of names, of the macro(s) to remove.
    * @since 2.0.0
    */
  def delete(name: String): Unit = js.native
  def delete(name: Array[String]): Unit = js.native
  
  /**
    * Return the named macro definition, or null on failure.
    * @param name Name of the macro whose definition should be returned.
    * @since 2.0.0
    */
  def get(name: String): MacroDefinition = js.native
  
  /**
    * Returns whether the named macro exists.
    * @param name Name of the macro to search for.
    * @since 2.0.0
    */
  def has(name: String): Boolean = js.native
  
  /**
    * @since 2.0.0
    */
  var tags: MacroTags = js.native
}
