package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectSocketOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ConnectSocketCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ConnectSocketFailCallback] = js.undefined
  
  /** HTTP Header，Header 中不能设置 Referer */
  var header: js.UndefOr[IAnyObject] = js.undefined
  
  /** 是否开启压缩扩展
    *
    * 最低基础库： `2.8.0` */
  var perMessageDeflate: js.UndefOr[Boolean] = js.undefined
  
  /** 子协议数组
    *
    * 最低基础库： `1.4.0` */
  var protocols: js.UndefOr[js.Array[String]] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ConnectSocketSuccessCallback] = js.undefined
  
  /** 建立 TCP 连接的时候的 TCP_NODELAY 设置
    *
    * 最低基础库： `2.4.0` */
  var tcpNoDelay: js.UndefOr[Boolean] = js.undefined
  
  /** 超时时间，单位为毫秒
    *
    * 最低基础库： `2.10.0` */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** 开发者服务器 wss 接口地址 */
  var url: String
}
object ConnectSocketOption {
  
  @scala.inline
  def apply(url: String): ConnectSocketOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectSocketOption]
  }
  
  @scala.inline
  implicit class ConnectSocketOptionMutableBuilder[Self <: ConnectSocketOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setHeader(value: IAnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setPerMessageDeflate(value: Boolean): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerMessageDeflateUndefined: Self = StObject.set(x, "perMessageDeflate", js.undefined)
    
    @scala.inline
    def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTcpNoDelay(value: Boolean): Self = StObject.set(x, "tcpNoDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpNoDelayUndefined: Self = StObject.set(x, "tcpNoDelay", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
