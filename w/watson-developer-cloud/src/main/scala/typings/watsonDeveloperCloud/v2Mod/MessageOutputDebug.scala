package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Additional detailed information about a message response and how it was generated. */
@js.native
trait MessageOutputDebug extends js.Object {
  /** Assistant sets this to true when this message response concludes or interrupts a dialog. */
  var branch_exited: js.UndefOr[Boolean] = js.native
  /** When `branch_exited` is set to `true` by the Assistant, the `branch_exited_reason` specifies whether the dialog completed by itself or got interrupted. */
  var branch_exited_reason: js.UndefOr[String] = js.native
  /** An array of up to 50 messages logged with the request. */
  var log_messages: js.UndefOr[js.Array[DialogLogMessage]] = js.native
  /** An array of objects containing detailed diagnostic information about the nodes that were triggered during processing of the input message. */
  var nodes_visited: js.UndefOr[js.Array[DialogNodesVisited]] = js.native
}

object MessageOutputDebug {
  @scala.inline
  def apply(): MessageOutputDebug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageOutputDebug]
  }
  @scala.inline
  implicit class MessageOutputDebugOps[Self <: MessageOutputDebug] (val x: Self) extends AnyVal {
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
    def setBranch_exited(value: Boolean): Self = this.set("branch_exited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranch_exited: Self = this.set("branch_exited", js.undefined)
    @scala.inline
    def setBranch_exited_reason(value: String): Self = this.set("branch_exited_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranch_exited_reason: Self = this.set("branch_exited_reason", js.undefined)
    @scala.inline
    def setLog_messagesVarargs(value: DialogLogMessage*): Self = this.set("log_messages", js.Array(value :_*))
    @scala.inline
    def setLog_messages(value: js.Array[DialogLogMessage]): Self = this.set("log_messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog_messages: Self = this.set("log_messages", js.undefined)
    @scala.inline
    def setNodes_visitedVarargs(value: DialogNodesVisited*): Self = this.set("nodes_visited", js.Array(value :_*))
    @scala.inline
    def setNodes_visited(value: js.Array[DialogNodesVisited]): Self = this.set("nodes_visited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodes_visited: Self = this.set("nodes_visited", js.undefined)
  }
  
}

