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
    addStroke: js.Function1[InkStroke, scala.Unit],
    boundingRect: winrtLib.WindowsNs.FoundationNs.Rect,
    canPasteFromClipboard: js.Function0[scala.Boolean],
    copySelectedToClipboard: js.Function0[scala.Unit],
    deleteSelected: js.Function0[winrtLib.WindowsNs.FoundationNs.Rect],
    getRecognitionResults: js.Function0[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognitionResult]],
    getStrokes: js.Function0[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkStroke]],
    loadAsync: js.Function1[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream, 
      winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[scala.Double]
    ],
    moveSelected: js.Function1[winrtLib.WindowsNs.FoundationNs.Point, winrtLib.WindowsNs.FoundationNs.Rect],
    pasteFromClipboard: js.Function1[winrtLib.WindowsNs.FoundationNs.Point, winrtLib.WindowsNs.FoundationNs.Rect],
    saveAsync: js.Function1[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double]
    ],
    selectWithLine: js.Function2[
      winrtLib.WindowsNs.FoundationNs.Point, 
      winrtLib.WindowsNs.FoundationNs.Point, 
      winrtLib.WindowsNs.FoundationNs.Rect
    ],
    selectWithPolyLine: js.Function1[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.FoundationNs.Point], 
      winrtLib.WindowsNs.FoundationNs.Rect
    ],
    updateRecognitionResults: js.Function1[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognitionResult], 
      scala.Unit
    ]
  ): IInkStrokeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addStroke")(addStroke)
    __obj.updateDynamic("boundingRect")(boundingRect)
    __obj.updateDynamic("canPasteFromClipboard")(canPasteFromClipboard)
    __obj.updateDynamic("copySelectedToClipboard")(copySelectedToClipboard)
    __obj.updateDynamic("deleteSelected")(deleteSelected)
    __obj.updateDynamic("getRecognitionResults")(getRecognitionResults)
    __obj.updateDynamic("getStrokes")(getStrokes)
    __obj.updateDynamic("loadAsync")(loadAsync)
    __obj.updateDynamic("moveSelected")(moveSelected)
    __obj.updateDynamic("pasteFromClipboard")(pasteFromClipboard)
    __obj.updateDynamic("saveAsync")(saveAsync)
    __obj.updateDynamic("selectWithLine")(selectWithLine)
    __obj.updateDynamic("selectWithPolyLine")(selectWithPolyLine)
    __obj.updateDynamic("updateRecognitionResults")(updateRecognitionResults)
    __obj.asInstanceOf[IInkStrokeContainer]
  }
}

