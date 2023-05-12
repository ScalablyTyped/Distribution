package typings.twilio.libJwtAccessTokenMod

import typings.twilio.twilioStrings.voice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/jwt/AccessToken", "VoiceGrant")
@js.native
/**
  * @param options - ...
  * @param options.incomingAllow - Whether or not this endpoint is allowed to receive incoming calls as grants.identity
  * @param options.outgoingApplicationSid - application sid to call when placing outgoing call
  * @param options.outgoingApplicationParams - request params to pass to the application
  * @param options.pushCredentialSid - Push Credential Sid to use when registering to receive incoming call notifications
  * @param options.endpointId - Specify an endpoint identifier for this device, which will allow the developer
  *                 to direct calls to a specific endpoint when multiple devices are associated with a single identity
  */
open class VoiceGrant ()
  extends Grant[VoiceGrantOptions, VoiceGrantPayload, voice]
     with VoiceGrantOptions {
  def this(options: VoiceGrantOptions) = this()
}
