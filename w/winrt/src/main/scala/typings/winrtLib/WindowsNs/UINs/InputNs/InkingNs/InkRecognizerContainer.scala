package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.Inking.InkRecognizerContainer")
@js.native
class InkRecognizerContainer () extends IInkRecognizerContainer {
  /* CompleteClass */
  override def getRecognizers(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognizer] = js.native
  /* CompleteClass */
  override def recognizeAsync(strokeCollection: InkStrokeContainer, recognitionTarget: InkRecognitionTarget): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognitionResult]] = js.native
  /* CompleteClass */
  override def setDefaultRecognizer(recognizer: InkRecognizer): scala.Unit = js.native
}

