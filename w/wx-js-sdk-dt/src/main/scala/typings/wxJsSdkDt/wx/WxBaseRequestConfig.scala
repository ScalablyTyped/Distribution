package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 所有通过wx对象调用的接口的基础请求参数
  * 见：https://mp.weixin.qq.com/wiki?action=doc&id=mp1421141115&t=0.08966560295638093#7
  */
trait WxBaseRequestConfig extends js.Object {
  /**
    * 用户点击取消时的回调函数，仅部分有用户取消操作的api才会用到
    */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用完成时执行的回调函数，无论成功或失败都会执行
    */
  var complete: js.UndefOr[js.Function1[/* res */ js.UndefOr[js.Any], Unit]] = js.undefined
  /**
    * 接口调用失败时执行的回调函数
    */
  var fail: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]] = js.undefined
  /**
    * 接口调用成功时执行的回调函数
    */
  var success: js.UndefOr[js.Function1[/* res */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object WxBaseRequestConfig {
  @scala.inline
  def apply(
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    success: /* res */ js.UndefOr[js.Any] => Unit = null
  ): WxBaseRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[WxBaseRequestConfig]
  }
}

