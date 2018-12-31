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

