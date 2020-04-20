package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuTemperatureData extends js.Object {
  var cores: js.Array[Double]
  var main: Double
  var max: Double
}

object CpuTemperatureData {
  @scala.inline
  def apply(cores: js.Array[Double], main: Double, max: Double): CpuTemperatureData = {
    val __obj = js.Dynamic.literal(cores = cores.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuTemperatureData]
  }
}

