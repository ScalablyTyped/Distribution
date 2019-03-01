package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFormattingParams extends js.Object {
  /**
    * The format options
    */
  var options: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FormattingOptions
  /**
    * The document to format.
    */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
}

object DocumentFormattingParams {
  @scala.inline
  def apply(
    options: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FormattingOptions,
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
  ): DocumentFormattingParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("textDocument")(textDocument)
    __obj.asInstanceOf[DocumentFormattingParams]
  }
}

