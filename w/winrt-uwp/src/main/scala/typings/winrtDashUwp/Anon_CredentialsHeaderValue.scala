package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpCredentialsHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CredentialsHeaderValue extends js.Object {
  /** The HttpCredentialsHeaderValue version of the string. */ var credentialsHeaderValue: HttpCredentialsHeaderValue
  /** true if input is valid HttpCredentialsHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object Anon_CredentialsHeaderValue {
  @scala.inline
  def apply(credentialsHeaderValue: HttpCredentialsHeaderValue, returnValue: Boolean): Anon_CredentialsHeaderValue = {
    val __obj = js.Dynamic.literal(credentialsHeaderValue = credentialsHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_CredentialsHeaderValue]
  }
}

