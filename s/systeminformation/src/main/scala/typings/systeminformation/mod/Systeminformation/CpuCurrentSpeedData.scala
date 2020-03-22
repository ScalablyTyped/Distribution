package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuCurrentSpeedData extends js.Object {
  var avg: Double
  var cores: js.Array[Double]
  var max: Double
  var min: Double
}

object CpuCurrentSpeedData {
  @scala.inline
  def apply(avg: Double, cores: js.Array[Double], max: Double, min: Double): CpuCurrentSpeedData = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], cores = cores.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CpuCurrentSpeedData]
  }
}

