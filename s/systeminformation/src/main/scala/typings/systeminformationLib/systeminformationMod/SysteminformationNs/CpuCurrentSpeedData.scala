package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuCurrentSpeedData extends js.Object {
  var avg: java.lang.String
  var max: java.lang.String
  var min: java.lang.String
}

object CpuCurrentSpeedData {
  @scala.inline
  def apply(avg: java.lang.String, max: java.lang.String, min: java.lang.String): CpuCurrentSpeedData = {
    val __obj = js.Dynamic.literal(avg = avg, max = max, min = min)
  
    __obj.asInstanceOf[CpuCurrentSpeedData]
  }
}

