package typings
package winrtLib.WindowsNs.SystemNs.ThreadingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThreadPoolTimer extends js.Object {
  var delay: scala.Double
  var period: scala.Double
  def cancel(): scala.Unit
}

object IThreadPoolTimer {
  @scala.inline
  def apply(cancel: js.Function0[scala.Unit], delay: scala.Double, period: scala.Double): IThreadPoolTimer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("period")(period)
    __obj.asInstanceOf[IThreadPoolTimer]
  }
}

