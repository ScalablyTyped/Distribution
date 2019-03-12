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
    postTransformNode: atVueComponentDashCompilerDashUtilsLib.distTemplateCompilerModulesUtilsMod.ASTNode => scala.Unit
  ): Anon_Node = {
    val __obj = js.Dynamic.literal(postTransformNode = js.Any.fromFunction1(postTransformNode))
  
    __obj.asInstanceOf[Anon_Node]
  }
}

