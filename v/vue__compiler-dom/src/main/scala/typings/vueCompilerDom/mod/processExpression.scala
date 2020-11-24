package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.ExpressionNode
import typings.vueCompilerCore.mod.SimpleExpressionNode
import typings.vueCompilerCore.mod.TransformContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "processExpression")
@js.native
object processExpression extends js.Object {
  
  def apply(node: SimpleExpressionNode, context: TransformContext): ExpressionNode = js.native
  def apply(
    node: SimpleExpressionNode,
    context: TransformContext,
    asParams: js.UndefOr[scala.Nothing],
    asRawStatements: Boolean
  ): ExpressionNode = js.native
  def apply(node: SimpleExpressionNode, context: TransformContext, asParams: Boolean): ExpressionNode = js.native
  def apply(node: SimpleExpressionNode, context: TransformContext, asParams: Boolean, asRawStatements: Boolean): ExpressionNode = js.native
}
