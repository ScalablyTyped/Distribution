package typings
package subscribeDashUiDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `Anon_` extends js.Object {
  var axisIntention: subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.x | subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.y | subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.Empty
  var deltaX: scala.Double
  var deltaY: scala.Double
  var startX: scala.Double
  var startY: scala.Double
}

object `Anon_` {
  @scala.inline
  def apply(
    axisIntention: subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.x | subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.y | subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.Empty,
    deltaX: scala.Double,
    deltaY: scala.Double,
    startX: scala.Double,
    startY: scala.Double
  ): `Anon_` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axisIntention")(axisIntention.asInstanceOf[js.Any])
    __obj.updateDynamic("deltaX")(deltaX)
    __obj.updateDynamic("deltaY")(deltaY)
    __obj.updateDynamic("startX")(startX)
    __obj.updateDynamic("startY")(startY)
    __obj.asInstanceOf[`Anon_`]
  }
}

