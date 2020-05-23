package typings.winrt.Windows.Networking.NetworkOperators

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UssdMessage extends IUssdMessage

object UssdMessage {
  @scala.inline
  def apply(
    dataCodingScheme: Double,
    getPayload: () => Uint8Array,
    payloadAsText: String,
    setPayload: Uint8Array => Unit
  ): UssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme.asInstanceOf[js.Any], getPayload = js.Any.fromFunction0(getPayload), payloadAsText = payloadAsText.asInstanceOf[js.Any], setPayload = js.Any.fromFunction1(setPayload))
    __obj.asInstanceOf[UssdMessage]
  }
}

