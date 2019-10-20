package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogNodeVisitedDetails. */
trait DialogNodeVisitedDetails extends js.Object {
  /** The conditions that trigger the dialog node. */
  var conditions: js.UndefOr[String] = js.undefined
  /** A dialog node that was triggered during processing of the input message. */
  var dialog_node: js.UndefOr[String] = js.undefined
  /** The title of the dialog node. */
  var title: js.UndefOr[String] = js.undefined
}

object DialogNodeVisitedDetails {
  @scala.inline
  def apply(conditions: String = null, dialog_node: String = null, title: String = null): DialogNodeVisitedDetails = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (dialog_node != null) __obj.updateDynamic("dialog_node")(dialog_node)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DialogNodeVisitedDetails]
  }
}

