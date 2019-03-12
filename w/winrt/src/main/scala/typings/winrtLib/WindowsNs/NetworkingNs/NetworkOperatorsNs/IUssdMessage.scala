package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUssdMessage extends js.Object {
  var dataCodingScheme: scala.Double
  var payloadAsText: java.lang.String
  def getPayload(): stdLib.Uint8Array
  def setPayload(value: stdLib.Uint8Array): scala.Unit
}

object IUssdMessage {
  @scala.inline
  def apply(
    dataCodingScheme: scala.Double,
    getPayload: () => stdLib.Uint8Array,
    payloadAsText: java.lang.String,
    setPayload: stdLib.Uint8Array => scala.Unit
  ): IUssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme, getPayload = js.Any.fromFunction0(getPayload), payloadAsText = payloadAsText, setPayload = js.Any.fromFunction1(setPayload))
  
    __obj.asInstanceOf[IUssdMessage]
  }
}

