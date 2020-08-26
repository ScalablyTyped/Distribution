package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBluetoothAdapterStateChangeResult extends js.Object {
  /**
    * 蓝牙适配器是否可用
    */
  var available: js.UndefOr[Boolean] = js.native
  /**
    * 是否正在搜索设备
    */
  var discovering: js.UndefOr[Boolean] = js.native
}

object OnBluetoothAdapterStateChangeResult {
  @scala.inline
  def apply(): OnBluetoothAdapterStateChangeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBluetoothAdapterStateChangeResult]
  }
  @scala.inline
  implicit class OnBluetoothAdapterStateChangeResultOps[Self <: OnBluetoothAdapterStateChangeResult] (val x: Self) extends AnyVal {
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
    def deleteAvailable: Self = this.set("available", js.undefined)
    @scala.inline
    def setDiscovering(value: Boolean): Self = this.set("discovering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscovering: Self = this.set("discovering", js.undefined)
  }
  
}

