package typings.vegaDashLite.buildSrcLegendMod

import typings.vegaDashLite.buildSrcGuideMod.GuideEncodingEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendEncoding extends js.Object {
  /**
    * Custom encoding for legend gradient filled rect marks.
    */
  var gradient: js.UndefOr[GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for legend label text marks.
    */
  var labels: js.UndefOr[GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for the legend container.
    * This can be useful for creating legend with custom x, y position.
    */
  var legend: js.UndefOr[GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for legend symbol marks.
    */
  var symbols: js.UndefOr[GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for the legend title text mark.
    */
  var title: js.UndefOr[GuideEncodingEntry] = js.undefined
}

object LegendEncoding {
  @scala.inline
  def apply(
    gradient: GuideEncodingEntry = null,
    labels: GuideEncodingEntry = null,
    legend: GuideEncodingEntry = null,
    symbols: GuideEncodingEntry = null,
    title: GuideEncodingEntry = null
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

