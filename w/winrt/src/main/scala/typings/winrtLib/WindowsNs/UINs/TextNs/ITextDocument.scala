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

