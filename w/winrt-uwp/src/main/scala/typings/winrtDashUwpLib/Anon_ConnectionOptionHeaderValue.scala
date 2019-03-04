package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionOptionHeaderValue extends js.Object {
  /** The HttpConnectionOptionHeaderValue version of the string. */ var connectionOptionHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpConnectionOptionHeaderValue
  /** true if input is valid HttpConnectionOptionHeaderValue information; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_ConnectionOptionHeaderValue {
  @scala.inline
  def apply(
    connectionOptionHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpConnectionOptionHeaderValue,
    returnValue: scala.Boolean
  ): Anon_ConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(connectionOptionHeaderValue = connectionOptionHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ConnectionOptionHeaderValue]
  }
}

