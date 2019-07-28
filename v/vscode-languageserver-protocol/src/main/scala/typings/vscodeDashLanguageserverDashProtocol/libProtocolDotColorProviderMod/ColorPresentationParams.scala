package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotColorProviderMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Color
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
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
    val __obj = js.Dynamic.literal(color = color, range = range, textDocument = textDocument)
  
    __obj.asInstanceOf[ColorPresentationParams]
  }
}

