package typings
package titaniumLib.TitaniumNs.NetworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * HTTP client object that (mostly) implements the XMLHttpRequest specification.
		 */
@js.native
trait HTTPClient
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Ready state constant indicating that the request is complete.
  			 */
  val DONE: scala.Double = js.native
  /**
  			 * Ready state constant indicating that response headers have been received.
  			 */
  val HEADERS_RECEIVED: scala.Double = js.native
  /**
  			 * Ready state constant indicating that response data is being received from the remote server.
  			 */
  val LOADING: scala.Double = js.native
  /**
  			 * Ready state constant indicating that the connection has been opened, but the request has
  			 * not yet been sent.
  			 */
  val OPENED: scala.Double = js.native
  /**
  			 * Ready state constant indicating that HTTPClient request has not been opened or sent.
  			 */
  val UNSENT: scala.Double = js.native
  /**
  			 * All of the response headers.
  			 */
  val allResponseHeaders: java.lang.String = js.native
  /**
  			 * Determines whether automatic encoding is enabled for the specified URL.
  			 */
  var autoEncodeUrl: scala.Boolean = js.native
  /**
  			 * Determines whether automatic automatic handling of HTTP redirects is enabled.
  			 */
  var autoRedirect: scala.Boolean = js.native
  /**
  			 * Determines whether HTTP responses are cached.
  			 */
  var cache: scala.Boolean = js.native
  /**
  			 * Indicates whether the response was successful.
  			 */
  val connected: scala.Boolean = js.native
  /**
  			 * Connection type, normally either `GET`, `POST` or `PATCH`.
  			 */
  val connectionType: java.lang.String = js.native
  /**
  			 * Sets the domain parameter for authentication credentials.
  			 */
  var domain: java.lang.String = js.native
  /**
  			 * Determines whether the client should attempt to keep a persistent connection.
  			 */
  var enableKeepAlive: scala.Boolean = js.native
  /**
  			 * Target local file to receive data.
  			 */
  var file: java.lang.String = js.native
  /**
  			 * Absolute URL of the request.
  			 */
  val location: java.lang.String = js.native
  /**
  			 * Sets the password parameter for authentication credentials.
  			 */
  var password: java.lang.String = js.native
  /**
  			 * The current ready state of this HTTP request.
  			 */
  val readyState: scala.Double = js.native
  /**
  			 * Response data as a `Blob` object.
  			 */
  val responseData: titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Returns all the response headers returned with the request.
  			 */
  val responseHeaders: js.Any = js.native
  /**
  			 * Response as text.
  			 */
  val responseText: java.lang.String = js.native
  /**
  			 * Response object as an XML DOM Document object.
  			 */
  val responseXML: titaniumLib.TitaniumNs.XMLNs.Document = js.native
  /**
  			 * The Security Manager for this client.
  			 */
  var securityManager: titaniumLib.SecurityManagerProtocol = js.native
  /**
  			 * Response HTTP status code.
  			 */
  val status: scala.Double = js.native
  /**
  			 * Human-readable status message associated with the status code.
  			 */
  val statusText: java.lang.String = js.native
  /**
  			 * Timeout in milliseconds when the connection should be aborted.
  			 */
  var timeout: scala.Double = js.native
  /**
  			 * Sets the TLS version to use for handshakes.
  			 */
  var tlsVersion: scala.Double = js.native
  /**
  			 * Sets the username parameter for authentication credentials.
  			 */
  var username: java.lang.String = js.native
  /**
  			 * Determines how SSL certification validation is performed on connection.
  			 */
  var validatesSecureCertificate: scala.Boolean = js.native
  /**
  			 * Cancels a pending request.
  			 */
  def abort(): scala.Unit = js.native
  /**
  			 * Registers a new AuthSchemeFactory for a given scheme.
  			 */
  def addAuthFactory(scheme: java.lang.String, factory: js.Any): scala.Unit = js.native
  /**
  			 * Adds a custom key manager.
  			 */
  def addKeyManager(X509KeyManager: js.Any): scala.Unit = js.native
  /**
  			 * Adds a custom trust manager.
  			 */
  def addTrustManager(X509TrustManager: js.Any): scala.Unit = js.native
  /**
  			 * Clears any cookies stored for the host.
  			 */
  def clearCookies(host: java.lang.String): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.allResponseHeaders> property.
  			 */
  def getAllResponseHeaders(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.autoEncodeUrl> property.
  			 */
  def getAutoEncodeUrl(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.autoRedirect> property.
  			 */
  def getAutoRedirect(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.cache> property.
  			 */
  def getCache(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.connected> property.
  			 */
  def getConnected(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.connectionType> property.
  			 */
  def getConnectionType(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.domain> property.
  			 */
  def getDomain(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.enableKeepAlive> property.
  			 */
  def getEnableKeepAlive(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.file> property.
  			 */
  def getFile(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.location> property.
  			 */
  def getLocation(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.ondatastream> property.
  			 */
  def getOndatastream(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.onerror> property.
  			 */
  def getOnerror(): js.Function1[/* param0 */ titaniumLib.FailureResponse, _] = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.onload> property.
  			 */
  def getOnload(): js.Function1[/* param0 */ titaniumLib.SuccessResponse, _] = js.native
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
  def getPassword(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.readyState> property.
  			 */
  def getReadyState(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.responseData> property.
  			 */
  def getResponseData(): titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Returns the value of the specified response header.
  			 */
  def getResponseHeader(name: java.lang.String): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.responseHeaders> property.
  			 */
  def getResponseHeaders(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.responseText> property.
  			 */
  def getResponseText(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.responseXML> property.
  			 */
  def getResponseXML(): titaniumLib.TitaniumNs.XMLNs.Document = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.securityManager> property.
  			 */
  def getSecurityManager(): titaniumLib.SecurityManagerProtocol = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.status> property.
  			 */
  def getStatus(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.statusText> property.
  			 */
  def getStatusText(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.timeout> property.
  			 */
  def getTimeout(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.tlsVersion> property.
  			 */
  def getTlsVersion(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.username> property.
  			 */
  def getUsername(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.HTTPClient.validatesSecureCertificate> property.
  			 */
  def getValidatesSecureCertificate(): scala.Boolean = js.native
  /**
  			 * Function to be called at regular intervals as the request data is being received.
  			 */
  def ondatastream(param0: js.Any): js.Any = js.native
  /**
  			 * Function to be called upon a error response.
  			 */
  def onerror(param0: titaniumLib.FailureResponse): js.Any = js.native
  /**
  			 * Function to be called upon a successful response.
  			 */
  def onload(param0: titaniumLib.SuccessResponse): js.Any = js.native
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
  def open(method: java.lang.String, url: java.lang.String): scala.Unit = js.native
  def open(method: java.lang.String, url: java.lang.String, async: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sends the request.
  			 */
  def send(): scala.Unit = js.native
  def send(data: java.lang.String): scala.Unit = js.native
  def send(data: js.Any): scala.Unit = js.native
  def send(data: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  def send(data: titaniumLib.TitaniumNs.FilesystemNs.File): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.autoEncodeUrl> property.
  			 */
  def setAutoEncodeUrl(autoEncodeUrl: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.autoRedirect> property.
  			 */
  def setAutoRedirect(autoRedirect: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.cache> property.
  			 */
  def setCache(cache: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.domain> property.
  			 */
  def setDomain(domain: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.enableKeepAlive> property.
  			 */
  def setEnableKeepAlive(enableKeepAlive: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.file> property.
  			 */
  def setFile(file: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.ondatastream> property.
  			 */
  def setOndatastream(ondatastream: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.onerror> property.
  			 */
  def setOnerror(onerror: js.Function1[/* param0 */ titaniumLib.FailureResponse, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.onload> property.
  			 */
  def setOnload(onload: js.Function1[/* param0 */ titaniumLib.SuccessResponse, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.onreadystatechange> property.
  			 */
  def setOnreadystatechange(onreadystatechange: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.onsendstream> property.
  			 */
  def setOnsendstream(onsendstream: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.password> property.
  			 */
  def setPassword(password: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value for the specified request header. Must be called after `open` but before `send`.
  			 */
  def setRequestHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.securityManager> property.
  			 */
  def setSecurityManager(securityManager: titaniumLib.SecurityManagerProtocol): scala.Unit = js.native
  /**
  			 * Sets the request timeout.
  			 */
  def setTimeout(timeout: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.tlsVersion> property.
  			 */
  def setTlsVersion(tlsVersion: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.username> property.
  			 */
  def setUsername(username: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.HTTPClient.validatesSecureCertificate> property.
  			 */
  def setValidatesSecureCertificate(validatesSecureCertificate: scala.Boolean): scala.Unit = js.native
}

