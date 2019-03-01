package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSpan extends js.Object {
  var duration: scala.Double
}

object TimeSpan {
  @scala.inline
  def apply(duration: scala.Double): TimeSpan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.asInstanceOf[TimeSpan]
  }
}

