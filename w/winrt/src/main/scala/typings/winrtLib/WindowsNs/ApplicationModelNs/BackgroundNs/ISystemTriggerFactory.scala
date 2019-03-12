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
  def apply(create: (SystemTriggerType, scala.Boolean) => SystemTrigger): ISystemTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
  
    __obj.asInstanceOf[ISystemTriggerFactory]
  }
}

