package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Additional detailed information about a message response and how it was generated. */
trait MessageOutputDebug extends js.Object {
  /** Assistant sets this to true when this message response concludes or interrupts a dialog. */
  var branch_exited: js.UndefOr[Boolean] = js.undefined
  /** When `branch_exited` is set to `true` by the Assistant, the `branch_exited_reason` specifies whether the dialog completed by itself or got interrupted. */
  var branch_exited_reason: js.UndefOr[String] = js.undefined
  /** An array of up to 50 messages logged with the request. */
  var log_messages: js.UndefOr[js.Array[DialogLogMessage]] = js.undefined
  /** An array of objects containing detailed diagnostic information about the nodes that were triggered during processing of the input message. */
  var nodes_visited: js.UndefOr[js.Array[DialogNodesVisited]] = js.undefined
}

object MessageOutputDebug {
  @scala.inline
  def apply(
    branch_exited: js.UndefOr[Boolean] = js.undefined,
    branch_exited_reason: String = null,
    log_messages: js.Array[DialogLogMessage] = null,
    nodes_visited: js.Array[DialogNodesVisited] = null
  ): MessageOutputDebug = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(branch_exited)) __obj.updateDynamic("branch_exited")(branch_exited.get.asInstanceOf[js.Any])
    if (branch_exited_reason != null) __obj.updateDynamic("branch_exited_reason")(branch_exited_reason.asInstanceOf[js.Any])
    if (log_messages != null) __obj.updateDynamic("log_messages")(log_messages.asInstanceOf[js.Any])
    if (nodes_visited != null) __obj.updateDynamic("nodes_visited")(nodes_visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOutputDebug]
  }
}

