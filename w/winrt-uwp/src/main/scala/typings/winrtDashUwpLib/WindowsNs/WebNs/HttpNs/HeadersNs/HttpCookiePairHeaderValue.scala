package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents cookie information used in the Cookie HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpCookiePairHeaderValue")
@js.native
class HttpCookiePairHeaderValue protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpCookiePairHeaderValue class. with a cookie name.
    * @param name A token that represents the cookie name.
    */
  def this(name: java.lang.String) = this()
  /**
    * Initializes a new instance of the HttpCookiePairHeaderValue class. with a cookie name and a value for the cookie.
    * @param name A token that represents the cookie name.
    * @param value A value for the cookie.
    */
  def this(name: java.lang.String, value: java.lang.String) = this()
  /** Gets a token that represents the cookie name used in the Cookie HTTP header. */
  var name: java.lang.String = js.native
  /** Gets or sets a value for the cookie used in the Cookie HTTP header. */
  var value: java.lang.String = js.native
}

/** Represents cookie information used in the Cookie HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpCookiePairHeaderValue")
@js.native
object HttpCookiePairHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpCookiePairHeaderValue instance.
    * @param input A string that represents the cookie name and value in the Cookie HTTP header.
    * @return An HttpCookiePairHeaderValue instance.
    */
  def parse(input: java.lang.String): winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpCookiePairHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpCookiePairHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: java.lang.String): winrtDashUwpLib.Anon_CookiePairHeaderValue = js.native
}

