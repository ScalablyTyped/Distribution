package typings.vueComponentCompilerUtils

import typings.vueComponentCompilerUtils.utilsMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNode extends js.Object {
  def postTransformNode(node: ASTNode): Unit
}

object AnonNode {
  @scala.inline
  def apply(postTransformNode: ASTNode => Unit): AnonNode = {
    val __obj = js.Dynamic.literal(postTransformNode = js.Any.fromFunction1(postTransformNode))
  
    __obj.asInstanceOf[AnonNode]
  }
}

