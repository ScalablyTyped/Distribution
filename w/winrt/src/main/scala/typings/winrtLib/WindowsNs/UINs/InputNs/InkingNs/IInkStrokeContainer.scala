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

