package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatagramSocketStatics extends js.Object {
  def getEndpointPairsAsync(remoteHostName: winrtLib.WindowsNs.NetworkingNs.HostName, remoteServiceName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.EndpointPair]
  ] = js.native
  def getEndpointPairsAsync(
    remoteHostName: winrtLib.WindowsNs.NetworkingNs.HostName,
    remoteServiceName: java.lang.String,
    sortOptions: winrtLib.WindowsNs.NetworkingNs.HostNameSortOptions
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.EndpointPair]
  ] = js.native
}

