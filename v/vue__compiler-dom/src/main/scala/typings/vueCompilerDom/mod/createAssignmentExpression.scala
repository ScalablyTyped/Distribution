package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.AssignmentExpression
import typings.vueCompilerCore.mod.JSChildNode
import typings.vueCompilerCore.mod.SimpleExpressionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createAssignmentExpression")
@js.native
object createAssignmentExpression extends js.Object {
  
  def apply(left: SimpleExpressionNode, right: JSChildNode): AssignmentExpression = js.native
}
