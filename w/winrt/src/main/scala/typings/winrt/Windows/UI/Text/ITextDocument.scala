package typings.winrt.Windows.UI.Text

import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextDocument extends js.Object {
  var caretType: CaretType
  var defaultTabStop: Double
  var selection: ITextSelection
  var undoLimit: Double
  def applyDisplayUpdates(): Double
  def batchDisplayUpdates(): Double
  def beginUndoGroup(): Unit
  def canCopy(): Boolean
  def canPaste(): Boolean
  def canRedo(): Boolean
  def canUndo(): Boolean
  def endUndoGroup(): Unit
  def getDefaultCharacterFormat(): ITextCharacterFormat
  def getDefaultParagraphFormat(): ITextParagraphFormat
  def getRange(startPosition: Double, endPosition: Double): ITextRange
  def getRangeFromPoint(point: Point, options: PointOptions): ITextRange
  def getText(options: TextGetOptions): String
  def loadFromStream(options: TextSetOptions, value: IRandomAccessStream): Unit
  def redo(): Unit
  def saveToStream(options: TextGetOptions, value: IRandomAccessStream): Unit
  def setDefaultCharacterFormat(value: ITextCharacterFormat): Unit
  def setDefaultParagraphFormat(value: ITextParagraphFormat): Unit
  def setText(options: TextSetOptions, value: String): Unit
  def undo(): Unit
}

object ITextDocument {
  @scala.inline
  def apply(
    applyDisplayUpdates: () => Double,
    batchDisplayUpdates: () => Double,
    beginUndoGroup: () => Unit,
    canCopy: () => Boolean,
    canPaste: () => Boolean,
    canRedo: () => Boolean,
    canUndo: () => Boolean,
    caretType: CaretType,
    defaultTabStop: Double,
    endUndoGroup: () => Unit,
    getDefaultCharacterFormat: () => ITextCharacterFormat,
    getDefaultParagraphFormat: () => ITextParagraphFormat,
    getRange: (Double, Double) => ITextRange,
    getRangeFromPoint: (Point, PointOptions) => ITextRange,
    getText: TextGetOptions => String,
    loadFromStream: (TextSetOptions, IRandomAccessStream) => Unit,
    redo: () => Unit,
    saveToStream: (TextGetOptions, IRandomAccessStream) => Unit,
    selection: ITextSelection,
    setDefaultCharacterFormat: ITextCharacterFormat => Unit,
    setDefaultParagraphFormat: ITextParagraphFormat => Unit,
    setText: (TextSetOptions, String) => Unit,
    undo: () => Unit,
    undoLimit: Double
  ): ITextDocument = {
    val __obj = js.Dynamic.literal(applyDisplayUpdates = js.Any.fromFunction0(applyDisplayUpdates), batchDisplayUpdates = js.Any.fromFunction0(batchDisplayUpdates), beginUndoGroup = js.Any.fromFunction0(beginUndoGroup), canCopy = js.Any.fromFunction0(canCopy), canPaste = js.Any.fromFunction0(canPaste), canRedo = js.Any.fromFunction0(canRedo), canUndo = js.Any.fromFunction0(canUndo), caretType = caretType, defaultTabStop = defaultTabStop, endUndoGroup = js.Any.fromFunction0(endUndoGroup), getDefaultCharacterFormat = js.Any.fromFunction0(getDefaultCharacterFormat), getDefaultParagraphFormat = js.Any.fromFunction0(getDefaultParagraphFormat), getRange = js.Any.fromFunction2(getRange), getRangeFromPoint = js.Any.fromFunction2(getRangeFromPoint), getText = js.Any.fromFunction1(getText), loadFromStream = js.Any.fromFunction2(loadFromStream), redo = js.Any.fromFunction0(redo), saveToStream = js.Any.fromFunction2(saveToStream), selection = selection, setDefaultCharacterFormat = js.Any.fromFunction1(setDefaultCharacterFormat), setDefaultParagraphFormat = js.Any.fromFunction1(setDefaultParagraphFormat), setText = js.Any.fromFunction2(setText), undo = js.Any.fromFunction0(undo), undoLimit = undoLimit)
  
    __obj.asInstanceOf[ITextDocument]
  }
}

