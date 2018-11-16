package typings
package winrtLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstanceRuntimeClass")
@js.native
class WebUIBackgroundTaskInstanceRuntimeClass ()
  extends IWebUIBackgroundTaskInstance
     with winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.IBackgroundTaskInstance {
  /* CompleteClass */
  override var instanceId: java.lang.String = js.native
  /* CompleteClass */
  override var oncanceled: js.Any = js.native
  /* CompleteClass */
  override var progress: scala.Double = js.native
  /* CompleteClass */
  override var succeeded: scala.Boolean = js.native
  /* CompleteClass */
  override var suspendedCount: scala.Double = js.native
  /* CompleteClass */
  override var task: winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskRegistration = js.native
  /* CompleteClass */
  override var triggerDetails: js.Any = js.native
  /* CompleteClass */
  override def getDeferral(): winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskDeferral = js.native
}

