package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisksIoData extends js.Object {
  var ms: scala.Double
  var rIO: scala.Double
  var rIO_sec: scala.Double
  var tIO: scala.Double
  var tIO_sec: scala.Double
  var wIO: scala.Double
  var wIO_sec: scala.Double
}

object DisksIoData {
  @scala.inline
  def apply(
    ms: scala.Double,
    rIO: scala.Double,
    rIO_sec: scala.Double,
    tIO: scala.Double,
    tIO_sec: scala.Double,
    wIO: scala.Double,
    wIO_sec: scala.Double
  ): DisksIoData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ms")(ms)
    __obj.updateDynamic("rIO")(rIO)
    __obj.updateDynamic("rIO_sec")(rIO_sec)
    __obj.updateDynamic("tIO")(tIO)
    __obj.updateDynamic("tIO_sec")(tIO_sec)
    __obj.updateDynamic("wIO")(wIO)
    __obj.updateDynamic("wIO_sec")(wIO_sec)
    __obj.asInstanceOf[DisksIoData]
  }
}

