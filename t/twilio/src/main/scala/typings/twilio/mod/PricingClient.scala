package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "PricingClient")
@js.native
class PricingClient () extends Client {
  def this(sid: String) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: String, options: ClientOptions) = this()
  def this(sid: String, tkn: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
  def this(sid: String, tkn: String, options: ClientOptions) = this()
  
  var messaging: PricingMessagingResource = js.native
  
  var phoneNumbers: PricingPhoneNumberResource = js.native
  
  var voice: PricingVoiceResource = js.native
}
