package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentLinkParams extends js.Object {
  /**
    * The document to provide document links for.
    */
  var textDocument: TextDocumentIdentifier
}

object DocumentLinkParams {
  @scala.inline
  def apply(textDocument: TextDocumentIdentifier): DocumentLinkParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentLinkParams]
  }
}

