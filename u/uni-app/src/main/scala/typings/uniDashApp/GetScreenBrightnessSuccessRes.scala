package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScreenBrightnessSuccessRes extends js.Object {
  /**
    * 屏幕亮度值，范围 0~1，0 最暗，1 最亮。
    */
  var value: js.UndefOr[Double] = js.undefined
}

object GetScreenBrightnessSuccessRes {
  @scala.inline
  def apply(value: Int | Double = null): GetScreenBrightnessSuccessRes = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScreenBrightnessSuccessRes]
  }
}

