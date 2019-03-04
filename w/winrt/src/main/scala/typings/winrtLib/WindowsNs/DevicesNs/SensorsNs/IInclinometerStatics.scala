package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInclinometerStatics extends js.Object {
  def getDefault(): Inclinometer
}

object IInclinometerStatics {
  @scala.inline
  def apply(getDefault: js.Function0[Inclinometer]): IInclinometerStatics = {
    val __obj = js.Dynamic.literal(getDefault = getDefault)
  
    __obj.asInstanceOf[IInclinometerStatics]
  }
}

