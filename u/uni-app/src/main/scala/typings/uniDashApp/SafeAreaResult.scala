package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeAreaResult extends js.Object {
  /**
    * 安全区域右下角纵坐标
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
    * 安全区域的高度，单位逻辑像素
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * 安全区域左上角横坐标
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * 安全区域右下角横坐标
    */
  var right: js.UndefOr[Double] = js.undefined
  /**
    * 安全区域左上角纵坐标
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    * 安全区域的宽度，单位逻辑像素
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SafeAreaResult {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    height: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null,
    width: Int | Double = null
  ): SafeAreaResult = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeAreaResult]
  }
}

