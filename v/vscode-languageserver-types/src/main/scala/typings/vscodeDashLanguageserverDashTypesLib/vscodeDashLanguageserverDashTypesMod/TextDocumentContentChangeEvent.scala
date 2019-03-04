package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentContentChangeEvent extends js.Object {
  /**
    * The range of the document that changed.
    */
  var range: js.UndefOr[Range] = js.undefined
  /**
    * The length of the range that got replaced.
    */
  var rangeLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * The new text of the document.
    */
  var text: java.lang.String
}

object TextDocumentContentChangeEvent {
  @scala.inline
  def apply(text: java.lang.String, range: Range = null, rangeLength: scala.Int | scala.Double = null): TextDocumentContentChangeEvent = {
    val __obj = js.Dynamic.literal(text = text)
    if (range != null) __obj.updateDynamic("range")(range)
    if (rangeLength != null) __obj.updateDynamic("rangeLength")(rangeLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentContentChangeEvent]
  }
}

