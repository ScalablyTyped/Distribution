package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Authorization or Proxy-Authorization HTTP header on an HTTP request. */
trait HttpCredentialsHeaderValue extends js.Object {
  /** Gets a set of name/value pairs included in the Authorization or Proxy-Authorization HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue]
  /** Gets the scheme to use for authentication. */
  var scheme: String
  /** Gets the user token information used in the Authorization or Proxy-Authorization HTTP header. */
  var token: String
}

object HttpCredentialsHeaderValue {
  @scala.inline
  def apply(parameters: IVector[HttpNameValueHeaderValue], scheme: String, token: String): HttpCredentialsHeaderValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpCredentialsHeaderValue]
  }
}

