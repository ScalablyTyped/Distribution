package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "AccessToken")
@js.native
class AccessToken protected () extends StObject {
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
object AccessToken {
  
  @JSImport("twilio", "AccessToken")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio", "AccessToken.ALGORITHMS")
  @js.native
  def ALGORITHMS: js.Array[String] = js.native
  @scala.inline
  def ALGORITHMS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALGORITHMS")(x.asInstanceOf[js.Any])
  
  @JSImport("twilio", "AccessToken.ConversationGrant")
  @js.native
  def ConversationGrant: ConversationsGrant = js.native
  @scala.inline
  def ConversationGrant_=(x: ConversationsGrant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConversationGrant")(x.asInstanceOf[js.Any])
  
  @JSImport("twilio", "AccessToken.DEFAULT_ALGORITHM")
  @js.native
  def DEFAULT_ALGORITHM: String = js.native
  @scala.inline
  def DEFAULT_ALGORITHM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ALGORITHM")(x.asInstanceOf[js.Any])
  
  @JSImport("twilio", "AccessToken.IpMessagingGrant")
  @js.native
  def IpMessagingGrant: typings.twilio.mod.IpMessagingGrant = js.native
  @scala.inline
  def IpMessagingGrant_=(x: IpMessagingGrant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IpMessagingGrant")(x.asInstanceOf[js.Any])
}
