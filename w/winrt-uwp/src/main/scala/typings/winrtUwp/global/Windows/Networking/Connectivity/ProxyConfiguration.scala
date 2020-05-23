package typings.winrtUwp.global.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the proxy configuration for the current user. */
@JSGlobal("Windows.Networking.Connectivity.ProxyConfiguration")
@js.native
abstract class ProxyConfiguration ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.ProxyConfiguration {
  /** Gets a value that indicates if this configuration can connect directly. */
  /* CompleteClass */
  override var canConnectDirectly: Boolean = js.native
  /** Gets a list of URIs for the proxies from the proxy configuration. */
  /* CompleteClass */
  override var proxyUris: IVectorView[Uri] = js.native
}

