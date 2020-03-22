package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ConditionalExpression
import typings.typescript.mod.Expression
import typings.typescript.mod.SyntaxKind.ColonToken
import typings.typescript.mod.SyntaxKind.QuestionToken
import typings.typescript.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateConditional")
@js.native
object updateConditional extends js.Object {
  def apply(
    node: ConditionalExpression,
    condition: Expression,
    questionToken: Token[QuestionToken],
    whenTrue: Expression,
    colonToken: Token[ColonToken],
    whenFalse: Expression
  ): ConditionalExpression = js.native
}

