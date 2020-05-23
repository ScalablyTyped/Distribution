package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a Hotspot authentication request. */
trait HotspotCredentialsAuthenticationResult extends js.Object {
  /** Provides the XML blob containing the WISPr authentication reply message from the server. */
  var authenticationReplyXml: XmlDocument
  /** Indicates if a network error has occurred that prevented the authentication attempt. If true, the other properties should not be examined. */
  var hasNetworkErrorOccurred: Boolean
  /** Provides the most recent Logoff URL as returned from the server in the authentication reply or from an earlier redirect message. If no Logoff URL was provided by the server, this property returns an empty URI. */
  var logoffUrl: Uri
  /** Provides the WISPr Response Code for the authentication attempt as returned from the server. Possible values are defined by HotspotAuthenticationResponseCode . */
  var responseCode: HotspotAuthenticationResponseCode
}

object HotspotCredentialsAuthenticationResult {
  @scala.inline
  def apply(
    authenticationReplyXml: XmlDocument,
    hasNetworkErrorOccurred: Boolean,
    logoffUrl: Uri,
    responseCode: HotspotAuthenticationResponseCode
  ): HotspotCredentialsAuthenticationResult = {
    val __obj = js.Dynamic.literal(authenticationReplyXml = authenticationReplyXml.asInstanceOf[js.Any], hasNetworkErrorOccurred = hasNetworkErrorOccurred.asInstanceOf[js.Any], logoffUrl = logoffUrl.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotspotCredentialsAuthenticationResult]
  }
}

