package typings
package atVueComponentDashCompilerDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node extends js.Object {
  def postTransformNode(node: atVueComponentDashCompilerDashUtilsLib.distTemplateCompilerModulesUtilsMod.ASTNode): scala.Unit
}

object Anon_Node {
  @scala.inline
  def apply(
    postTransformNode: js.Function1[
      atVueComponentDashCompilerDashUtilsLib.distTemplateCompilerModulesUtilsMod.ASTNode, 
      scala.Unit
    ]
  ): Anon_Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("postTransformNode")(postTransformNode)
    __obj.asInstanceOf[Anon_Node]
  }
}

