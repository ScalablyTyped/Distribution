package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceCharacteristicsSuccess extends js.Object {
  /**
    * 设备特征值列表
    */
  var characteristics: js.UndefOr[js.Array[GetBLEDeviceCharacteristicsSuccessData]] = js.undefined
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
}

object GetBLEDeviceCharacteristicsSuccess {
  @scala.inline
  def apply(characteristics: js.Array[GetBLEDeviceCharacteristicsSuccessData] = null, errMsg: String = null): GetBLEDeviceCharacteristicsSuccess = {
    val __obj = js.Dynamic.literal()
    if (characteristics != null) __obj.updateDynamic("characteristics")(characteristics.asInstanceOf[js.Any])
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsSuccess]
  }
}

