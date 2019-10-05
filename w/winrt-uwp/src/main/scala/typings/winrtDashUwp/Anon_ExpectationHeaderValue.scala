package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpExpectationHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpectationHeaderValue extends js.Object {
  /** The HttpExpectationHeaderValue version of the string. */ var expectationHeaderValue: HttpExpectationHeaderValue
  /** true if input is valid HttpExpectationHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object Anon_ExpectationHeaderValue {
  @scala.inline
  def apply(expectationHeaderValue: HttpExpectationHeaderValue, returnValue: Boolean): Anon_ExpectationHeaderValue = {
    val __obj = js.Dynamic.literal(expectationHeaderValue = expectationHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ExpectationHeaderValue]
  }
}

