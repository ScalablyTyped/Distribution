package typings.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdStyle extends js.Object {
  /**
    * banner 广告组件的高度
    */
  var height: Double
  /**
    * 广告组件的左上角横坐标
    */
  var left: Double
  /**
    * banner 广告组件经过缩放后真实的高度
    */
  var realHeight: Double
  /**
    * banner 广告组件经过缩放后真实的宽度
    */
  var realWidth: Double
  /**
    * banner 广告组件的左上角纵坐标
    */
  var top: Double
  /**
    * banner 广告组件的宽度。最小 300，最大至 屏幕宽度（屏幕宽度可以通过 wx.getSystemInfoSync() 获取）。
    */
  var width: Double
}

object AdStyle {
  @scala.inline
  def apply(height: Double, left: Double, realHeight: Double, realWidth: Double, top: Double, width: Double): AdStyle = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], realHeight = realHeight.asInstanceOf[js.Any], realWidth = realWidth.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdStyle]
  }
}

