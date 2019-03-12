package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextDocument extends js.Object {
  var caretType: CaretType
  var defaultTabStop: scala.Double
  var selection: ITextSelection
  var undoLimit: scala.Double
  def applyDisplayUpdates(): scala.Double
  def batchDisplayUpdates(): scala.Double
  def beginUndoGroup(): scala.Unit
  def canCopy(): scala.Boolean
  def canPaste(): scala.Boolean
  def canRedo(): scala.Boolean
  def canUndo(): scala.Boolean
  def endUndoGroup(): scala.Unit
  def getDefaultCharacterFormat(): ITextCharacterFormat
  def getDefaultParagraphFormat(): ITextParagraphFormat
  def getRange(startPosition: scala.Double, endPosition: scala.Double): ITextRange
  def getRangeFromPoint(point: winrtLib.WindowsNs.FoundationNs.Point, options: PointOptions): ITextRange
  def getText(options: TextGetOptions): java.lang.String
  def loadFromStream(options: TextSetOptions, value: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): scala.Unit
  def redo(): scala.Unit
  def saveToStream(options: TextGetOptions, value: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): scala.Unit
  def setDefaultCharacterFormat(value: ITextCharacterFormat): scala.Unit
  def setDefaultParagraphFormat(value: ITextParagraphFormat): scala.Unit
  def setText(options: TextSetOptions, value: java.lang.String): scala.Unit
  def undo(): scala.Unit
}

object ITextDocument {
  @scala.inline
  def apply(
    applyDisplayUpdates: () => scala.Double,
    batchDisplayUpdates: () => scala.Double,
    beginUndoGroup: () => scala.Unit,
    canCopy: () => scala.Boolean,
    canPaste: () => scala.Boolean,
    canRedo: () => scala.Boolean,
    canUndo: () => scala.Boolean,
    caretType: CaretType,
    defaultTabStop: scala.Double,
    endUndoGroup: () => scala.Unit,
    getDefaultCharacterFormat: () => ITextCharacterFormat,
    getDefaultParagraphFormat: () => ITextParagraphFormat,
    getRange: (scala.Double, scala.Double) => ITextRange,
    getRangeFromPoint: (winrtLib.WindowsNs.FoundationNs.Point, PointOptions) => ITextRange,
    getText: TextGetOptions => java.lang.String,
    loadFromStream: (TextSetOptions, winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream) => scala.Unit,
    redo: () => scala.Unit,
    saveToStream: (TextGetOptions, winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream) => scala.Unit,
    selection: ITextSelection,
    setDefaultCharacterFormat: ITextCharacterFormat => scala.Unit,
    setDefaultParagraphFormat: ITextParagraphFormat => scala.Unit,
    setText: (TextSetOptions, java.lang.String) => scala.Unit,
    undo: () => scala.Unit,
    undoLimit: scala.Double
  ): ITextDocument = {
    val __obj = js.Dynamic.literal(applyDisplayUpdates = js.Any.fromFunction0(applyDisplayUpdates), batchDisplayUpdates = js.Any.fromFunction0(batchDisplayUpdates), beginUndoGroup = js.Any.fromFunction0(beginUndoGroup), canCopy = js.Any.fromFunction0(canCopy), canPaste = js.Any.fromFunction0(canPaste), canRedo = js.Any.fromFunction0(canRedo), canUndo = js.Any.fromFunction0(canUndo), caretType = caretType, defaultTabStop = defaultTabStop, endUndoGroup = js.Any.fromFunction0(endUndoGroup), getDefaultCharacterFormat = js.Any.fromFunction0(getDefaultCharacterFormat), getDefaultParagraphFormat = js.Any.fromFunction0(getDefaultParagraphFormat), getRange = js.Any.fromFunction2(getRange), getRangeFromPoint = js.Any.fromFunction2(getRangeFromPoint), getText = js.Any.fromFunction1(getText), loadFromStream = js.Any.fromFunction2(loadFromStream), redo = js.Any.fromFunction0(redo), saveToStream = js.Any.fromFunction2(saveToStream), selection = selection, setDefaultCharacterFormat = js.Any.fromFunction1(setDefaultCharacterFormat), setDefaultParagraphFormat = js.Any.fromFunction1(setDefaultParagraphFormat), setText = js.Any.fromFunction2(setText), undo = js.Any.fromFunction0(undo), undoLimit = undoLimit)
  
    __obj.asInstanceOf[ITextDocument]
  }
}

