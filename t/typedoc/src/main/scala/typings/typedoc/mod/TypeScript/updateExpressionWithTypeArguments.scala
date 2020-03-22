package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.ExpressionWithTypeArguments
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateExpressionWithTypeArguments")
@js.native
object updateExpressionWithTypeArguments extends js.Object {
  def apply(
    node: ExpressionWithTypeArguments,
    typeArguments: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExpressionWithTypeArguments = js.native
  def apply(node: ExpressionWithTypeArguments, typeArguments: js.Array[TypeNode], expression: Expression): ExpressionWithTypeArguments = js.native
}

