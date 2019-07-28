package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.NetworkingNs.EndpointPair
import typings.winrt.WindowsNs.NetworkingNs.HostName
import typings.winrt.WindowsNs.NetworkingNs.HostNameSortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatagramSocketStatics extends js.Object {
  def getEndpointPairsAsync(remoteHostName: HostName, remoteServiceName: String): IAsyncOperation[IVectorView[EndpointPair]] = js.native
  def getEndpointPairsAsync(remoteHostName: HostName, remoteServiceName: String, sortOptions: HostNameSortOptions): IAsyncOperation[IVectorView[EndpointPair]] = js.native
}

