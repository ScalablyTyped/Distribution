package typings.usage.usageMod

import typings.usage.Anon_Rss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultObject extends js.Object {
  var cpu: Double
  var memory: Double
  var memoryInfo: Anon_Rss
}

object ResultObject {
  @scala.inline
  def apply(cpu: Double, memory: Double, memoryInfo: Anon_Rss): ResultObject = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], memoryInfo = memoryInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResultObject]
  }
}

