package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowResizeResult extends js.Object {
  /**
    * 变化后的窗口高度，单位 px
    */
  var windowHeight: js.UndefOr[Double] = js.undefined
  /**
    * 变化后的窗口宽度，单位 px
    */
  var windowWidth: js.UndefOr[Double] = js.undefined
}

object WindowResizeResult {
  @scala.inline
  def apply(windowHeight: js.UndefOr[Double] = js.undefined, windowWidth: js.UndefOr[Double] = js.undefined): WindowResizeResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(windowHeight)) __obj.updateDynamic("windowHeight")(windowHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowWidth)) __obj.updateDynamic("windowWidth")(windowWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowResizeResult]
  }
}

