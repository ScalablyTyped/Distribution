package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 网络请求过程中一些调试信息
  *
  * 最低基础库： `2.10.4` */
@js.native
trait SocketProfile extends StObject {
  
  /** 完成建立连接的时间（完成握手），如果是持久连接，则与 fetchStart 值相等。注意如果在传输层发生了错误且重新建立连接，则这里显示的是新建立的连接完成的时间。注意这里握手结束，包括安全连接建立完成、SOCKS 授权通过 */
  var connectEnd: Double = js.native
  
  /** 开始建立连接的时间，如果是持久连接，则与 fetchStart 值相等。注意如果在传输层发生了错误且重新建立连接，则这里显示的是新建立的连接开始的时间 */
  var connectStart: Double = js.native
  
  /** 上层请求到返回的耗时 */
  var cost: Double = js.native
  
  /** DNS 域名查询完成的时间，如果使用了本地缓存（即无 DNS 查询）或持久连接，则与 fetchStart 值相等 */
  var domainLookupEnd: Double = js.native
  
  /** DNS 域名查询开始的时间，如果使用了本地缓存（即无 DNS 查询）或持久连接，则与 fetchStart 值相等 */
  var domainLookupStart: Double = js.native
  
  /** 组件准备好使用 SOCKET 建立请求的时间，这发生在检查本地缓存之前 */
  var fetchStart: Double = js.native
  
  /** 握手耗时 */
  var handshakeCost: Double = js.native
  
  /** 单次连接的耗时，包括 connect ，tls */
  var rtt: Double = js.native
}
object SocketProfile {
  
  @scala.inline
  def apply(
    connectEnd: Double,
    connectStart: Double,
    cost: Double,
    domainLookupEnd: Double,
    domainLookupStart: Double,
    fetchStart: Double,
    handshakeCost: Double,
    rtt: Double
  ): SocketProfile = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], handshakeCost = handshakeCost.asInstanceOf[js.Any], rtt = rtt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketProfile]
  }
  
  @scala.inline
  implicit class SocketProfileMutableBuilder[Self <: SocketProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectEnd(value: Double): Self = StObject.set(x, "connectEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectStart(value: Double): Self = StObject.set(x, "connectStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainLookupEnd(value: Double): Self = StObject.set(x, "domainLookupEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainLookupStart(value: Double): Self = StObject.set(x, "domainLookupStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchStart(value: Double): Self = StObject.set(x, "fetchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandshakeCost(value: Double): Self = StObject.set(x, "handshakeCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtt(value: Double): Self = StObject.set(x, "rtt", value.asInstanceOf[js.Any])
  }
}
