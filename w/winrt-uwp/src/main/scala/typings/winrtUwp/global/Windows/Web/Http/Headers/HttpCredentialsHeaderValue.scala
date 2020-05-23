package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.anon.CredentialsHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Authorization or Proxy-Authorization HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpCredentialsHeaderValue")
@js.native
class HttpCredentialsHeaderValue protected ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpCredentialsHeaderValue {
  /**
    * Initializes a new instance of the HttpCredentialsHeaderValue class with the scheme to use for authentication.
    * @param scheme The scheme to use for authentication.
    */
  def this(scheme: String) = this()
  /**
    * Initializes a new instance of the HttpCredentialsHeaderValue class with the scheme and user token information to use for authentication.
    * @param scheme The scheme to use for authentication.
    * @param token The user token information to use for authentication.
    */
  def this(scheme: String, token: String) = this()
  /** Gets a set of name/value pairs included in the Authorization or Proxy-Authorization HTTP header. */
  /* CompleteClass */
  override var parameters: IVector[typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue] = js.native
  /** Gets the scheme to use for authentication. */
  /* CompleteClass */
  override var scheme: String = js.native
  /** Gets the user token information used in the Authorization or Proxy-Authorization HTTP header. */
  /* CompleteClass */
  override var token: String = js.native
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
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpCredentialsHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpCredentialsHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): CredentialsHeaderValue = js.native
}

