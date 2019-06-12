package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrefixUnaryExpression extends UpdateExpression {
  @JSName("kind")
  var kind_PrefixUnaryExpression: typescriptLib.typescriptMod.SyntaxKind.PrefixUnaryExpression = js.native
  var operand: UnaryExpression = js.native
  var operator: PrefixUnaryOperator = js.native
}

