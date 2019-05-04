package typings
package vegaDashLiteLib.buildSrcToplevelpropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundsMixins extends js.Object {
  /**
    * The bounds calculation method to use for determining the extent of a sub-plot. One of `full` (the default) or `flush`.
    *
    * - If set to `full`, the entire calculated bounds (including axes, title, and legend) will be used.
    * - If set to `flush`, only the specified width and height values for the sub-view will be used. The `flush` setting can be useful when attempting to place sub-plots without axes or legends into a uniform grid structure.
    *
    * __Default value:__ `"full"`
    */
  var bounds: js.UndefOr[
    vegaDashLiteLib.vegaDashLiteLibStrings.full | vegaDashLiteLib.vegaDashLiteLibStrings.flush
  ] = js.undefined
}

object BoundsMixins {
  @scala.inline
  def apply(
    bounds: vegaDashLiteLib.vegaDashLiteLibStrings.full | vegaDashLiteLib.vegaDashLiteLibStrings.flush = null
  ): BoundsMixins = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundsMixins]
  }
}

