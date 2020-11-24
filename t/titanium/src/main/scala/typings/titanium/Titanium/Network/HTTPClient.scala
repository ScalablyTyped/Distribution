package typings.titanium.Titanium.Network

import typings.titanium.FailureResponse
import typings.titanium.SecurityManagerProtocol
import typings.titanium.SuccessResponse
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.XML.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTP client object that (mostly) implements the XMLHttpRequest specification.
  */
@js.native
trait HTTPClient extends Proxy {
  
  /**
    * Ready state constant indicating that the request is complete.
    */
  val DONE: Double = js.native
  
  /**
    * Ready state constant indicating that response headers have been received.
    */
  val HEADERS_RECEIVED: Double = js.native
  
  /**
    * Ready state constant indicating that response data is being received from the remote server.
    */
  val LOADING: Double = js.native
  
  /**
    * Ready state constant indicating that the connection has been opened, but the request has
    * not yet been sent.
    */
  val OPENED: Double = js.native
  
  /**
    * Ready state constant indicating that HTTPClient request has not been opened or sent.
    */
  val UNSENT: Double = js.native
  
  /**
    * Cancels a pending request.
    */
  def abort(): Unit = js.native
  
  /**
    * All of the response headers.
    */
  val allResponseHeaders: String = js.native
  
  /**
    * Determines whether automatic encoding is enabled for the specified URL.
    */
  var autoEncodeUrl: Boolean = js.native
  
  /**
    * Determines whether automatic automatic handling of HTTP redirects is enabled.
    */
  var autoRedirect: Boolean = js.native
  
  /**
    * Determines whether HTTP responses are cached.
    */
  var cache: Boolean = js.native
  
  /**
    * Clears any cookies stored for the host.
    */
  def clearCookies(host: String): Unit = js.native
  
  /**
    * Indicates whether the response was successful.
    */
  val connected: Boolean = js.native
  
  /**
    * Connection type, normally either `GET`, `POST` or `PATCH`.
    */
  val connectionType: String = js.native
  
  /**
    * Sets the domain parameter for authentication credentials.
    */
  var domain: String = js.native
  
  /**
    * Determines whether the client should attempt to keep a persistent connection.
    */
  var enableKeepAlive: Boolean = js.native
  
