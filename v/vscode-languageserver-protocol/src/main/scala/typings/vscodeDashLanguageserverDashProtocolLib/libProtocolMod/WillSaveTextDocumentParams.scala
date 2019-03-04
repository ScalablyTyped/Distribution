package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WillSaveTextDocumentParams extends js.Object {
  /**
    * The 'TextDocumentSaveReason'.
    */
  var reason: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentSaveReason
  /**
    * The document that will be saved.
    */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
}

object WillSaveTextDocumentParams {
  @scala.inline
  def apply(
    reason: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentSaveReason,
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
  ): WillSaveTextDocumentParams = {
    val __obj = js.Dynamic.literal(reason = reason, textDocument = textDocument)
  
    __obj.asInstanceOf[WillSaveTextDocumentParams]
  }
}

