package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuTemperatureData extends js.Object {
  var cores: String
  var main: String
  var max: String
}

object CpuTemperatureData {
  @scala.inline
  def apply(cores: String, main: String, max: String): CpuTemperatureData = {
    val __obj = js.Dynamic.literal(cores = cores, main = main, max = max)
  
    __obj.asInstanceOf[CpuTemperatureData]
  }
}

