package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowResizeResult extends js.Object {
  /**
    * 变化后的窗口高度，单位 px
    */
  var windowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * 变化后的窗口宽度，单位 px
    */
  var windowWidth: js.UndefOr[scala.Double] = js.undefined
}

object WindowResizeResult {
  @scala.inline
  def apply(windowHeight: scala.Int | scala.Double = null, windowWidth: scala.Int | scala.Double = null): WindowResizeResult = {
    val __obj = js.Dynamic.literal()
    if (windowHeight != null) __obj.updateDynamic("windowHeight")(windowHeight.asInstanceOf[js.Any])
    if (windowWidth != null) __obj.updateDynamic("windowWidth")(windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowResizeResult]
  }
}

