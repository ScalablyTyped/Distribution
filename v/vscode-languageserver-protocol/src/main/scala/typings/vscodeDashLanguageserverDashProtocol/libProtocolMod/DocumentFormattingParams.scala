package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.FormattingOptions
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFormattingParams extends js.Object {
  /**
    * The format options
    */
  var options: FormattingOptions
  /**
    * The document to format.
    */
  var textDocument: TextDocumentIdentifier
}

object DocumentFormattingParams {
  @scala.inline
  def apply(options: FormattingOptions, textDocument: TextDocumentIdentifier): DocumentFormattingParams = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentFormattingParams]
  }
}

