package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateOrDeltaHeaderValue extends js.Object {
  /** The HttpDateOrDeltaHeaderValue version of the string. */ var dateOrDeltaHeaderValue: HttpDateOrDeltaHeaderValue
  /** true if input is valid HttpDateOrDeltaHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object Anon_DateOrDeltaHeaderValue {
  @scala.inline
  def apply(dateOrDeltaHeaderValue: HttpDateOrDeltaHeaderValue, returnValue: Boolean): Anon_DateOrDeltaHeaderValue = {
    val __obj = js.Dynamic.literal(dateOrDeltaHeaderValue = dateOrDeltaHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DateOrDeltaHeaderValue]
  }
}

