package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Background.MaintenanceTrigger")
@js.native
class MaintenanceTrigger protected () extends IMaintenanceTrigger {
  def this(freshnessTime: Double, oneShot: Boolean) = this()
  /* CompleteClass */
  override var freshnessTime: Double = js.native
  /* CompleteClass */
  override var oneShot: Boolean = js.native
}

