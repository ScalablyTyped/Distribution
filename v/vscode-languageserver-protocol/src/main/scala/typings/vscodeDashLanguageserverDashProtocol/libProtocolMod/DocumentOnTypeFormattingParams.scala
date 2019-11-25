package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.FormattingOptions
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Position
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentOnTypeFormattingParams extends js.Object {
  /**
    * The character that has been typed.
    */
  var ch: String
  /**
    * The format options.
    */
  var options: FormattingOptions
  /**
    * The position at which this request was send.
    */
  var position: Position
  /**
    * The document to format.
    */
  var textDocument: TextDocumentIdentifier
}

object DocumentOnTypeFormattingParams {
  @scala.inline
  def apply(ch: String, options: FormattingOptions, position: Position, textDocument: TextDocumentIdentifier): DocumentOnTypeFormattingParams = {
    val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentOnTypeFormattingParams]
  }
}

