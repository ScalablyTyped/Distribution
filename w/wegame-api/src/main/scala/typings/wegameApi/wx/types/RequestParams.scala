package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StringDictionary
import typings.wegameApi.anon.Header
import typings.wegameApi.wegameApiStrings.arraybuffer
import typings.wegameApi.wegameApiStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 请求的参数
    */
  var data: js.UndefOr[String | StringDictionary[js.Any]] = js.native
  /**
    * 返回的数据格式
    */
  var dataType: js.UndefOr[json | arraybuffer] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 设置请求的 header，header 中不能设置 Referer
    */
  var header: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * HTTP 请求方法
    */
  var method: js.UndefOr[RequestMethod] = js.native
  /**
    * res.data usually can be string or ArrayBuffer
    */
  var success: js.UndefOr[js.Function1[/* res */ Header, Unit]] = js.native
  /**
    * 开发者服务器接口地址
    */
  var url: String = js.native
}

object RequestParams {
  @scala.inline
  def apply(url: String): RequestParams = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParams]
  }
  @scala.inline
  implicit class RequestParamsOps[Self <: RequestParams] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setData(value: String | StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataType(value: json | arraybuffer): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setHeader(value: StringDictionary[String]): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setMethod(value: RequestMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ Header => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

