package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.UssdMessage")
@js.native
class UssdMessage protected () extends IUssdMessage {
  def this(messageText: java.lang.String) = this()
  /* CompleteClass */
  override var dataCodingScheme: scala.Double = js.native
  /* CompleteClass */
  override var payloadAsText: java.lang.String = js.native
  /* CompleteClass */
  override def getPayload(): stdLib.Uint8Array = js.native
  /* CompleteClass */
  override def setPayload(value: stdLib.Uint8Array): scala.Unit = js.native
}

