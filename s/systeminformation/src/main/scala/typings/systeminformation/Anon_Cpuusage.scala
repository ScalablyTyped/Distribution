package typings.systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cpuusage extends js.Object {
  var cpu_usage: Anon_Totalusage
  var throttling_data: Anon_Periods
}

object Anon_Cpuusage {
  @scala.inline
  def apply(cpu_usage: Anon_Totalusage, throttling_data: Anon_Periods): Anon_Cpuusage = {
    val __obj = js.Dynamic.literal(cpu_usage = cpu_usage, throttling_data = throttling_data)
  
    __obj.asInstanceOf[Anon_Cpuusage]
  }
}

