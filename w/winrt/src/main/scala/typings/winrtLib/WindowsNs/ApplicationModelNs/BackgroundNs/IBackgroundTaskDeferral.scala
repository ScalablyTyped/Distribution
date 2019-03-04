package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskDeferral extends js.Object {
  def complete(): scala.Unit
}

object IBackgroundTaskDeferral {
  @scala.inline
  def apply(complete: js.Function0[scala.Unit]): IBackgroundTaskDeferral = {
    val __obj = js.Dynamic.literal(complete = complete)
  
    __obj.asInstanceOf[IBackgroundTaskDeferral]
  }
}

