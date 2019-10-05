package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionOptionHeaderValue extends js.Object {
  /** The HttpConnectionOptionHeaderValue version of the string. */ var connectionOptionHeaderValue: HttpConnectionOptionHeaderValue
  /** true if input is valid HttpConnectionOptionHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object Anon_ConnectionOptionHeaderValue {
  @scala.inline
  def apply(connectionOptionHeaderValue: HttpConnectionOptionHeaderValue, returnValue: Boolean): Anon_ConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(connectionOptionHeaderValue = connectionOptionHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ConnectionOptionHeaderValue]
  }
}

