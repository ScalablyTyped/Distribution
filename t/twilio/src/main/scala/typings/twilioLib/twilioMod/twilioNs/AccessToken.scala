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

