package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CredentialsHeaderValue extends js.Object {
  /** The HttpCredentialsHeaderValue version of the string. */ var credentialsHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpCredentialsHeaderValue
  /** true if input is valid HttpCredentialsHeaderValue information; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_CredentialsHeaderValue {
  @scala.inline
  def apply(
    credentialsHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpCredentialsHeaderValue,
    returnValue: scala.Boolean
  ): Anon_CredentialsHeaderValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("credentialsHeaderValue")(credentialsHeaderValue)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_CredentialsHeaderValue]
  }
}

