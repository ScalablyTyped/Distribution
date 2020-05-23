package typings.winrt.global.Windows.UI.WebUI

import typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskDeferral
import typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstanceRuntimeClass")
@js.native
class WebUIBackgroundTaskInstanceRuntimeClass ()
  extends typings.winrt.Windows.UI.WebUI.WebUIBackgroundTaskInstanceRuntimeClass {
  /* CompleteClass */
  override var instanceId: String = js.native
  /* CompleteClass */
  override var oncanceled: js.Any = js.native
  /* CompleteClass */
  override var progress: Double = js.native
  /* CompleteClass */
  override var succeeded: Boolean = js.native
  /* CompleteClass */
  override var suspendedCount: Double = js.native
  /* CompleteClass */
  override var task: BackgroundTaskRegistration = js.native
  /* CompleteClass */
  override var triggerDetails: js.Any = js.native
  /* CompleteClass */
  override def getDeferral(): BackgroundTaskDeferral = js.native
}

