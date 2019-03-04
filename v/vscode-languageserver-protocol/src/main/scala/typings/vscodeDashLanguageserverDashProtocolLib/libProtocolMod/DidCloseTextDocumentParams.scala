package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidCloseTextDocumentParams extends js.Object {
  /**
    * The document that was closed.
    */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
}

object DidCloseTextDocumentParams {
  @scala.inline
  def apply(
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
  ): DidCloseTextDocumentParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument)
  
    __obj.asInstanceOf[DidCloseTextDocumentParams]
  }
}

