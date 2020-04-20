package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnectionOptionHeaderValue extends js.Object {
  /** The HttpConnectionOptionHeaderValue version of the string. */ var connectionOptionHeaderValue: HttpConnectionOptionHeaderValue
  /** true if input is valid HttpConnectionOptionHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object AnonConnectionOptionHeaderValue {
  @scala.inline
  def apply(connectionOptionHeaderValue: HttpConnectionOptionHeaderValue, returnValue: Boolean): AnonConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(connectionOptionHeaderValue = connectionOptionHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnectionOptionHeaderValue]
  }
}

