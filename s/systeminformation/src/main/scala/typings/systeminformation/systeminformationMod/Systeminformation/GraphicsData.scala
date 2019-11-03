package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphicsData extends js.Object {
  var controllers: js.Array[GraphicsControllerData]
  var displays: js.Array[GraphicsDisplayData]
}

object GraphicsData {
  @scala.inline
  def apply(controllers: js.Array[GraphicsControllerData], displays: js.Array[GraphicsDisplayData]): GraphicsData = {
    val __obj = js.Dynamic.literal(controllers = controllers, displays = displays)
  
    __obj.asInstanceOf[GraphicsData]
  }
}

