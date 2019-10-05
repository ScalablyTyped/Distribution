package typings.titanium.Titanium.Network

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Cookie object used to manage the system cookie store and HTTP client cookie store.
		 */
trait Cookie extends Proxy {
  /**
  			 * The comment describing the purpose of this cookie
  			 */
  var comment: String
  /**
  			 * The domain attribute of the cookie.
  			 */
  var domain: String
  /**
  			 * The expiration Date of the cookie.
  			 */
  var expiryDate: String
  /**
  			 * The httponly attribute of the cookie.
  			 */
  var httponly: Boolean
  /**
  			 * Sets the Max-Age attribute of a Cookie, in delta-seconds.
  			 */
  var maxAge: Double
  /**
  			 * The name of the cookie.
  			 */
  val name: String
  /**
  			 * The origual url attribute of the cookie.
  			 */
  var originalUrl: String
  /**
  			 * The path attribute of the cookie.
  			 */
  var path: String
  /**
  			 * The secure attribute of the cookie.
  			 */
  var secure: Boolean
  /**
  			 * The value of the cookie.
  			 */
  var value: String
  /**
  			 * The version of the cookie specification to which this cookie conforms.
  			 */
  var version: Double
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.comment> property.
  			 */
  def getComment(): String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.domain> property.
  			 */
  def getDomain(): String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.expiryDate> property.
  			 */
  def getExpiryDate(): String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.httponly> property.
  			 */
  def getHttponly(): Boolean
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.maxAge> property.
  			 */
  def getMaxAge(): Double
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.name> property.
  			 */
  def getName(): String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.originalUrl> property.
  			 */
  def getOriginalUrl(): String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.path> property.
  			 */
  def getPath(): String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.secure> property.
  			 */
  def getSecure(): Boolean
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.value> property.
  			 */
  def getValue(): String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.version> property.
  			 */
  def getVersion(): Double
  /**
  			 * Returns true if the cookie is valid.
  			 */
  def isValid(): Boolean
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.comment> property.
  			 */
  def setComment(comment: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.domain> property.
  			 */
  def setDomain(domain: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.expiryDate> property.
  			 */
  def setExpiryDate(expiryDate: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.httponly> property.
  			 */
  def setHttponly(httponly: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.maxAge> property.
  			 */
  def setMaxAge(maxAge: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.originalUrl> property.
  			 */
  def setOriginalUrl(originalUrl: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.path> property.
  			 */
  def setPath(path: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.secure> property.
  			 */
  def setSecure(secure: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.value> property.
  			 */
  def setValue(value: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.version> property.
  			 */
  def setVersion(version: Double): Unit
}

object Cookie {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    comment: String,
    domain: String,
    expiryDate: String,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getComment: () => String,
    getDomain: () => String,
    getExpiryDate: () => String,
    getHttponly: () => Boolean,
    getMaxAge: () => Double,
    getName: () => String,
    getOriginalUrl: () => String,
    getPath: () => String,
    getSecure: () => Boolean,
    getValue: () => String,
    getVersion: () => Double,
    httponly: Boolean,
    isValid: () => Boolean,
    maxAge: Double,
    name: String,
    originalUrl: String,
    path: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    secure: Boolean,
    setBubbleParent: Boolean => Unit,
    setComment: String => Unit,
    setDomain: String => Unit,
    setExpiryDate: String => Unit,
    setHttponly: Boolean => Unit,
    setMaxAge: Double => Unit,
    setOriginalUrl: String => Unit,
    setPath: String => Unit,
    setSecure: Boolean => Unit,
    setValue: String => Unit,
    setVersion: Double => Unit,
    value: String,
    version: Double,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Cookie = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, comment = comment, domain = domain, expiryDate = expiryDate, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getComment = js.Any.fromFunction0(getComment), getDomain = js.Any.fromFunction0(getDomain), getExpiryDate = js.Any.fromFunction0(getExpiryDate), getHttponly = js.Any.fromFunction0(getHttponly), getMaxAge = js.Any.fromFunction0(getMaxAge), getName = js.Any.fromFunction0(getName), getOriginalUrl = js.Any.fromFunction0(getOriginalUrl), getPath = js.Any.fromFunction0(getPath), getSecure = js.Any.fromFunction0(getSecure), getValue = js.Any.fromFunction0(getValue), getVersion = js.Any.fromFunction0(getVersion), httponly = httponly, isValid = js.Any.fromFunction0(isValid), maxAge = maxAge, name = name, originalUrl = originalUrl, path = path, removeEventListener = js.Any.fromFunction2(removeEventListener), secure = secure, setBubbleParent = js.Any.fromFunction1(setBubbleParent), setComment = js.Any.fromFunction1(setComment), setDomain = js.Any.fromFunction1(setDomain), setExpiryDate = js.Any.fromFunction1(setExpiryDate), setHttponly = js.Any.fromFunction1(setHttponly), setMaxAge = js.Any.fromFunction1(setMaxAge), setOriginalUrl = js.Any.fromFunction1(setOriginalUrl), setPath = js.Any.fromFunction1(setPath), setSecure = js.Any.fromFunction1(setSecure), setValue = js.Any.fromFunction1(setValue), setVersion = js.Any.fromFunction1(setVersion), value = value, version = version)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Cookie]
  }
}

