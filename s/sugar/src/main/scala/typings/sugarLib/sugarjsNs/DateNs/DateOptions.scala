package typings
package sugarLib.sugarjsNs.DateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateOptions extends js.Object {
  var newDateInternal: js.Function
}

object DateOptions {
  @scala.inline
  def apply(newDateInternal: js.Function): DateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newDateInternal")(newDateInternal)
    __obj.asInstanceOf[DateOptions]
  }
}

