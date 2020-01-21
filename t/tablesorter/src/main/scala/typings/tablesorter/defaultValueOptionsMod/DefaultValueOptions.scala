package typings.tablesorter.defaultValueOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultValueOptions[T] extends js.Object {
  /**
    * The default value of the control.
    */
  var value: js.UndefOr[T] = js.undefined
}

object DefaultValueOptions {
  @scala.inline
  def apply[T](value: T = null): DefaultValueOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValueOptions[T]]
  }
}

