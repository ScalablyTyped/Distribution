package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMaintenanceTriggerFactory extends js.Object {
  def create(freshnessTime: scala.Double, oneShot: scala.Boolean): MaintenanceTrigger
}

object IMaintenanceTriggerFactory {
  @scala.inline
  def apply(create: js.Function2[scala.Double, scala.Boolean, MaintenanceTrigger]): IMaintenanceTriggerFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[IMaintenanceTriggerFactory]
  }
}

