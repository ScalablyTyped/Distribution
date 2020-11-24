package typings.twineSugarcube.macroMod

import typings.twineSugarcube.extensionsMod.global.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MacroDefinition extends js.Object {
  
  def handler(): Unit = js.native
  
  var skipArgs: js.UndefOr[Boolean] = js.native
  
  var tags: js.UndefOr[Array[String]] = js.native
}
object MacroDefinition {
  
  @scala.inline
  def apply(handler: () => Unit): MacroDefinition = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction0(handler))
    __obj.asInstanceOf[MacroDefinition]
  }
  
  @scala.inline
  implicit class MacroDefinitionOps[Self <: MacroDefinition] (val x: Self) extends AnyVal {
    
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
    def setHandler(value: () => Unit): Self = this.set("handler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSkipArgs(value: Boolean): Self = this.set("skipArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipArgs: Self = this.set("skipArgs", js.undefined)
    
    @scala.inline
    def setTags(value: Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
