package typings.weixinApp.wx

import typings.weixinApp.weixinAppStrings.ok
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
  def apply(adapterState: BluetoothAdapterState, errMsg: ok | String): BluetoothAdapterStateData = {
    val __obj = js.Dynamic.literal(adapterState = adapterState.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothAdapterStateData]
  }
}

