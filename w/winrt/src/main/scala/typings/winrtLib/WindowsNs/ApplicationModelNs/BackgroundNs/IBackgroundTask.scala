package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTask extends js.Object {
  def run(taskInstance: IBackgroundTaskInstance): scala.Unit
}

object IBackgroundTask {
  @scala.inline
  def apply(run: js.Function1[IBackgroundTaskInstance, scala.Unit]): IBackgroundTask = {
    val __obj = js.Dynamic.literal(run = run)
  
    __obj.asInstanceOf[IBackgroundTask]
  }
}

