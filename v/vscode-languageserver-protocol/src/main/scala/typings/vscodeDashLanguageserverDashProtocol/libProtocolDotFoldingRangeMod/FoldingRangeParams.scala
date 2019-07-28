package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
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
    val __obj = js.Dynamic.literal(textDocument = textDocument)
  
    __obj.asInstanceOf[FoldingRangeParams]
  }
}

