package typings.twilio.libJwtAccessTokenMod

import typings.twilio.twilioStrings.chat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/jwt/AccessToken", "ChatGrant")
@js.native
/**
  * @param options - ...
  * @param options.serviceSid - The service unique ID
  * @param options.endpointId - The endpoint ID
  * @param options.deploymentRoleSid - SID of the deployment role to be
  *                 assigned to the user
  * @param options.pushCredentialSid - The Push Credentials SID
  */
open class ChatGrant ()
  extends Grant[ChatGrantOptions, ChatGrantPayload, chat]
     with ChatGrantOptions {
  def this(options: ChatGrantOptions) = this()
}
