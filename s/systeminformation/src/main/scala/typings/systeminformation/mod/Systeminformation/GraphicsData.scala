package typings.systeminformation.mod.Systeminformation

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
    val __obj = js.Dynamic.literal(controllers = controllers.asInstanceOf[js.Any], displays = displays.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraphicsData]
  }
}

