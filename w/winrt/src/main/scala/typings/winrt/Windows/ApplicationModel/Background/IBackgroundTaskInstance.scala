package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskInstance extends js.Object {
  var instanceId: String
  var oncanceled: js.Any
  var progress: Double
  var suspendedCount: Double
  var task: BackgroundTaskRegistration
  var triggerDetails: js.Any
  def getDeferral(): BackgroundTaskDeferral
}

object IBackgroundTaskInstance {
  @scala.inline
  def apply(
    getDeferral: () => BackgroundTaskDeferral,
    instanceId: String,
    oncanceled: js.Any,
    progress: Double,
    suspendedCount: Double,
    task: BackgroundTaskRegistration,
    triggerDetails: js.Any
  ): IBackgroundTaskInstance = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), instanceId = instanceId, oncanceled = oncanceled, progress = progress, suspendedCount = suspendedCount, task = task, triggerDetails = triggerDetails)
  
    __obj.asInstanceOf[IBackgroundTaskInstance]
  }
}

