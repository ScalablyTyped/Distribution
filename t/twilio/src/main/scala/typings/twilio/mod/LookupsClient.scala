package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "LookupsClient")
@js.native
class LookupsClient () extends Client {
  def this(sid: String) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: String, options: ClientOptions) = this()
  def this(sid: String, tkn: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
  def this(sid: String, tkn: String, options: ClientOptions) = this()
  @JSName("phoneNumbers")
  var phoneNumbers_Original: PhoneNumberResource = js.native
  def phoneNumbers(resourceSid: String): PhoneNumberInstance = js.native
}

