package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeOptions extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.native
  var legalNodes: js.Array[String] = js.native
  var name: String = js.native
  var text: js.UndefOr[String] = js.native
  var topLevel: js.UndefOr[Boolean] = js.native
}

object NodeOptions {
  @scala.inline
  def apply(legalNodes: js.Array[String], name: String): NodeOptions = {
    val __obj = js.Dynamic.literal(legalNodes = legalNodes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOptions]
  }
  @scala.inline
  implicit class NodeOptionsOps[Self <: NodeOptions] (val x: Self) extends AnyVal {
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
    def setLegalNodesVarargs(value: String*): Self = this.set("legalNodes", js.Array(value :_*))
    @scala.inline
    def setLegalNodes(value: js.Array[String]): Self = this.set("legalNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTopLevel(value: Boolean): Self = this.set("topLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopLevel: Self = this.set("topLevel", js.undefined)
  }
  
}

