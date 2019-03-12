package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkStrokeContainer extends js.Object {
  var boundingRect: winrtLib.WindowsNs.FoundationNs.Rect
  def addStroke(stroke: InkStroke): scala.Unit
  def canPasteFromClipboard(): scala.Boolean
  def copySelectedToClipboard(): scala.Unit
  def deleteSelected(): winrtLib.WindowsNs.FoundationNs.Rect
  def getRecognitionResults(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognitionResult]
  def getStrokes(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkStroke]
  def loadAsync(inputStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream): winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[scala.Double]
  def moveSelected(translation: winrtLib.WindowsNs.FoundationNs.Point): winrtLib.WindowsNs.FoundationNs.Rect
  def pasteFromClipboard(position: winrtLib.WindowsNs.FoundationNs.Point): winrtLib.WindowsNs.FoundationNs.Rect
  def saveAsync(outputStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double]
  def selectWithLine(from: winrtLib.WindowsNs.FoundationNs.Point, to: winrtLib.WindowsNs.FoundationNs.Point): winrtLib.WindowsNs.FoundationNs.Rect
  def selectWithPolyLine(
    polyline: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.FoundationNs.Point]
  ): winrtLib.WindowsNs.FoundationNs.Rect
  def updateRecognitionResults(
    recognitionResults: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognitionResult]
  ): scala.Unit
}

object IInkStrokeContainer {
  @scala.inline
  def apply(
    addStroke: InkStroke => scala.Unit,
    boundingRect: winrtLib.WindowsNs.FoundationNs.Rect,
    canPasteFromClipboard: () => scala.Boolean,
    copySelectedToClipboard: () => scala.Unit,
    deleteSelected: () => winrtLib.WindowsNs.FoundationNs.Rect,
    getRecognitionResults: () => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognitionResult],
    getStrokes: () => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkStroke],
    loadAsync: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream => winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[scala.Double],
    moveSelected: winrtLib.WindowsNs.FoundationNs.Point => winrtLib.WindowsNs.FoundationNs.Rect,
    pasteFromClipboard: winrtLib.WindowsNs.FoundationNs.Point => winrtLib.WindowsNs.FoundationNs.Rect,
    saveAsync: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double],
    selectWithLine: (winrtLib.WindowsNs.FoundationNs.Point, winrtLib.WindowsNs.FoundationNs.Point) => winrtLib.WindowsNs.FoundationNs.Rect,
    selectWithPolyLine: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.FoundationNs.Point] => winrtLib.WindowsNs.FoundationNs.Rect,
    updateRecognitionResults: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognitionResult] => scala.Unit
  ): IInkStrokeContainer = {
    val __obj = js.Dynamic.literal(addStroke = js.Any.fromFunction1(addStroke), boundingRect = boundingRect, canPasteFromClipboard = js.Any.fromFunction0(canPasteFromClipboard), copySelectedToClipboard = js.Any.fromFunction0(copySelectedToClipboard), deleteSelected = js.Any.fromFunction0(deleteSelected), getRecognitionResults = js.Any.fromFunction0(getRecognitionResults), getStrokes = js.Any.fromFunction0(getStrokes), loadAsync = js.Any.fromFunction1(loadAsync), moveSelected = js.Any.fromFunction1(moveSelected), pasteFromClipboard = js.Any.fromFunction1(pasteFromClipboard), saveAsync = js.Any.fromFunction1(saveAsync), selectWithLine = js.Any.fromFunction2(selectWithLine), selectWithPolyLine = js.Any.fromFunction1(selectWithPolyLine), updateRecognitionResults = js.Any.fromFunction1(updateRecognitionResults))
  
    __obj.asInstanceOf[IInkStrokeContainer]
  }
}

