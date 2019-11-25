package typings.watsonDashDeveloperDashCloud.assistantV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogNodesVisited. */
trait DialogNodesVisited extends js.Object {
  /** The conditions that trigger the dialog node. */
  var conditions: js.UndefOr[String] = js.undefined
  /** A dialog node that was triggered during processing of the input message. */
  var dialog_node: js.UndefOr[String] = js.undefined
  /** The title of the dialog node. */
  var title: js.UndefOr[String] = js.undefined
}

object DialogNodesVisited {
  @scala.inline
  def apply(conditions: String = null, dialog_node: String = null, title: String = null): DialogNodesVisited = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (dialog_node != null) __obj.updateDynamic("dialog_node")(dialog_node.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodesVisited]
  }
}

