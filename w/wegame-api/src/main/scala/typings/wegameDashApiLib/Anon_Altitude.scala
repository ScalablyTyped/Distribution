package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Altitude extends js.Object {
  /**
               * 位置的精确度
               */
  var accuracy: scala.Double
  /**
               * 高度，单位 m
               */
  var altitude: scala.Double
  /**
               * 水平精度，单位 m
               */
  var horizontalAccuracy: scala.Double
  /**
               * 纬度，范围为 -90~90，负数表示南纬
               */
  var latitude: scala.Double
  /**
               * 经度，范围为 -180~180，负数表示西经
               */
  var longitude: scala.Double
  /**
               * 速度，单位 m/s
               */
  var speed: scala.Double
  /**
               * 垂直精度，单位 m（Android 无法获取，返回 0）
               */
  var verticalAccuracy: scala.Double
}

