package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISystemTrigger extends IBackgroundTrigger {
  var oneShot: Boolean
  var triggerType: SystemTriggerType
}

object ISystemTrigger {
  @scala.inline
  def apply(oneShot: Boolean, triggerType: SystemTriggerType): ISystemTrigger = {
    val __obj = js.Dynamic.literal(oneShot = oneShot.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISystemTrigger]
  }
}

