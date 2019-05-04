package typings
package vegaDashLiteLib.buildSrcCompositemarkBoxplotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxPlotDef extends js.Object {
  /**
    * Extent is used to determine where the whiskers extend to. The options are
    * - `"min-max": min and max are the lower and upper whiskers respectively.
    * -  A scalar (integer or floating point number) that will be multiplied by the IQR and the product will be added to the third quartile to get the upper whisker and subtracted from the first quartile to get the lower whisker.
    * __Default value:__ `"1.5"`.
    */
  var extent: js.UndefOr[vegaDashLiteLib.vegaDashLiteLibStrings.`min-max` | scala.Double] = js.undefined
  /**
    * Orientation of the box plot.  This is normally automatically determined, but can be specified when the orientation is ambiguous and cannot be automatically determined.
    */
  var orient: js.UndefOr[vegaDashLiteLib.buildSrcVegaDotSchemaMod.Orient] = js.undefined
  /**
    * Type of the mark.  For box plots, this should always be `"box-plot"`.
    * [boxplot](https://vega.github.io/vega-lite/docs/compositemark.html#boxplot)
    */
  var `type`: BOXPLOT
}

object BoxPlotDef {
  @scala.inline
  def apply(
    `type`: BOXPLOT,
    extent: vegaDashLiteLib.vegaDashLiteLibStrings.`min-max` | scala.Double = null,
    orient: vegaDashLiteLib.buildSrcVegaDotSchemaMod.Orient = null
  ): BoxPlotDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    __obj.asInstanceOf[BoxPlotDef]
  }
}

