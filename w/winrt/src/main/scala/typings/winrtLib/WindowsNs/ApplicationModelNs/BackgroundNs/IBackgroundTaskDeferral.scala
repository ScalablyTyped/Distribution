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
  def apply(complete: () => scala.Unit): IBackgroundTaskDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[IBackgroundTaskDeferral]
  }
}

