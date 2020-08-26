package typings.vueComponentCompilerUtils.anon

import typings.vueComponentCompilerUtils.utilsMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostTransformNode extends js.Object {
  def postTransformNode(node: ASTNode): Unit = js.native
}

object PostTransformNode {
  @scala.inline
  def apply(postTransformNode: ASTNode => Unit): PostTransformNode = {
    val __obj = js.Dynamic.literal(postTransformNode = js.Any.fromFunction1(postTransformNode))
    __obj.asInstanceOf[PostTransformNode]
  }
  @scala.inline
  implicit class PostTransformNodeOps[Self <: PostTransformNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPostTransformNode(value: ASTNode => Unit): Self = this.set("postTransformNode", js.Any.fromFunction1(value))
  }
  
}

