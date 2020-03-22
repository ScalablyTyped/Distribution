package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.ExpressionWithTypeArguments
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createExpressionWithTypeArguments")
@js.native
object createExpressionWithTypeArguments extends js.Object {
  def apply(typeArguments: js.UndefOr[scala.Nothing], expression: Expression): ExpressionWithTypeArguments = js.native
  def apply(typeArguments: js.Array[TypeNode], expression: Expression): ExpressionWithTypeArguments = js.native
}

