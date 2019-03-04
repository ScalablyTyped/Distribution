package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsConnected extends js.Object {
  var isConnected: scala.Boolean
  var networkType: weixinDashAppLib.wxNs.networkType
}

object Anon_IsConnected {
  @scala.inline
  def apply(isConnected: scala.Boolean, networkType: weixinDashAppLib.wxNs.networkType): Anon_IsConnected = {
    val __obj = js.Dynamic.literal(isConnected = isConnected, networkType = networkType)
  
    __obj.asInstanceOf[Anon_IsConnected]
  }
}

