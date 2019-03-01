package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Length extends js.Object {
  /** The length in bytes of the HTTP content. */ var length: scala.Double
  /** true if length is a valid length; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_Length {
  @scala.inline
  def apply(length: scala.Double, returnValue: scala.Boolean): Anon_Length = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_Length]
  }
}

