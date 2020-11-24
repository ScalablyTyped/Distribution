package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "AccessToken")
@js.native
class AccessToken protected () extends js.Object {
  def this(accountSid: String, keySid: String, secret: String) = this()
  def this(accountSid: String, keySid: String, secret: String, opts: AccessTokenOptions) = this()
  
  var accountSid: String = js.native
  
  def addGrant(grant: Grant): Unit = js.native
  
  var grants: js.Array[Grant] = js.native
  
  var identity: String = js.native
  
  var keySid: String = js.native
  
  var nbf: Double = js.native
  
  var secret: String = js.native
  
  def toJwt(algorithm: String): js.Any = js.native
  
  var ttl: Double = js.native
}
/* static members */
@JSImport("twilio", "AccessToken")
@js.native
object AccessToken extends js.Object {
  
  var ALGORITHMS: js.Array[String] = js.native
  
  var ConversationGrant: ConversationsGrant = js.native
  
  var DEFAULT_ALGORITHM: String = js.native
  
  var IpMessagingGrant: typings.twilio.mod.IpMessagingGrant = js.native
}
