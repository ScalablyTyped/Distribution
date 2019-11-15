package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppNameHidden extends js.Object {
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

object Anon_AppNameHidden {
  @scala.inline
  def apply(
    appNameHidden: Boolean,
    borderColor: String,
    borderWidth: Double,
    color: String,
    left: Double,
    size: Double,
    top: Double
  ): Anon_AppNameHidden = {
    val __obj = js.Dynamic.literal(appNameHidden = appNameHidden, borderColor = borderColor, borderWidth = borderWidth, color = color, left = left, size = size, top = top)
  
    __obj.asInstanceOf[Anon_AppNameHidden]
  }
}

