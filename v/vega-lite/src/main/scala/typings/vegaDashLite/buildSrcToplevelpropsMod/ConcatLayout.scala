package typings.vegaDashLite.buildSrcToplevelpropsMod

import typings.vegaDashLite.vegaDashLiteStrings.flush
import typings.vegaDashLite.vegaDashLiteStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatLayout extends BoundsMixins {
  /**
    * Boolean flag indicating if subviews should be centered relative to their respective rows or columns.
    *
    * __Default value:__ `false`
    */
  var center: js.UndefOr[Boolean] = js.undefined
  /**
    * The spacing in pixels between sub-views of the concat operator.
    *
    * __Default value__: `10`
    */
  var spacing: js.UndefOr[Double] = js.undefined
}

object ConcatLayout {
  @scala.inline
  def apply(
    bounds: full | flush = null,
    center: js.UndefOr[Boolean] = js.undefined,
    spacing: Int | Double = null
  ): ConcatLayout = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatLayout]
  }
}

