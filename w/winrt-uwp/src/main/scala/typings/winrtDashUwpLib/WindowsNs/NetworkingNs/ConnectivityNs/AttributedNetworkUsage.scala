package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to property values containing information on current usage of the attributed network connection. */
@JSGlobal("Windows.Networking.Connectivity.AttributedNetworkUsage")
@js.native
abstract class AttributedNetworkUsage () extends js.Object {
  /** Gets the Id of the of the app. */
  var attributionId: java.lang.String = js.native
  /** Gets the name of the app. */
  var attributionName: java.lang.String = js.native
  /** Gets the thumbnail of the app. */
  var attributionThumbnail: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets the number of bytes received by the app over the network. */
  var bytesReceived: scala.Double = js.native
  /** Gets the number of bytes sent by the app over the network. */
  var bytesSent: scala.Double = js.native
}

