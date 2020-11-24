package typings.twineSugarcube.macroMod

import typings.twineSugarcube.extensionsMod.global.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MacroTags extends js.Object {
  
  /**
    * Return the named macro tag's parents array (includes the names of all macros who have registered the tag as a
    * child), or null on failure.
    * @param name Name of the macro tag whose parents array should be returned.
    * @since 2.0.0
    * @example
    * Macro.tags.get("else") // For the standard library, returns: ["if"]
    */
  def get(name: String): Array[String] = js.native
  
  /**
    * Returns whether the named macro tag exists.
    * @param name Name of the macro tag to search for.
    * @since 2.0.0
    */
  def has(name: String): Boolean = js.native
}
object MacroTags {
  
  @scala.inline
  def apply(get: String => Array[String], has: String => Boolean): MacroTags = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[MacroTags]
  }
  
  @scala.inline
  implicit class MacroTagsOps[Self <: MacroTags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: String => Array[String]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
  }
}
