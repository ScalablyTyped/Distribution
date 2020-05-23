package typings.winrtUwp.Windows.Media.Ocr

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the results of Optical Character Recognition (OCR). */
trait OcrResult extends js.Object {
  /** Gets the collection of OcrLine objects that represents the lines of text detected in the image by the RecognizeAsync method. */
  var lines: IVectorView[OcrLine]
  /** Gets the recognized text. */
  var text: String
  /** Gets the clockwise rotation of the recognized text, in degrees, around the center of the image. */
  var textAngle: Double
}

object OcrResult {
  @scala.inline
  def apply(lines: IVectorView[OcrLine], text: String, textAngle: Double): OcrResult = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textAngle = textAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcrResult]
  }
}

