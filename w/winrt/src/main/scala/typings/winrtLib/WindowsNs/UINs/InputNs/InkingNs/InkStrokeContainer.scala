package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.Inking.InkStrokeContainer")
@js.native
class InkStrokeContainer () extends IInkStrokeContainer {
  /* CompleteClass */
  override var boundingRect: winrtLib.WindowsNs.FoundationNs.Rect = js.native
  /* CompleteClass */
  override def addStroke(stroke: InkStroke): scala.Unit = js.native
  /* CompleteClass */
  override def canPasteFromClipboard(): scala.Boolean = js.native
  /* CompleteClass */
  override def copySelectedToClipboard(): scala.Unit = js.native
  /* CompleteClass */
  override def deleteSelected(): winrtLib.WindowsNs.FoundationNs.Rect = js.native
  /* CompleteClass */
  override def getRecognitionResults(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognitionResult] = js.native
  /* CompleteClass */
  override def getStrokes(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkStroke] = js.native
  /* CompleteClass */
  override def loadAsync(inputStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream): winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[scala.Double] = js.native
  /* CompleteClass */
  override def moveSelected(translation: winrtLib.WindowsNs.FoundationNs.Point): winrtLib.WindowsNs.FoundationNs.Rect = js.native
  /* CompleteClass */
  override def pasteFromClipboard(position: winrtLib.WindowsNs.FoundationNs.Point): winrtLib.WindowsNs.FoundationNs.Rect = js.native
  /* CompleteClass */
  override def saveAsync(outputStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override def selectWithLine(from: winrtLib.WindowsNs.FoundationNs.Point, to: winrtLib.WindowsNs.FoundationNs.Point): winrtLib.WindowsNs.FoundationNs.Rect = js.native
  /* CompleteClass */
  override def selectWithPolyLine(
    polyline: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.FoundationNs.Point]
  ): winrtLib.WindowsNs.FoundationNs.Rect = js.native
  /* CompleteClass */
  override def updateRecognitionResults(
    recognitionResults: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognitionResult]
  ): scala.Unit = js.native
}

