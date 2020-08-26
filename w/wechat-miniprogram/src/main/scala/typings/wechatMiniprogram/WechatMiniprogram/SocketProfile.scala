package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 网络请求过程中一些调试信息
  *
  * 最低基础库： `2.10.4` */
@js.native
trait SocketProfile extends js.Object {
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
  implicit class SocketProfileOps[Self <: SocketProfile] (val x: Self) extends AnyVal {
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
    def setConnectEnd(value: Double): Self = this.set("connectEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectStart(value: Double): Self = this.set("connectStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setCost(value: Double): Self = this.set("cost", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainLookupEnd(value: Double): Self = this.set("domainLookupEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainLookupStart(value: Double): Self = this.set("domainLookupStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchStart(value: Double): Self = this.set("fetchStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandshakeCost(value: Double): Self = this.set("handshakeCost", value.asInstanceOf[js.Any])
    @scala.inline
    def setRtt(value: Double): Self = this.set("rtt", value.asInstanceOf[js.Any])
  }
  
}

