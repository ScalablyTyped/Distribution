package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Document conversion settings. */
@js.native
trait Conversions extends js.Object {
  /** A list of HTML conversion settings. */
  var html: js.UndefOr[HtmlSettings] = js.native
  /** Defines operations that can be used to transform the final output JSON into a normalized form. Operations are executed in the order that they appear in the array. */
  var json_normalizations: js.UndefOr[js.Array[NormalizationOperation]] = js.native
  /** A list of PDF conversion settings. */
  var pdf: js.UndefOr[PdfSettings] = js.native
  /** A list of Document Segmentation settings. */
  var segment: js.UndefOr[SegmentSettings] = js.native
  /** A list of Word conversion settings. */
  var word: js.UndefOr[WordSettings] = js.native
}

object Conversions {
  @scala.inline
  def apply(): Conversions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conversions]
  }
  @scala.inline
  implicit class ConversionsOps[Self <: Conversions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHtml(value: HtmlSettings): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setJson_normalizationsVarargs(value: NormalizationOperation*): Self = this.set("json_normalizations", js.Array(value :_*))
    @scala.inline
    def setJson_normalizations(value: js.Array[NormalizationOperation]): Self = this.set("json_normalizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson_normalizations: Self = this.set("json_normalizations", js.undefined)
    @scala.inline
    def setPdf(value: PdfSettings): Self = this.set("pdf", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    @scala.inline
    def setSegment(value: SegmentSettings): Self = this.set("segment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
    @scala.inline
    def setWord(value: WordSettings): Self = this.set("word", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWord: Self = this.set("word", js.undefined)
  }
  
}

