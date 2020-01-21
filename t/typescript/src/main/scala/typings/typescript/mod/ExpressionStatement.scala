package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionStatement
  extends Statement
     with JSDocContainer
     with _HasJSDoc {
  var expression: Expression = js.native
  @JSName("kind")
  var kind_ExpressionStatement: typings.typescript.mod.SyntaxKind.ExpressionStatement = js.native
}

