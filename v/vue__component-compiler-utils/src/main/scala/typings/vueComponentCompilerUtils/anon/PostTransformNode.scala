package typings.vueComponentCompilerUtils.anon

import typings.vueComponentCompilerUtils.utilsMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostTransformNode extends js.Object {
  def postTransformNode(node: ASTNode): Unit
}

object PostTransformNode {
  @scala.inline
  def apply(postTransformNode: ASTNode => Unit): PostTransformNode = {
    val __obj = js.Dynamic.literal(postTransformNode = js.Any.fromFunction1(postTransformNode))
    __obj.asInstanceOf[PostTransformNode]
  }
}

