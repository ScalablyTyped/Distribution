package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 网络请求过程中一些调试信息
  *
  * 最低基础库： `2.10.4` */
@js.native
trait DownloadProfile extends StObject {
  
  /** SSL建立完成的时间,如果不是安全连接,则值为 0 */
  var SSLconnectionEnd: Double = js.native
  
  /** SSL建立连接的时间,如果不是安全连接,则值为 0 */
  var SSLconnectionStart: Double = js.native
  
  /** HTTP（TCP） 完成建立连接的时间（完成握手），如果是持久连接，则与 fetchStart 值相等。注意如果在传输层发生了错误且重新建立连接，则这里显示的是新建立的连接完成的时间。注意这里握手结束，包括安全连接建立完成、SOCKS 授权通过 */
  var connectEnd: Double = js.native
  
  /** HTTP（TCP） 开始建立连接的时间，如果是持久连接，则与 fetchStart 值相等。注意如果在传输层发生了错误且重新建立连接，则这里显示的是新建立的连接开始的时间 */
  var connectStart: Double = js.native
  
  /** DNS 域名查询完成的时间，如果使用了本地缓存（即无 DNS 查询）或持久连接，则与 fetchStart 值相等 */
  var domainLookupEnd: Double = js.native
  
  /** DNS 域名查询开始的时间，如果使用了本地缓存（即无 DNS 查询）或持久连接，则与 fetchStart 值相等 */
  var domainLookupStart: Double = js.native
  
  /** 评估当前网络下载的kbps */
  var downstreamThroughputKbpsEstimate: Double = js.native
  
  /** 评估的网络状态 slow 2g/2g/3g/4g */
  var estimate_nettype: String = js.native
  
  /** 组件准备好使用 HTTP 请求抓取资源的时间，这发生在检查本地缓存之前 */
  var fetchStart: Double = js.native
  
  /** 协议层根据多个请求评估当前网络的 rtt（仅供参考） */
  var httpRttEstimate: Double = js.native
  
  /** 当前请求的IP */
  var peerIP: String = js.native
  
  /** 当前请求的端口 */
  var port: Double = js.native
  
  /** 收到字节数 */
  var receivedBytedCount: Double = js.native
  
  /** 最后一个 HTTP 重定向完成时的时间。有跳转且是同域名内部的重定向才算，否则值为 0 */
  var redirectEnd: Double = js.native
  
  /** 第一个 HTTP 重定向发生时的时间。有跳转且是同域名内的重定向才算，否则值为 0 */
  var redirectStart: Double = js.native
  
  /** HTTP请求读取真实文档结束的时间 */
  var requestEnd: Double = js.native
  
  /** HTTP请求读取真实文档开始的时间（完成建立连接），包括从本地读取缓存。连接错误重连时，这里显示的也是新建立连接的时间 */
  var requestStart: Double = js.native
  
  /** HTTP 响应全部接收完成的时间（获取到最后一个字节），包括从本地读取缓存 */
  var responseEnd: Double = js.native
  
  /** HTTP 开始接收响应的时间（获取到第一个字节），包括从本地读取缓存 */
  var responseStart: Double = js.native
  
  /** 当次请求连接过程中实时 rtt */
  var rtt: Double = js.native
  
  /** 发送的字节数 */
  var sendBytesCount: Double = js.native
  
  /** 是否复用连接 */
  var socketReused: Boolean = js.native
  
  /** 当前网络的实际下载kbps */
  var throughputKbps: Double = js.native
  
  /** 传输层根据多个请求评估的当前网络的 rtt（仅供参考） */
  var transportRttEstimate: Double = js.native
}
object DownloadProfile {
  
  @scala.inline
  def apply(
    SSLconnectionEnd: Double,
    SSLconnectionStart: Double,
    connectEnd: Double,
    connectStart: Double,
    domainLookupEnd: Double,
    domainLookupStart: Double,
    downstreamThroughputKbpsEstimate: Double,
    estimate_nettype: String,
    fetchStart: Double,
    httpRttEstimate: Double,
    peerIP: String,
    port: Double,
    receivedBytedCount: Double,
    redirectEnd: Double,
    redirectStart: Double,
    requestEnd: Double,
    requestStart: Double,
    responseEnd: Double,
    responseStart: Double,
    rtt: Double,
    sendBytesCount: Double,
    socketReused: Boolean,
    throughputKbps: Double,
    transportRttEstimate: Double
  ): DownloadProfile = {
    val __obj = js.Dynamic.literal(SSLconnectionEnd = SSLconnectionEnd.asInstanceOf[js.Any], SSLconnectionStart = SSLconnectionStart.asInstanceOf[js.Any], connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], downstreamThroughputKbpsEstimate = downstreamThroughputKbpsEstimate.asInstanceOf[js.Any], estimate_nettype = estimate_nettype.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], httpRttEstimate = httpRttEstimate.asInstanceOf[js.Any], peerIP = peerIP.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], receivedBytedCount = receivedBytedCount.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestEnd = requestEnd.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], rtt = rtt.asInstanceOf[js.Any], sendBytesCount = sendBytesCount.asInstanceOf[js.Any], socketReused = socketReused.asInstanceOf[js.Any], throughputKbps = throughputKbps.asInstanceOf[js.Any], transportRttEstimate = transportRttEstimate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProfile]
  }
  
  @scala.inline
  implicit class DownloadProfileMutableBuilder[Self <: DownloadProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectEnd(value: Double): Self = StObject.set(x, "connectEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectStart(value: Double): Self = StObject.set(x, "connectStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainLookupEnd(value: Double): Self = StObject.set(x, "domainLookupEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainLookupStart(value: Double): Self = StObject.set(x, "domainLookupStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownstreamThroughputKbpsEstimate(value: Double): Self = StObject.set(x, "downstreamThroughputKbpsEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimate_nettype(value: String): Self = StObject.set(x, "estimate_nettype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchStart(value: Double): Self = StObject.set(x, "fetchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRttEstimate(value: Double): Self = StObject.set(x, "httpRttEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerIP(value: String): Self = StObject.set(x, "peerIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedBytedCount(value: Double): Self = StObject.set(x, "receivedBytedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectEnd(value: Double): Self = StObject.set(x, "redirectEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectStart(value: Double): Self = StObject.set(x, "redirectStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestEnd(value: Double): Self = StObject.set(x, "requestEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestStart(value: Double): Self = StObject.set(x, "requestStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseEnd(value: Double): Self = StObject.set(x, "responseEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStart(value: Double): Self = StObject.set(x, "responseStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtt(value: Double): Self = StObject.set(x, "rtt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSLconnectionEnd(value: Double): Self = StObject.set(x, "SSLconnectionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSLconnectionStart(value: Double): Self = StObject.set(x, "SSLconnectionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendBytesCount(value: Double): Self = StObject.set(x, "sendBytesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketReused(value: Boolean): Self = StObject.set(x, "socketReused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThroughputKbps(value: Double): Self = StObject.set(x, "throughputKbps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportRttEstimate(value: Double): Self = StObject.set(x, "transportRttEstimate", value.asInstanceOf[js.Any])
  }
}
