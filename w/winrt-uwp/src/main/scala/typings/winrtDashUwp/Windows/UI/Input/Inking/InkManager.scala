package typings.winrtDashUwp.Windows.UI.Input.Inking

import typings.winrtDashUwp.Windows.Foundation.Collections.IIterable
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncActionWithProgress
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.Windows.Foundation.Point
import typings.winrtDashUwp.Windows.Foundation.Rect
import typings.winrtDashUwp.Windows.Storage.Streams.IInputStream
import typings.winrtDashUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtDashUwp.Windows.UI.Input.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties and methods to manage the input, manipulation, and processing (including handwriting recognition) of one or more InkStroke objects. */
@JSGlobal("Windows.UI.Input.Inking.InkManager")
@js.native
/** Creates a new InkManager object that is used to manage InkStroke objects. */
class InkManager () extends js.Object {
  /** Gets the bounding rectangle of the InkStroke collection that is managed by the InkManager . */
  var boundingRect: Rect = js.native
  /** Gets or sets the ink input mode. */
  var mode: InkManipulationMode = js.native
  /**
    * Adds one or more InkStroke objects to the collection managed by the InkManager .
    * @param stroke The ink stroke to be added.
    */
  def addStroke(stroke: InkStroke): Unit = js.native
  /**
    * Identifies whether content on the clipboard can be added to the InkStroke collection that is managed by the InkManager .
    * @return True if content can be pasted from the clipboard; otherwise, false.
    */
  def canPasteFromClipboard(): Boolean = js.native
  /** Copies the selected InkStroke objects (from the InkStroke collection managed by the InkManager ) to the clipboard in Ink Serialized Format (ISF) format. */
  def copySelectedToClipboard(): Unit = js.native
  /**
    * Deletes the selected InkStroke objects from the InkStroke collection managed by the InkManager .
    * @return The bounding rectangle of the selected ink strokes, or the invalidated rectangle (0, 0, 0, 0) if no strokes were removed (no selected strokes).
    */
  def deleteSelected(): Rect = js.native
  /**
    * Retrieves the collection of words returned by handwriting recognition.
    * @return The words returned by the handwriting recognizer as a collection of InkRecognitionResult objects.
    */
  def getRecognitionResults(): IVectorView[InkRecognitionResult] = js.native
  /**
    * Gets the collection of installed handwriting recognizers.
    * @return The installed handwriting recognizers as a collection of InkRecognizer objects.
    */
  def getRecognizers(): IVectorView[InkRecognizer] = js.native
  /**
    * Retrieves all ink strokes in the collection managed by the InkManager .
    * @return The ink strokes managed by the InkManager as a collection of InkStroke objects.
    */
  def getStrokes(): IVectorView[InkStroke] = js.native
  /**
    * Asynchronously loads all InkStroke objects from the specified stream to the InkStroke collection that is managed by the InkManager .
    * @param inputStream The stream that contains the stroke collection. An IRandomAccessStream (requires IOutputStream ) object can be specified instead.
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
    * Adds the InkStroke content from the clipboard to the InkStroke collection that is managed by the InkManager and renders the new strokes..
    * @param position The screen coordinates for the upper-left corner of the bounding rectangle of the clipboard content.
    * @return The invalidated bounding rectangle of the InkStroke collection.
    */
  def pasteFromClipboard(position: Point): Rect = js.native
  /**
    * Processes information about the position and features of the contact point, like pressure and tilt, on initial down contact. You must call this method before you call ProcessPointerUpdate , and then ProcessPointerUp.
    * @param pointerPoint Information about the position and features of the contact point.
    */
  def processPointerDown(pointerPoint: PointerPoint): Unit = js.native
  /**
    * Processes information about the position and features of the contact point, like pressure and tilt, on up contact. You must call this method after you call ProcessPointerUpdate .
    * @param pointerPoint Information about the position and features of the contact point.
    * @return For Inking and Selecting modes, this is the bounding box for the stroke (invalidated rectangle). For Erasing mode, the invalidated rectangle is (0,0,0,0).
    */
  def processPointerUp(pointerPoint: PointerPoint): Rect = js.native
  /**
    * Processes position and state properties, such as pressure and tilt, for the specified pointer, from the last pointer event up to and including the current pointer event.
    * @param pointerPoint The input pointer for which updates are to be processed.
    * @return When the current InkManipulationMode is Inking or Selecting, this method returns the Point (screen position in ink space) associated with the last ProcessPointerUpdate of pointerPoint.
    */
  def processPointerUpdate(pointerPoint: PointerPoint): js.Any = js.native
  /**
    * Performs handwriting recognition on one or more InkStroke objects.
    * @param recognitionTarget One of the values from the InkRecognitionTarget enumeration.
    * @return The results of the recognition as a collection of InkRecognitionResult objects.
    */
  def recognizeAsync(recognitionTarget: InkRecognitionTarget): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Performs handwriting recognition on one or more InkStroke objects.
    * @param strokeCollection The set of strokes on which recognition is performed.
    * @param recognitionTarget One of the values from the InkRecognitionTarget enumeration.
    * @return The results of the recognition as a collection of InkRecognitionResult objects.
    */
  def recognizeAsync(strokeCollection: InkStrokeContainer, recognitionTarget: InkRecognitionTarget): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously saves all InkStroke objects in the InkStroke collection that is managed by the InkManager to the specified stream.
    * @param outputStream The target stream. An IRandomAccessStream (requires IOutputStream ) object can be specified instead.
    * @return The size of the saved stream and the status of the asynchronous operation as the number of bytes sent. For more information, see WriteAsync method.
    */
  def saveAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  /**
    * Selects all strokes intersected by the new stroke.
    * @param from The start of the stroke.
    * @param to The end of the stroke.
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
    * Sets the default InkDrawingAttributes for all new InkStroke objects added to the InkStroke collection managed by the InkManager .
    * @param drawingAttributes The default attributes applied to a new ink stroke.
    */
  def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): Unit = js.native
  /**
    * Sets the default InkRecognizer used for handwriting recognition.
    * @param recognizer The InkRecognizer .
    */
  def setDefaultRecognizer(recognizer: InkRecognizer): Unit = js.native
  /**
    * Updates the collection of potential text matches from handwriting recognition.
    * @param recognitionResults The results returned by recognition, where each InkRecognitionResult object represents one written word.
    */
  def updateRecognitionResults(recognitionResults: IVectorView[InkRecognitionResult]): Unit = js.native
}

