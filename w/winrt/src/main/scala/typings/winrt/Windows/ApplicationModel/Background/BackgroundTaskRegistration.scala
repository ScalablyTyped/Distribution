package typings.winrt.Windows.ApplicationModel.Background

import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
@js.native
class BackgroundTaskRegistration () extends IBackgroundTaskRegistration {
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var oncompleted: js.Any = js.native
  /* CompleteClass */
  override var onprogress: js.Any = js.native
  /* CompleteClass */
  override var taskId: String = js.native
  /* CompleteClass */
  override def unregister(cancelTask: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
@js.native
object BackgroundTaskRegistration extends js.Object {
  var allTasks: IMapView[String, IBackgroundTaskRegistration] = js.native
}

