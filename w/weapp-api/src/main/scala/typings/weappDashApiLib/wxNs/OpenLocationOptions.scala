package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenLocationOptions extends js.Object {
  /** 地址的详细说明 */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** 纬度，范围为-90~90，负数表示南纬 */
  var latitude: scala.Double
  /** 经度，范围为-180~180，负数表示西经 */
  var longitude: scala.Double
  /** 位置名 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** 缩放比例，范围1~28，默认为28 */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ResponseCallback] = js.undefined
}

