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
  def apply(run: IBackgroundTaskInstance => scala.Unit): IBackgroundTask = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
  
    __obj.asInstanceOf[IBackgroundTask]
  }
}

