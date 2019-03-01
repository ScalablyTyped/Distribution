package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentPositionParams extends js.Object {
  /**
    * The position inside the text document.
    */
  var position: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position
  /**
    * The text document.
    */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
}

object TextDocumentPositionParams {
  @scala.inline
  def apply(
    position: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position,
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
  ): TextDocumentPositionParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("textDocument")(textDocument)
    __obj.asInstanceOf[TextDocumentPositionParams]
  }
}

