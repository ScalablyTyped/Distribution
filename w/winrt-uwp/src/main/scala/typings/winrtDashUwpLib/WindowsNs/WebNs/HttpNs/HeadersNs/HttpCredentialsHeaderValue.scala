package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Authorization or Proxy-Authorization HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpCredentialsHeaderValue")
@js.native
class HttpCredentialsHeaderValue protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpCredentialsHeaderValue class with the scheme to use for authentication.
    * @param scheme The scheme to use for authentication.
    */
  def this(scheme: java.lang.String) = this()
  /**
    * Initializes a new instance of the HttpCredentialsHeaderValue class with the scheme and user token information to use for authentication.
    * @param scheme The scheme to use for authentication.
    * @param token The user token information to use for authentication.
    */
  def this(scheme: java.lang.String, token: java.lang.String) = this()
  /** Gets a set of name/value pairs included in the Authorization or Proxy-Authorization HTTP header. */
  var parameters: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[HttpNameValueHeaderValue] = js.native
  /** Gets the scheme to use for authentication. */
  var scheme: java.lang.String = js.native
  /** Gets the user token information used in the Authorization or Proxy-Authorization HTTP header. */
  var token: java.lang.String = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpCredentialsHeaderValue")
@js.native
object HttpCredentialsHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpCredentialsHeaderValue instance.
    * @param input A string that represents the credential information in the Authorization or Proxy-Authorization HTTP header.
    * @return An HttpCredentialsHeaderValue instance.
    */
  def parse(input: java.lang.String): winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpCredentialsHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpCredentialsHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: java.lang.String): winrtDashUwpLib.Anon_CredentialsHeaderValue = js.native
}

