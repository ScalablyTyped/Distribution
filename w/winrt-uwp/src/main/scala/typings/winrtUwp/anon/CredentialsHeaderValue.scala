package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpCredentialsHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsHeaderValue extends js.Object {
  /** The HttpCredentialsHeaderValue version of the string. */ var credentialsHeaderValue: HttpCredentialsHeaderValue
  /** true if input is valid HttpCredentialsHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object CredentialsHeaderValue {
  @scala.inline
  def apply(credentialsHeaderValue: HttpCredentialsHeaderValue, returnValue: Boolean): CredentialsHeaderValue = {
    val __obj = js.Dynamic.literal(credentialsHeaderValue = credentialsHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsHeaderValue]
  }
}

