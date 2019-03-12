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
  def delete_(unit: TextRangeUnit, count: scala.Double): scala.Double
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

object ITextRange {
  @scala.inline
  def apply(
    canPaste: scala.Double => scala.Boolean,
    changeCase: LetterCase => scala.Unit,
    character: java.lang.String,
    characterFormat: ITextCharacterFormat,
    collapse: scala.Boolean => scala.Unit,
    copy: () => scala.Unit,
    cut: () => scala.Unit,
    delete_ : (TextRangeUnit, scala.Double) => scala.Double,
    endOf: (TextRangeUnit, scala.Boolean) => scala.Double,
    endPosition: scala.Double,
    expand: TextRangeUnit => scala.Double,
    findText: (java.lang.String, scala.Double, FindOptions) => scala.Double,
    formattedText: ITextRange,
    getCharacterUtf32: scala.Double => scala.Double,
    getClone: () => ITextRange,
    getIndex: TextRangeUnit => scala.Double,
    getPoint: (HorizontalCharacterAlignment, VerticalCharacterAlignment, PointOptions) => winrtLib.WindowsNs.FoundationNs.Point,
    getRect: PointOptions => winrtLib.Anon_Hit,
    getText: TextGetOptions => java.lang.String,
    getTextViaStream: (TextGetOptions, winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream) => scala.Unit,
    gravity: RangeGravity,
    inRange: ITextRange => scala.Boolean,
    inStory: ITextRange => scala.Boolean,
    insertImage: (scala.Double, scala.Double, scala.Double, VerticalCharacterAlignment, java.lang.String, winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream) => scala.Unit,
    isEqual: ITextRange => scala.Boolean,
    length: scala.Double,
    link: java.lang.String,
    matchSelection: () => scala.Unit,
    move: (TextRangeUnit, scala.Double) => scala.Double,
    moveEnd: (TextRangeUnit, scala.Double) => scala.Double,
    moveStart: (TextRangeUnit, scala.Double) => scala.Double,
    paragraphFormat: ITextParagraphFormat,
    paste: scala.Double => scala.Unit,
    scrollIntoView: PointOptions => scala.Unit,
    setIndex: (TextRangeUnit, scala.Double, scala.Boolean) => scala.Unit,
    setPoint: (winrtLib.WindowsNs.FoundationNs.Point, PointOptions, scala.Boolean) => scala.Unit,
    setRange: (scala.Double, scala.Double) => scala.Unit,
    setText: (TextSetOptions, java.lang.String) => scala.Unit,
    setTextViaStream: (TextSetOptions, winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream) => scala.Unit,
    startOf: (TextRangeUnit, scala.Boolean) => scala.Double,
    startPosition: scala.Double,
    storyLength: scala.Double,
    text: java.lang.String
  ): ITextRange = {
    val __obj = js.Dynamic.literal(canPaste = js.Any.fromFunction1(canPaste), changeCase = js.Any.fromFunction1(changeCase), character = character, characterFormat = characterFormat, collapse = js.Any.fromFunction1(collapse), copy = js.Any.fromFunction0(copy), cut = js.Any.fromFunction0(cut), delete_ = js.Any.fromFunction2(delete_), endOf = js.Any.fromFunction2(endOf), endPosition = endPosition, expand = js.Any.fromFunction1(expand), findText = js.Any.fromFunction3(findText), formattedText = formattedText, getCharacterUtf32 = js.Any.fromFunction1(getCharacterUtf32), getClone = js.Any.fromFunction0(getClone), getIndex = js.Any.fromFunction1(getIndex), getPoint = js.Any.fromFunction3(getPoint), getRect = js.Any.fromFunction1(getRect), getText = js.Any.fromFunction1(getText), getTextViaStream = js.Any.fromFunction2(getTextViaStream), gravity = gravity, inRange = js.Any.fromFunction1(inRange), inStory = js.Any.fromFunction1(inStory), insertImage = js.Any.fromFunction6(insertImage), isEqual = js.Any.fromFunction1(isEqual), length = length, link = link, matchSelection = js.Any.fromFunction0(matchSelection), move = js.Any.fromFunction2(move), moveEnd = js.Any.fromFunction2(moveEnd), moveStart = js.Any.fromFunction2(moveStart), paragraphFormat = paragraphFormat, paste = js.Any.fromFunction1(paste), scrollIntoView = js.Any.fromFunction1(scrollIntoView), setIndex = js.Any.fromFunction3(setIndex), setPoint = js.Any.fromFunction3(setPoint), setRange = js.Any.fromFunction2(setRange), setText = js.Any.fromFunction2(setText), setTextViaStream = js.Any.fromFunction2(setTextViaStream), startOf = js.Any.fromFunction2(startOf), startPosition = startPosition, storyLength = storyLength, text = text)
  
    __obj.asInstanceOf[ITextRange]
  }
}

