package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotColorProviderMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentColorParams extends js.Object {
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier
}

object DocumentColorParams {
  @scala.inline
  def apply(textDocument: TextDocumentIdentifier): DocumentColorParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentColorParams]
  }
}

