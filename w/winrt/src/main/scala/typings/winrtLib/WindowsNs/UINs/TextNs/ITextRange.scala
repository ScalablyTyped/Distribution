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
    canPaste: js.Function1[scala.Double, scala.Boolean],
    changeCase: js.Function1[LetterCase, scala.Unit],
    character: java.lang.String,
    characterFormat: ITextCharacterFormat,
    collapse: js.Function1[scala.Boolean, scala.Unit],
    copy: js.Function0[scala.Unit],
    cut: js.Function0[scala.Unit],
    delete_ : js.Function2[TextRangeUnit, scala.Double, scala.Double],
    endOf: js.Function2[TextRangeUnit, scala.Boolean, scala.Double],
    endPosition: scala.Double,
    expand: js.Function1[TextRangeUnit, scala.Double],
    findText: js.Function3[java.lang.String, scala.Double, FindOptions, scala.Double],
    formattedText: ITextRange,
    getCharacterUtf32: js.Function1[scala.Double, scala.Double],
    getClone: js.Function0[ITextRange],
    getIndex: js.Function1[TextRangeUnit, scala.Double],
    getPoint: js.Function3[
      HorizontalCharacterAlignment, 
      VerticalCharacterAlignment, 
      PointOptions, 
      winrtLib.WindowsNs.FoundationNs.Point
    ],
    getRect: js.Function1[PointOptions, winrtLib.Anon_Hit],
    getText: js.Function1[TextGetOptions, java.lang.String],
    getTextViaStream: js.Function2[
      TextGetOptions, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream, 
      scala.Unit
    ],
    gravity: RangeGravity,
    inRange: js.Function1[ITextRange, scala.Boolean],
    inStory: js.Function1[ITextRange, scala.Boolean],
    insertImage: js.Function6[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      VerticalCharacterAlignment, 
      java.lang.String, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream, 
      scala.Unit
    ],
    isEqual: js.Function1[ITextRange, scala.Boolean],
    length: scala.Double,
    link: java.lang.String,
    matchSelection: js.Function0[scala.Unit],
    move: js.Function2[TextRangeUnit, scala.Double, scala.Double],
    moveEnd: js.Function2[TextRangeUnit, scala.Double, scala.Double],
    moveStart: js.Function2[TextRangeUnit, scala.Double, scala.Double],
    paragraphFormat: ITextParagraphFormat,
    paste: js.Function1[scala.Double, scala.Unit],
    scrollIntoView: js.Function1[PointOptions, scala.Unit],
    setIndex: js.Function3[TextRangeUnit, scala.Double, scala.Boolean, scala.Unit],
    setPoint: js.Function3[winrtLib.WindowsNs.FoundationNs.Point, PointOptions, scala.Boolean, scala.Unit],
    setRange: js.Function2[scala.Double, scala.Double, scala.Unit],
    setText: js.Function2[TextSetOptions, java.lang.String, scala.Unit],
    setTextViaStream: js.Function2[
      TextSetOptions, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream, 
      scala.Unit
    ],
    startOf: js.Function2[TextRangeUnit, scala.Boolean, scala.Double],
    startPosition: scala.Double,
    storyLength: scala.Double,
    text: java.lang.String
  ): ITextRange = {
    val __obj = js.Dynamic.literal(canPaste = canPaste, changeCase = changeCase, character = character, characterFormat = characterFormat, collapse = collapse, copy = copy, cut = cut, delete_ = delete_, endOf = endOf, endPosition = endPosition, expand = expand, findText = findText, formattedText = formattedText, getCharacterUtf32 = getCharacterUtf32, getClone = getClone, getIndex = getIndex, getPoint = getPoint, getRect = getRect, getText = getText, getTextViaStream = getTextViaStream, gravity = gravity, inRange = inRange, inStory = inStory, insertImage = insertImage, isEqual = isEqual, length = length, link = link, matchSelection = matchSelection, move = move, moveEnd = moveEnd, moveStart = moveStart, paragraphFormat = paragraphFormat, paste = paste, scrollIntoView = scrollIntoView, setIndex = setIndex, setPoint = setPoint, setRange = setRange, setText = setText, setTextViaStream = setTextViaStream, startOf = startOf, startPosition = startPosition, storyLength = storyLength, text = text)
  
    __obj.asInstanceOf[ITextRange]
  }
}

