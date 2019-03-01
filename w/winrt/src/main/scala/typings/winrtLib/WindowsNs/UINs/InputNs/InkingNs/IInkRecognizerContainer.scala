package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkRecognizerContainer extends js.Object {
  def getRecognizers(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognizer]
  def recognizeAsync(strokeCollection: InkStrokeContainer, recognitionTarget: InkRecognitionTarget): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognitionResult]]
  def setDefaultRecognizer(recognizer: InkRecognizer): scala.Unit
}

object IInkRecognizerContainer {
  @scala.inline
  def apply(
    getRecognizers: js.Function0[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognizer]],
    recognizeAsync: js.Function2[
      InkStrokeContainer, 
      InkRecognitionTarget, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognitionResult]]
    ],
    setDefaultRecognizer: js.Function1[InkRecognizer, scala.Unit]
  ): IInkRecognizerContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRecognizers")(getRecognizers)
    __obj.updateDynamic("recognizeAsync")(recognizeAsync)
    __obj.updateDynamic("setDefaultRecognizer")(setDefaultRecognizer)
    __obj.asInstanceOf[IInkRecognizerContainer]
  }
}

