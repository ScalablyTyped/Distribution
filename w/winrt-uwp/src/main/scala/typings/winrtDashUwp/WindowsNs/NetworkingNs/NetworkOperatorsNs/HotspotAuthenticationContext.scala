package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import typings.winrtDashUwp.Anon_Context
import typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the authentication context that contains details of the current authentication attempt and provides methods to perform the authentication. */
@JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext")
@js.native
abstract class HotspotAuthenticationContext () extends js.Object {
  /** Gets the HTTPS URL specified in the Wireless Internet Service Provider roaming (WISPr) redirect message. */
  var authenticationUrl: Uri = js.native
  /** Gets the network interface that is connected to the WLAN access point of the hotspot. */
  var networkAdapter: NetworkAdapter = js.native
  /** Gets the URL of the web page where the Wireless Internet Service Provider roaming (WISPr) redirect message was found. */
  var redirectMessageUrl: Uri = js.native
  /** Gets the XML blob of the Wireless Internet Service Provider roaming (WISPr) redirect message of the hotspot. */
  var redirectMessageXml: XmlDocument = js.native
  /** Gets the SSID of the WLAN access point of the hotspot. */
  var wirelessNetworkId: Double = js.native
  /**
    * Aborts the current authentication attempt and disconnects the WLAN interface from the hotspot.
    * @param markAsManual If true, Windows disables the auto-connect property for the corresponding WLAN profile and avoids future auto-connects to this hotspot. Otherwise, false.
    */
  def abortAuthentication(markAsManual: Boolean): Unit = js.native
  /**
    * Provides credentials to Windows for hotspot authentication
    * @param userName The UserName parameter of the Wireless Internet Service Provider roaming (WISPr) authentication protocol. IssueCredentials performs URL encoding before submitting the value to the server. If this string is empty, the corresponding authentication parameter is skipped.
    * @param password The Password parameter of the WISPr authentication protocol. IssueCredentials performs URL encoding before submitting the value to the server. If this string is empty, the corresponding authentication parameter is skipped.
    * @param extraParameters Additional parameters to be appended to the authentication string. IssueCredentials appends this parameter after an "&" character to the HTTP POST string as is without any encoding. This can be used to add multiple parameters. The default for this parameter is an empty string.
    * @param markAsManualConnectOnFailure If true, an application permanently disables the auto-connect property on a connection. If authentication fails, the connection will be disconnected and not retried in the current user session. Otherwise, false.
    */
  def issueCredentials(userName: String, password: String, extraParameters: String, markAsManualConnectOnFailure: Boolean): Unit = js.native
  /**
    * Asynchronously provides credentials to Windows for hotspot authentication Windows does not cache these credentials and another authentication event will be raised when the system connects to the same hotspot again.
    * @param userName The UserName parameter of the Wireless Internet Service Provider roaming (WISPr) authentication protocol. IssueCredentials performs URL encoding before submitting the value to the server. If this string is empty, the corresponding authentication parameter is skipped.
    * @param password The Password parameter of the WISPr authentication protocol. IssueCredentials performs URL encoding before submitting the value to the server. If this string is empty, the corresponding authentication parameter is skipped.
    * @param extraParameters Additional parameters to be appended to the authentication string. IssueCredentials appends this parameter after an "&" character to the HTTP POST string as is without any encoding. This can be used to add multiple parameters. The default for this parameter is an empty string.
    * @param markAsManualConnectOnFailure If true, an application permanently disables the auto-connect property on a connection. If authentication fails, the connection will be disconnected and not retried in the current user session. Otherwise, false.
    * @return Results of the Hotspot authentication request.
    */
  def issueCredentialsAsync(userName: String, password: String, extraParameters: String, markAsManualConnectOnFailure: Boolean): IPromiseWithIAsyncOperation[HotspotCredentialsAuthenticationResult] = js.native
  /** Skips Wireless Internet Service Provider roaming (WISPr) Windows authentication. */
  def skipAuthentication(): Unit = js.native
  /**
    * Called by a background task handler to launch the foreground application when there is an authentication attempt to complete.
    * @param packageRelativeApplicationId The foreground application ID within its application package. The application must belong to the same package as the background task handler.
    * @param applicationParameters Optional command line parameters that are passed to the application at launch.
    */
  def triggerAttentionRequired(packageRelativeApplicationId: String, applicationParameters: String): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext")
@js.native
object HotspotAuthenticationContext extends js.Object {
  /**
    * Gets the context of an authentication attempt.
    * @param evenToken The event token retrieved from the network operator hotspot authentication event . The token is a GUID in string format.
    */
  def tryGetAuthenticationContext(evenToken: String): Anon_Context = js.native
}

