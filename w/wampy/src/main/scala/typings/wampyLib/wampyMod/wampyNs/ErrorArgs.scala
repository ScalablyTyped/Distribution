package typings
package wampyLib.wampyMod.wampyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorArgs extends js.Object {
  var details: Dict
  var error: java.lang.String
}

object ErrorArgs {
  @scala.inline
  def apply(details: Dict, error: java.lang.String): ErrorArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("details")(details)
    __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[ErrorArgs]
  }
}

