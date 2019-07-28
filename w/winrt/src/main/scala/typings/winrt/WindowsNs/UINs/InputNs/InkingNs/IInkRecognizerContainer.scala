package typings.winrt.WindowsNs.UINs.InputNs.InkingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkRecognizerContainer extends js.Object {
  def getRecognizers(): IVectorView[InkRecognizer]
  def recognizeAsync(strokeCollection: InkStrokeContainer, recognitionTarget: InkRecognitionTarget): IAsyncOperation[IVectorView[InkRecognitionResult]]
  def setDefaultRecognizer(recognizer: InkRecognizer): Unit
}

object IInkRecognizerContainer {
  @scala.inline
  def apply(
    getRecognizers: () => IVectorView[InkRecognizer],
    recognizeAsync: (InkStrokeContainer, InkRecognitionTarget) => IAsyncOperation[IVectorView[InkRecognitionResult]],
    setDefaultRecognizer: InkRecognizer => Unit
  ): IInkRecognizerContainer = {
    val __obj = js.Dynamic.literal(getRecognizers = js.Any.fromFunction0(getRecognizers), recognizeAsync = js.Any.fromFunction2(recognizeAsync), setDefaultRecognizer = js.Any.fromFunction1(setDefaultRecognizer))
  
    __obj.asInstanceOf[IInkRecognizerContainer]
  }
}

