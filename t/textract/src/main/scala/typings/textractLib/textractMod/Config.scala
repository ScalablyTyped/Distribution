package typings
package textractLib.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * Doc extractor options for non OS X.
    * See `drawingtotext` manual for available options
    */
  var doc: js.UndefOr[extractorExecOpts] = js.undefined
  /**
    * DXF extractor options.
    * See `antiword` manual for available options
    */
  var dxf: js.UndefOr[extractorExecOpts] = js.undefined
  /**
    * Some extractors (dxf) use node's exec functionality.
    * This setting allows for providing config to exec execution.
    * One reason you might want to provide this config is if you are dealing with very large files.
    * You might want to increase the exec maxBuffer setting.
    */
  var exec: js.UndefOr[nodeLib.childUnderscoreProcessMod.ExecException] = js.undefined
  /**
    * Images (png, jpg, gif) extractor options.
    * See `tesseract` manual for available options
    */
  var images: js.UndefOr[extractorExecOpts] = js.undefined
  /**
    * When extracting HTML, whether or not to include `alt` text with the extracted text.
    * @default false
    */
  var includeAltText: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This is a proxy options object to the library textract uses for pdf extraction: pdf-text-extract.
    * Options include ownerPassword, userPassword if you are extracting text from password protected PDFs.
    * IMPORTANT: textract modifies the pdf-text-extract layout default so that, instead of layout: layout, it uses layout:raw.
    * It is not suggested you modify this without understanding what trouble that might get you in.
    * See [this GH issue](https://github.com/dbashford/textract/issues/75) for why textract overrides that library's default.
    */
  var pdftotextOptions: js.UndefOr[textractLib.Anon_FirstPage] = js.undefined
  /**
    * Pass this in as true and textract will not strip any line breaks.
    * @default false
    */
  var preserveLineBreaks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Some extractors, like PDF, insert line breaks at the end of every line, even if the middle of a sentence.
    * If this option is set to true, then any instances of a single line break are removed but multiple line breaks are preserved.
    * Check your output with this option, though, this doesn't preserve paragraphs unless there are multiple breaks.
    * @default false
    */
  var preserveOnlyMultipleLineBreaks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * RTF extractor options.
    * See `unrtf` manual for available options
    */
  var rtf: js.UndefOr[extractorExecOpts] = js.undefined
  var tesseract: js.UndefOr[textractLib.Anon_Lang | textractLib.Anon_Cmd] = js.undefined
}

