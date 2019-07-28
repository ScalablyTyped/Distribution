package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a Hotspot authentication request. */
@JSGlobal("Windows.Networking.NetworkOperators.HotspotCredentialsAuthenticationResult")
@js.native
abstract class HotspotCredentialsAuthenticationResult () extends js.Object {
  /** Provides the XML blob containing the WISPr authentication reply message from the server. */
  var authenticationReplyXml: XmlDocument = js.native
  /** Indicates if a network error has occurred that prevented the authentication attempt. If true, the other properties should not be examined. */
  var hasNetworkErrorOccurred: Boolean = js.native
  /** Provides the most recent Logoff URL as returned from the server in the authentication reply or from an earlier redirect message. If no Logoff URL was provided by the server, this property returns an empty URI. */
  var logoffUrl: Uri = js.native
  /** Provides the WISPr Response Code for the authentication attempt as returned from the server. Possible values are defined by HotspotAuthenticationResponseCode . */
  var responseCode: HotspotAuthenticationResponseCode = js.native
}

