package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITextRange extends js.Object {
  var character: java.lang.String
  var characterFormat: ITextCharacterFormat
  var endPosition: scala.Double
  var formattedText: ITextRange
  var gravity: RangeGravity
  var length: scala.Double
  var link: java.lang.String
  var paragraphFormat: ITextParagraphFormat
  var startPosition: scala.Double
  var storyLength: scala.Double
  var text: java.lang.String
  def canPaste(format: scala.Double): scala.Boolean
  def changeCase(value: LetterCase): scala.Unit
  def collapse(value: scala.Boolean): scala.Unit
  def copy(): scala.Unit
  def cut(): scala.Unit
  def `delete_`(unit: TextRangeUnit, count: scala.Double): scala.Double
  def endOf(unit: TextRangeUnit, extend: scala.Boolean): scala.Double
  def expand(unit: TextRangeUnit): scala.Double
  def findText(value: java.lang.String, scanLength: scala.Double, options: FindOptions): scala.Double
  def getCharacterUtf32(offset: scala.Double): scala.Double
  def getClone(): ITextRange
  def getIndex(unit: TextRangeUnit): scala.Double
  def getPoint(
    horizontalAlign: HorizontalCharacterAlignment,
    verticalAlign: VerticalCharacterAlignment,
    options: PointOptions
  ): winrtLib.WindowsNs.FoundationNs.Point
  def getRect(options: PointOptions): winrtLib.Anon_Hit
  def getText(options: TextGetOptions): java.lang.String
  def getTextViaStream(options: TextGetOptions, value: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): scala.Unit
  def inRange(range: ITextRange): scala.Boolean
  def inStory(range: ITextRange): scala.Boolean
  def insertImage(
    width: scala.Double,
    height: scala.Double,
    ascent: scala.Double,
    verticalAlign: VerticalCharacterAlignment,
    alternateText: java.lang.String,
    value: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  ): scala.Unit
  def isEqual(range: ITextRange): scala.Boolean
  def matchSelection(): scala.Unit
  def move(unit: TextRangeUnit, count: scala.Double): scala.Double
  def moveEnd(unit: TextRangeUnit, count: scala.Double): scala.Double
  def moveStart(unit: TextRangeUnit, count: scala.Double): scala.Double
  def paste(format: scala.Double): scala.Unit
  def scrollIntoView(value: PointOptions): scala.Unit
  def setIndex(unit: TextRangeUnit, index: scala.Double, extend: scala.Boolean): scala.Unit
  def setPoint(point: winrtLib.WindowsNs.FoundationNs.Point, options: PointOptions, extend: scala.Boolean): scala.Unit
  def setRange(startPosition: scala.Double, endPosition: scala.Double): scala.Unit
  def setText(options: TextSetOptions, value: java.lang.String): scala.Unit
  def setTextViaStream(options: TextSetOptions, value: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): scala.Unit
  def startOf(unit: TextRangeUnit, extend: scala.Boolean): scala.Double
}

