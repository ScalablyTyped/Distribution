package typings.wechatMiniprogram.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setTimeout")
@js.native
object setTimeout extends js.Object {
  /** [number setTimeout(function callback, number delay, any rest)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/setTimeout.html)
    *
    * 设定一个定时器。在定时到期以后执行注册的回调函数 */
  def apply(/** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Double = js.native
  def apply(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _],
    /** 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。 */
  delay: js.UndefOr[scala.Nothing],
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: js.Any
  ): Double = js.native
  def apply(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _],
    /** 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。 */
  delay: Double
  ): Double = js.native
  def apply(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _],
    /** 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。 */
  delay: Double,
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: js.Any
  ): Double = js.native
}

