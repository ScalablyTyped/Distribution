package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptedData extends js.Object {
  var encryptedData: java.lang.String
  var errMsg: java.lang.String
  var iv: java.lang.String
}

object Anon_EncryptedData {
  @scala.inline
  def apply(encryptedData: java.lang.String, errMsg: java.lang.String, iv: java.lang.String): Anon_EncryptedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encryptedData")(encryptedData)
    __obj.updateDynamic("errMsg")(errMsg)
    __obj.updateDynamic("iv")(iv)
    __obj.asInstanceOf[Anon_EncryptedData]
  }
}

