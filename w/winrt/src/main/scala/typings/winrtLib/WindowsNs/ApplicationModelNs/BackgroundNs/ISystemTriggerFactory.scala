package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISystemTriggerFactory extends js.Object {
  def create(triggerType: SystemTriggerType, oneShot: scala.Boolean): SystemTrigger
}

object ISystemTriggerFactory {
  @scala.inline
  def apply(create: js.Function2[SystemTriggerType, scala.Boolean, SystemTrigger]): ISystemTriggerFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[ISystemTriggerFactory]
  }
}

