package typings.winrt.WindowsNs.UINs.InputNs.InkingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Rect
import typings.winrt.WindowsNs.UINs.InputNs.PointerPoint
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

