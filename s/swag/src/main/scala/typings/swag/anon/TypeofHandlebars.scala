package typings.swag.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHandlebars extends js.Object {
  
  val AST: js.Any = js.native
  
  val Utils: js.Any = js.native
  
  val VM: js.Any = js.native
}
object TypeofHandlebars {
  
  @scala.inline
  def apply(AST: js.Any, Utils: js.Any, VM: js.Any): TypeofHandlebars = {
    val __obj = js.Dynamic.literal(AST = AST.asInstanceOf[js.Any], Utils = Utils.asInstanceOf[js.Any], VM = VM.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofHandlebars]
  }
  
  @scala.inline
  implicit class TypeofHandlebarsOps[Self <: TypeofHandlebars] (val x: Self) extends AnyVal {
    
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
    def setAST(value: js.Any): Self = this.set("AST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtils(value: js.Any): Self = this.set("Utils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVM(value: js.Any): Self = this.set("VM", value.asInstanceOf[js.Any])
  }
}
