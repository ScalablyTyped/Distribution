package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameValueHeaderValue extends js.Object {
  /** The HttpNameValueHeaderValue version of the string. */ var nameValueHeaderValue: HttpNameValueHeaderValue
  /** true if input is valid HttpNameValueHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object AnonNameValueHeaderValue {
  @scala.inline
  def apply(nameValueHeaderValue: HttpNameValueHeaderValue, returnValue: Boolean): AnonNameValueHeaderValue = {
    val __obj = js.Dynamic.literal(nameValueHeaderValue = nameValueHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameValueHeaderValue]
  }
}

