package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBluetoothAdapterStateChangeResult extends js.Object {
  /**
    * 蓝牙适配器是否可用
    */
  var available: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否正在搜索设备
    */
  var discovering: js.UndefOr[Boolean] = js.undefined
}

object OnBluetoothAdapterStateChangeResult {
  @scala.inline
  def apply(available: js.UndefOr[Boolean] = js.undefined, discovering: js.UndefOr[Boolean] = js.undefined): OnBluetoothAdapterStateChangeResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available)
    if (!js.isUndefined(discovering)) __obj.updateDynamic("discovering")(discovering)
    __obj.asInstanceOf[OnBluetoothAdapterStateChangeResult]
  }
}

