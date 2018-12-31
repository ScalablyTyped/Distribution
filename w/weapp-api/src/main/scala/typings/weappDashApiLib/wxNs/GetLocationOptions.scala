package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocationOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** 默认为 wgs84 返回 gps 坐标，gcj02 返回可用于wx.openLocation的坐标 */
  var `type`: js.UndefOr[
    weappDashApiLib.weappDashApiLibStrings.wgs84 | weappDashApiLib.weappDashApiLibStrings.gcj02
  ] = js.undefined
  /** 接口调用成功的回调函数，返回内容详见返回参数说明。 */
  def success(res: LocationData): scala.Unit
}

