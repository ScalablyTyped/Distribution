package typings.winrt.Windows.Networking.NetworkOperators

import typings.std.Uint8Array
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Networking.Connectivity.NetworkAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHotspotAuthenticationContext extends StObject {
  
  def abortAuthentication(markAsManual: Boolean): Unit
  
  var authenticationUrl: Uri
  
  def issueCredentials(userName: String, password: String, extraParameters: String, markAsManualConnectOnFailure: Boolean): Unit
  
  var networkAdapter: NetworkAdapter
  
  var redirectMessageUrl: Uri
  
  var redirectMessageXml: XmlDocument
  
  def skipAuthentication(): Unit
  
  def triggerAttentionRequired(packageRelativeApplicationId: String, applicationParameters: String): Unit
  
  var wirelessNetworkId: Uint8Array
}
object IHotspotAuthenticationContext {
  
  inline def apply(
    abortAuthentication: Boolean => Unit,
    authenticationUrl: Uri,
    issueCredentials: (String, String, String, Boolean) => Unit,
    networkAdapter: NetworkAdapter,
    redirectMessageUrl: Uri,
    redirectMessageXml: XmlDocument,
    skipAuthentication: () => Unit,
    triggerAttentionRequired: (String, String) => Unit,
    wirelessNetworkId: Uint8Array
  ): IHotspotAuthenticationContext = {
    val __obj = js.Dynamic.literal(abortAuthentication = js.Any.fromFunction1(abortAuthentication), authenticationUrl = authenticationUrl.asInstanceOf[js.Any], issueCredentials = js.Any.fromFunction4(issueCredentials), networkAdapter = networkAdapter.asInstanceOf[js.Any], redirectMessageUrl = redirectMessageUrl.asInstanceOf[js.Any], redirectMessageXml = redirectMessageXml.asInstanceOf[js.Any], skipAuthentication = js.Any.fromFunction0(skipAuthentication), triggerAttentionRequired = js.Any.fromFunction2(triggerAttentionRequired), wirelessNetworkId = wirelessNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotspotAuthenticationContext]
  }
  
  extension [Self <: IHotspotAuthenticationContext](x: Self) {
    
    inline def setAbortAuthentication(value: Boolean => Unit): Self = StObject.set(x, "abortAuthentication", js.Any.fromFunction1(value))
    
    inline def setAuthenticationUrl(value: Uri): Self = StObject.set(x, "authenticationUrl", value.asInstanceOf[js.Any])
    
    inline def setIssueCredentials(value: (String, String, String, Boolean) => Unit): Self = StObject.set(x, "issueCredentials", js.Any.fromFunction4(value))
    
    inline def setNetworkAdapter(value: NetworkAdapter): Self = StObject.set(x, "networkAdapter", value.asInstanceOf[js.Any])
    
    inline def setRedirectMessageUrl(value: Uri): Self = StObject.set(x, "redirectMessageUrl", value.asInstanceOf[js.Any])
    
    inline def setRedirectMessageXml(value: XmlDocument): Self = StObject.set(x, "redirectMessageXml", value.asInstanceOf[js.Any])
    
    inline def setSkipAuthentication(value: () => Unit): Self = StObject.set(x, "skipAuthentication", js.Any.fromFunction0(value))
    
    inline def setTriggerAttentionRequired(value: (String, String) => Unit): Self = StObject.set(x, "triggerAttentionRequired", js.Any.fromFunction2(value))
    
    inline def setWirelessNetworkId(value: Uint8Array): Self = StObject.set(x, "wirelessNetworkId", value.asInstanceOf[js.Any])
  }
}
