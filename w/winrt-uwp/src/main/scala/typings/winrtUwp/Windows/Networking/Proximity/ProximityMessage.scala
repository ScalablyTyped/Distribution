package typings.winrtUwp.Windows.Networking.Proximity

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a message that's received from a subscription. */
@JSGlobal("Windows.Networking.Proximity.ProximityMessage")
@js.native
abstract class ProximityMessage () extends js.Object {
  /** Gets the binary data of the message. */
  var data: IBuffer = js.native
  /** Gets the message data as text. */
  var dataAsString: String = js.native
  /** Gets the type of the message. */
  var messageType: String = js.native
  /** Gets the subscription ID of the message. */
  var subscriptionId: Double = js.native
}

