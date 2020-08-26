package typings.uniApp

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
trait ConnectSocketOption extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * HTTP 请求 Header，header 中不能设置 Referer
    */
  var header: js.UndefOr[js.Any] = js.native
  /**
    * 默认为 GET
    * 可以是：OPTIONS，GET，HEAD，POST，PUT，DELETE，TRACE，CONNECT
    */
  var method: js.UndefOr[OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.native
  /**
    * 子协议数组
    */
  var protocols: js.UndefOr[js.Array[String]] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 开发者服务器接口地址，必须是 wss 协议，且域名必须是后台配置的合法域名
    */
  var url: js.UndefOr[String] = js.native
}

object ConnectSocketOption {
  @scala.inline
  def apply(): ConnectSocketOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectSocketOption]
  }
  @scala.inline
  implicit class ConnectSocketOptionOps[Self <: ConnectSocketOption] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
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
    def setProtocolsVarargs(value: String*): Self = this.set("protocols", js.Array(value :_*))
    @scala.inline
    def setProtocols(value: js.Array[String]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

