package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "AccessToken")
@js.native
class AccessToken protected () extends js.Object {
  def this(accountSid: java.lang.String, keySid: java.lang.String, secret: java.lang.String) = this()
  def this(accountSid: java.lang.String, keySid: java.lang.String, secret: java.lang.String, opts: AccessTokenOptions) = this()
  var accountSid: java.lang.String = js.native
  var grants: js.Array[Grant] = js.native
  var identity: java.lang.String = js.native
  var keySid: java.lang.String = js.native
  var nbf: scala.Double = js.native
  var secret: java.lang.String = js.native
  var ttl: scala.Double = js.native
  def addGrant(grant: Grant): scala.Unit = js.native
  def toJwt(algorithm: java.lang.String): js.Any = js.native
}

/* static members */
@JSImport("twilio", "AccessToken")
@js.native
object AccessToken extends js.Object {
  var ALGORITHMS: js.Array[java.lang.String] = js.native
  var ConversationGrant: twilioLib.twilioMod.ConversationsGrant = js.native
  var DEFAULT_ALGORITHM: java.lang.String = js.native
  var IpMessagingGrant: twilioLib.twilioMod.IpMessagingGrant = js.native
}

