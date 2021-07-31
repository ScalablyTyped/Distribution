package typings.typescriptServices.global.TypeScript.Services

import typings.typescriptServices.TypeScript.PullDecl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.DeclReferenceCompletionEntry")
@js.native
class DeclReferenceCompletionEntry protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.DeclReferenceCompletionEntry {
  def this(name: String, kind: String, kindModifiers: String, decl: PullDecl) = this()
  
  /* CompleteClass */
  var decl: PullDecl = js.native
  
  /* CompleteClass */
  var docComment: String = js.native
  
  /* CompleteClass */
  var fullSymbolName: String = js.native
  
  /* CompleteClass */
  var hasBeenResolved: js.Any = js.native
  
  /* CompleteClass */
  override def isResolved(): Boolean = js.native
  
  /* CompleteClass */
  var kind: String = js.native
  
  /* CompleteClass */
  var kindModifiers: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  override def resolve(`type`: String, fullSymbolName: String, docComments: String): Unit = js.native
  
  /* CompleteClass */
  var `type`: String = js.native
}
