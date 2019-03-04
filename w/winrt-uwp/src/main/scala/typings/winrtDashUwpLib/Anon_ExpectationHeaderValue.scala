package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpectationHeaderValue extends js.Object {
  /** The HttpExpectationHeaderValue version of the string. */ var expectationHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpExpectationHeaderValue
  /** true if input is valid HttpExpectationHeaderValue information; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_ExpectationHeaderValue {
  @scala.inline
  def apply(
    expectationHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpExpectationHeaderValue,
    returnValue: scala.Boolean
  ): Anon_ExpectationHeaderValue = {
    val __obj = js.Dynamic.literal(expectationHeaderValue = expectationHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ExpectationHeaderValue]
  }
}

