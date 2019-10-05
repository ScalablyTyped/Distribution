package typings.winrt.Windows.Networking.Connectivity

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProxyConfiguration extends js.Object {
  var canConnectDirectly: Boolean
  var proxyUris: IVectorView[Uri]
}

object IProxyConfiguration {
  @scala.inline
  def apply(canConnectDirectly: Boolean, proxyUris: IVectorView[Uri]): IProxyConfiguration = {
    val __obj = js.Dynamic.literal(canConnectDirectly = canConnectDirectly, proxyUris = proxyUris)
  
    __obj.asInstanceOf[IProxyConfiguration]
  }
}

