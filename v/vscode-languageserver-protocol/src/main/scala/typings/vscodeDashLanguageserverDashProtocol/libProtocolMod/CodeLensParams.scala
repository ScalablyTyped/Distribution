package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeLensParams extends js.Object {
  /**
    * The document to request code lens for.
    */
  var textDocument: TextDocumentIdentifier
}

object CodeLensParams {
  @scala.inline
  def apply(textDocument: TextDocumentIdentifier): CodeLensParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CodeLensParams]
  }
}

