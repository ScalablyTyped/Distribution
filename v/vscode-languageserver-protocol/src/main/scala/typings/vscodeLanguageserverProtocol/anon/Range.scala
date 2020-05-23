package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentContentChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends TextDocumentContentChangeEvent {
  /**
    * The range of the document that changed.
    */
  var range: typings.vscodeLanguageserverTypes.mod.Range
  /**
    * The optional length of the range that got replaced.
    *
    * @deprecated use range instead.
    */
  var rangeLength: js.UndefOr[Double] = js.undefined
  /**
    * The new text for the provided range.
    */
  var text: String
}

object Range {
  @scala.inline
  def apply(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    text: String,
    rangeLength: js.UndefOr[Double] = js.undefined
  ): Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeLength)) __obj.updateDynamic("rangeLength")(rangeLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

