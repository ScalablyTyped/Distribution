package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents authentication information used in the Proxy-Authenticate and WWW-Authenticate HTTP header values. */
@js.native
trait HttpChallengeHeaderValue extends js.Object {
  /** Gets the credentials that contain the authentication information of the user agent for the resource being requested. */
  var parameters: IVector[HttpNameValueHeaderValue] = js.native
  /** Gets the scheme to use for authentication. */
  var scheme: String = js.native
  /** The SPNEGO token to use with the Negotiate protocol scheme. */
  var token: String = js.native
}

object HttpChallengeHeaderValue {
  @scala.inline
  def apply(parameters: IVector[HttpNameValueHeaderValue], scheme: String, token: String): HttpChallengeHeaderValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpChallengeHeaderValue]
  }
  @scala.inline
  implicit class HttpChallengeHeaderValueOps[Self <: HttpChallengeHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(value: IVector[HttpNameValueHeaderValue]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

