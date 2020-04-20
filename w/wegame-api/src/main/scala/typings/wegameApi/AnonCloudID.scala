package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloudID extends js.Object {
  /**
    * 敏感数据对应的云 ID，开通云开发的小程序才会返回，可通过云调用直接获取开放数据，详细见云调用直接获取开放数据
    */
  var cloudID: String
  /**
    * 加密数据，包含互动型托管数据的值。解密后的结果为一个 KVDataList，每一项为一个 KVData。 用户数据的签名验证和加解密
    */
  var encryptedData: String
}

object AnonCloudID {
  @scala.inline
  def apply(cloudID: String, encryptedData: String): AnonCloudID = {
    val __obj = js.Dynamic.literal(cloudID = cloudID.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloudID]
  }
}

