package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadBLECharacteristicValueSuccess extends js.Object {
  /**
    * 错误码
    */
  var errCode: js.UndefOr[String] = js.native
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.native
}

object ReadBLECharacteristicValueSuccess {
  @scala.inline
  def apply(): ReadBLECharacteristicValueSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadBLECharacteristicValueSuccess]
  }
  @scala.inline
  implicit class ReadBLECharacteristicValueSuccessOps[Self <: ReadBLECharacteristicValueSuccess] (val x: Self) extends AnyVal {
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
    def setErrCode(value: String): Self = this.set("errCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrCode: Self = this.set("errCode", js.undefined)
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrMsg: Self = this.set("errMsg", js.undefined)
  }
  
}

