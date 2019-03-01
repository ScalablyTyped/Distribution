package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProxyConfiguration extends js.Object {
  var canConnectDirectly: scala.Boolean
  var proxyUris: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.FoundationNs.Uri]
}

object IProxyConfiguration {
  @scala.inline
  def apply(
    canConnectDirectly: scala.Boolean,
    proxyUris: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.FoundationNs.Uri]
  ): IProxyConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canConnectDirectly")(canConnectDirectly)
    __obj.updateDynamic("proxyUris")(proxyUris)
    __obj.asInstanceOf[IProxyConfiguration]
  }
}

