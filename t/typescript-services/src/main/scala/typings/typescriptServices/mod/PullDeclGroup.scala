package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PullDeclGroup")
@js.native
class PullDeclGroup protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.PullDeclGroup {
  def this(name: String) = this()
  
  /* CompleteClass */
  var _decls: js.Any = js.native
  
  /* CompleteClass */
  override def addDecl(decl: typings.typescriptServices.TypeScript.PullDecl): Unit = js.native
  
  /* CompleteClass */
  override def getDecls(): js.Array[typings.typescriptServices.TypeScript.PullDecl] = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
