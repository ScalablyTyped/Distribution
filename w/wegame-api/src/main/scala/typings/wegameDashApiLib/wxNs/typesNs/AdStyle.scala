package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdStyle extends js.Object {
  /**
    * banner 广告组件的高度
    */
  var height: scala.Double
  /**
    * 广告组件的左上角横坐标
    */
  var left: scala.Double
  /**
    * banner 广告组件经过缩放后真实的高度
    */
  var realHeight: scala.Double
  /**
    * banner 广告组件经过缩放后真实的宽度
    */
  var realWidth: scala.Double
  /**
    * banner 广告组件的左上角纵坐标
    */
  var top: scala.Double
  /**
    * banner 广告组件的宽度。最小 300，最大至 屏幕宽度（屏幕宽度可以通过 wx.getSystemInfoSync() 获取）。
    */
  var width: scala.Double
}

object AdStyle {
  @scala.inline
  def apply(
    height: scala.Double,
    left: scala.Double,
    realHeight: scala.Double,
    realWidth: scala.Double,
    top: scala.Double,
    width: scala.Double
  ): AdStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("realHeight")(realHeight)
    __obj.updateDynamic("realWidth")(realWidth)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[AdStyle]
  }
}

