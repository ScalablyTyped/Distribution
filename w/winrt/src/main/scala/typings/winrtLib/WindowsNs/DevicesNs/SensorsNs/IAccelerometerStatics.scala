package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccelerometerStatics extends js.Object {
  def getDefault(): Accelerometer
}

object IAccelerometerStatics {
  @scala.inline
  def apply(getDefault: js.Function0[Accelerometer]): IAccelerometerStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDefault")(getDefault)
    __obj.asInstanceOf[IAccelerometerStatics]
  }
}

