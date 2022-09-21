package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullDeclGroup extends StObject {
  
  /* private */ var _decls: Any
  
  def addDecl(decl: PullDecl): Unit
  
  def getDecls(): js.Array[PullDecl]
  
  var name: String
}
object PullDeclGroup {
  
  inline def apply(_decls: Any, addDecl: PullDecl => Unit, getDecls: () => js.Array[PullDecl], name: String): PullDeclGroup = {
    val __obj = js.Dynamic.literal(_decls = _decls.asInstanceOf[js.Any], addDecl = js.Any.fromFunction1(addDecl), getDecls = js.Any.fromFunction0(getDecls), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullDeclGroup]
  }
  
  extension [Self <: PullDeclGroup](x: Self) {
    
    inline def setAddDecl(value: PullDecl => Unit): Self = StObject.set(x, "addDecl", js.Any.fromFunction1(value))
    
    inline def setGetDecls(value: () => js.Array[PullDecl]): Self = StObject.set(x, "getDecls", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def set_decls(value: Any): Self = StObject.set(x, "_decls", value.asInstanceOf[js.Any])
  }
}
