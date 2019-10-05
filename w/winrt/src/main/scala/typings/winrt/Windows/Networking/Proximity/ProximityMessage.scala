package typings.winrt.Windows.Networking.Proximity

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Proximity.ProximityMessage")
@js.native
class ProximityMessage () extends IProximityMessage {
  /* CompleteClass */
  override var data: IBuffer = js.native
  /* CompleteClass */
  override var dataAsString: String = js.native
  /* CompleteClass */
  override var messageType: String = js.native
  /* CompleteClass */
  override var subscriptionId: Double = js.native
}

