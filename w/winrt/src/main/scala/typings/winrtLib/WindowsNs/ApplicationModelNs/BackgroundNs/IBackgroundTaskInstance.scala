package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskInstance extends js.Object {
  var instanceId: java.lang.String
  var oncanceled: js.Any
  var progress: scala.Double
  var suspendedCount: scala.Double
  var task: BackgroundTaskRegistration
  var triggerDetails: js.Any
  def getDeferral(): BackgroundTaskDeferral
}

object IBackgroundTaskInstance {
  @scala.inline
  def apply(
    getDeferral: js.Function0[BackgroundTaskDeferral],
    instanceId: java.lang.String,
    oncanceled: js.Any,
    progress: scala.Double,
    suspendedCount: scala.Double,
    task: BackgroundTaskRegistration,
    triggerDetails: js.Any
  ): IBackgroundTaskInstance = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral, instanceId = instanceId, oncanceled = oncanceled, progress = progress, suspendedCount = suspendedCount, task = task, triggerDetails = triggerDetails)
  
    __obj.asInstanceOf[IBackgroundTaskInstance]
  }
}

