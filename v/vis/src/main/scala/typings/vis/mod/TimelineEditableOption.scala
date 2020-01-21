package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineEditableOption extends js.Object {
  var add: js.UndefOr[Boolean] = js.undefined
  var overrideItems: js.UndefOr[Boolean] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
  var updateGroup: js.UndefOr[Boolean] = js.undefined
  var updateTime: js.UndefOr[Boolean] = js.undefined
}

object TimelineEditableOption {
  @scala.inline
  def apply(
    add: js.UndefOr[Boolean] = js.undefined,
    overrideItems: js.UndefOr[Boolean] = js.undefined,
    remove: js.UndefOr[Boolean] = js.undefined,
    updateGroup: js.UndefOr[Boolean] = js.undefined,
    updateTime: js.UndefOr[Boolean] = js.undefined
  ): TimelineEditableOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideItems)) __obj.updateDynamic("overrideItems")(overrideItems.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (!js.isUndefined(updateGroup)) __obj.updateDynamic("updateGroup")(updateGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(updateTime)) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineEditableOption]
  }
}

