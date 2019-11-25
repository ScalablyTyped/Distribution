package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.FormattingOptions
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentRangeFormattingParams extends js.Object {
  /**
    * The format options
    */
  var options: FormattingOptions
  /**
    * The range to format
    */
  var range: Range
  /**
    * The document to format.
    */
  var textDocument: TextDocumentIdentifier
}

object DocumentRangeFormattingParams {
  @scala.inline
  def apply(options: FormattingOptions, range: Range, textDocument: TextDocumentIdentifier): DocumentRangeFormattingParams = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentRangeFormattingParams]
  }
}

