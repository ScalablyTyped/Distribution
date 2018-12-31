package typings
package winrtDashUwpLib.WindowsNs.MediaNs.OcrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides optical character recognition (OCR) functionality. */
@JSGlobal("Windows.Media.Ocr.OcrEngine")
@js.native
abstract class OcrEngine () extends js.Object {
  /** Gets the language being used for text recognition. */
  var recognizerLanguage: winrtDashUwpLib.WindowsNs.GlobalizationNs.Language = js.native
  /**
    * Scans the specified image for text in the language specified by the RecognizerLanguage property.
    * @param bitmap Represents an uncompressed bitmap.
    * @return The result of the OCR that was initiated by the OcrEngine object.
    */
  def recognizeAsync(bitmap: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.SoftwareBitmap): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[OcrResult] = js.native
}

/** Provides optical character recognition (OCR) functionality. */
@JSGlobal("Windows.Media.Ocr.OcrEngine")
@js.native
object OcrEngine extends js.Object {
  /** Returns a collection of all available OCR languages on the device. */
  var availableRecognizerLanguages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.GlobalizationNs.Language] = js.native
  /** Gets the maximum image pixel dimensions supported by the OCR engine. */
  var maxImageDimension: scala.Double = js.native
  /**
    * Returns true if a specified language can be resolved to any of the available OCR languages. See language matching for a further explanation of language resolving.
    * @param language The language being used for text recognition.
    * @return TRUE, if the specified language can be resolved to any of the available OCR languages; otherwise, FALSE.
    */
  def isLanguageSupported(language: winrtDashUwpLib.WindowsNs.GlobalizationNs.Language): scala.Boolean = js.native
  /**
    * Creates a new instance of the OcrEngine class.
    * @param language The language being used for text recognition.
    * @return If the specified language can be resolved to any of the OCR languages available on the device, returns new instance of OcrEngine class, otherwise returns null. See language matching for a further explanation of language resolving.
    */
  def tryCreateFromLanguage(language: winrtDashUwpLib.WindowsNs.GlobalizationNs.Language): winrtDashUwpLib.WindowsNs.MediaNs.OcrNs.OcrEngine = js.native
  /**
    * Creates a new instance of the OcrEngine class.
    * @return If any language from GlobalizationPreferences.Languages can be resolved to any of the available OCR languages returns new instance of OcrEngine class, otherwise returns null.
    */
  def tryCreateFromUserProfileLanguages(): winrtDashUwpLib.WindowsNs.MediaNs.OcrNs.OcrEngine = js.native
}

