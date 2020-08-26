package typings.winrtUwp.Windows.Media.Ocr

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Globalization.Language
import typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides optical character recognition (OCR) functionality. */
@js.native
trait OcrEngine extends js.Object {
  /** Gets the language being used for text recognition. */
  var recognizerLanguage: Language = js.native
  /**
    * Scans the specified image for text in the language specified by the RecognizerLanguage property.
    * @param bitmap Represents an uncompressed bitmap.
    * @return The result of the OCR that was initiated by the OcrEngine object.
    */
  def recognizeAsync(bitmap: SoftwareBitmap): IPromiseWithIAsyncOperation[OcrResult] = js.native
}

object OcrEngine {
  @scala.inline
  def apply(
    recognizeAsync: SoftwareBitmap => IPromiseWithIAsyncOperation[OcrResult],
    recognizerLanguage: Language
  ): OcrEngine = {
    val __obj = js.Dynamic.literal(recognizeAsync = js.Any.fromFunction1(recognizeAsync), recognizerLanguage = recognizerLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcrEngine]
  }
  @scala.inline
  implicit class OcrEngineOps[Self <: OcrEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRecognizeAsync(value: SoftwareBitmap => IPromiseWithIAsyncOperation[OcrResult]): Self = this.set("recognizeAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setRecognizerLanguage(value: Language): Self = this.set("recognizerLanguage", value.asInstanceOf[js.Any])
  }
  
}

