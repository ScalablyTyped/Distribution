package typings.titanium.Titanium.Network

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cookie object used to manage the system cookie store and HTTP client cookie store.
  */
@js.native
trait Cookie extends Proxy {
  
  /**
    * The comment describing the purpose of this cookie
    */
  var comment: String = js.native
  
  /**
    * The domain attribute of the cookie.
    */
  var domain: String = js.native
  
  /**
    * The expiration Date of the cookie.
    */
  var expiryDate: String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.Cookie.comment> property.
    * @deprecated Access <Titanium.Network.Cookie.comment> instead.
    */
  def getComment(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.Cookie.domain> property.
    * @deprecated Access <Titanium.Network.Cookie.domain> instead.
    */
  def getDomain(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.Cookie.expiryDate> property.
    * @deprecated Access <Titanium.Network.Cookie.expiryDate> instead.
    */
  def getExpiryDate(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.Cookie.httponly> property.
    * @deprecated Access <Titanium.Network.Cookie.httponly> instead.
    */
  def getHttponly(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Network.Cookie.maxAge> property.
    * @deprecated Access <Titanium.Network.Cookie.maxAge> instead.
    */
  def getMaxAge(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Network.Cookie.name> property.
    * @deprecated Access <Titanium.Network.Cookie.name> instead.
    */
  def getName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.Cookie.originalUrl> property.
    * @deprecated Access <Titanium.Network.Cookie.originalUrl> instead.
    */
  def getOriginalUrl(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.Cookie.path> property.
    * @deprecated Access <Titanium.Network.Cookie.path> instead.
    */
  def getPath(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.Cookie.secure> property.
    * @deprecated Access <Titanium.Network.Cookie.secure> instead.
    */
  def getSecure(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Network.Cookie.value> property.
    * @deprecated Access <Titanium.Network.Cookie.value> instead.
    */
  def getValue(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.Cookie.version> property.
    * @deprecated Access <Titanium.Network.Cookie.version> instead.
    */
  def getVersion(): Double = js.native
  
  /**
    * The httponly attribute of the cookie.
    */
  var httponly: Boolean = js.native
  
  /**
    * Returns true if the cookie is valid.
    */
  def isValid(): Boolean = js.native
  
  /**
    * Sets the Max-Age attribute of a Cookie, in delta-seconds.
    */
  var maxAge: Double = js.native
  
  /**
    * The name of the cookie.
    */
  val name: String = js.native
  
  /**
    * The origual url attribute of the cookie.
    */
  var originalUrl: String = js.native
  
  /**
    * The path attribute of the cookie.
    */
  var path: String = js.native
  
  /**
    * The secure attribute of the cookie.
    */
  var secure: Boolean = js.native
  
  /**
    * Sets the value of the <Titanium.Network.Cookie.comment> property.
    * @deprecated Set the value using <Titanium.Network.Cookie.comment> instead.
    */
  def setComment(comment: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.Cookie.domain> property.
    * @deprecated Set the value using <Titanium.Network.Cookie.domain> instead.
    */
  def setDomain(domain: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.Cookie.expiryDate> property.
    * @deprecated Set the value using <Titanium.Network.Cookie.expiryDate> instead.
    */
  def setExpiryDate(expiryDate: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.Cookie.httponly> property.
    * @deprecated Set the value using <Titanium.Network.Cookie.httponly> instead.
    */
  def setHttponly(httponly: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.Cookie.maxAge> property.
    * @deprecated Set the value using <Titanium.Network.Cookie.maxAge> instead.
    */
  def setMaxAge(maxAge: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.Cookie.originalUrl> property.
    * @deprecated Set the value using <Titanium.Network.Cookie.originalUrl> instead.
    */
  def setOriginalUrl(originalUrl: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.Cookie.path> property.
    * @deprecated Set the value using <Titanium.Network.Cookie.path> instead.
    */
  def setPath(path: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.Cookie.secure> property.
    * @deprecated Set the value using <Titanium.Network.Cookie.secure> instead.
    */
  def setSecure(secure: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.Cookie.value> property.
    * @deprecated Set the value using <Titanium.Network.Cookie.value> instead.
    */
  def setValue(value: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.Cookie.version> property.
    * @deprecated Set the value using <Titanium.Network.Cookie.version> instead.
    */
  def setVersion(version: Double): Unit = js.native
  
  /**
    * The value of the cookie.
    */
  var value: String = js.native
  
  /**
    * The version of the cookie specification to which this cookie conforms.
    */
  var version: Double = js.native
}
