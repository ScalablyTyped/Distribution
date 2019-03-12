package typings
package winrtLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuspendingDeferral extends js.Object {
  def complete(): scala.Unit
}

object ISuspendingDeferral {
  @scala.inline
  def apply(complete: () => scala.Unit): ISuspendingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[ISuspendingDeferral]
  }
}

