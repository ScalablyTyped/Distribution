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
    applyDisplayUpdates: js.Function0[scala.Double],
    batchDisplayUpdates: js.Function0[scala.Double],
    beginUndoGroup: js.Function0[scala.Unit],
    canCopy: js.Function0[scala.Boolean],
    canPaste: js.Function0[scala.Boolean],
    canRedo: js.Function0[scala.Boolean],
    canUndo: js.Function0[scala.Boolean],
    caretType: CaretType,
    defaultTabStop: scala.Double,
    endUndoGroup: js.Function0[scala.Unit],
    getDefaultCharacterFormat: js.Function0[ITextCharacterFormat],
    getDefaultParagraphFormat: js.Function0[ITextParagraphFormat],
    getRange: js.Function2[scala.Double, scala.Double, ITextRange],
    getRangeFromPoint: js.Function2[winrtLib.WindowsNs.FoundationNs.Point, PointOptions, ITextRange],
    getText: js.Function1[TextGetOptions, java.lang.String],
    loadFromStream: js.Function2[
      TextSetOptions, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream, 
      scala.Unit
    ],
    redo: js.Function0[scala.Unit],
    saveToStream: js.Function2[
      TextGetOptions, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream, 
      scala.Unit
    ],
    selection: ITextSelection,
    setDefaultCharacterFormat: js.Function1[ITextCharacterFormat, scala.Unit],
    setDefaultParagraphFormat: js.Function1[ITextParagraphFormat, scala.Unit],
    setText: js.Function2[TextSetOptions, java.lang.String, scala.Unit],
    undo: js.Function0[scala.Unit],
    undoLimit: scala.Double
  ): ITextDocument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyDisplayUpdates")(applyDisplayUpdates)
    __obj.updateDynamic("batchDisplayUpdates")(batchDisplayUpdates)
    __obj.updateDynamic("beginUndoGroup")(beginUndoGroup)
    __obj.updateDynamic("canCopy")(canCopy)
    __obj.updateDynamic("canPaste")(canPaste)
    __obj.updateDynamic("canRedo")(canRedo)
    __obj.updateDynamic("canUndo")(canUndo)
    __obj.updateDynamic("caretType")(caretType)
    __obj.updateDynamic("defaultTabStop")(defaultTabStop)
    __obj.updateDynamic("endUndoGroup")(endUndoGroup)
    __obj.updateDynamic("getDefaultCharacterFormat")(getDefaultCharacterFormat)
    __obj.updateDynamic("getDefaultParagraphFormat")(getDefaultParagraphFormat)
    __obj.updateDynamic("getRange")(getRange)
    __obj.updateDynamic("getRangeFromPoint")(getRangeFromPoint)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("loadFromStream")(loadFromStream)
    __obj.updateDynamic("redo")(redo)
    __obj.updateDynamic("saveToStream")(saveToStream)
    __obj.updateDynamic("selection")(selection)
    __obj.updateDynamic("setDefaultCharacterFormat")(setDefaultCharacterFormat)
    __obj.updateDynamic("setDefaultParagraphFormat")(setDefaultParagraphFormat)
    __obj.updateDynamic("setText")(setText)
    __obj.updateDynamic("undo")(undo)
    __obj.updateDynamic("undoLimit")(undoLimit)
    __obj.asInstanceOf[ITextDocument]
  }
}

