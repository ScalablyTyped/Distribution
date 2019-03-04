package typings
package winrtLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuspendingOperation extends js.Object {
  var deadline: stdLib.Date
  def getDeferral(): SuspendingDeferral
}

object ISuspendingOperation {
  @scala.inline
  def apply(deadline: stdLib.Date, getDeferral: js.Function0[SuspendingDeferral]): ISuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline, getDeferral = getDeferral)
  
    __obj.asInstanceOf[ISuspendingOperation]
  }
}

