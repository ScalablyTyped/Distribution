package typings
package winrtLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuspendingOperation extends js.Object {
  var deadline: stdLib.Date
  def getDeferral(): SuspendingDeferral
}

