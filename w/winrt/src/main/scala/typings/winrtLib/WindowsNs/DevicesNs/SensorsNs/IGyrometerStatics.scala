package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGyrometerStatics extends js.Object {
  def getDefault(): Gyrometer
}

object IGyrometerStatics {
  @scala.inline
  def apply(getDefault: () => Gyrometer): IGyrometerStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
  
    __obj.asInstanceOf[IGyrometerStatics]
  }
}

