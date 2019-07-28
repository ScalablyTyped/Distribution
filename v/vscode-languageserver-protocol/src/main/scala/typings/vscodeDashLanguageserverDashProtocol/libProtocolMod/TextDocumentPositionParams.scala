package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Position
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentPositionParams extends js.Object {
  /**
    * The position inside the text document.
    */
  var position: Position
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier
}

object TextDocumentPositionParams {
  @scala.inline
  def apply(position: Position, textDocument: TextDocumentIdentifier): TextDocumentPositionParams = {
    val __obj = js.Dynamic.literal(position = position, textDocument = textDocument)
  
    __obj.asInstanceOf[TextDocumentPositionParams]
  }
}

