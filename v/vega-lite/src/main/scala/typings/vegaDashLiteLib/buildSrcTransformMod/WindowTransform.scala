package typings
package vegaDashLiteLib.buildSrcTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowTransform extends Transform {
  /**
    * A frame specification as a two-element array indicating how the sliding window should proceed. The array entries should either be a number indicating the offset from the current data object, or null to indicate unbounded rows preceding or following the current data object. The default value is `[null, 0]`, indicating that the sliding window includes the current object and all preceding objects. The value `[-5, 5]` indicates that the window should include five objects preceding and five objects following the current object. Finally, `[null, null]` indicates that the window frame should always include all data objects. The only operators affected are the aggregation operations and the `first_value`, `last_value`, and `nth_value` window operations. The other window operations are not affected by this.
    *
    * __Default value:__:  `[null, 0]` (includes the current object and all preceding objects)
    */
  var frame: js.UndefOr[js.Array[scala.Null | scala.Double]] = js.undefined
  /**
    * The data fields for partitioning the data objects into separate windows. If unspecified, all data points will be in a single group.
    */
  var groupby: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Indicates if the sliding window frame should ignore peer values. (Peer values are those considered identical by the sort criteria). The default is false, causing the window frame to expand to include all peer values. If set to true, the window frame will be defined by offset values only. This setting only affects those operations that depend on the window frame, namely aggregation operations and the first_value, last_value, and nth_value window operations.
    *
    * __Default value:__ `false`
    */
  var ignorePeers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A sort field definition for sorting data objects within a window. If two data objects are considered equal by the comparator, they are considered “peer” values of equal rank. If sort is not specified, the order is undefined: data objects are processed in the order they are observed and none are considered peers (the ignorePeers parameter is ignored and treated as if set to `true`).
    */
  var sort: js.UndefOr[js.Array[vegaDashLiteLib.buildSrcSortMod.SortField]] = js.undefined
  /**
    * The definition of the fields in the window, and what calculations to use.
    */
  var window: js.Array[WindowFieldDef]
}

object WindowTransform {
  @scala.inline
  def apply(
    window: js.Array[WindowFieldDef],
    frame: js.Array[scala.Null | scala.Double] = null,
    groupby: js.Array[java.lang.String] = null,
    ignorePeers: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.Array[vegaDashLiteLib.buildSrcSortMod.SortField] = null
  ): WindowTransform = {
    val __obj = js.Dynamic.literal(window = window)
    if (frame != null) __obj.updateDynamic("frame")(frame)
    if (groupby != null) __obj.updateDynamic("groupby")(groupby)
    if (!js.isUndefined(ignorePeers)) __obj.updateDynamic("ignorePeers")(ignorePeers)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[WindowTransform]
  }
}

