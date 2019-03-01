package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccelerometerShakenEventArgs extends js.Object {
  var timestamp: stdLib.Date
}

object IAccelerometerShakenEventArgs {
  @scala.inline
  def apply(timestamp: stdLib.Date): IAccelerometerShakenEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[IAccelerometerShakenEventArgs]
  }
}

