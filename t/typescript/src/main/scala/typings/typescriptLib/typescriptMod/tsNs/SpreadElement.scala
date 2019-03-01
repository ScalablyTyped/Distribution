package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadElement
  extends Expression
     with _BindingOrAssignmentElement
     with _BindingOrAssignmentElementRestIndicator {
  var expression: Expression = js.native
  @JSName("parent")
  var parent_SpreadElement: ArrayLiteralExpression | CallExpression | NewExpression = js.native
}

