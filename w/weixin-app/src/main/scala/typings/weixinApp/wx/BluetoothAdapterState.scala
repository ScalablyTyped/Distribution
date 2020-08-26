package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothAdapterState extends js.Object {
  /**
    * 蓝牙适配器是否可用
    */
  var available: Boolean = js.native
  /**
    * 蓝牙适配器是否处于搜索状态
    */
  var discovering: Boolean = js.native
}

object BluetoothAdapterState {
  @scala.inline
  def apply(available: Boolean, discovering: Boolean): BluetoothAdapterState = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothAdapterState]
  }
  @scala.inline
  implicit class BluetoothAdapterStateOps[Self <: BluetoothAdapterState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailable(value: Boolean): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiscovering(value: Boolean): Self = this.set("discovering", value.asInstanceOf[js.Any])
  }
  
}

