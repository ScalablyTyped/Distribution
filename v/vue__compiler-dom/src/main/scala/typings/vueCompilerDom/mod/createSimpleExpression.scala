package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.SimpleExpressionNode
import typings.vueCompilerCore.mod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createSimpleExpression")
@js.native
object createSimpleExpression extends js.Object {
  
  def apply(content: String, isStatic: Boolean): SimpleExpressionNode = js.native
  def apply(content: String, isStatic: Boolean, loc: js.UndefOr[scala.Nothing], isConstant: Boolean): SimpleExpressionNode = js.native
  def apply(content: String, isStatic: Boolean, loc: SourceLocation): SimpleExpressionNode = js.native
  def apply(content: String, isStatic: Boolean, loc: SourceLocation, isConstant: Boolean): SimpleExpressionNode = js.native
}
