package typings.vegaDashLite.buildSrcTransformMod

import typings.vegaDashLite.buildSrcSortMod.SortField
import typings.vegaDashLite.vegaDashLiteStrings.center
import typings.vegaDashLite.vegaDashLiteStrings.normalize
import typings.vegaDashLite.vegaDashLiteStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackTransform extends Transform {
  /**
    * Output field names. This can be either a string or an array of strings with
    * two elements denoting the name for the fields for stack start and stack end
    * respectively.
    * If a single string(eg."val") is provided, the end field will be "val_end".
    */
  var as: String | js.Array[String]
  /**
    * The data fields to group by.
    */
  var groupby: js.Array[String]
  /**
    * Mode for stacking marks.
    * __Default value:__ `"zero"`
    */
  var offset: js.UndefOr[zero | center | normalize] = js.undefined
  /**
    * Field that determines the order of leaves in the stacked charts.
    */
  var sort: js.UndefOr[js.Array[SortField]] = js.undefined
  /**
    * The field which is stacked.
    */
  var stack: String
}

object StackTransform {
  @scala.inline
  def apply(
    as: String | js.Array[String],
    groupby: js.Array[String],
    stack: String,
    offset: zero | center | normalize = null,
    sort: js.Array[SortField] = null
  ): StackTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], groupby = groupby, stack = stack)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[StackTransform]
  }
}

