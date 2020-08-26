package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncActionWithProgress
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties and methods to store and manage the collection of InkStroke objects rendered by the InkPresenter . */
@js.native
trait InkStrokeContainer extends js.Object {
  /** Gets the bounding rectangle of the InkStroke collection managed by the InkStrokeContainer . */
  var boundingRect: Rect = js.native
  /**
    * Adds an InkStroke object to the collection managed by the InkStrokeContainer .
    * @param stroke The ink stroke to be added.
    */
  def addStroke(stroke: InkStroke): Unit = js.native
  /**
    * Adds one or more ink strokes to the collection managed by the InkStrokeContainer .
    * @param strokes The ink strokes to be added as a collection of InkStroke objects.
    */
  def addStrokes(strokes: IIterable[InkStroke]): Unit = js.native
  /**
    * Identifies whether content on the clipboard can be added to the InkStroke collection managed by the InkStrokeContainer .
    * @return True if content can be pasted from the clipboard; otherwise, false.
    */
  def canPasteFromClipboard(): Boolean = js.native
  /** Deletes all InkStroke objects from the collection managed by the InkStrokeContainer . */
  def clear(): Unit = js.native
  /** Copies the selected InkStroke objects (from the InkStroke collection managed by the InkStrokeContainer ) to the clipboard in Ink Serialized Format (ISF) format. */
  def copySelectedToClipboard(): Unit = js.native
  /**
    * Deletes the selected InkStroke objects from the InkStroke collection managed by the InkStrokeContainer .
    * @return The bounding rectangle of the selected ink strokes, or the invalidated rectangle (0, 0, 0, 0) if no strokes were removed (no selected strokes).
    */
  def deleteSelected(): Rect = js.native
  /**
    * Gets the collection of recognition matches previously processed by an InkRecognizer and stored in an InkRecognizerContainer .
    * @return The results of the recognition as a collection of InkRecognitionResult objects.
    */
  def getRecognitionResults(): IVectorView[InkRecognitionResult] = js.native
  /**
    * Retrieves all ink strokes in the collection managed by the InkStrokeContainer .
    * @return The ink strokes managed by the InkStrokeContainer as a collection of InkStroke objects.
    */
  def getStrokes(): IVectorView[InkStroke] = js.native
  /**
    * Asynchronously loads all InkStroke objects from the specified stream to the InkStroke collection that is managed by the InkStrokeContainer .
    * @param inputStream The target stream.
    * @return The status of the asynchronous operation as the number of bytes fetched. For more information, see ReadAsync method.
    */
  def loadAsync(inputStream: IInputStream): IPromiseWithIAsyncActionWithProgress[Double] = js.native
  /**
    * Moves the selected strokes. All affected strokes are re-rendered.
    * @param translation The destination screen coordinates for the upper-left corner of the bounding rectangle of the selected strokes.
    * @return The bounding rectangle of the selected ink strokes.
    */
  def moveSelected(translation: Point): Rect = js.native
  /**
    * Adds the InkStroke content from the clipboard to the InkStroke collection that is managed by the InkStrokeContainer and renders the new strokes..
    * @param position The screen coordinates for the upper-left corner of the bounding rectangle of the clipboard content.
    * @return The invalidated bounding rectangle of the InkStroke collection.
    */
  def pasteFromClipboard(position: Point): Rect = js.native
  /**
    * Asynchronously saves all InkStroke objects in the InkStroke collection that is managed by the InkStrokeContainer to the specified stream.
    * @param outputStream The target stream. An IRandomAccessStream (requires IOutputStream ) object can be specified instead.
    * @return The status of the asynchronous operation as the number of bytes sent. For more information, see WriteAsync method.
    */
  def saveAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  /**
    * Selects all strokes intersected by the new stroke.
    * @param from The start of the line.
    * @param to The of the line.
    * @return The bounding rectangle of the selected ink strokes.
    */
  def selectWithLine(from: Point, to: Point): Rect = js.native
  /**
    * Selects all strokes contained entirely within the polyline.
    * @param polyline The points of the polyline.
    * @return The bounding rectangle of the selected ink strokes.
    */
  def selectWithPolyLine(polyline: IIterable[Point]): Rect = js.native
  /**
    * Updates the collection of recognition matches previously processed by an InkRecognizer and stored in an InkRecognizerContainer .
    * @param recognitionResults The updated collection of InkRecognitionResult objects.
    */
  def updateRecognitionResults(recognitionResults: IVectorView[InkRecognitionResult]): Unit = js.native
}

