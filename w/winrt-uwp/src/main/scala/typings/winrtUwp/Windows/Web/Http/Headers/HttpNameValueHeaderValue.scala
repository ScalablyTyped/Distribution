package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.AnonNameValueHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents name and value information used in a number of HTTP headers. */
@JSGlobal("Windows.Web.Http.Headers.HttpNameValueHeaderValue")
@js.native
class HttpNameValueHeaderValue protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpNameValueHeaderValue class. with a name.
    * @param name The name to be used.
    */
  def this(name: String) = this()
  /**
    * Initializes a new instance of the HttpNameValueHeaderValue class. with a name and value.
    * @param name The name to be used.
    * @param value The value to associate with the name.
    */
  def this(name: String, value: String) = this()
  /** Gets the name used in the HttpNameValueHeaderValue object. */
  var name: String = js.native
  /** Gets or sets the value associated with a name used in the HttpNameValueHeaderValue object. */
  var value: String = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpNameValueHeaderValue")
@js.native
object HttpNameValueHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpNameValueHeaderValue instance.
    * @param input A string that represents the name and value.
    * @return An HttpNameValueHeaderValue instance.
    */
  def parse(input: String): HttpNameValueHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpNameValueHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): AnonNameValueHeaderValue = js.native
}

