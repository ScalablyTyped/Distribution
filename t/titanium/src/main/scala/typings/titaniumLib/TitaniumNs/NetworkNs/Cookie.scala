package typings
package titaniumLib.TitaniumNs.NetworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Cookie object used to manage the system cookie store and HTTP client cookie store.
		 */

trait Cookie
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The comment describing the purpose of this cookie
  			 */
  var comment: java.lang.String
  /**
  			 * The domain attribute of the cookie.
  			 */
  var domain: java.lang.String
  /**
  			 * The expiration Date of the cookie.
  			 */
  var expiryDate: java.lang.String
  /**
  			 * The httponly attribute of the cookie.
  			 */
  var httponly: scala.Boolean
  /**
  			 * Sets the Max-Age attribute of a Cookie, in delta-seconds.
  			 */
  var maxAge: scala.Double
  /**
  			 * The name of the cookie.
  			 */
  val name: java.lang.String
  /**
  			 * The origual url attribute of the cookie.
  			 */
  var originalUrl: java.lang.String
  /**
  			 * The path attribute of the cookie.
  			 */
  var path: java.lang.String
  /**
  			 * The secure attribute of the cookie.
  			 */
  var secure: scala.Boolean
  /**
  			 * The value of the cookie.
  			 */
  var value: java.lang.String
  /**
  			 * The version of the cookie specification to which this cookie conforms.
  			 */
  var version: scala.Double
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.comment> property.
  			 */
  def getComment(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.domain> property.
  			 */
  def getDomain(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.expiryDate> property.
  			 */
  def getExpiryDate(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.httponly> property.
  			 */
  def getHttponly(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.maxAge> property.
  			 */
  def getMaxAge(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.name> property.
  			 */
  def getName(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.originalUrl> property.
  			 */
  def getOriginalUrl(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.path> property.
  			 */
  def getPath(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.secure> property.
  			 */
  def getSecure(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.value> property.
  			 */
  def getValue(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.version> property.
  			 */
  def getVersion(): scala.Double
  /**
  			 * Returns true if the cookie is valid.
  			 */
  def isValid(): scala.Boolean
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.comment> property.
  			 */
  def setComment(comment: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.domain> property.
  			 */
  def setDomain(domain: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.expiryDate> property.
  			 */
  def setExpiryDate(expiryDate: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.httponly> property.
  			 */
  def setHttponly(httponly: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.maxAge> property.
  			 */
  def setMaxAge(maxAge: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.originalUrl> property.
  			 */
  def setOriginalUrl(originalUrl: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.path> property.
  			 */
  def setPath(path: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.secure> property.
  			 */
  def setSecure(secure: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.value> property.
  			 */
  def setValue(value: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.version> property.
  			 */
  def setVersion(version: scala.Double): scala.Unit
}

