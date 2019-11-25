package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Document conversion settings. */
trait Conversions extends js.Object {
  /** A list of HTML conversion settings. */
  var html: js.UndefOr[HtmlSettings] = js.undefined
  /** Defines operations that can be used to transform the final output JSON into a normalized form. Operations are executed in the order that they appear in the array. */
  var json_normalizations: js.UndefOr[js.Array[NormalizationOperation]] = js.undefined
  /** A list of PDF conversion settings. */
  var pdf: js.UndefOr[PdfSettings] = js.undefined
  /** A list of Document Segmentation settings. */
  var segment: js.UndefOr[SegmentSettings] = js.undefined
  /** A list of Word conversion settings. */
  var word: js.UndefOr[WordSettings] = js.undefined
}

object Conversions {
  @scala.inline
  def apply(
    html: HtmlSettings = null,
    json_normalizations: js.Array[NormalizationOperation] = null,
    pdf: PdfSettings = null,
    segment: SegmentSettings = null,
    word: WordSettings = null
  ): Conversions = {
    val __obj = js.Dynamic.literal()
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (json_normalizations != null) __obj.updateDynamic("json_normalizations")(json_normalizations.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    if (word != null) __obj.updateDynamic("word")(word.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversions]
  }
}

