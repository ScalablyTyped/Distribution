package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.ConditionalExpression
import typings.vueCompilerCore.mod.JSChildNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createConditionalExpression")
@js.native
object createConditionalExpression extends js.Object {
  
  def apply(test: JSChildNode, consequent: JSChildNode, alternate: JSChildNode): ConditionalExpression = js.native
  def apply(test: JSChildNode, consequent: JSChildNode, alternate: JSChildNode, newline: Boolean): ConditionalExpression = js.native
}
