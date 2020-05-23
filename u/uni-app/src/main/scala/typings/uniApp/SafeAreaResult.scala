package typings.uniApp

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
    bottom: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): SafeAreaResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeAreaResult]
  }
}

