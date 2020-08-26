package typings.vueComponentCompilerUtils.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTNode extends js.Object {
  var attrs: js.Array[Attr] = js.native
  var tag: String = js.native
}

object ASTNode {
  @scala.inline
  def apply(attrs: js.Array[Attr], tag: String): ASTNode = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  implicit class ASTNodeOps[Self <: ASTNode] (val x: Self) extends AnyVal {
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
    def setAttrsVarargs(value: Attr*): Self = this.set("attrs", js.Array(value :_*))
    @scala.inline
    def setAttrs(value: js.Array[Attr]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
  
}

