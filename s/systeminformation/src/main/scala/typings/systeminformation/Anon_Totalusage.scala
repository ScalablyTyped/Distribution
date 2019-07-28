package typings.systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Totalusage extends js.Object {
  var total_usage: Double
  var usage_in_kernelmode: Double
  var usage_in_usermode: Double
}

object Anon_Totalusage {
  @scala.inline
  def apply(total_usage: Double, usage_in_kernelmode: Double, usage_in_usermode: Double): Anon_Totalusage = {
    val __obj = js.Dynamic.literal(total_usage = total_usage, usage_in_kernelmode = usage_in_kernelmode, usage_in_usermode = usage_in_usermode)
  
    __obj.asInstanceOf[Anon_Totalusage]
  }
}

