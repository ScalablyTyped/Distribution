package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppNameHidden extends js.Object {
  /**
    * 游戏名称是否隐藏
    */
  var appNameHidden: Boolean
  /**
    * 游戏icon的border颜色色值
    */
  var borderColor: String
  /**
    * 游戏icon的border尺寸
    */
  var borderWidth: Double
  /**
    * 游戏名称的颜色色值
    */
  var color: String
  /**
    * 游戏icon的X轴坐标
    */
  var left: Double
  /**
    * 游戏icon的宽高值
    */
  var size: Double
  /**
    * 游戏icon的Y轴坐标
    */
  var top: Double
}

object AnonAppNameHidden {
  @scala.inline
  def apply(
    appNameHidden: Boolean,
    borderColor: String,
    borderWidth: Double,
    color: String,
    left: Double,
    size: Double,
    top: Double
  ): AnonAppNameHidden = {
    val __obj = js.Dynamic.literal(appNameHidden = appNameHidden.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppNameHidden]
  }
}

