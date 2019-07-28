package typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Background.SystemTrigger")
@js.native
class SystemTrigger protected () extends ISystemTrigger {
  def this(triggerType: SystemTriggerType, oneShot: Boolean) = this()
  /* CompleteClass */
  override var oneShot: Boolean = js.native
  /* CompleteClass */
  override var triggerType: SystemTriggerType = js.native
}

