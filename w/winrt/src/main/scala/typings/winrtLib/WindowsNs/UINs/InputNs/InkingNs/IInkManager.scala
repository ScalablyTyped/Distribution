package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInkManager
  extends IInkStrokeContainer
     with IInkRecognizerContainer {
  var mode: InkManipulationMode = js.native
  def processPointerDown(pointerPoint: winrtLib.WindowsNs.UINs.InputNs.PointerPoint): scala.Unit = js.native
  def processPointerUp(pointerPoint: winrtLib.WindowsNs.UINs.InputNs.PointerPoint): winrtLib.WindowsNs.FoundationNs.Rect = js.native
  def processPointerUpdate(pointerPoint: winrtLib.WindowsNs.UINs.InputNs.PointerPoint): js.Any = js.native
  def recognizeAsync(recognitionTarget: InkRecognitionTarget): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognitionResult]] = js.native
  def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): scala.Unit = js.native
}

