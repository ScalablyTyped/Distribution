package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.CompoundExpressionNode
import typings.vueCompilerCore.mod.InterpolationNode
import typings.vueCompilerCore.mod.SimpleExpressionNode
import typings.vueCompilerCore.mod.SourceLocation
import typings.vueCompilerCore.mod.TextNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createCompoundExpression")
@js.native
object createCompoundExpression extends js.Object {
  
  def apply(
    children: js.Array[
      SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ]
  ): CompoundExpressionNode = js.native
  def apply(
    children: js.Array[
      SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ],
    loc: SourceLocation
  ): CompoundExpressionNode = js.native
}
