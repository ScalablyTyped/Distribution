package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTabBarStyleOptions
  extends BaseOptions[js.Any, js.Any] {
  /** tab 的背景色 */
  var backgroundColor: String = js.native
  /** tabbar上边框的颜色， 仅支持 black/white */
  var borderStyle: String = js.native
  /** tab 上的文字默认颜色 */
  var color: String = js.native
  /** tab 上的文字选中时的颜色 */
  var selectedColor: String = js.native
}

object SetTabBarStyleOptions {
  @scala.inline
  def apply(backgroundColor: String, borderStyle: String, color: String, selectedColor: String): SetTabBarStyleOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], selectedColor = selectedColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTabBarStyleOptions]
  }
  @scala.inline
  implicit class SetTabBarStyleOptionsOps[Self <: SetTabBarStyleOptions] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderStyle(value: String): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedColor(value: String): Self = this.set("selectedColor", value.asInstanceOf[js.Any])
  }
  
}

