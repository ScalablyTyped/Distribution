package typings.waitDashOn.waitDashOnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpSignature extends js.Object {
  var key: String
  var keyId: String
}

object HttpSignature {
  @scala.inline
  def apply(key: String, keyId: String): HttpSignature = {
    val __obj = js.Dynamic.literal(key = key, keyId = keyId)
  
    __obj.asInstanceOf[HttpSignature]
  }
}

