package typings.twilio.libJwtAccessTokenMod

import typings.twilio.twilioStrings.voice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/jwt/AccessToken", "VoiceGrant")
@js.native
open class VoiceGrant ()
  extends Grant[VoiceGrantOptions, VoiceGrantPayload, voice]
     with VoiceGrantOptions {
  def this(opts: VoiceGrantOptions) = this()
}
