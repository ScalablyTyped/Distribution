package typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMaintenanceTriggerFactory extends js.Object {
  def create(freshnessTime: Double, oneShot: Boolean): MaintenanceTrigger
}

object IMaintenanceTriggerFactory {
  @scala.inline
  def apply(create: (Double, Boolean) => MaintenanceTrigger): IMaintenanceTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
  
    __obj.asInstanceOf[IMaintenanceTriggerFactory]
  }
}

