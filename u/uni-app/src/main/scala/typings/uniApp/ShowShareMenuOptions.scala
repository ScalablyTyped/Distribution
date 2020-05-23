package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowShareMenuOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 是否使用带 shareTicket 的转发
    */
  var withShareTicket: js.UndefOr[Boolean] = js.undefined
}

object ShowShareMenuOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null,
    withShareTicket: js.UndefOr[Boolean] = js.undefined
  ): ShowShareMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (!js.isUndefined(withShareTicket)) __obj.updateDynamic("withShareTicket")(withShareTicket.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowShareMenuOptions]
  }
}

