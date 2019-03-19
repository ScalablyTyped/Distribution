package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBluetoothAdapterStateSuccess extends js.Object {
  /**
    * 蓝牙适配器是否可用
    */
  var available: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否正在搜索设备
    */
  var discovering: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[java.lang.String] = js.undefined
}

object GetBluetoothAdapterStateSuccess {
  @scala.inline
  def apply(
    available: js.UndefOr[scala.Boolean] = js.undefined,
    discovering: js.UndefOr[scala.Boolean] = js.undefined,
    errMsg: java.lang.String = null
  ): GetBluetoothAdapterStateSuccess = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available)
    if (!js.isUndefined(discovering)) __obj.updateDynamic("discovering")(discovering)
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg)
    __obj.asInstanceOf[GetBluetoothAdapterStateSuccess]
  }
}

