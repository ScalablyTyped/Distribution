package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothAdapterStateData extends ErrMsgResponse {
  /**
  		 * 蓝牙适配器信息
  		 */
  var adapterState: BluetoothAdapterState
}

object BluetoothAdapterStateData {
  @scala.inline
  def apply(
    adapterState: BluetoothAdapterState,
    errMsg: weixinDashAppLib.weixinDashAppLibStrings.ok | java.lang.String
  ): BluetoothAdapterStateData = {
    val __obj = js.Dynamic.literal(adapterState = adapterState, errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BluetoothAdapterStateData]
  }
}

