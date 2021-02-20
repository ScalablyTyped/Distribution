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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInkStrokeContainer extends StObject {
  
  def addStroke(stroke: InkStroke): Unit = js.native
  
  var boundingRect: Rect = js.native
  
  def canPasteFromClipboard(): Boolean = js.native
  
  def copySelectedToClipboard(): Unit = js.native
  
  def deleteSelected(): Rect = js.native
  
  def getRecognitionResults(): IVectorView[InkRecognitionResult] = js.native
  
  def getStrokes(): IVectorView[InkStroke] = js.native
  
  def loadAsync(inputStream: IInputStream): IAsyncActionWithProgress[Double] = js.native
  
  def moveSelected(translation: Point): Rect = js.native
  
  def pasteFromClipboard(position: Point): Rect = js.native
  
  def saveAsync(outputStream: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
  
  def selectWithLine(from: Point, to: Point): Rect = js.native
  
  def selectWithPolyLine(polyline: IIterable[Point]): Rect = js.native
  
  def updateRecognitionResults(recognitionResults: IVectorView[InkRecognitionResult]): Unit = js.native
}
object IInkStrokeContainer {
  
  @scala.inline
  def apply(
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
  implicit class IInkStrokeContainerMutableBuilder[Self <: IInkStrokeContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddStroke(value: InkStroke => Unit): Self = StObject.set(x, "addStroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBoundingRect(value: Rect): Self = StObject.set(x, "boundingRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanPasteFromClipboard(value: () => Boolean): Self = StObject.set(x, "canPasteFromClipboard", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopySelectedToClipboard(value: () => Unit): Self = StObject.set(x, "copySelectedToClipboard", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteSelected(value: () => Rect): Self = StObject.set(x, "deleteSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecognitionResults(value: () => IVectorView[InkRecognitionResult]): Self = StObject.set(x, "getRecognitionResults", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStrokes(value: () => IVectorView[InkStroke]): Self = StObject.set(x, "getStrokes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadAsync(value: IInputStream => IAsyncActionWithProgress[Double]): Self = StObject.set(x, "loadAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveSelected(value: Point => Rect): Self = StObject.set(x, "moveSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPasteFromClipboard(value: Point => Rect): Self = StObject.set(x, "pasteFromClipboard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveAsync(value: IOutputStream => IAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "saveAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectWithLine(value: (Point, Point) => Rect): Self = StObject.set(x, "selectWithLine", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectWithPolyLine(value: IIterable[Point] => Rect): Self = StObject.set(x, "selectWithPolyLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateRecognitionResults(value: IVectorView[InkRecognitionResult] => Unit): Self = StObject.set(x, "updateRecognitionResults", js.Any.fromFunction1(value))
  }
}