  /**
    * Target local file or file path to receive data.
    */
  var file: String | File = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.allResponseHeaders> property.
    * @deprecated Access <Titanium.Network.HTTPClient.allResponseHeaders> instead.
    */
  def getAllResponseHeaders(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.autoEncodeUrl> property.
    * @deprecated Access <Titanium.Network.HTTPClient.autoEncodeUrl> instead.
    */
  def getAutoEncodeUrl(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.autoRedirect> property.
    * @deprecated Access <Titanium.Network.HTTPClient.autoRedirect> instead.
    */
  def getAutoRedirect(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.cache> property.
    * @deprecated Access <Titanium.Network.HTTPClient.cache> instead.
    */
  def getCache(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.connected> property.
    * @deprecated Access <Titanium.Network.HTTPClient.connected> instead.
    */
  def getConnected(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.connectionType> property.
    * @deprecated Access <Titanium.Network.HTTPClient.connectionType> instead.
    */
  def getConnectionType(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.domain> property.
    * @deprecated Access <Titanium.Network.HTTPClient.domain> instead.
    */
  def getDomain(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.enableKeepAlive> property.
    * @deprecated Access <Titanium.Network.HTTPClient.enableKeepAlive> instead.
    */
  def getEnableKeepAlive(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.file> property.
    * @deprecated Access <Titanium.Network.HTTPClient.file> instead.
    */
  def getFile(): String | File = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.location> property.
    * @deprecated Access <Titanium.Network.HTTPClient.location> instead.
    */
  def getLocation(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.ondatastream> property.
    * @deprecated Access <Titanium.Network.HTTPClient.ondatastream> instead.
    */
  def getOndatastream(): js.Function1[/* param0 */ js.Any, Unit] = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.onerror> property.
    * @deprecated Access <Titanium.Network.HTTPClient.onerror> instead.
    */
  def getOnerror(): js.Function1[/* param0 */ FailureResponse, Unit] = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.onload> property.
    * @deprecated Access <Titanium.Network.HTTPClient.onload> instead.
    */
  def getOnload(): js.Function1[/* param0 */ SuccessResponse, Unit] = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.onreadystatechange> property.
    * @deprecated Access <Titanium.Network.HTTPClient.onreadystatechange> instead.
    */
  def getOnreadystatechange(): js.Function1[/* param0 */ js.Any, Unit] = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.onsendstream> property.
    * @deprecated Access <Titanium.Network.HTTPClient.onsendstream> instead.
    */
  def getOnsendstream(): js.Function1[/* param0 */ js.Any, Unit] = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.password> property.
    * @deprecated Access <Titanium.Network.HTTPClient.password> instead.
    */
  def getPassword(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.readyState> property.
    * @deprecated Access <Titanium.Network.HTTPClient.readyState> instead.
    */
  def getReadyState(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.responseData> property.
    * @deprecated Access <Titanium.Network.HTTPClient.responseData> instead.
    */
  def getResponseData(): Blob = js.native
  
  /**
    * Returns the value of the specified response header.
    */
  def getResponseHeader(name: String): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.responseHeaders> property.
    * @deprecated Access <Titanium.Network.HTTPClient.responseHeaders> instead.
    */
  def getResponseHeaders(): js.Any = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.responseText> property.
    * @deprecated Access <Titanium.Network.HTTPClient.responseText> instead.
    */
  def getResponseText(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.responseXML> property.
    * @deprecated Access <Titanium.Network.HTTPClient.responseXML> instead.
    */
  def getResponseXML(): Document = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.securityManager> property.
    * @deprecated Access <Titanium.Network.HTTPClient.securityManager> instead.
    */
  def getSecurityManager(): SecurityManagerProtocol = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.status> property.
    * @deprecated Access <Titanium.Network.HTTPClient.status> instead.
    */
  def getStatus(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.statusText> property.
    * @deprecated Access <Titanium.Network.HTTPClient.statusText> instead.
    */
  def getStatusText(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.timeout> property.
    * @deprecated Access <Titanium.Network.HTTPClient.timeout> instead.
    */
  def getTimeout(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.timeoutForResource> property.
    * @deprecated Access <Titanium.Network.HTTPClient.timeoutForResource> instead.
    */
  def getTimeoutForResource(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.tlsVersion> property.
    * @deprecated Access <Titanium.Network.HTTPClient.tlsVersion> instead.
    */
  def getTlsVersion(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.username> property.
    * @deprecated Access <Titanium.Network.HTTPClient.username> instead.
    */
  def getUsername(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.validatesSecureCertificate> property.
    * @deprecated Access <Titanium.Network.HTTPClient.validatesSecureCertificate> instead.
    */
  def getValidatesSecureCertificate(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Network.HTTPClient.waitsForConnectivity> property.
    * @deprecated Access <Titanium.Network.HTTPClient.waitsForConnectivity> instead.
    */
  def getWaitsForConnectivity(): Boolean = js.native
  
  /**
    * Absolute URL of the request.
    */
  val location: String = js.native
  
  /**
    * Function to be called at regular intervals as the request data is being received.
    */
  def ondatastream(param0: js.Any): Unit = js.native
  
  /**
    * Function to be called upon a error response.
    */
  def onerror(param0: FailureResponse): Unit = js.native
  
  /**
    * Function to be called upon a successful response.
    */
  def onload(param0: SuccessResponse): Unit = js.native
  
  /**
    * Function to be called for each [readyState](Titanium.Network.HTTPClient.readyState) change.
    */
  def onreadystatechange(param0: js.Any): Unit = js.native
  
  /**
    * Function to be called at regular intervals as the request data is being transmitted.
    */
  def onsendstream(param0: js.Any): Unit = js.native
  
  /**
    * Opens the request and prepares the connection.
    */
  def open(method: String, url: String): Unit = js.native
  def open(method: String, url: String, async: Boolean): Unit = js.native
  
  /**
    * Sets the password parameter for authentication credentials.
    */
  var password: String = js.native
  
  /**
    * The current ready state of this HTTP request.
    */
  val readyState: Double = js.native
  
  /**
    * Response data as a `Blob` object.
    */
  val responseData: Blob = js.native
  
  /**
    * Returns all the response headers returned with the request.
    */
  val responseHeaders: js.Any = js.native
  
  /**
    * Response as text.
    */
  val responseText: String = js.native
  
  /**
    * Response object as an XML DOM Document object.
    */
  val responseXML: Document = js.native
  
  /**
    * The Security Manager for this client.
    */
  var securityManager: SecurityManagerProtocol = js.native
  
  /**
    * Sends the request.
    */
  def send(): Unit = js.native
  def send(data: js.Any): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.autoEncodeUrl> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.autoEncodeUrl> instead.
    */
  def setAutoEncodeUrl(autoEncodeUrl: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.autoRedirect> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.autoRedirect> instead.
    */
  def setAutoRedirect(autoRedirect: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.cache> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.cache> instead.
    */
  def setCache(cache: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.domain> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.domain> instead.
    */
  def setDomain(domain: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.enableKeepAlive> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.enableKeepAlive> instead.
    */
  def setEnableKeepAlive(enableKeepAlive: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.file> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.file> instead.
    */
  def setFile(file: String): Unit = js.native
  def setFile(file: File): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.ondatastream> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.ondatastream> instead.
    */
  def setOndatastream(ondatastream: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.onerror> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.onerror> instead.
    */
  def setOnerror(onerror: js.Function1[/* param0 */ FailureResponse, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.onload> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.onload> instead.
    */
  def setOnload(onload: js.Function1[/* param0 */ SuccessResponse, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.onreadystatechange> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.onreadystatechange> instead.
    */
  def setOnreadystatechange(onreadystatechange: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.onsendstream> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.onsendstream> instead.
    */
  def setOnsendstream(onsendstream: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.password> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.password> instead.
    */
  def setPassword(password: String): Unit = js.native
  
  /**
    * Sets the value for the specified request header. Must be called after `open` but before `send`.
    */
  def setRequestHeader(name: String, value: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.securityManager> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.securityManager> instead.
    */
  def setSecurityManager(securityManager: SecurityManagerProtocol): Unit = js.native
  
  /**
    * Sets the request timeout.
    */
  def setTimeout(timeout: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.timeoutForResource> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.timeoutForResource> instead.
    */
  def setTimeoutForResource(timeoutForResource: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.tlsVersion> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.tlsVersion> instead.
    */
  def setTlsVersion(tlsVersion: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.username> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.username> instead.
    */
  def setUsername(username: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.validatesSecureCertificate> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.validatesSecureCertificate> instead.
    */
  def setValidatesSecureCertificate(validatesSecureCertificate: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.HTTPClient.waitsForConnectivity> property.
    * @deprecated Set the value using <Titanium.Network.HTTPClient.waitsForConnectivity> instead.
    */
  def setWaitsForConnectivity(waitsForConnectivity: Boolean): Unit = js.native
  
  /**
    * Response HTTP status code.
    */
  val status: Double = js.native
  
  /**
    * Human-readable status message associated with the status code.
    */
  val statusText: String = js.native
  
  /**
    * Timeout in milliseconds when the connection should be aborted.
    */
  var timeout: Double = js.native
  
  /**
    * The maximum amount of time (in milliseconds) that a resource request should be allowed to take.
    */
  var timeoutForResource: Double = js.native
  
  /**
    * Sets the TLS version to use for handshakes.
    */
  var tlsVersion: Double = js.native
  
  /**
    * Sets the username parameter for authentication credentials.
    */
  var username: String = js.native
  
  /**
    * Determines how SSL certification validation is performed on connection.
    */
  var validatesSecureCertificate: Boolean = js.native
  
  /**
    * A Boolean value that indicates whether the session should wait for connectivity to become available, or fail immediately.
    */
  var waitsForConnectivity: Boolean = js.native
}
