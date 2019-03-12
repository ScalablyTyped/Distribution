package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHotspotAuthenticationContext extends js.Object {
  var authenticationUrl: winrtLib.WindowsNs.FoundationNs.Uri
  var networkAdapter: winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAdapter
  var redirectMessageUrl: winrtLib.WindowsNs.FoundationNs.Uri
  var redirectMessageXml: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
  var wirelessNetworkId: stdLib.Uint8Array
  def abortAuthentication(markAsManual: scala.Boolean): scala.Unit
  def issueCredentials(
    userName: java.lang.String,
    password: java.lang.String,
    extraParameters: java.lang.String,
    markAsManualConnectOnFailure: scala.Boolean
  ): scala.Unit
  def skipAuthentication(): scala.Unit
  def triggerAttentionRequired(packageRelativeApplicationId: java.lang.String, applicationParameters: java.lang.String): scala.Unit
}

object IHotspotAuthenticationContext {
  @scala.inline
  def apply(
    abortAuthentication: scala.Boolean => scala.Unit,
    authenticationUrl: winrtLib.WindowsNs.FoundationNs.Uri,
    issueCredentials: (java.lang.String, java.lang.String, java.lang.String, scala.Boolean) => scala.Unit,
    networkAdapter: winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAdapter,
    redirectMessageUrl: winrtLib.WindowsNs.FoundationNs.Uri,
    redirectMessageXml: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument,
    skipAuthentication: () => scala.Unit,
    triggerAttentionRequired: (java.lang.String, java.lang.String) => scala.Unit,
    wirelessNetworkId: stdLib.Uint8Array
  ): IHotspotAuthenticationContext = {
    val __obj = js.Dynamic.literal(abortAuthentication = js.Any.fromFunction1(abortAuthentication), authenticationUrl = authenticationUrl, issueCredentials = js.Any.fromFunction4(issueCredentials), networkAdapter = networkAdapter, redirectMessageUrl = redirectMessageUrl, redirectMessageXml = redirectMessageXml, skipAuthentication = js.Any.fromFunction0(skipAuthentication), triggerAttentionRequired = js.Any.fromFunction2(triggerAttentionRequired), wirelessNetworkId = wirelessNetworkId)
  
    __obj.asInstanceOf[IHotspotAuthenticationContext]
  }
}

