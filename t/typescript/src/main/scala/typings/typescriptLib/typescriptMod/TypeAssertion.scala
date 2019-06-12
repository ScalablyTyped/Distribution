package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeAssertion
  extends UnaryExpression
     with AssertionExpression {
  var expression: UnaryExpression = js.native
  @JSName("kind")
  var kind_TypeAssertion: typescriptLib.typescriptMod.SyntaxKind.TypeAssertionExpression = js.native
  var `type`: TypeNode = js.native
}

