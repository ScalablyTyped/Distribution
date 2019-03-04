package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentLinkParams extends js.Object {
  /**
    * The document to provide document links for.
    */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
}

object DocumentLinkParams {
  @scala.inline
  def apply(
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
  ): DocumentLinkParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument)
  
    __obj.asInstanceOf[DocumentLinkParams]
  }
}

