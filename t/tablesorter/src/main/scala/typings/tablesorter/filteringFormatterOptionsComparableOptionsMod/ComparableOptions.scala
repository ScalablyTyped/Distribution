package typings.tablesorter.filteringFormatterOptionsComparableOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComparableOptions extends js.Object {
  /**
    * The compare-operators supported by the control.
    */
  var compare: js.UndefOr[String | js.Array[String]] = js.undefined
}

object ComparableOptions {
  @scala.inline
  def apply(compare: String | js.Array[String] = null): ComparableOptions = {
    val __obj = js.Dynamic.literal()
    if (compare != null) __obj.updateDynamic("compare")(compare.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComparableOptions]
  }
}

