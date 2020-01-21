package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalExpression extends Expression {
  var colonToken: ColonToken = js.native
  var condition: Expression = js.native
  @JSName("kind")
  var kind_ConditionalExpression: typings.typescript.mod.SyntaxKind.ConditionalExpression = js.native
  var questionToken: QuestionToken = js.native
  var whenFalse: Expression = js.native
  var whenTrue: Expression = js.native
}

