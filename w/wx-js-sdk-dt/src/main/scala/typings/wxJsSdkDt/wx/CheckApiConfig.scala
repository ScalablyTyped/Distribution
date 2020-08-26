package typings.wxJsSdkDt.wx

import typings.wxJsSdkDt.anon.CheckResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 判断当前客户端版本是否支持指定 JS 接口, checkJsApi 接口是客户端6.0.2新引入的一个预留接口，第一期开放的接口均可不使用 checkJsApi 来检测
  */
@js.native
trait CheckApiConfig extends WxBaseRequestConfig {
  /**
    * 需要检测的JS接口列表
    */
  var jsApiList: js.Array[String] = js.native
  /**
    * 以键值对的形式返回，可用的 api 值 true，不可用为 false
    * 如：{"checkResult":{"chooseImage":true},"errMsg":"checkJsApi:ok"}
    */
  @JSName("success")
  def success_MCheckApiConfig(res: CheckResult): Unit = js.native
}

object CheckApiConfig {
  @scala.inline
  def apply(jsApiList: js.Array[String], success: CheckResult => Unit): CheckApiConfig = {
    val __obj = js.Dynamic.literal(jsApiList = jsApiList.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[CheckApiConfig]
  }
  @scala.inline
  implicit class CheckApiConfigOps[Self <: CheckApiConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJsApiListVarargs(value: String*): Self = this.set("jsApiList", js.Array(value :_*))
    @scala.inline
    def setJsApiList(value: js.Array[String]): Self = this.set("jsApiList", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: CheckResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

