package typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUssdMessage extends js.Object {
  var dataCodingScheme: Double
  var payloadAsText: String
  def getPayload(): Uint8Array
  def setPayload(value: Uint8Array): Unit
}

object IUssdMessage {
  @scala.inline
  def apply(
    dataCodingScheme: Double,
    getPayload: () => Uint8Array,
    payloadAsText: String,
    setPayload: Uint8Array => Unit
  ): IUssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme, getPayload = js.Any.fromFunction0(getPayload), payloadAsText = payloadAsText, setPayload = js.Any.fromFunction1(setPayload))
  
    __obj.asInstanceOf[IUssdMessage]
  }
}

