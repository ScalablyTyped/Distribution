package typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeParams extends js.Object {
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier
}

object FoldingRangeParams {
  @scala.inline
  def apply(textDocument: TextDocumentIdentifier): FoldingRangeParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FoldingRangeParams]
  }
}

