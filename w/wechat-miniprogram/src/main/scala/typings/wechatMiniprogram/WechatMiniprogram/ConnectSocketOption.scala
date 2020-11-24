package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectSocketOption extends js.Object {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ConnectSocketCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ConnectSocketFailCallback] = js.native
  
  /** HTTP Header，Header 中不能设置 Referer */
  var header: js.UndefOr[IAnyObject] = js.native
  
  /** 是否开启压缩扩展
    *
    * 最低基础库： `2.8.0` */
  var perMessageDeflate: js.UndefOr[Boolean] = js.native
  
  /** 子协议数组
    *
    * 最低基础库： `1.4.0` */
  var protocols: js.UndefOr[js.Array[String]] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ConnectSocketSuccessCallback] = js.native
  
  /** 建立 TCP 连接的时候的 TCP_NODELAY 设置
    *
    * 最低基础库： `2.4.0` */
  var tcpNoDelay: js.UndefOr[Boolean] = js.native
  
  /** 超时时间，单位为毫秒
    *
    * 最低基础库： `2.10.0` */
  var timeout: js.UndefOr[Double] = js.native
  
  /** 开发者服务器 wss 接口地址 */
  var url: String = js.native
}
object ConnectSocketOption {
  
  @scala.inline
  def apply(url: String): ConnectSocketOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setHeader(value: IAnyObject): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setPerMessageDeflate(value: Boolean): Self = this.set("perMessageDeflate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerMessageDeflate: Self = this.set("perMessageDeflate", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: String*): Self = this.set("protocols", js.Array(value :_*))
    
    @scala.inline
    def setProtocols(value: js.Array[String]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setTcpNoDelay(value: Boolean): Self = this.set("tcpNoDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcpNoDelay: Self = this.set("tcpNoDelay", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
