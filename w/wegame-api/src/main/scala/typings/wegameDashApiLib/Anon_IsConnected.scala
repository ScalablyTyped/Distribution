package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsConnected extends js.Object {
  /**
    * 当前是否有网络链接
    */
  var isConnected: scala.Boolean
  /**
    * none - 无网络, unknown - Android 下不常见的网络类型
    */
  var networkType: wegameDashApiLib.wxNs.typesNs.NetworkType
}

