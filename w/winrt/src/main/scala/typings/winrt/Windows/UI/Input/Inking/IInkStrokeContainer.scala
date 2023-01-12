package typings.winrt.Windows.UI.Input.Inking

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncActionWithProgress
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInkStrokeContainer extends StObject {
  
  def addStroke(stroke: InkStroke): Unit
  
  var boundingRect: Rect
  
  def canPasteFromClipboard(): Boolean
  
  def copySelectedToClipboard(): Unit
  
  def deleteSelected(): Rect
  
  def getRecognitionResults(): IVectorView[InkRecognitionResult]
  
  def getStrokes(): IVectorView[InkStroke]
  
  def loadAsync(inputStream: IInputStream): IAsyncActionWithProgress[Double]
  
  def moveSelected(translation: Point): Rect
  
  def pasteFromClipboard(position: Point): Rect
  
  def saveAsync(outputStream: IOutputStream): IAsyncOperationWithProgress[Double, Double]
  
  def selectWithLine(from: Point, to: Point): Rect
  
  def selectWithPolyLine(polyline: IIterable[Point]): Rect
  
  def updateRecognitionResults(recognitionResults: IVectorView[InkRecognitionResult]): Unit
}
object IInkStrokeContainer {
  
  inline def apply(
    addStroke: InkStroke => Unit,
    boundingRect: Rect,
    canPasteFromClipboard: () => Boolean,
    copySelectedToClipboard: () => Unit,
    deleteSelected: () => Rect,
    getRecognitionResults: () => IVectorView[InkRecognitionResult],
    getStrokes: () => IVectorView[InkStroke],
    loadAsync: IInputStream => IAsyncActionWithProgress[Double],
    moveSelected: Point => Rect,
    pasteFromClipboard: Point => Rect,
    saveAsync: IOutputStream => IAsyncOperationWithProgress[Double, Double],
    selectWithLine: (Point, Point) => Rect,
    selectWithPolyLine: IIterable[Point] => Rect,
    updateRecognitionResults: IVectorView[InkRecognitionResult] => Unit
  ): IInkStrokeContainer = {
    val __obj = js.Dynamic.literal(addStroke = js.Any.fromFunction1(addStroke), boundingRect = boundingRect.asInstanceOf[js.Any], canPasteFromClipboard = js.Any.fromFunction0(canPasteFromClipboard), copySelectedToClipboard = js.Any.fromFunction0(copySelectedToClipboard), deleteSelected = js.Any.fromFunction0(deleteSelected), getRecognitionResults = js.Any.fromFunction0(getRecognitionResults), getStrokes = js.Any.fromFunction0(getStrokes), loadAsync = js.Any.fromFunction1(loadAsync), moveSelected = js.Any.fromFunction1(moveSelected), pasteFromClipboard = js.Any.fromFunction1(pasteFromClipboard), saveAsync = js.Any.fromFunction1(saveAsync), selectWithLine = js.Any.fromFunction2(selectWithLine), selectWithPolyLine = js.Any.fromFunction1(selectWithPolyLine), updateRecognitionResults = js.Any.fromFunction1(updateRecognitionResults))
    __obj.asInstanceOf[IInkStrokeContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IInkStrokeContainer] (val x: Self) extends AnyVal {
    
    inline def setAddStroke(value: InkStroke => Unit): Self = StObject.set(x, "addStroke", js.Any.fromFunction1(value))
    
    inline def setBoundingRect(value: Rect): Self = StObject.set(x, "boundingRect", value.asInstanceOf[js.Any])
    
    inline def setCanPasteFromClipboard(value: () => Boolean): Self = StObject.set(x, "canPasteFromClipboard", js.Any.fromFunction0(value))
    
    inline def setCopySelectedToClipboard(value: () => Unit): Self = StObject.set(x, "copySelectedToClipboard", js.Any.fromFunction0(value))
    
    inline def setDeleteSelected(value: () => Rect): Self = StObject.set(x, "deleteSelected", js.Any.fromFunction0(value))
    
    inline def setGetRecognitionResults(value: () => IVectorView[InkRecognitionResult]): Self = StObject.set(x, "getRecognitionResults", js.Any.fromFunction0(value))
    
    inline def setGetStrokes(value: () => IVectorView[InkStroke]): Self = StObject.set(x, "getStrokes", js.Any.fromFunction0(value))
    
    inline def setLoadAsync(value: IInputStream => IAsyncActionWithProgress[Double]): Self = StObject.set(x, "loadAsync", js.Any.fromFunction1(value))
    
    inline def setMoveSelected(value: Point => Rect): Self = StObject.set(x, "moveSelected", js.Any.fromFunction1(value))
    
    inline def setPasteFromClipboard(value: Point => Rect): Self = StObject.set(x, "pasteFromClipboard", js.Any.fromFunction1(value))
    
    inline def setSaveAsync(value: IOutputStream => IAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "saveAsync", js.Any.fromFunction1(value))
    
    inline def setSelectWithLine(value: (Point, Point) => Rect): Self = StObject.set(x, "selectWithLine", js.Any.fromFunction2(value))
    
    inline def setSelectWithPolyLine(value: IIterable[Point] => Rect): Self = StObject.set(x, "selectWithPolyLine", js.Any.fromFunction1(value))
    
    inline def setUpdateRecognitionResults(value: IVectorView[InkRecognitionResult] => Unit): Self = StObject.set(x, "updateRecognitionResults", js.Any.fromFunction1(value))
  }
}
