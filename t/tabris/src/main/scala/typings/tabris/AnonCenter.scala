package typings.tabris

import typings.tabris.tabrisBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCenter extends js.Object {
  var center: js.UndefOr[`true`] = js.undefined
  var stretch: js.UndefOr[`true`] = js.undefined
  var stretchX: js.UndefOr[`true`] = js.undefined
  var stretchY: js.UndefOr[`true`] = js.undefined
}

object AnonCenter {
  @scala.inline
  def apply(center: `true` = null, stretch: `true` = null, stretchX: `true` = null, stretchY: `true` = null): AnonCenter = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (stretch != null) __obj.updateDynamic("stretch")(stretch.asInstanceOf[js.Any])
    if (stretchX != null) __obj.updateDynamic("stretchX")(stretchX.asInstanceOf[js.Any])
    if (stretchY != null) __obj.updateDynamic("stretchY")(stretchY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCenter]
  }
}

