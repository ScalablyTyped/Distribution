package typings.winrt.WindowsNs.UINs.InputNs.InkingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.Inking.InkRecognizerContainer")
@js.native
class InkRecognizerContainer () extends IInkRecognizerContainer {
  /* CompleteClass */
  override def getRecognizers(): IVectorView[InkRecognizer] = js.native
  /* CompleteClass */
  override def recognizeAsync(strokeCollection: InkStrokeContainer, recognitionTarget: InkRecognitionTarget): IAsyncOperation[IVectorView[InkRecognitionResult]] = js.native
  /* CompleteClass */
  override def setDefaultRecognizer(recognizer: InkRecognizer): Unit = js.native
}

