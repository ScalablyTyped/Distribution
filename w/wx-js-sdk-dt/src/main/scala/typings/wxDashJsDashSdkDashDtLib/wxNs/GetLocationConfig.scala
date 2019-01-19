package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocationConfig extends WxBaseRequestConfig {
  /**
    * 默认为 wgs84 的 gps 坐标，如果要返回直接给 openLocation 用的火星坐标，可传入'gcj02'
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  @JSName("success")
  def success_MGetLocationConfig(res: Location): scala.Unit
}

