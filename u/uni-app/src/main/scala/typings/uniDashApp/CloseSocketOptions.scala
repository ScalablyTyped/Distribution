package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseSocketOptions extends js.Object {
  /**
    * 一个数字值表示关闭连接的状态号，表示连接被关闭的原因。如果这个参数没有被指定，默认的取值是1000 （表示正常连接关闭）
    */
  var code: js.UndefOr[Double] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.undefined
  /**
    * 一个可读的字符串，表示连接被关闭的原因。这个字符串必须是不长于123字节的UTF-8 文本（不是字符）
    */
  var reason: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.undefined
}

object CloseSocketOptions {
  @scala.inline
  def apply(
    code: Int | Double = null,
    complete: /* result */ GeneralCallbackResult => Unit = null,
    fail: /* result */ GeneralCallbackResult => Unit = null,
    reason: String = null,
    success: /* result */ GeneralCallbackResult => Unit = null
  ): CloseSocketOptions = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CloseSocketOptions]
  }
}

