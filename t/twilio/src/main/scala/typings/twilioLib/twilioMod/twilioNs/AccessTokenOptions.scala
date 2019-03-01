package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessTokenOptions extends js.Object {
  var identity: java.lang.String
  var nbf: scala.Double
  var ttl: scala.Double
}

object AccessTokenOptions {
  @scala.inline
  def apply(identity: java.lang.String, nbf: scala.Double, ttl: scala.Double): AccessTokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identity")(identity)
    __obj.updateDynamic("nbf")(nbf)
    __obj.updateDynamic("ttl")(ttl)
    __obj.asInstanceOf[AccessTokenOptions]
  }
}

