package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessToken extends js.Object {
  var accountSid: java.lang.String
  var grants: js.Array[Grant]
  var identity: java.lang.String
  var keySid: java.lang.String
  var nbf: scala.Double
  var secret: java.lang.String
  var ttl: scala.Double
  def addGrant(grant: Grant): scala.Unit
  def toJwt(algorithm: java.lang.String): js.Any
}

object AccessToken {
  @scala.inline
  def apply(
    accountSid: java.lang.String,
    addGrant: js.Function1[Grant, scala.Unit],
    grants: js.Array[Grant],
    identity: java.lang.String,
    keySid: java.lang.String,
    nbf: scala.Double,
    secret: java.lang.String,
    toJwt: js.Function1[java.lang.String, js.Any],
    ttl: scala.Double
  ): AccessToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accountSid")(accountSid)
    __obj.updateDynamic("addGrant")(addGrant)
    __obj.updateDynamic("grants")(grants)
    __obj.updateDynamic("identity")(identity)
    __obj.updateDynamic("keySid")(keySid)
    __obj.updateDynamic("nbf")(nbf)
    __obj.updateDynamic("secret")(secret)
    __obj.updateDynamic("toJwt")(toJwt)
    __obj.updateDynamic("ttl")(ttl)
    __obj.asInstanceOf[AccessToken]
  }
}

