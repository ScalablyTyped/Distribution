package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotFoldingRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeParams extends js.Object {
  /**
    * The text document.
    */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
}

object FoldingRangeParams {
  @scala.inline
  def apply(
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
  ): FoldingRangeParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("textDocument")(textDocument)
    __obj.asInstanceOf[FoldingRangeParams]
  }
}

