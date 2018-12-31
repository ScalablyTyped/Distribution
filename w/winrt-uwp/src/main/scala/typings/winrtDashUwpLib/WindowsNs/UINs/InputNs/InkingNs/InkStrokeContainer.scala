package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties and methods to store and manage the collection of InkStroke objects rendered by the InkPresenter . */
@JSGlobal("Windows.UI.Input.Inking.InkStrokeContainer")
@js.native
/** Creates a new InkStrokeContainer object that is used to manage InkStroke objects. */
class InkStrokeContainer () extends js.Object {
  /** Gets the bounding rectangle of the InkStroke collection managed by the InkStrokeContainer . */
  var boundingRect: winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
  /**
    * Adds an InkStroke object to the collection managed by the InkStrokeContainer .
    * @param stroke The ink stroke to be added.
    */
  def addStroke(stroke: InkStroke): scala.Unit = js.native
  /**
    * Adds one or more ink strokes to the collection managed by the InkStrokeContainer .
    * @param strokes The ink strokes to be added as a collection of InkStroke objects.
    */
  def addStrokes(strokes: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[InkStroke]): scala.Unit = js.native
  /**
    * Identifies whether content on the clipboard can be added to the InkStroke collection managed by the InkStrokeContainer .
    * @return True if content can be pasted from the clipboard; otherwise, false.
    */
  def canPasteFromClipboard(): scala.Boolean = js.native
  /** Deletes all InkStroke objects from the collection managed by the InkStrokeContainer . */
  def clear(): scala.Unit = js.native
  /** Copies the selected InkStroke objects (from the InkStroke collection managed by the InkStrokeContainer ) to the clipboard in Ink Serialized Format (ISF) format. */
  def copySelectedToClipboard(): scala.Unit = js.native
  /**
    * Deletes the selected InkStroke objects from the InkStroke collection managed by the InkStrokeContainer .
    * @return The bounding rectangle of the selected ink strokes, or the invalidated rectangle (0, 0, 0, 0) if no strokes were removed (no selected strokes).
    */
  def deleteSelected(): winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
  /**
    * Gets the collection of recognition matches previously processed by an InkRecognizer and stored in an InkRecognizerContainer .
    * @return The results of the recognition as a collection of InkRecognitionResult objects.
    */
  def getRecognitionResults(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognitionResult] = js.native
  /**
    * Retrieves all ink strokes in the collection managed by the InkStrokeContainer .
    * @return The ink strokes managed by the InkStrokeContainer as a collection of InkStroke objects.
    */
  def getStrokes(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkStroke] = js.native
  /**
    * Asynchronously loads all InkStroke objects from the specified stream to the InkStroke collection that is managed by the InkStrokeContainer .
    * @param inputStream The target stream.
    * @return The status of the asynchronous operation as the number of bytes fetched. For more information, see ReadAsync method.
    */
  def loadAsync(inputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncActionWithProgress[scala.Double] = js.native
  /**
    * Moves the selected strokes. All affected strokes are re-rendered.
    * @param translation The destination screen coordinates for the upper-left corner of the bounding rectangle of the selected strokes.
    * @return The bounding rectangle of the selected ink strokes.
    */
  def moveSelected(translation: winrtDashUwpLib.WindowsNs.FoundationNs.Point): winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
  /**
    * Adds the InkStroke content from the clipboard to the InkStroke collection that is managed by the InkStrokeContainer and renders the new strokes..
    * @param position The screen coordinates for the upper-left corner of the bounding rectangle of the clipboard content.
    * @return The invalidated bounding rectangle of the InkStroke collection.
    */
  def pasteFromClipboard(position: winrtDashUwpLib.WindowsNs.FoundationNs.Point): winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
  /**
    * Asynchronously saves all InkStroke objects in the InkStroke collection that is managed by the InkStrokeContainer to the specified stream.
    * @param outputStream The target stream. An IRandomAccessStream (requires IOutputStream ) object can be specified instead.
    * @return The status of the asynchronous operation as the number of bytes sent. For more information, see WriteAsync method.
    */
  def saveAsync(outputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
  /**
    * Selects all strokes intersected by the new stroke.
    * @param from The start of the line.
    * @param to The of the line.
    * @return The bounding rectangle of the selected ink strokes.
    */
  def selectWithLine(
    from: winrtDashUwpLib.WindowsNs.FoundationNs.Point,
    to: winrtDashUwpLib.WindowsNs.FoundationNs.Point
  ): winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
  /**
    * Selects all strokes contained entirely within the polyline.
    * @param polyline The points of the polyline.
    * @return The bounding rectangle of the selected ink strokes.
    */
  def selectWithPolyLine(
    polyline: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.FoundationNs.Point]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
  /**
    * Updates the collection of recognition matches previously processed by an InkRecognizer and stored in an InkRecognizerContainer .
    * @param recognitionResults The updated collection of InkRecognitionResult objects.
    */
  def updateRecognitionResults(
    recognitionResults: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognitionResult]
  ): scala.Unit = js.native
}

