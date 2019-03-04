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
    abortAuthentication: js.Function1[scala.Boolean, scala.Unit],
    authenticationUrl: winrtLib.WindowsNs.FoundationNs.Uri,
    issueCredentials: js.Function4[java.lang.String, java.lang.String, java.lang.String, scala.Boolean, scala.Unit],
    networkAdapter: winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAdapter,
    redirectMessageUrl: winrtLib.WindowsNs.FoundationNs.Uri,
    redirectMessageXml: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument,
    skipAuthentication: js.Function0[scala.Unit],
    triggerAttentionRequired: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    wirelessNetworkId: stdLib.Uint8Array
  ): IHotspotAuthenticationContext = {
    val __obj = js.Dynamic.literal(abortAuthentication = abortAuthentication, authenticationUrl = authenticationUrl, issueCredentials = issueCredentials, networkAdapter = networkAdapter, redirectMessageUrl = redirectMessageUrl, redirectMessageXml = redirectMessageXml, skipAuthentication = skipAuthentication, triggerAttentionRequired = triggerAttentionRequired, wirelessNetworkId = wirelessNetworkId)
  
    __obj.asInstanceOf[IHotspotAuthenticationContext]
  }
}

