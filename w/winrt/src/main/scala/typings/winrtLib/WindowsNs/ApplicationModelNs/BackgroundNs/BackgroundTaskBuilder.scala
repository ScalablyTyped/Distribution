package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskBuilder")
@js.native
class BackgroundTaskBuilder () extends IBackgroundTaskBuilder {
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var taskEntryPoint: java.lang.String = js.native
  /* CompleteClass */
  override def addCondition(condition: IBackgroundCondition): scala.Unit = js.native
  /* CompleteClass */
  override def register(): BackgroundTaskRegistration = js.native
  /* CompleteClass */
  override def setTrigger(trigger: IBackgroundTrigger): scala.Unit = js.native
}

