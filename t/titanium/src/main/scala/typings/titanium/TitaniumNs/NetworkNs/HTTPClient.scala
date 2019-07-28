package typings.titanium.TitaniumNs.NetworkNs

import typings.titanium.FailureResponse
import typings.titanium.SecurityManagerProtocol
import typings.titanium.SuccessResponse
import typings.titanium.TitaniumNs.Blob
import typings.titanium.TitaniumNs.FilesystemNs.File
import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.XMLNs.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  			 * Target local file to receive data.
  			 */
  var file: String = js.native
  /**
  			 * Absolute URL of the request.
  			 */
  val location: String = js.native
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
  			 * Cancels a pending request.
  			 */
  def abort(): Unit = js.native
  /**
  			 * Registers a new AuthSchemeFactory for a given scheme.
  			 */
  def addAuthFactory(scheme: String, factory: js.Any): Unit = js.native
  /**
  			 * Adds a custom key manager.
  			 */
  def addKeyManager(X509KeyManager: js.Any): Unit = js.native
  /**
  			 * Adds a custom trust manager.
  			 */
  def addTrustManager(X509TrustManager: js.Any): Unit = js.native
  /**
  			 * Clears any cookies stored for the host.
  			 */
  def clearCookies(host: String): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.allResponseHeaders> property.
  			 */
  def getAllResponseHeaders(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.autoEncodeUrl> property.
  			 */
  def getAutoEncodeUrl(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.autoRedirect> property.
  			 */
  def getAutoRedirect(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.cache> property.
  			 */
  def getCache(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.connected> property.
  			 */
  def getConnected(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.connectionType> property.
  			 */
  def getConnectionType(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.domain> property.
  			 */
  def getDomain(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.enableKeepAlive> property.
  			 */
  def getEnableKeepAlive(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.file> property.
  			 */
  def getFile(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.location> property.
  			 */
  def getLocation(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.ondatastream> property.
  			 */
  def getOndatastream(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.onerror> property.
  			 */
  def getOnerror(): js.Function1[/* param0 */ FailureResponse, _] = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.onload> property.
  			 */
  def getOnload(): js.Function1[/* param0 */ SuccessResponse, _] = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.onreadystatechange> property.
  			 */
  def getOnreadystatechange(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.onsendstream> property.
  			 */
  def getOnsendstream(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.password> property.
  			 */
  def getPassword(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.readyState> property.
  			 */
  def getReadyState(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.responseData> property.
  			 */
  def getResponseData(): Blob = js.native
  /**
  			 * Returns the value of the specified response header.
  			 */
  def getResponseHeader(name: String): String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.responseHeaders> property.
  			 */
  def getResponseHeaders(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.responseText> property.
  			 */
  def getResponseText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.responseXML> property.
  			 */
  def getResponseXML(): Document = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.securityManager> property.
  			 */
  def getSecurityManager(): SecurityManagerProtocol = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.status> property.
  			 */
  def getStatus(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.statusText> property.
  			 */
  def getStatusText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.timeout> property.
  			 */
  def getTimeout(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.tlsVersion> property.
  			 */
  def getTlsVersion(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.username> property.
  			 */
  def getUsername(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.validatesSecureCertificate> property.
  			 */
  def getValidatesSecureCertificate(): Boolean = js.native
  /**
  			 * Function to be called at regular intervals as the request data is being received.
  			 */
  def ondatastream(param0: js.Any): js.Any = js.native
  /**
  			 * Function to be called upon a error response.
  			 */
  def onerror(param0: FailureResponse): js.Any = js.native
  /**
  			 * Function to be called upon a successful response.
  			 */
  def onload(param0: SuccessResponse): js.Any = js.native
  /**
  			 * Function to be called for each [readyState](Titanium.Network.HTTPClient.readyState) change.
  			 */
  def onreadystatechange(param0: js.Any): js.Any = js.native
  /**
  			 * Function to be called at regular intervals as the request data is being transmitted.
  			 */
  def onsendstream(param0: js.Any): js.Any = js.native
  /**
  			 * Opens the request and prepares the connection.
  			 */
  def open(method: String, url: String): Unit = js.native
  def open(method: String, url: String, async: Boolean): Unit = js.native
  /**
  			 * Sends the request.
  			 */
  def send(): Unit = js.native
  def send(data: String): Unit = js.native
  def send(data: js.Any): Unit = js.native
  def send(data: Blob): Unit = js.native
  def send(data: File): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.autoEncodeUrl> property.
  			 */
  def setAutoEncodeUrl(autoEncodeUrl: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.autoRedirect> property.
  			 */
  def setAutoRedirect(autoRedirect: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.cache> property.
  			 */
  def setCache(cache: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.domain> property.
  			 */
  def setDomain(domain: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.enableKeepAlive> property.
  			 */
  def setEnableKeepAlive(enableKeepAlive: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.file> property.
  			 */
  def setFile(file: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.ondatastream> property.
  			 */
  def setOndatastream(ondatastream: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.onerror> property.
  			 */
  def setOnerror(onerror: js.Function1[/* param0 */ FailureResponse, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.onload> property.
  			 */
  def setOnload(onload: js.Function1[/* param0 */ SuccessResponse, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.onreadystatechange> property.
  			 */
  def setOnreadystatechange(onreadystatechange: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.onsendstream> property.
  			 */
  def setOnsendstream(onsendstream: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.password> property.
  			 */
  def setPassword(password: String): Unit = js.native
  /**
  			 * Sets the value for the specified request header. Must be called after `open` but before `send`.
  			 */
  def setRequestHeader(name: String, value: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.securityManager> property.
  			 */
  def setSecurityManager(securityManager: SecurityManagerProtocol): Unit = js.native
  /**
  			 * Sets the request timeout.
  			 */
  def setTimeout(timeout: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.tlsVersion> property.
  			 */
  def setTlsVersion(tlsVersion: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.username> property.
  			 */
  def setUsername(username: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.validatesSecureCertificate> property.
  			 */
  def setValidatesSecureCertificate(validatesSecureCertificate: Boolean): Unit = js.native
}

