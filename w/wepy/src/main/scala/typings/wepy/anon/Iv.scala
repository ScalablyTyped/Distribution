package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iv extends js.Object {
  var encryptedData: String
  var iv: String
  var rawData: String
  var signature: String
  var userInfo: js.Object
}

object Iv {
  @scala.inline
  def apply(encryptedData: String, iv: String, rawData: String, signature: String, userInfo: js.Object): Iv = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iv]
  }
}

