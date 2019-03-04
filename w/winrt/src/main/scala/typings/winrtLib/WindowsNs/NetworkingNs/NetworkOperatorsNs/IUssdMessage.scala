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
    getPayload: js.Function0[stdLib.Uint8Array],
    payloadAsText: java.lang.String,
    setPayload: js.Function1[stdLib.Uint8Array, scala.Unit]
  ): IUssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme, getPayload = getPayload, payloadAsText = payloadAsText, setPayload = setPayload)
  
    __obj.asInstanceOf[IUssdMessage]
  }
}

