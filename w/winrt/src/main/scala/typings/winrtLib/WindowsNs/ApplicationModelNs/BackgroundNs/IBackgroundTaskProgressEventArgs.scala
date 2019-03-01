package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskProgressEventArgs extends js.Object {
  var instanceId: java.lang.String
  var progress: scala.Double
}

object IBackgroundTaskProgressEventArgs {
  @scala.inline
  def apply(instanceId: java.lang.String, progress: scala.Double): IBackgroundTaskProgressEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("instanceId")(instanceId)
    __obj.updateDynamic("progress")(progress)
    __obj.asInstanceOf[IBackgroundTaskProgressEventArgs]
  }
}

