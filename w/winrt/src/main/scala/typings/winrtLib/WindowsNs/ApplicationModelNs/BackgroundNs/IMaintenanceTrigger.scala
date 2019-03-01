package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMaintenanceTrigger extends IBackgroundTrigger {
  var freshnessTime: scala.Double
  var oneShot: scala.Boolean
}

object IMaintenanceTrigger {
  @scala.inline
  def apply(freshnessTime: scala.Double, oneShot: scala.Boolean): IMaintenanceTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("freshnessTime")(freshnessTime)
    __obj.updateDynamic("oneShot")(oneShot)
    __obj.asInstanceOf[IMaintenanceTrigger]
  }
}

