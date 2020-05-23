package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateOrDeltaHeaderValue extends js.Object {
  /** The HttpDateOrDeltaHeaderValue version of the string. */ var dateOrDeltaHeaderValue: HttpDateOrDeltaHeaderValue
  /** true if input is valid HttpDateOrDeltaHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object DateOrDeltaHeaderValue {
  @scala.inline
  def apply(dateOrDeltaHeaderValue: HttpDateOrDeltaHeaderValue, returnValue: Boolean): DateOrDeltaHeaderValue = {
    val __obj = js.Dynamic.literal(dateOrDeltaHeaderValue = dateOrDeltaHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateOrDeltaHeaderValue]
  }
}

