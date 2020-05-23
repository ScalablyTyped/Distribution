package typings.winrtUwp.Windows.Media.Ocr

import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single word in a line of text recognized by the OCR engine and returned as part of the OcrLine . */
trait OcrWord extends js.Object {
  /** Gets the position and size in pixels of the recognized word from the top left corner of image when the value of TextAngle property is 0 (zero). */
  var boundingRect: Rect
  /** Gets the text of the recognized word. */
  var text: String
}

object OcrWord {
  @scala.inline
  def apply(boundingRect: Rect, text: String): OcrWord = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcrWord]
  }
}

