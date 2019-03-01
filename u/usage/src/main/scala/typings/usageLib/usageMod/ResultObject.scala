package typings
package usageLib.usageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultObject extends js.Object {
  var cpu: scala.Double
  var memory: scala.Double
  var memoryInfo: usageLib.Anon_Rss
}

object ResultObject {
  @scala.inline
  def apply(cpu: scala.Double, memory: scala.Double, memoryInfo: usageLib.Anon_Rss): ResultObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cpu")(cpu)
    __obj.updateDynamic("memory")(memory)
    __obj.updateDynamic("memoryInfo")(memoryInfo)
    __obj.asInstanceOf[ResultObject]
  }
}

