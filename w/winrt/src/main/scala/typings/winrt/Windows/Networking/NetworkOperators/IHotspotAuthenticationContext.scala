package typings.winrt.Windows.Networking.NetworkOperators

import typings.std.Uint8Array
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Networking.Connectivity.NetworkAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHotspotAuthenticationContext extends js.Object {
  var authenticationUrl: Uri
  var networkAdapter: NetworkAdapter
  var redirectMessageUrl: Uri
  var redirectMessageXml: XmlDocument
  var wirelessNetworkId: Uint8Array
  def abortAuthentication(markAsManual: Boolean): Unit
  def issueCredentials(userName: String, password: String, extraParameters: String, markAsManualConnectOnFailure: Boolean): Unit
  def skipAuthentication(): Unit
  def triggerAttentionRequired(packageRelativeApplicationId: String, applicationParameters: String): Unit
}

object IHotspotAuthenticationContext {
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
  ): IHotspotAuthenticationContext = {
    val __obj = js.Dynamic.literal(abortAuthentication = js.Any.fromFunction1(abortAuthentication), authenticationUrl = authenticationUrl, issueCredentials = js.Any.fromFunction4(issueCredentials), networkAdapter = networkAdapter, redirectMessageUrl = redirectMessageUrl, redirectMessageXml = redirectMessageXml, skipAuthentication = js.Any.fromFunction0(skipAuthentication), triggerAttentionRequired = js.Any.fromFunction2(triggerAttentionRequired), wirelessNetworkId = wirelessNetworkId)
  
    __obj.asInstanceOf[IHotspotAuthenticationContext]
  }
}

