package typings.vscodeLanguageserverProtocol

import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentContentChangeEvent
import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRange extends TextDocumentContentChangeEvent {
  /**
    * The range of the document that changed.
    */
  var range: Range
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

object AnonRange {
  @scala.inline
  def apply(range: Range, text: String, rangeLength: Int | Double = null): AnonRange = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (rangeLength != null) __obj.updateDynamic("rangeLength")(rangeLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRange]
  }
}

