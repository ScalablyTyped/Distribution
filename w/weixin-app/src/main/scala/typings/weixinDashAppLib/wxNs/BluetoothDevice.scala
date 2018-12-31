package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 蓝牙设备信息
	 */
trait BluetoothDevice extends js.Object {
  /**
  		 * int 当前蓝牙设备的信号强度
  		 */
  var RSSI: scala.Double
  /**
  		 * 当前蓝牙设备的广播内容
  		 */
  var advertisData: stdLib.ArrayBuffer
  /**
  		 * 用于区分设备的 id
  		 */
  var deviceId: java.lang.String
  /**
  		 * 蓝牙设备名称，某些设备可能没有
  		 */
  var name: java.lang.String
}

