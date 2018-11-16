package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LocationData extends js.Object {
  /** 位置的精确度 */
  var accuracy: scala.Double
  /** 纬度，浮点数，范围为-90~90，负数表示南纬 */
  var latitude: scala.Double
  /** 经度，浮点数，范围为-180~180，负数表示西经 */
  var longitude: scala.Double
  /** 速度，浮点数，单位m/s */
  var speed: scala.Double
}

