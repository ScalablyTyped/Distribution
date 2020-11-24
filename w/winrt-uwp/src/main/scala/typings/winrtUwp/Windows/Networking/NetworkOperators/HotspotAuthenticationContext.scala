package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the authentication context that contains details of the current authentication attempt and provides methods to perform the authentication. */
@js.native
trait HotspotAuthenticationContext extends js.Object {
  
  /**
    * Aborts the current authentication attempt and disconnects the WLAN interface from the hotspot.
    * @param markAsManual If true, Windows disables the auto-connect property for the corresponding WLAN profile and avoids future auto-connects to this hotspot. Otherwise, false.
    */
  def abortAuthentication(markAsManual: Boolean): Unit = js.native
  
  /** Gets the HTTPS URL specified in the Wireless Internet Service Provider roaming (WISPr) redirect message. */
  var authenticationUrl: Uri = js.native
  
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
  
  /** Gets the network interface that is connected to the WLAN access point of the hotspot. */
  var networkAdapter: NetworkAdapter = js.native
  
  /** Gets the URL of the web page where the Wireless Internet Service Provider roaming (WISPr) redirect message was found. */
  var redirectMessageUrl: Uri = js.native
  
  /** Gets the XML blob of the Wireless Internet Service Provider roaming (WISPr) redirect message of the hotspot. */
  var redirectMessageXml: XmlDocument = js.native
  
  /** Skips Wireless Internet Service Provider roaming (WISPr) Windows authentication. */
  def skipAuthentication(): Unit = js.native
  
  /**
    * Called by a background task handler to launch the foreground application when there is an authentication attempt to complete.
    * @param packageRelativeApplicationId The foreground application ID within its application package. The application must belong to the same package as the background task handler.
    * @param applicationParameters Optional command line parameters that are passed to the application at launch.
    */
  def triggerAttentionRequired(packageRelativeApplicationId: String, applicationParameters: String): Unit = js.native
  
  /** Gets the SSID of the WLAN access point of the hotspot. */
  var wirelessNetworkId: Double = js.native
}
object HotspotAuthenticationContext {
  
  @scala.inline
  def apply(
    abortAuthentication: Boolean => Unit,
    authenticationUrl: Uri,
    issueCredentials: (String, String, String, Boolean) => Unit,
    issueCredentialsAsync: (String, String, String, Boolean) => IPromiseWithIAsyncOperation[HotspotCredentialsAuthenticationResult],
    networkAdapter: NetworkAdapter,
    redirectMessageUrl: Uri,
    redirectMessageXml: XmlDocument,
    skipAuthentication: () => Unit,
    triggerAttentionRequired: (String, String) => Unit,
    wirelessNetworkId: Double
  ): HotspotAuthenticationContext = {
    val __obj = js.Dynamic.literal(abortAuthentication = js.Any.fromFunction1(abortAuthentication), authenticationUrl = authenticationUrl.asInstanceOf[js.Any], issueCredentials = js.Any.fromFunction4(issueCredentials), issueCredentialsAsync = js.Any.fromFunction4(issueCredentialsAsync), networkAdapter = networkAdapter.asInstanceOf[js.Any], redirectMessageUrl = redirectMessageUrl.asInstanceOf[js.Any], redirectMessageXml = redirectMessageXml.asInstanceOf[js.Any], skipAuthentication = js.Any.fromFunction0(skipAuthentication), triggerAttentionRequired = js.Any.fromFunction2(triggerAttentionRequired), wirelessNetworkId = wirelessNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotspotAuthenticationContext]
  }
  
  @scala.inline
  implicit class HotspotAuthenticationContextOps[Self <: HotspotAuthenticationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbortAuthentication(value: Boolean => Unit): Self = this.set("abortAuthentication", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAuthenticationUrl(value: Uri): Self = this.set("authenticationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueCredentials(value: (String, String, String, Boolean) => Unit): Self = this.set("issueCredentials", js.Any.fromFunction4(value))
    
    @scala.inline
    def setIssueCredentialsAsync(
      value: (String, String, String, Boolean) => IPromiseWithIAsyncOperation[HotspotCredentialsAuthenticationResult]
    ): Self = this.set("issueCredentialsAsync", js.Any.fromFunction4(value))
    
    @scala.inline
    def setNetworkAdapter(value: NetworkAdapter): Self = this.set("networkAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectMessageUrl(value: Uri): Self = this.set("redirectMessageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectMessageXml(value: XmlDocument): Self = this.set("redirectMessageXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipAuthentication(value: () => Unit): Self = this.set("skipAuthentication", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTriggerAttentionRequired(value: (String, String) => Unit): Self = this.set("triggerAttentionRequired", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWirelessNetworkId(value: Double): Self = this.set("wirelessNetworkId", value.asInstanceOf[js.Any])
  }
}
