package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotColorProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentColorParams extends js.Object {
  /**
    * The text document.
    */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
}

object DocumentColorParams {
  @scala.inline
  def apply(
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
  ): DocumentColorParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument)
  
    __obj.asInstanceOf[DocumentColorParams]
  }
}