object InkStrokeContainer {
  @scala.inline
  def apply(
    addStroke: InkStroke => Unit,
    addStrokes: IIterable[InkStroke] => Unit,
    boundingRect: Rect,
    canPasteFromClipboard: () => Boolean,
    clear: () => Unit,
    copySelectedToClipboard: () => Unit,
    deleteSelected: () => Rect,
    getRecognitionResults: () => IVectorView[InkRecognitionResult],
    getStrokes: () => IVectorView[InkStroke],
    loadAsync: IInputStream => IPromiseWithIAsyncActionWithProgress[Double],
    moveSelected: Point => Rect,
    pasteFromClipboard: Point => Rect,
    saveAsync: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double],
    selectWithLine: (Point, Point) => Rect,
    selectWithPolyLine: IIterable[Point] => Rect,
    updateRecognitionResults: IVectorView[InkRecognitionResult] => Unit
  ): InkStrokeContainer = {
    val __obj = js.Dynamic.literal(addStroke = js.Any.fromFunction1(addStroke), addStrokes = js.Any.fromFunction1(addStrokes), boundingRect = boundingRect.asInstanceOf[js.Any], canPasteFromClipboard = js.Any.fromFunction0(canPasteFromClipboard), clear = js.Any.fromFunction0(clear), copySelectedToClipboard = js.Any.fromFunction0(copySelectedToClipboard), deleteSelected = js.Any.fromFunction0(deleteSelected), getRecognitionResults = js.Any.fromFunction0(getRecognitionResults), getStrokes = js.Any.fromFunction0(getStrokes), loadAsync = js.Any.fromFunction1(loadAsync), moveSelected = js.Any.fromFunction1(moveSelected), pasteFromClipboard = js.Any.fromFunction1(pasteFromClipboard), saveAsync = js.Any.fromFunction1(saveAsync), selectWithLine = js.Any.fromFunction2(selectWithLine), selectWithPolyLine = js.Any.fromFunction1(selectWithPolyLine), updateRecognitionResults = js.Any.fromFunction1(updateRecognitionResults))
    __obj.asInstanceOf[InkStrokeContainer]
  }
  @scala.inline
  implicit class InkStrokeContainerOps[Self <: InkStrokeContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddStroke(value: InkStroke => Unit): Self = this.set("addStroke", js.Any.fromFunction1(value))
    @scala.inline
    def setAddStrokes(value: IIterable[InkStroke] => Unit): Self = this.set("addStrokes", js.Any.fromFunction1(value))
    @scala.inline
    def setBoundingRect(value: Rect): Self = this.set("boundingRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanPasteFromClipboard(value: () => Boolean): Self = this.set("canPasteFromClipboard", js.Any.fromFunction0(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setCopySelectedToClipboard(value: () => Unit): Self = this.set("copySelectedToClipboard", js.Any.fromFunction0(value))
    @scala.inline
    def setDeleteSelected(value: () => Rect): Self = this.set("deleteSelected", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRecognitionResults(value: () => IVectorView[InkRecognitionResult]): Self = this.set("getRecognitionResults", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStrokes(value: () => IVectorView[InkStroke]): Self = this.set("getStrokes", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadAsync(value: IInputStream => IPromiseWithIAsyncActionWithProgress[Double]): Self = this.set("loadAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setMoveSelected(value: Point => Rect): Self = this.set("moveSelected", js.Any.fromFunction1(value))
    @scala.inline
    def setPasteFromClipboard(value: Point => Rect): Self = this.set("pasteFromClipboard", js.Any.fromFunction1(value))
    @scala.inline
    def setSaveAsync(value: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = this.set("saveAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectWithLine(value: (Point, Point) => Rect): Self = this.set("selectWithLine", js.Any.fromFunction2(value))
    @scala.inline
    def setSelectWithPolyLine(value: IIterable[Point] => Rect): Self = this.set("selectWithPolyLine", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateRecognitionResults(value: IVectorView[InkRecognitionResult] => Unit): Self = this.set("updateRecognitionResults", js.Any.fromFunction1(value))
  }
  
}

