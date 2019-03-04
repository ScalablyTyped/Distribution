package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReturnValueValue extends js.Object {
  /** Returns true if the method succeeds, or false otherwise. */ var returnValue: scala.Boolean
  /** The current value of the setting. The units depend on the setting. */ var value: scala.Double
}

object Anon_ReturnValueValue {
  @scala.inline
  def apply(returnValue: scala.Boolean, value: scala.Double): Anon_ReturnValueValue = {
    val __obj = js.Dynamic.literal(returnValue = returnValue, value = value)
  
    __obj.asInstanceOf[Anon_ReturnValueValue]
  }
}

