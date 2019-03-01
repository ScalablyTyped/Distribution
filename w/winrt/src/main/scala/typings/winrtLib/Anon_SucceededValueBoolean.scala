package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SucceededValueBoolean extends js.Object {
  var succeeded: scala.Boolean
  var value: scala.Boolean
}

object Anon_SucceededValueBoolean {
  @scala.inline
  def apply(succeeded: scala.Boolean, value: scala.Boolean): Anon_SucceededValueBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_SucceededValueBoolean]
  }
}

