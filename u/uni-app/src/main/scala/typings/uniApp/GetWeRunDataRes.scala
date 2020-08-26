package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWeRunDataRes extends js.Object {
  /**
    * 包括敏感数据在内的完整用户信息的加密数据
    */
  var encryptedData: js.UndefOr[String] = js.native
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
  /**
    * 加密算法的初始向量
    */
  var iv: js.UndefOr[String] = js.native
}

object GetWeRunDataRes {
  @scala.inline
  def apply(): GetWeRunDataRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWeRunDataRes]
  }
  @scala.inline
  implicit class GetWeRunDataResOps[Self <: GetWeRunDataRes] (val x: Self) extends AnyVal {
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
    def deleteEncryptedData: Self = this.set("encryptedData", js.undefined)
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrMsg: Self = this.set("errMsg", js.undefined)
    @scala.inline
    def setIv(value: String): Self = this.set("iv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
  }
  
}

