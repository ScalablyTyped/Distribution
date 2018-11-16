package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
@js.native
class BackgroundTaskRegistration () extends IBackgroundTaskRegistration {
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var oncompleted: js.Any = js.native
  /* CompleteClass */
  override var onprogress: js.Any = js.native
  /* CompleteClass */
  override var taskId: java.lang.String = js.native
  /* CompleteClass */
  override def unregister(cancelTask: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
@js.native
object BackgroundTaskRegistration extends js.Object {
  var allTasks: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
    java.lang.String, 
    winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.IBackgroundTaskRegistration
  ] = js.native
}

