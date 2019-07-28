package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs

import typings.winrtDashUwp.Anon_ChallengeHeaderValue
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents authentication information used in the Proxy-Authenticate and WWW-Authenticate HTTP header values. */
@JSGlobal("Windows.Web.Http.Headers.HttpChallengeHeaderValue")
@js.native
class HttpChallengeHeaderValue protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpChallengeHeaderValue class with the scheme to use for authorization.
    * @param scheme The scheme to use for authorization.
    */
  def this(scheme: String) = this()
  /**
    * Initializes a new instance of the HttpChallengeHeaderValue class with the scheme to use for authorization and the SPNEGO token.
    * @param scheme The scheme to use for authorization.
    * @param token The SPNEGO token to use with the Negotiate protocol scheme.
    */
  def this(scheme: String, token: String) = this()
  /** Gets the credentials that contain the authentication information of the user agent for the resource being requested. */
  var parameters: IVector[HttpNameValueHeaderValue] = js.native
  /** Gets the scheme to use for authentication. */
  var scheme: String = js.native
  /** The SPNEGO token to use with the Negotiate protocol scheme. */
  var token: String = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpChallengeHeaderValue")
@js.native
object HttpChallengeHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpChallengeHeaderValue instance.
    * @param input A string that represents authentication header value information.
    * @return An HttpChallengeHeaderValue instance.
    */
  def parse(input: String): HttpChallengeHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpChallengeHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): Anon_ChallengeHeaderValue = js.native
}

