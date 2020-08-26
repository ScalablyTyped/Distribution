package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBLEDeviceCharacteristicsSuccess extends js.Object {
  /**
    * 设备特征值列表
    */
  var characteristics: js.UndefOr[js.Array[GetBLEDeviceCharacteristicsSuccessData]] = js.native
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.native
}

object GetBLEDeviceCharacteristicsSuccess {
  @scala.inline
  def apply(): GetBLEDeviceCharacteristicsSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsSuccess]
  }
  @scala.inline
  implicit class GetBLEDeviceCharacteristicsSuccessOps[Self <: GetBLEDeviceCharacteristicsSuccess] (val x: Self) extends AnyVal {
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
    def setCharacteristicsVarargs(value: GetBLEDeviceCharacteristicsSuccessData*): Self = this.set("characteristics", js.Array(value :_*))
    @scala.inline
    def setCharacteristics(value: js.Array[GetBLEDeviceCharacteristicsSuccessData]): Self = this.set("characteristics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacteristics: Self = this.set("characteristics", js.undefined)
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrMsg: Self = this.set("errMsg", js.undefined)
  }
  
}

