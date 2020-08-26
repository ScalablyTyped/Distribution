package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogNodesVisited. */
@js.native
trait DialogNodesVisited extends js.Object {
  /** The conditions that trigger the dialog node. */
  var conditions: js.UndefOr[String] = js.native
  /** A dialog node that was triggered during processing of the input message. */
  var dialog_node: js.UndefOr[String] = js.native
  /** The title of the dialog node. */
  var title: js.UndefOr[String] = js.native
}

object DialogNodesVisited {
  @scala.inline
  def apply(): DialogNodesVisited = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogNodesVisited]
  }
  @scala.inline
  implicit class DialogNodesVisitedOps[Self <: DialogNodesVisited] (val x: Self) extends AnyVal {
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
    def setConditions(value: String): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setDialog_node(value: String): Self = this.set("dialog_node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialog_node: Self = this.set("dialog_node", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

