package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParenthesizedExpression
  extends PrimaryExpression
     with JSDocContainer
     with _HasJSDoc {
  
  val expression: Expression = js.native
  
  @JSName("kind")
  val kind_ParenthesizedExpression: typings.typescript.mod.SyntaxKind.ParenthesizedExpression = js.native
}
