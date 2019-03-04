package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISystemTrigger extends IBackgroundTrigger {
  var oneShot: scala.Boolean
  var triggerType: SystemTriggerType
}

object ISystemTrigger {
  @scala.inline
  def apply(oneShot: scala.Boolean, triggerType: SystemTriggerType): ISystemTrigger = {
    val __obj = js.Dynamic.literal(oneShot = oneShot, triggerType = triggerType)
  
    __obj.asInstanceOf[ISystemTrigger]
  }
}

