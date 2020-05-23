package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a Hotspot authentication request. */
@JSGlobal("Windows.Networking.NetworkOperators.HotspotCredentialsAuthenticationResult")
@js.native
abstract class HotspotCredentialsAuthenticationResult ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotCredentialsAuthenticationResult {
  /** Provides the XML blob containing the WISPr authentication reply message from the server. */
  /* CompleteClass */
  override var authenticationReplyXml: XmlDocument = js.native
  /** Indicates if a network error has occurred that prevented the authentication attempt. If true, the other properties should not be examined. */
  /* CompleteClass */
  override var hasNetworkErrorOccurred: Boolean = js.native
  /** Provides the most recent Logoff URL as returned from the server in the authentication reply or from an earlier redirect message. If no Logoff URL was provided by the server, this property returns an empty URI. */
  /* CompleteClass */
  override var logoffUrl: Uri = js.native
  /** Provides the WISPr Response Code for the authentication attempt as returned from the server. Possible values are defined by HotspotAuthenticationResponseCode . */
  /* CompleteClass */
  override var responseCode: typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationResponseCode = js.native
}

