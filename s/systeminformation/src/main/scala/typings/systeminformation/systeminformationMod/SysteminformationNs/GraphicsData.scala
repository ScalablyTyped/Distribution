package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphicsData extends js.Object {
  var controllers: js.Array[GraphicsControllerInfo]
  var displays: js.Array[GraphicsDisplayInfo]
}

object GraphicsData {
  @scala.inline
  def apply(controllers: js.Array[GraphicsControllerInfo], displays: js.Array[GraphicsDisplayInfo]): GraphicsData = {
    val __obj = js.Dynamic.literal(controllers = controllers, displays = displays)
  
    __obj.asInstanceOf[GraphicsData]
  }
}

