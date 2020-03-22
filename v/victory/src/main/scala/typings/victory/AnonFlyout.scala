package typings.victory

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlyout extends js.Object {
  var data: js.UndefOr[CSSProperties] = js.undefined
  var flyout: js.UndefOr[CSSProperties] = js.undefined
  var labels: js.UndefOr[CSSProperties] = js.undefined
}

object AnonFlyout {
  @scala.inline
  def apply(data: CSSProperties = null, flyout: CSSProperties = null, labels: CSSProperties = null): AnonFlyout = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (flyout != null) __obj.updateDynamic("flyout")(flyout.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlyout]
  }
}

