package typings.wxDashJsDashSdkDashDt.wx

import typings.wxDashJsDashSdkDashDt.Anon_CheckResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 判断当前客户端版本是否支持指定 JS 接口, checkJsApi 接口是客户端6.0.2新引入的一个预留接口，第一期开放的接口均可不使用 checkJsApi 来检测
  */
trait CheckApiConfig extends WxBaseRequestConfig {
  /**
    * 需要检测的JS接口列表
    */
  var jsApiList: js.Array[String]
  /**
    * 以键值对的形式返回，可用的 api 值 true，不可用为 false
    * 如：{"checkResult":{"chooseImage":true},"errMsg":"checkJsApi:ok"}
    */
  @JSName("success")
  def success_MCheckApiConfig(res: Anon_CheckResult): Unit
}

object CheckApiConfig {
  @scala.inline
  def apply(
    jsApiList: js.Array[String],
    success: Anon_CheckResult => Unit,
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null
  ): CheckApiConfig = {
    val __obj = js.Dynamic.literal(jsApiList = jsApiList, success = js.Any.fromFunction1(success))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[CheckApiConfig]
  }
}

