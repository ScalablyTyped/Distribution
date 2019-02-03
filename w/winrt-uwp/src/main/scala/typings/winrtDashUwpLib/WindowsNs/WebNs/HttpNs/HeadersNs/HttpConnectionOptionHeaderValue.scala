package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents connection information used in the Connection HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue")
@js.native
class HttpConnectionOptionHeaderValue protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpConnectionOptionHeaderValue class.
    * @param token The value of the connection-token to use.
    */
  def this(token: java.lang.String) = this()
  /** Gets the value of the connection-token in the Connection HTTP header. */
  var token: java.lang.String = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue")
@js.native
object HttpConnectionOptionHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpConnectionOptionHeaderValue instance.
    * @param input A string that represents the connection information in the Connection HTTP header.
    * @return An HttpConnectionOptionHeaderValue instance.
    */
  def parse(input: java.lang.String): winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpConnectionOptionHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpConnectionOptionHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: java.lang.String): winrtDashUwpLib.Anon_ConnectionOptionHeaderValue = js.native
}

