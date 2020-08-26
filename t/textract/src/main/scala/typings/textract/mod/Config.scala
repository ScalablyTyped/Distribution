package typings.textract.mod

import typings.node.childProcessMod.ExecException
import typings.textract.anon.Cmd
import typings.textract.anon.Crop
import typings.textract.anon.Lang
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * Doc extractor options for non OS X.
    * See `drawingtotext` manual for available options
    */
  var doc: js.UndefOr[extractorExecOpts] = js.native
  /**
    * DXF extractor options.
    * See `antiword` manual for available options
    */
  var dxf: js.UndefOr[extractorExecOpts] = js.native
  /**
    * Some extractors (dxf) use node's exec functionality.
    * This setting allows for providing config to exec execution.
    * One reason you might want to provide this config is if you are dealing with very large files.
    * You might want to increase the exec maxBuffer setting.
    */
  var exec: js.UndefOr[ExecException] = js.native
  /**
    * Images (png, jpg, gif) extractor options.
    * See `tesseract` manual for available options
    */
  var images: js.UndefOr[extractorExecOpts] = js.native
  /**
    * When extracting HTML, whether or not to include `alt` text with the extracted text.
    * @default false
    */
  var includeAltText: js.UndefOr[Boolean] = js.native
  /**
    * This is a proxy options object to the library textract uses for pdf extraction: pdf-text-extract.
    * Options include ownerPassword, userPassword if you are extracting text from password protected PDFs.
    * IMPORTANT: textract modifies the pdf-text-extract layout default so that, instead of layout: layout, it uses layout:raw.
    * It is not suggested you modify this without understanding what trouble that might get you in.
    * See [this GH issue](https://github.com/dbashford/textract/issues/75) for why textract overrides that library's default.
    */
  var pdftotextOptions: js.UndefOr[Crop] = js.native
  /**
    * Pass this in as true and textract will not strip any line breaks.
    * @default false
    */
  var preserveLineBreaks: js.UndefOr[Boolean] = js.native
  /**
    * Some extractors, like PDF, insert line breaks at the end of every line, even if the middle of a sentence.
    * If this option is set to true, then any instances of a single line break are removed but multiple line breaks are preserved.
    * Check your output with this option, though, this doesn't preserve paragraphs unless there are multiple breaks.
    * @default false
    */
  var preserveOnlyMultipleLineBreaks: js.UndefOr[Boolean] = js.native
  /**
    * RTF extractor options.
    * See `unrtf` manual for available options
    */
  var rtf: js.UndefOr[extractorExecOpts] = js.native
  var tesseract: js.UndefOr[Lang | Cmd] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setDoc(value: extractorExecOpts): Self = this.set("doc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoc: Self = this.set("doc", js.undefined)
    @scala.inline
    def setDxf(value: extractorExecOpts): Self = this.set("dxf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDxf: Self = this.set("dxf", js.undefined)
    @scala.inline
    def setExec(value: ExecException): Self = this.set("exec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExec: Self = this.set("exec", js.undefined)
    @scala.inline
    def setImages(value: extractorExecOpts): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setIncludeAltText(value: Boolean): Self = this.set("includeAltText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAltText: Self = this.set("includeAltText", js.undefined)
    @scala.inline
    def setPdftotextOptions(value: Crop): Self = this.set("pdftotextOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePdftotextOptions: Self = this.set("pdftotextOptions", js.undefined)
    @scala.inline
    def setPreserveLineBreaks(value: Boolean): Self = this.set("preserveLineBreaks", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveLineBreaks: Self = this.set("preserveLineBreaks", js.undefined)
    @scala.inline
    def setPreserveOnlyMultipleLineBreaks(value: Boolean): Self = this.set("preserveOnlyMultipleLineBreaks", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveOnlyMultipleLineBreaks: Self = this.set("preserveOnlyMultipleLineBreaks", js.undefined)
    @scala.inline
    def setRtf(value: extractorExecOpts): Self = this.set("rtf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtf: Self = this.set("rtf", js.undefined)
    @scala.inline
    def setTesseract(value: Lang | Cmd): Self = this.set("tesseract", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTesseract: Self = this.set("tesseract", js.undefined)
  }
  
}

