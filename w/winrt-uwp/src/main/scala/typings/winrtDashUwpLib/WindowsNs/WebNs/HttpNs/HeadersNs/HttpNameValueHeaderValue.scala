package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

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
  def this(name: java.lang.String) = this()
  /**
    * Initializes a new instance of the HttpNameValueHeaderValue class. with a name and value.
    * @param name The name to be used.
    * @param value The value to associate with the name.
    */
  def this(name: java.lang.String, value: java.lang.String) = this()
  /** Gets the name used in the HttpNameValueHeaderValue object. */
  var name: java.lang.String = js.native
  /** Gets or sets the value associated with a name used in the HttpNameValueHeaderValue object. */
  var value: java.lang.String = js.native
}

/** Represents name and value information used in a number of HTTP headers. */
@JSGlobal("Windows.Web.Http.Headers.HttpNameValueHeaderValue")
@js.native
object HttpNameValueHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpNameValueHeaderValue instance.
    * @param input A string that represents the name and value.
    * @return An HttpNameValueHeaderValue instance.
    */
  def parse(input: java.lang.String): winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpNameValueHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpNameValueHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: java.lang.String): winrtDashUwpLib.Anon_NameValueHeaderValue = js.native
}

