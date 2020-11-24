package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.BlockStatement
import typings.vueCompilerCore.mod.ExpressionNode
import typings.vueCompilerCore.mod.IfStatement
import typings.vueCompilerCore.mod.ReturnStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createIfStatement")
@js.native
object createIfStatement extends js.Object {
  
  def apply(test: ExpressionNode, consequent: BlockStatement): IfStatement = js.native
  def apply(test: ExpressionNode, consequent: BlockStatement, alternate: BlockStatement): IfStatement = js.native
  def apply(test: ExpressionNode, consequent: BlockStatement, alternate: IfStatement): IfStatement = js.native
  def apply(test: ExpressionNode, consequent: BlockStatement, alternate: ReturnStatement): IfStatement = js.native
}
