package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphicsData extends js.Object {
  var controllers: js.Array[GraphicsControllerData] = js.native
  var displays: js.Array[GraphicsDisplayData] = js.native
}

object GraphicsData {
  @scala.inline
  def apply(controllers: js.Array[GraphicsControllerData], displays: js.Array[GraphicsDisplayData]): GraphicsData = {
    val __obj = js.Dynamic.literal(controllers = controllers.asInstanceOf[js.Any], displays = displays.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsData]
  }
  @scala.inline
  implicit class GraphicsDataOps[Self <: GraphicsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setControllersVarargs(value: GraphicsControllerData*): Self = this.set("controllers", js.Array(value :_*))
    @scala.inline
    def setControllers(value: js.Array[GraphicsControllerData]): Self = this.set("controllers", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplaysVarargs(value: GraphicsDisplayData*): Self = this.set("displays", js.Array(value :_*))
    @scala.inline
    def setDisplays(value: js.Array[GraphicsDisplayData]): Self = this.set("displays", value.asInstanceOf[js.Any])
  }
  
}

