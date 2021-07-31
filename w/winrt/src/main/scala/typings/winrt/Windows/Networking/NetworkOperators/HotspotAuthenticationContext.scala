package typings.winrt.Windows.Networking.NetworkOperators

import typings.std.Uint8Array
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Networking.Connectivity.NetworkAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HotspotAuthenticationContext
  extends StObject
     with IHotspotAuthenticationContext
object HotspotAuthenticationContext {
  
  @scala.inline
  def apply(
    abortAuthentication: Boolean => Unit,
    authenticationUrl: Uri,
    issueCredentials: (String, String, String, Boolean) => Unit,
    networkAdapter: NetworkAdapter,
    redirectMessageUrl: Uri,
    redirectMessageXml: XmlDocument,
    skipAuthentication: () => Unit,
    triggerAttentionRequired: (String, String) => Unit,
    wirelessNetworkId: Uint8Array
  ): HotspotAuthenticationContext = {
    val __obj = js.Dynamic.literal(abortAuthentication = js.Any.fromFunction1(abortAuthentication), authenticationUrl = authenticationUrl.asInstanceOf[js.Any], issueCredentials = js.Any.fromFunction4(issueCredentials), networkAdapter = networkAdapter.asInstanceOf[js.Any], redirectMessageUrl = redirectMessageUrl.asInstanceOf[js.Any], redirectMessageXml = redirectMessageXml.asInstanceOf[js.Any], skipAuthentication = js.Any.fromFunction0(skipAuthentication), triggerAttentionRequired = js.Any.fromFunction2(triggerAttentionRequired), wirelessNetworkId = wirelessNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotspotAuthenticationContext]
  }
}
