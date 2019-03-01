package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentRangeFormattingParams extends js.Object {
  /**
    * The format options
    */
  var options: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FormattingOptions
  /**
    * The range to format
    */
  var range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range
  /**
    * The document to format.
    */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
}

object DocumentRangeFormattingParams {
  @scala.inline
  def apply(
    options: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FormattingOptions,
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
  ): DocumentRangeFormattingParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("textDocument")(textDocument)
    __obj.asInstanceOf[DocumentRangeFormattingParams]
  }
}

