package typings.twilio.libJwtAccessTokenMod

import typings.twilio.twilioStrings.ip_messaging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/jwt/AccessToken", "IpMessagingGrant")
@js.native
open class IpMessagingGrant ()
  extends Grant[ChatGrantOptions, ChatGrantPayload, ip_messaging]
     with ChatGrantOptions {
  def this(opts: ChatGrantOptions) = this()
}
