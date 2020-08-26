package typings.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --触摸对象
@js.native
trait Touch extends js.Object {
  /**
    * 触点相对于游戏窗口的 X 轴距离。
    */
  var clientX: Double = js.native
  /**
    * 触点相对于游戏窗口的 Y 轴距离。
    */
  var clientY: Double = js.native
  /**
    * Touch 对象的唯一标识符，只读属性。一次触摸动作(我们值的是手指的触摸)在平面上移动的整个过程中, 该标识符不变。可以根据它来判断跟踪的是否是同一次触摸过程。
    */
  var identifier: Double = js.native
  /**
    * 触点相对于整体页面的 X 轴距离。
    */
  var pageX: Double = js.native
  /**
    * 触点相对于整体页面的 Y 轴距离。
    */
  var pageY: Double = js.native
}

object Touch {
  @scala.inline
  def apply(clientX: Double, clientY: Double, identifier: Double, pageX: Double, pageY: Double): Touch = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Touch]
  }
  @scala.inline
  implicit class TouchOps[Self <: Touch] (val x: Self) extends AnyVal {
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
    def setClientX(value: Double): Self = this.set("clientX", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientY(value: Double): Self = this.set("clientY", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: Double): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
  }
  
}

