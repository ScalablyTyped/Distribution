package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidOpenTextDocumentParams extends js.Object {
  /**
    * The document that was opened.
    */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentItem
}

object DidOpenTextDocumentParams {
  @scala.inline
  def apply(
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentItem
  ): DidOpenTextDocumentParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("textDocument")(textDocument)
    __obj.asInstanceOf[DidOpenTextDocumentParams]
  }
}

