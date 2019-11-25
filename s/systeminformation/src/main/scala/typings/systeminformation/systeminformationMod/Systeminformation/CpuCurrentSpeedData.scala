package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuCurrentSpeedData extends js.Object {
  var avg: String
  var cores: js.Array[Double]
  var max: String
  var min: String
}

object CpuCurrentSpeedData {
  @scala.inline
  def apply(avg: String, cores: js.Array[Double], max: String, min: String): CpuCurrentSpeedData = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], cores = cores.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CpuCurrentSpeedData]
  }
}

