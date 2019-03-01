package typings
package waitDashOnLib.waitDashOnMod.waitOnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpSignature extends js.Object {
  var key: java.lang.String
  var keyId: java.lang.String
}

object HttpSignature {
  @scala.inline
  def apply(key: java.lang.String, keyId: java.lang.String): HttpSignature = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("keyId")(keyId)
    __obj.asInstanceOf[HttpSignature]
  }
}

