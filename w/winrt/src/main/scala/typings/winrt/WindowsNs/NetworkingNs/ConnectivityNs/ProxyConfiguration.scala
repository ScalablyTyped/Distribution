package typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Connectivity.ProxyConfiguration")
@js.native
class ProxyConfiguration () extends IProxyConfiguration {
  /* CompleteClass */
  override var canConnectDirectly: Boolean = js.native
  /* CompleteClass */
  override var proxyUris: IVectorView[Uri] = js.native
}

