package typings.vscodeLanguageserverProtocol.protocolColorProviderMod

import typings.vscodeLanguageserverTypes.mod.Color
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPresentationParams extends js.Object {
  /**
    * The color to request presentations for.
    */
  var color: Color
  /**
    * The range where the color would be inserted. Serves as a context.
    */
  var range: Range
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier
}

object ColorPresentationParams {
  @scala.inline
  def apply(color: Color, range: Range, textDocument: TextDocumentIdentifier): ColorPresentationParams = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColorPresentationParams]
  }
}

