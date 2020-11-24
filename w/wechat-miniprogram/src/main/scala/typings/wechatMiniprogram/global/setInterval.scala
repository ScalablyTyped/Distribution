package typings.wechatMiniprogram.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("setInterval")
@js.native
object setInterval extends js.Object {
  
  /** [number setInterval(function callback, number delay, any rest)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/setInterval.html)
    *
    * 设定一个定时器。按照指定的周期（以毫秒计）来执行注册的回调函数 */
  def apply(/** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Double = js.native
  def apply(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _],
    /** 执行回调函数之间的时间间隔，单位 ms。 */
  delay: js.UndefOr[scala.Nothing],
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: js.Any
  ): Double = js.native
  def apply(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _],
    /** 执行回调函数之间的时间间隔，单位 ms。 */
  delay: Double
  ): Double = js.native
  def apply(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _],
    /** 执行回调函数之间的时间间隔，单位 ms。 */
  delay: Double,
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: js.Any
  ): Double = js.native
}
