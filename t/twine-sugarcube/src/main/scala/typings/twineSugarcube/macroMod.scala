package typings.twineSugarcube

import typings.std.HTMLElement
import typings.twineSugarcube.extensionsMod.global.Array
import typings.twineSugarcube.twineSugarcubeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macroMod {
  
  @js.native
  trait MacroAPI extends StObject {
    
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
  
  @js.native
  trait MacroArgsArray
    extends StObject
       with Array[js.Any] {
    
    /**
      * The current tag's argument string after converting all TwineScript syntax elements into their
      * native JavaScript counterparts. Equivalent in function to <MacroContext>.args.full.
      */
    var full: String = js.native
    
    /**
      * The current tag's unprocessed argument string. Equivalent in function to <MacroContext>.args.raw.
      */
    var raw: String = js.native
  }
  
  trait MacroContext extends StObject {
    
    /**
      * The argument string parsed into an array of discrete arguments.
      * @since 2.0.0
      */
    var args: MacroArgsArray
    
    /**
      * Returns whether any of the macro's ancestors passed the test implemented by the given
      * filter function.
      * @param filter he function used to test each ancestor execution context object, which
      * is passed in as its sole parameter.
      * @since 2.0.0
      */
    def contextHas(filter: js.Function1[/* context */ MacroContextObject, Boolean]): Boolean
    
    /**
      * Returns the first of the macro's ancestors which passed the test implemented by the given
      * filter function or null, if no members pass.
      * @param filter The function used to test each ancestor execution context object, which is
      * passed in as its sole parameter.
      * @since 2.0.0
      */
    def contextSelect(filter: js.Function1[/* context */ MacroContextObject, Boolean]): js.Object
    
    /**
      * Returns a new array containing all of the macro's ancestors which passed the test implemented
      * by the given filter function or an empty array, if no members pass.
      * @since 2.0.0
      * @param filter
      */
    def contextSelectAll(filter: js.Function1[/* context */ MacroContextObject, Boolean]): Array[js.Object]
    
    /**
      * Renders the message prefixed with the name of the macro and returns false.
      * @param message The error message to output.
      * @since 2.0.0
      */
    def error(message: String): `false`
    
    /**
      * The name of the macro.
      * @since 2.0.0
      */
    var name: String
    
    /**
      * The current output element.
      * @since 2.0.0
      */
    var output: HTMLElement
    
    /**
      * The (execution) context object of the macro's parent, or null if the macro has no parent.
      * @since 2.0.0
      */
    var parent: js.Object
    
    /**
      * The text of a container macro parsed into discrete payload objects by tag.
      * @since 2.0.0
      */
    var payload: Array[MacroContextObject]
    
    /**
      * The macro's definition — created via @see Macro.add()
      * @since 2.0.0
      */
    var self: js.Object
  }
  object MacroContext {
    
    inline def apply(
      args: MacroArgsArray,
      contextHas: js.Function1[/* context */ MacroContextObject, Boolean] => Boolean,
      contextSelect: js.Function1[/* context */ MacroContextObject, Boolean] => js.Object,
      contextSelectAll: js.Function1[/* context */ MacroContextObject, Boolean] => Array[js.Object],
      error: String => `false`,
      name: String,
      output: HTMLElement,
      parent: js.Object,
      payload: Array[MacroContextObject],
      self: js.Object
    ): MacroContext = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], contextHas = js.Any.fromFunction1(contextHas), contextSelect = js.Any.fromFunction1(contextSelect), contextSelectAll = js.Any.fromFunction1(contextSelectAll), error = js.Any.fromFunction1(error), name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
      __obj.asInstanceOf[MacroContext]
    }
    
    extension [Self <: MacroContext](x: Self) {
      
      inline def setArgs(value: MacroArgsArray): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setContextHas(value: js.Function1[/* context */ MacroContextObject, Boolean] => Boolean): Self = StObject.set(x, "contextHas", js.Any.fromFunction1(value))
      
      inline def setContextSelect(value: js.Function1[/* context */ MacroContextObject, Boolean] => js.Object): Self = StObject.set(x, "contextSelect", js.Any.fromFunction1(value))
      
      inline def setContextSelectAll(value: js.Function1[/* context */ MacroContextObject, Boolean] => Array[js.Object]): Self = StObject.set(x, "contextSelectAll", js.Any.fromFunction1(value))
      
      inline def setError(value: String => `false`): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: HTMLElement): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setParent(value: js.Object): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Array[MacroContextObject]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setSelf(value: js.Object): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    }
  }
  
  trait MacroContextObject extends StObject {
    
    /**
      * The current tag's argument string parsed into an array of discrete arguments.
      * Equivalent in function to <MacroContext>.args.
      */
    var args: MacroArgsArray
    
    /**
      * The current tag's contents — i.e. the text between the current tag and the next.
      */
    var contents: String
    
    /**
      * Name of the current tag.
      */
    var name: String
  }
  object MacroContextObject {
    
    inline def apply(args: MacroArgsArray, contents: String, name: String): MacroContextObject = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MacroContextObject]
    }
    
    extension [Self <: MacroContextObject](x: Self) {
      
      inline def setArgs(value: MacroArgsArray): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MacroDefinition extends StObject {
    
    def handler(): Unit
    
    var skipArgs: js.UndefOr[Boolean] = js.undefined
    
    var tags: js.UndefOr[Array[String]] = js.undefined
  }
  object MacroDefinition {
    
    inline def apply(handler: () => Unit): MacroDefinition = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction0(handler))
      __obj.asInstanceOf[MacroDefinition]
    }
    
    extension [Self <: MacroDefinition](x: Self) {
      
      inline def setHandler(value: () => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction0(value))
      
      inline def setSkipArgs(value: Boolean): Self = StObject.set(x, "skipArgs", value.asInstanceOf[js.Any])
      
      inline def setSkipArgsUndefined: Self = StObject.set(x, "skipArgs", js.undefined)
      
      inline def setTags(value: Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait MacroTags extends StObject {
    
    /**
      * Return the named macro tag's parents array (includes the names of all macros who have registered the tag as a
      * child), or null on failure.
      * @param name Name of the macro tag whose parents array should be returned.
      * @since 2.0.0
      * @example
      * Macro.tags.get("else") // For the standard library, returns: ["if"]
      */
    def get(name: String): Array[String]
    
    /**
      * Returns whether the named macro tag exists.
      * @param name Name of the macro tag to search for.
      * @since 2.0.0
      */
    def has(name: String): Boolean
  }
  object MacroTags {
    
    inline def apply(get: String => Array[String], has: String => Boolean): MacroTags = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[MacroTags]
    }
    
    extension [Self <: MacroTags](x: Self) {
      
      inline def setGet(value: String => Array[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    }
  }
}
