package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateExpressionWithTypeArguments")
@js.native
object updateExpressionWithTypeArguments extends js.Object {
  
  def apply(
    node: ExpressionWithTypeArguments,
    typeArguments: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExpressionWithTypeArguments = js.native
  /** @deprecated Use `factory.updateExpressionWithTypeArguments` or the factory supplied by your transformation context instead. */
  def apply(node: ExpressionWithTypeArguments, typeArguments: js.Array[TypeNode], expression: Expression): ExpressionWithTypeArguments = js.native
}
