package typings.twilio.accessTokenMod

import typings.twilio.twilioStrings.rtc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/jwt/AccessToken", "ConversationsGrant")
@js.native
open class ConversationsGrant () extends Grant[ConversationsGrantOptions, ConversationsGrantPayload, rtc] {
  def this(opts: ConversationsGrantOptions) = this()
  
  var configurationProfileSid: js.UndefOr[String] = js.native
}
