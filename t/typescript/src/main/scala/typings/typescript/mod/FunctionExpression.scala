package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionExpression
  extends PrimaryExpression
     with FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with SignatureDeclaration
     with _HasJSDoc {
  
  @JSName("body")
  val body_FunctionExpression: FunctionBody = js.native
  
  @JSName("kind")
  val kind_FunctionExpression: typings.typescript.mod.SyntaxKind.FunctionExpression = js.native
  
  @JSName("name")
  val name_FunctionExpression: js.UndefOr[Identifier] = js.native
}
