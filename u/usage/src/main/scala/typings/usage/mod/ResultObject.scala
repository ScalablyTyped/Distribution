package typings.usage.mod

import typings.usage.AnonRss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultObject extends js.Object {
  var cpu: Double
  var memory: Double
  var memoryInfo: AnonRss
}

object ResultObject {
  @scala.inline
  def apply(cpu: Double, memory: Double, memoryInfo: AnonRss): ResultObject = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], memoryInfo = memoryInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResultObject]
  }
}

