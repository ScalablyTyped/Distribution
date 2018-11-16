package typings
package winrtDashUwpLib.WindowsNs.MediaNs.OcrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single word in a line of text recognized by the OCR engine and returned as part of the OcrLine . */
@JSGlobal("Windows.Media.Ocr.OcrWord")
@js.native
abstract class OcrWord () extends js.Object {
  /** Gets the position and size in pixels of the recognized word from the top left corner of image when the value of TextAngle property is 0 (zero). */
  var boundingRect: winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
  /** Gets the text of the recognized word. */
  var text: java.lang.String = js.native
}

