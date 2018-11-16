package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "AccessToken")
@js.native
class AccessToken protected ()
  extends twilioLib.twilioMod.twilioNs.AccessToken {
  def this(accountSid: java.lang.String, keySid: java.lang.String, secret: java.lang.String) = this()
  def this(accountSid: java.lang.String, keySid: java.lang.String, secret: java.lang.String, opts: twilioLib.twilioMod.twilioNs.AccessTokenOptions) = this()
  /* CompleteClass */
  override var accountSid: java.lang.String = js.native
  /* CompleteClass */
  override var grants: js.Array[twilioLib.twilioMod.twilioNs.Grant] = js.native
  /* CompleteClass */
  override var identity: java.lang.String = js.native
  /* CompleteClass */
  override var keySid: java.lang.String = js.native
  /* CompleteClass */
  override var nbf: scala.Double = js.native
  /* CompleteClass */
  override var secret: java.lang.String = js.native
  /* CompleteClass */
  override var ttl: scala.Double = js.native
  /* CompleteClass */
  override def addGrant(grant: twilioLib.twilioMod.twilioNs.Grant): scala.Unit = js.native
  /* CompleteClass */
  override def toJwt(algorithm: java.lang.String): js.Any = js.native
}

@JSImport("twilio", "AccessToken")
@js.native
object AccessToken extends js.Object {
  var ALGORITHMS: js.Array[java.lang.String] = js.native
  var ConversationGrant: twilioLib.twilioMod.twilioNs.ConversationsGrant = js.native
  var DEFAULT_ALGORITHM: java.lang.String = js.native
  var IpMessagingGrant: twilioLib.twilioMod.twilioNs.IpMessagingGrant = js.native
}

