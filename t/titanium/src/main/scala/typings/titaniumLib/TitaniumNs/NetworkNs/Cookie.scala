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

object Cookie {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    comment: java.lang.String,
    domain: java.lang.String,
    expiryDate: java.lang.String,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getComment: js.Function0[java.lang.String],
    getDomain: js.Function0[java.lang.String],
    getExpiryDate: js.Function0[java.lang.String],
    getHttponly: js.Function0[scala.Boolean],
    getMaxAge: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    getOriginalUrl: js.Function0[java.lang.String],
    getPath: js.Function0[java.lang.String],
    getSecure: js.Function0[scala.Boolean],
    getValue: js.Function0[java.lang.String],
    getVersion: js.Function0[scala.Double],
    httponly: scala.Boolean,
    isValid: js.Function0[scala.Boolean],
    maxAge: scala.Double,
    name: java.lang.String,
    originalUrl: java.lang.String,
    path: java.lang.String,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    secure: scala.Boolean,
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setComment: js.Function1[java.lang.String, scala.Unit],
    setDomain: js.Function1[java.lang.String, scala.Unit],
    setExpiryDate: js.Function1[java.lang.String, scala.Unit],
    setHttponly: js.Function1[scala.Boolean, scala.Unit],
    setMaxAge: js.Function1[scala.Double, scala.Unit],
    setOriginalUrl: js.Function1[java.lang.String, scala.Unit],
    setPath: js.Function1[java.lang.String, scala.Unit],
    setSecure: js.Function1[scala.Boolean, scala.Unit],
    setValue: js.Function1[java.lang.String, scala.Unit],
    setVersion: js.Function1[scala.Double, scala.Unit],
    value: java.lang.String,
    version: scala.Double,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Cookie = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, comment = comment, domain = domain, expiryDate = expiryDate, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getComment = getComment, getDomain = getDomain, getExpiryDate = getExpiryDate, getHttponly = getHttponly, getMaxAge = getMaxAge, getName = getName, getOriginalUrl = getOriginalUrl, getPath = getPath, getSecure = getSecure, getValue = getValue, getVersion = getVersion, httponly = httponly, isValid = isValid, maxAge = maxAge, name = name, originalUrl = originalUrl, path = path, removeEventListener = removeEventListener, secure = secure, setBubbleParent = setBubbleParent, setComment = setComment, setDomain = setDomain, setExpiryDate = setExpiryDate, setHttponly = setHttponly, setMaxAge = setMaxAge, setOriginalUrl = setOriginalUrl, setPath = setPath, setSecure = setSecure, setValue = setValue, setVersion = setVersion, value = value, version = version)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Cookie]
  }
}

