package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowFunction
  extends FunctionLikeDeclarationBase
     with Expression
     with FunctionLikeDeclaration
     with SignatureDeclaration
     with _HasJSDoc {
  
  @JSName("body")
  val body_ArrowFunction: ConciseBody = js.native
  
  val equalsGreaterThanToken: EqualsGreaterThanToken = js.native
  
  @JSName("kind")
  val kind_ArrowFunction: typings.typescript.mod.SyntaxKind.ArrowFunction = js.native
}
