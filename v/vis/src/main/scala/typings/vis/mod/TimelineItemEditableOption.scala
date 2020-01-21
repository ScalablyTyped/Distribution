package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineItemEditableOption extends js.Object {
  var remove: js.UndefOr[Boolean] = js.undefined
  var updateGroup: js.UndefOr[Boolean] = js.undefined
  var updateTime: js.UndefOr[Boolean] = js.undefined
}

object TimelineItemEditableOption {
  @scala.inline
  def apply(
    remove: js.UndefOr[Boolean] = js.undefined,
    updateGroup: js.UndefOr[Boolean] = js.undefined,
    updateTime: js.UndefOr[Boolean] = js.undefined
  ): TimelineItemEditableOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (!js.isUndefined(updateGroup)) __obj.updateDynamic("updateGroup")(updateGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(updateTime)) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineItemEditableOption]
  }
}

