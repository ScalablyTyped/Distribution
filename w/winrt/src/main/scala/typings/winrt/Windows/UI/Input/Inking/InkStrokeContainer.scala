package typings.winrt.Windows.UI.Input.Inking

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncActionWithProgress
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.Inking.InkStrokeContainer")
@js.native
class InkStrokeContainer () extends IInkStrokeContainer {
  /* CompleteClass */
  override var boundingRect: Rect = js.native
  /* CompleteClass */
  override def addStroke(stroke: InkStroke): Unit = js.native
  /* CompleteClass */
  override def canPasteFromClipboard(): Boolean = js.native
  /* CompleteClass */
  override def copySelectedToClipboard(): Unit = js.native
  /* CompleteClass */
  override def deleteSelected(): Rect = js.native
  /* CompleteClass */
  override def getRecognitionResults(): IVectorView[InkRecognitionResult] = js.native
  /* CompleteClass */
  override def getStrokes(): IVectorView[InkStroke] = js.native
  /* CompleteClass */
  override def loadAsync(inputStream: IInputStream): IAsyncActionWithProgress[Double] = js.native
  /* CompleteClass */
  override def moveSelected(translation: Point): Rect = js.native
  /* CompleteClass */
  override def pasteFromClipboard(position: Point): Rect = js.native
  /* CompleteClass */
  override def saveAsync(outputStream: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
  /* CompleteClass */
  override def selectWithLine(from: Point, to: Point): Rect = js.native
  /* CompleteClass */
  override def selectWithPolyLine(polyline: IIterable[Point]): Rect = js.native
  /* CompleteClass */
  override def updateRecognitionResults(recognitionResults: IVectorView[InkRecognitionResult]): Unit = js.native
}

