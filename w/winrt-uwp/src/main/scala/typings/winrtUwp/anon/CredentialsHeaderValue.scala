package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpCredentialsHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredentialsHeaderValue extends js.Object {
  /** The HttpCredentialsHeaderValue version of the string. */ var credentialsHeaderValue: HttpCredentialsHeaderValue = js.native
  /** true if input is valid HttpCredentialsHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object CredentialsHeaderValue {
  @scala.inline
  def apply(credentialsHeaderValue: HttpCredentialsHeaderValue, returnValue: Boolean): CredentialsHeaderValue = {
    val __obj = js.Dynamic.literal(credentialsHeaderValue = credentialsHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsHeaderValue]
  }
  @scala.inline
  implicit class CredentialsHeaderValueOps[Self <: CredentialsHeaderValue] (val x: Self) extends AnyVal {
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
    def setCredentialsHeaderValue(value: HttpCredentialsHeaderValue): Self = this.set("credentialsHeaderValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Boolean): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

