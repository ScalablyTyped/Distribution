package typings.winrtDashUwp.WindowsNs.MediaNs.OcrNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the results of Optical Character Recognition (OCR). */
@JSGlobal("Windows.Media.Ocr.OcrResult")
@js.native
abstract class OcrResult () extends js.Object {
  /** Gets the collection of OcrLine objects that represents the lines of text detected in the image by the RecognizeAsync method. */
  var lines: IVectorView[OcrLine] = js.native
  /** Gets the recognized text. */
  var text: String = js.native
  /** Gets the clockwise rotation of the recognized text, in degrees, around the center of the image. */
  var textAngle: Double = js.native
}

