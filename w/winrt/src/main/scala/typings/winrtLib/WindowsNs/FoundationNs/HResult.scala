package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HResult extends js.Object {
  var value: scala.Double
}

object HResult {
  @scala.inline
  def apply(value: scala.Double): HResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[HResult]
  }
}

