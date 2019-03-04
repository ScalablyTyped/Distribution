package typings
package systeminformationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Totalusage extends js.Object {
  var total_usage: scala.Double
  var usage_in_kernelmode: scala.Double
  var usage_in_usermode: scala.Double
}

object Anon_Totalusage {
  @scala.inline
  def apply(total_usage: scala.Double, usage_in_kernelmode: scala.Double, usage_in_usermode: scala.Double): Anon_Totalusage = {
    val __obj = js.Dynamic.literal(total_usage = total_usage, usage_in_kernelmode = usage_in_kernelmode, usage_in_usermode = usage_in_usermode)
  
    __obj.asInstanceOf[Anon_Totalusage]
  }
}

