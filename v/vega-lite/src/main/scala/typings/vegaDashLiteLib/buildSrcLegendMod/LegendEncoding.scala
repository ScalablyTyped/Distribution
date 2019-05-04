package typings
package vegaDashLiteLib.buildSrcLegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendEncoding extends js.Object {
  /**
    * Custom encoding for legend gradient filled rect marks.
    */
  var gradient: js.UndefOr[vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for legend label text marks.
    */
  var labels: js.UndefOr[vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for the legend container.
    * This can be useful for creating legend with custom x, y position.
    */
  var legend: js.UndefOr[vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for legend symbol marks.
    */
  var symbols: js.UndefOr[vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for the legend title text mark.
    */
  var title: js.UndefOr[vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry] = js.undefined
}

object LegendEncoding {
  @scala.inline
  def apply(
    gradient: vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry = null,
    labels: vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry = null,
    legend: vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry = null,
    symbols: vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry = null,
    title: vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry = null
  ): LegendEncoding = {
    val __obj = js.Dynamic.literal()
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (symbols != null) __obj.updateDynamic("symbols")(symbols)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[LegendEncoding]
  }
}

