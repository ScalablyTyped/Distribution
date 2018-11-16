package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a message that's received from a subscription. */
@JSGlobal("Windows.Networking.Proximity.ProximityMessage")
@js.native
abstract class ProximityMessage () extends js.Object {
  /** Gets the binary data of the message. */
  var data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the message data as text. */
  var dataAsString: java.lang.String = js.native
  /** Gets the type of the message. */
  var messageType: java.lang.String = js.native
  /** Gets the subscription ID of the message. */
  var subscriptionId: scala.Double = js.native
}

