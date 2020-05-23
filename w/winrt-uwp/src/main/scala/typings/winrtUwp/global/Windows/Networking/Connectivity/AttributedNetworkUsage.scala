package typings.winrtUwp.global.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to property values containing information on current usage of the attributed network connection. */
@JSGlobal("Windows.Networking.Connectivity.AttributedNetworkUsage")
@js.native
abstract class AttributedNetworkUsage ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.AttributedNetworkUsage {
  /** Gets the Id of the of the app. */
  /* CompleteClass */
  override var attributionId: String = js.native
  /** Gets the name of the app. */
  /* CompleteClass */
  override var attributionName: String = js.native
  /** Gets the thumbnail of the app. */
  /* CompleteClass */
  override var attributionThumbnail: IRandomAccessStreamReference = js.native
  /** Gets the number of bytes received by the app over the network. */
  /* CompleteClass */
  override var bytesReceived: Double = js.native
  /** Gets the number of bytes sent by the app over the network. */
  /* CompleteClass */
  override var bytesSent: Double = js.native
}

