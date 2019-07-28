package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidCloseTextDocumentParams extends js.Object {
  /**
    * The document that was closed.
    */
  var textDocument: TextDocumentIdentifier
}

object DidCloseTextDocumentParams {
  @scala.inline
  def apply(textDocument: TextDocumentIdentifier): DidCloseTextDocumentParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument)
  
    __obj.asInstanceOf[DidCloseTextDocumentParams]
  }
}

