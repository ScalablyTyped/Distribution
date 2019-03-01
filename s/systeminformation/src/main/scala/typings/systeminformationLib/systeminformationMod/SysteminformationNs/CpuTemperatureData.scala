package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuTemperatureData extends js.Object {
  var cores: java.lang.String
  var main: java.lang.String
  var max: java.lang.String
}

object CpuTemperatureData {
  @scala.inline
  def apply(cores: java.lang.String, main: java.lang.String, max: java.lang.String): CpuTemperatureData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cores")(cores)
    __obj.updateDynamic("main")(main)
    __obj.updateDynamic("max")(max)
    __obj.asInstanceOf[CpuTemperatureData]
  }
}

