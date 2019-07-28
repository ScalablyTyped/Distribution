package typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskBuilder")
@js.native
class BackgroundTaskBuilder () extends IBackgroundTaskBuilder {
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var taskEntryPoint: String = js.native
  /* CompleteClass */
  override def addCondition(condition: IBackgroundCondition): Unit = js.native
  /* CompleteClass */
  override def register(): BackgroundTaskRegistration = js.native
  /* CompleteClass */
  override def setTrigger(trigger: IBackgroundTrigger): Unit = js.native
}

