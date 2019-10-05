package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.reportMonitor")
@js.native
object reportMonitor extends js.Object {
  /**
  	 * 自定义业务数据监控上报接口。使用前，需要在小程序管理后台-运维中心-性能监控-业务数据监控中新建监控事件，
  	 * 配置监控描述与告警类型。每一个监控事件对应唯一的监控ID，开发者最多可以创建128个监控事件。
  	 * @param name 监控ID，在小程序管理后台新建数据指标后获得
  	 * @param value 上报数值，经处理后会在小程序管理后台上展示每分钟的上报总量
  	 */
  def apply(name: String, value: Double): Unit = js.native
}

