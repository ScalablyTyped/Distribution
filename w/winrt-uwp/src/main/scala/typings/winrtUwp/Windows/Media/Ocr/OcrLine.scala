package typings.winrtUwp.Windows.Media.Ocr

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single line of text recognized by the OCR engine and returned as part of the OcrResult . */
trait OcrLine extends js.Object {
  /** Gets the text of the recognized line. */
  var text: String
  /** Gets the collection of OcrWord objects that represents the words detected in the current line of text by the RecognizeAsync method. */
  var words: IVectorView[OcrWord]
}

object OcrLine {
  @scala.inline
  def apply(text: String, words: IVectorView[OcrWord]): OcrLine = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcrLine]
  }
}

