package typings.uniApp

import typings.std.ArrayBuffer
import typings.uniApp.uniAppStrings.CONNECT
import typings.uniApp.uniAppStrings.DELETE
import typings.uniApp.uniAppStrings.GET
import typings.uniApp.uniAppStrings.HEAD
import typings.uniApp.uniAppStrings.OPTIONS
import typings.uniApp.uniAppStrings.POST
import typings.uniApp.uniAppStrings.PUT
import typings.uniApp.uniAppStrings.TRACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.native
  /**
    * 请求的参数
    */
  var data: js.UndefOr[String | js.Object | ArrayBuffer] = js.native
  /**
    * 如果设为json，会尝试对返回的数据做一次 JSON.parse
    */
  var dataType: js.UndefOr[String] = js.native
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.native
  /**
    * 设置请求的 header，header 中不能设置 Referer。
    */
  var header: js.UndefOr[js.Any] = js.native
  /**
    * 默认为 GET
    * 可以是：OPTIONS，GET，HEAD，POST，PUT，DELETE，TRACE，CONNECT
    */
  var method: js.UndefOr[OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.native
  /**
    * 设置响应的数据类型。合法值：text、arraybuffer
    */
  var responseType: js.UndefOr[String] = js.native
  /**
    * 成功返回的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ RequestSuccessCallbackResult, Unit]] = js.native
  /**
    * 资源url
    */
  var url: js.UndefOr[String] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
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
    def setComplete(value: /* result */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setData(value: String | js.Object | ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setFail(value: /* result */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setMethod(value: OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ RequestSuccessCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

