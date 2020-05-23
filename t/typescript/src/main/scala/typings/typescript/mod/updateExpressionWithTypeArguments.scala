package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateExpressionWithTypeArguments")
@js.native
object updateExpressionWithTypeArguments extends js.Object {
  def apply(
    node: ExpressionWithTypeArguments,
    typeArguments: js.UndefOr[js.Array[TypeNode]],
    expression: Expression
  ): ExpressionWithTypeArguments = js.native
}

