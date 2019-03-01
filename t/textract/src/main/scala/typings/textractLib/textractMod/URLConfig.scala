package typings
package textractLib.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLConfig extends Config {
  /**
    * Used with fromUrl, if set, rather than using the content-type from the URL request, will use the provided typeOverride.
    */
  var typeOverride: js.UndefOr[java.lang.String] = js.undefined
}

object URLConfig {
  @scala.inline
  def apply(
    doc: extractorExecOpts = null,
    dxf: extractorExecOpts = null,
    exec: nodeLib.childUnderscoreProcessMod.ExecException = null,
    images: extractorExecOpts = null,
    includeAltText: js.UndefOr[scala.Boolean] = js.undefined,
    pdftotextOptions: textractLib.Anon_ASCII7 = null,
    preserveLineBreaks: js.UndefOr[scala.Boolean] = js.undefined,
    preserveOnlyMultipleLineBreaks: js.UndefOr[scala.Boolean] = js.undefined,
    rtf: extractorExecOpts = null,
    tesseract: textractLib.Anon_Lang | textractLib.Anon_Cmd = null,
    typeOverride: java.lang.String = null
  ): URLConfig = {
    val __obj = js.Dynamic.literal()
    if (doc != null) __obj.updateDynamic("doc")(doc)
    if (dxf != null) __obj.updateDynamic("dxf")(dxf)
    if (exec != null) __obj.updateDynamic("exec")(exec)
    if (images != null) __obj.updateDynamic("images")(images)
    if (!js.isUndefined(includeAltText)) __obj.updateDynamic("includeAltText")(includeAltText)
    if (pdftotextOptions != null) __obj.updateDynamic("pdftotextOptions")(pdftotextOptions)
    if (!js.isUndefined(preserveLineBreaks)) __obj.updateDynamic("preserveLineBreaks")(preserveLineBreaks)
    if (!js.isUndefined(preserveOnlyMultipleLineBreaks)) __obj.updateDynamic("preserveOnlyMultipleLineBreaks")(preserveOnlyMultipleLineBreaks)
    if (rtf != null) __obj.updateDynamic("rtf")(rtf)
    if (tesseract != null) __obj.updateDynamic("tesseract")(tesseract.asInstanceOf[js.Any])
    if (typeOverride != null) __obj.updateDynamic("typeOverride")(typeOverride)
    __obj.asInstanceOf[URLConfig]
  }
}

