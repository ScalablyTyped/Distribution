package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Background.SystemTrigger")
@js.native
class SystemTrigger protected () extends ISystemTrigger {
  def this(triggerType: SystemTriggerType, oneShot: scala.Boolean) = this()
  /* CompleteClass */
  override var oneShot: scala.Boolean = js.native
  /* CompleteClass */
  override var triggerType: SystemTriggerType = js.native
}

