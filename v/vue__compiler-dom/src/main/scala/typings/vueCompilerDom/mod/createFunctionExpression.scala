package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.ExpressionNode
import typings.vueCompilerCore.mod.FunctionExpression
import typings.vueCompilerCore.mod.JSChildNode
import typings.vueCompilerCore.mod.SourceLocation
import typings.vueCompilerCore.mod.TemplateChildNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createFunctionExpression")
@js.native
object createFunctionExpression extends js.Object {
  
  def apply(
    params: js.UndefOr[ExpressionNode | String | (js.Array[ExpressionNode | String])],
    returns: js.UndefOr[TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode],
    newline: js.UndefOr[Boolean],
    isSlot: js.UndefOr[Boolean],
    loc: js.UndefOr[SourceLocation]
  ): FunctionExpression = js.native
}
