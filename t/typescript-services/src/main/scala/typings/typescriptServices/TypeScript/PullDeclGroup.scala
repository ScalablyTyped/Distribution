package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullDeclGroup extends js.Object {
  
  var _decls: js.Any = js.native
  
  def addDecl(decl: PullDecl): Unit = js.native
  
  def getDecls(): js.Array[PullDecl] = js.native
  
  var name: String = js.native
}
object PullDeclGroup {
  
  @scala.inline
  def apply(_decls: js.Any, addDecl: PullDecl => Unit, getDecls: () => js.Array[PullDecl], name: String): PullDeclGroup = {
    val __obj = js.Dynamic.literal(_decls = _decls.asInstanceOf[js.Any], addDecl = js.Any.fromFunction1(addDecl), getDecls = js.Any.fromFunction0(getDecls), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullDeclGroup]
  }
  
  @scala.inline
  implicit class PullDeclGroupOps[Self <: PullDeclGroup] (val x: Self) extends AnyVal {
    
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
    def set_decls(value: js.Any): Self = this.set("_decls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddDecl(value: PullDecl => Unit): Self = this.set("addDecl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDecls(value: () => js.Array[PullDecl]): Self = this.set("getDecls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
