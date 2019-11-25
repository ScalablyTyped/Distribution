package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentSaveReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WillSaveTextDocumentParams extends js.Object {
  /**
    * The 'TextDocumentSaveReason'.
    */
  var reason: TextDocumentSaveReason
  /**
    * The document that will be saved.
    */
  var textDocument: TextDocumentIdentifier
}

object WillSaveTextDocumentParams {
  @scala.inline
  def apply(reason: TextDocumentSaveReason, textDocument: TextDocumentIdentifier): WillSaveTextDocumentParams = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WillSaveTextDocumentParams]
  }
}

