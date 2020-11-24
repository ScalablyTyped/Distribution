package typings.vueCompilerCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-core", "createIfStatement")
@js.native
object createIfStatement extends js.Object {
  
  def apply(test: ExpressionNode, consequent: BlockStatement): IfStatement = js.native
  def apply(
    test: ExpressionNode,
    consequent: BlockStatement,
    alternate: js.UndefOr[IfStatement | BlockStatement | ReturnStatement]
  ): IfStatement = js.native
}
