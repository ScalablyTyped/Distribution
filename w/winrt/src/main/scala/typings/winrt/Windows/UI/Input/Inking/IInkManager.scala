package typings.winrt.Windows.UI.Input.Inking

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.UI.Input.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInkManager
  extends IInkStrokeContainer
     with IInkRecognizerContainer {
  var mode: InkManipulationMode = js.native
  def processPointerDown(pointerPoint: PointerPoint): Unit = js.native
  def processPointerUp(pointerPoint: PointerPoint): Rect = js.native
  def processPointerUpdate(pointerPoint: PointerPoint): js.Any = js.native
  def recognizeAsync(recognitionTarget: InkRecognitionTarget): IAsyncOperation[IVectorView[InkRecognitionResult]] = js.native
  def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): Unit = js.native
}

