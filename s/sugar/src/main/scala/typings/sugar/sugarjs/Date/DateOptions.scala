package typings.sugar.sugarjs.Date

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateOptions extends js.Object {
  var newDateInternal: js.Function
}

object DateOptions {
  @scala.inline
  def apply(newDateInternal: js.Function): DateOptions = {
    val __obj = js.Dynamic.literal(newDateInternal = newDateInternal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DateOptions]
  }
}

