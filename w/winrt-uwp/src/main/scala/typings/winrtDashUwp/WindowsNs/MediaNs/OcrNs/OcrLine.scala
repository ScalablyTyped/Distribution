package typings.winrtDashUwp.WindowsNs.MediaNs.OcrNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single line of text recognized by the OCR engine and returned as part of the OcrResult . */
@JSGlobal("Windows.Media.Ocr.OcrLine")
@js.native
abstract class OcrLine () extends js.Object {
  /** Gets the text of the recognized line. */
  var text: String = js.native
  /** Gets the collection of OcrWord objects that represents the words detected in the current line of text by the RecognizeAsync method. */
  var words: IVectorView[OcrWord] = js.native
}

