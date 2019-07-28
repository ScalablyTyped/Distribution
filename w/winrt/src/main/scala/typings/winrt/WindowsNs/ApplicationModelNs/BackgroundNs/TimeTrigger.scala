package typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Background.TimeTrigger")
@js.native
class TimeTrigger protected () extends ITimeTrigger {
  def this(freshnessTime: Double, oneShot: Boolean) = this()
  /* CompleteClass */
  override var freshnessTime: Double = js.native
  /* CompleteClass */
  override var oneShot: Boolean = js.native
}

