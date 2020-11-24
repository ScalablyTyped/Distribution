package typings.twineSugarcube.macroMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MacroContextObject extends js.Object {
  
  /**
    * The current tag's argument string parsed into an array of discrete arguments.
    * Equivalent in function to <MacroContext>.args.
    */
  var args: MacroArgsArray = js.native
  
  /**
    * The current tag's contents — i.e. the text between the current tag and the next.
    */
  var contents: String = js.native
  
  /**
    * Name of the current tag.
    */
  var name: String = js.native
}
object MacroContextObject {
  
  @scala.inline
  def apply(args: MacroArgsArray, contents: String, name: String): MacroContextObject = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacroContextObject]
  }
  
  @scala.inline
  implicit class MacroContextObjectOps[Self <: MacroContextObject] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: MacroArgsArray): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContents(value: String): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
