package typings.vueComponentCompilerUtils

import typings.vueComponentCompilerUtils.utilsMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPostTransformNode extends js.Object {
  def postTransformNode(node: ASTNode): Unit
}

object AnonPostTransformNode {
  @scala.inline
  def apply(postTransformNode: ASTNode => Unit): AnonPostTransformNode = {
    val __obj = js.Dynamic.literal(postTransformNode = js.Any.fromFunction1(postTransformNode))
  
    __obj.asInstanceOf[AnonPostTransformNode]
  }
}

