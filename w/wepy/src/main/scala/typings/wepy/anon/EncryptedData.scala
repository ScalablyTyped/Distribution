package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptedData extends js.Object {
  var encryptedData: String = js.native
  var errMsg: String = js.native
  var iv: String = js.native
}

object EncryptedData {
  @scala.inline
  def apply(encryptedData: String, errMsg: String, iv: String): EncryptedData = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedData]
  }
  @scala.inline
  implicit class EncryptedDataOps[Self <: EncryptedData] (val x: Self) extends AnyVal {
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
    def setEncryptedData(value: String): Self = this.set("encryptedData", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setIv(value: String): Self = this.set("iv", value.asInstanceOf[js.Any])
  }
  
}

