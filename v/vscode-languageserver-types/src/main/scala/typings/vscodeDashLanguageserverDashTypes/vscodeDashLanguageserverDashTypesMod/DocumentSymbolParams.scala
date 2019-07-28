package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSymbolParams extends js.Object {
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier
}

object DocumentSymbolParams {
  @scala.inline
  def apply(textDocument: TextDocumentIdentifier): DocumentSymbolParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument)
  
    __obj.asInstanceOf[DocumentSymbolParams]
  }
}

