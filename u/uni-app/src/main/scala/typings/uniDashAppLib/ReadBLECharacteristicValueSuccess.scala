package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadBLECharacteristicValueSuccess extends js.Object {
  /**
    * 错误码
    */
  var errCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[java.lang.String] = js.undefined
}

object ReadBLECharacteristicValueSuccess {
  @scala.inline
  def apply(errCode: java.lang.String = null, errMsg: java.lang.String = null): ReadBLECharacteristicValueSuccess = {
    val __obj = js.Dynamic.literal()
    if (errCode != null) __obj.updateDynamic("errCode")(errCode)
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg)
    __obj.asInstanceOf[ReadBLECharacteristicValueSuccess]
  }
}

