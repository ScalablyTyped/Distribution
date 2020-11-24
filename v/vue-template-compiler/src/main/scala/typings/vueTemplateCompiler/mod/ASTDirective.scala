package typings.vueTemplateCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASTDirective extends js.Object {
  
  var arg: js.UndefOr[String] = js.native
  
  var modifiers: js.UndefOr[ASTModifiers] = js.native
  
  var name: String = js.native
  
  var rawName: String = js.native
  
  var value: String = js.native
}
object ASTDirective {
  
  @scala.inline
  def apply(name: String, rawName: String, value: String): ASTDirective = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTDirective]
  }
  
  @scala.inline
  implicit class ASTDirectiveOps[Self <: ASTDirective] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawName(value: String): Self = this.set("rawName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArg(value: String): Self = this.set("arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArg: Self = this.set("arg", js.undefined)
    
    @scala.inline
    def setModifiers(value: ASTModifiers): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
  }
}
