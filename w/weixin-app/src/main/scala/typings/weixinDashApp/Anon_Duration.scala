package typings.weixinDashApp

import typings.weixinDashApp.weixinDashAppStrings.easeIn
import typings.weixinDashApp.weixinDashAppStrings.easeInOut
import typings.weixinDashApp.weixinDashAppStrings.easeOut
import typings.weixinDashApp.weixinDashAppStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  // 动画变化时间，默认0，单位：毫秒
  var duration: js.UndefOr[Double] = js.undefined
  /**
  			 * 动画变化方式，默认 linear
  			 * 值	说明
  			 * 有效值：
  			 * linear	动画从头到尾的速度是相同的。
  			 * easeIn	动画以低速开始
  			 * easeOut	动画以低速结束。
  			 * easeInOut	动画以低速开始和结束。
  			 */
  var timingFunc: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.undefined
}

object Anon_Duration {
  @scala.inline
  def apply(duration: Int | Double = null, timingFunc: linear | easeIn | easeOut | easeInOut = null): Anon_Duration = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (timingFunc != null) __obj.updateDynamic("timingFunc")(timingFunc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Duration]
  }
}

