package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudID extends js.Object {
  /**
    * 敏感数据对应的云 ID，开通云开发的小程序才会返回，可通过云调用直接获取开放数据，详细见云调用直接获取开放数据
    */
  var cloudID: String = js.native
  /**
    * 加密数据，包含互动型托管数据的值。解密后的结果为一个 KVDataList，每一项为一个 KVData。 用户数据的签名验证和加解密
    */
  var encryptedData: String = js.native
}

object CloudID {
  @scala.inline
  def apply(cloudID: String, encryptedData: String): CloudID = {
    val __obj = js.Dynamic.literal(cloudID = cloudID.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudID]
  }
  @scala.inline
  implicit class CloudIDOps[Self <: CloudID] (val x: Self) extends AnyVal {
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
    def setCloudID(value: String): Self = this.set("cloudID", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncryptedData(value: String): Self = this.set("encryptedData", value.asInstanceOf[js.Any])
  }
  
}

