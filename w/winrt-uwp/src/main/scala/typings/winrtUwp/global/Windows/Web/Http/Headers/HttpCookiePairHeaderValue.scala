package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.CookiePairHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents cookie information used in the Cookie HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpCookiePairHeaderValue")
@js.native
class HttpCookiePairHeaderValue protected ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpCookiePairHeaderValue {
  /**
    * Initializes a new instance of the HttpCookiePairHeaderValue class. with a cookie name.
    * @param name A token that represents the cookie name.
    */
  def this(name: String) = this()
  /**
    * Initializes a new instance of the HttpCookiePairHeaderValue class. with a cookie name and a value for the cookie.
    * @param name A token that represents the cookie name.
    * @param value A value for the cookie.
    */
  def this(name: String, value: String) = this()
  /** Gets a token that represents the cookie name used in the Cookie HTTP header. */
  /* CompleteClass */
  override var name: String = js.native
  /** Gets or sets a value for the cookie used in the Cookie HTTP header. */
  /* CompleteClass */
  override var value: String = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpCookiePairHeaderValue")
@js.native
object HttpCookiePairHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpCookiePairHeaderValue instance.
    * @param input A string that represents the cookie name and value in the Cookie HTTP header.
    * @return An HttpCookiePairHeaderValue instance.
    */
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpCookiePairHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpCookiePairHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): CookiePairHeaderValue = js.native
}

