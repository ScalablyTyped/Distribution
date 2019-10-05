package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuCurrentSpeedData extends js.Object {
  var avg: String
  var max: String
  var min: String
}

object CpuCurrentSpeedData {
  @scala.inline
  def apply(avg: String, max: String, min: String): CpuCurrentSpeedData = {
    val __obj = js.Dynamic.literal(avg = avg, max = max, min = min)
  
    __obj.asInstanceOf[CpuCurrentSpeedData]
  }
}

