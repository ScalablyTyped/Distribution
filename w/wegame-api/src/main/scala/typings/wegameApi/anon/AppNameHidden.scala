package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppNameHidden extends js.Object {
  /**
    * 游戏名称是否隐藏
    */
  var appNameHidden: Boolean = js.native
  /**
    * 游戏icon的border颜色色值
    */
  var borderColor: String = js.native
  /**
    * 游戏icon的border尺寸
    */
  var borderWidth: Double = js.native
  /**
    * 游戏名称的颜色色值
    */
  var color: String = js.native
  /**
    * 游戏icon的X轴坐标
    */
  var left: Double = js.native
  /**
    * 游戏icon的宽高值
    */
  var size: Double = js.native
  /**
    * 游戏icon的Y轴坐标
    */
  var top: Double = js.native
}

object AppNameHidden {
  @scala.inline
  def apply(
    appNameHidden: Boolean,
    borderColor: String,
    borderWidth: Double,
    color: String,
    left: Double,
    size: Double,
    top: Double
  ): AppNameHidden = {
    val __obj = js.Dynamic.literal(appNameHidden = appNameHidden.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppNameHidden]
  }
  @scala.inline
  implicit class AppNameHiddenOps[Self <: AppNameHidden] (val x: Self) extends AnyVal {
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
    def setAppNameHidden(value: Boolean): Self = this.set("appNameHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

