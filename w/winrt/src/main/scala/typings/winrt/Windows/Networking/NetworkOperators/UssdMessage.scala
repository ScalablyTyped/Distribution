package typings.winrt.Windows.Networking.NetworkOperators

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.UssdMessage")
@js.native
class UssdMessage protected () extends IUssdMessage {
  def this(messageText: String) = this()
  /* CompleteClass */
  override var dataCodingScheme: Double = js.native
  /* CompleteClass */
  override var payloadAsText: String = js.native
  /* CompleteClass */
  override def getPayload(): Uint8Array = js.native
  /* CompleteClass */
  override def setPayload(value: Uint8Array): Unit = js.native
}

