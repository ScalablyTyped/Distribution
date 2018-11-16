package typings
package winrtDashUwpLib.WindowsNs.MediaNs.OcrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single line of text recognized by the OCR engine and returned as part of the OcrResult . */
@JSGlobal("Windows.Media.Ocr.OcrLine")
@js.native
abstract class OcrLine () extends js.Object {
  /** Gets the text of the recognized line. */
  var text: java.lang.String = js.native
  /** Gets the collection of OcrWord objects that represents the words detected in the current line of text by the RecognizeAsync method. */
  var words: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[OcrWord] = js.native
}

