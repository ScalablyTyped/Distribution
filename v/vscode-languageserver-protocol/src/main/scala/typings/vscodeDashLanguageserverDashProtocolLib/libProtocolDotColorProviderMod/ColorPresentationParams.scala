package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotColorProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPresentationParams extends js.Object {
  /**
    * The color to request presentations for.
    */
  var color: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Color
  /**
    * The range where the color would be inserted. Serves as a context.
    */
  var range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range
  /**
    * The text document.
    */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
}

object ColorPresentationParams {
  @scala.inline
  def apply(
    color: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Color,
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
  ): ColorPresentationParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("textDocument")(textDocument)
    __obj.asInstanceOf[ColorPresentationParams]
  }
}

