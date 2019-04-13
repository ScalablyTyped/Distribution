package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalExpression extends Expression {
  var colonToken: ColonToken = js.native
  var condition: Expression = js.native
  var questionToken: QuestionToken = js.native
  var whenFalse: Expression = js.native
  var whenTrue: Expression = js.native
}

