package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullDeclGroup extends StObject {
  
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
  implicit class PullDeclGroupMutableBuilder[Self <: PullDeclGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddDecl(value: PullDecl => Unit): Self = StObject.set(x, "addDecl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDecls(value: () => js.Array[PullDecl]): Self = StObject.set(x, "getDecls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_decls(value: js.Any): Self = StObject.set(x, "_decls", value.asInstanceOf[js.Any])
  }
}
