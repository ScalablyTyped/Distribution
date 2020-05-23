package typings.winrt.Windows.UI.Text

import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import typings.winrt.anon.Hit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextRange extends js.Object {
  var character: String
  var characterFormat: ITextCharacterFormat
  var endPosition: Double
  var formattedText: ITextRange
  var gravity: RangeGravity
  var length: Double
  var link: String
  var paragraphFormat: ITextParagraphFormat
  var startPosition: Double
  var storyLength: Double
  var text: String
  def canPaste(format: Double): Boolean
  def changeCase(value: LetterCase): Unit
  def collapse(value: Boolean): Unit
  def copy(): Unit
  def cut(): Unit
  def delete_(unit: TextRangeUnit, count: Double): Double
  def endOf(unit: TextRangeUnit, extend: Boolean): Double
  def expand(unit: TextRangeUnit): Double
  def findText(value: String, scanLength: Double, options: FindOptions): Double
  def getCharacterUtf32(offset: Double): Double
  def getClone(): ITextRange
  def getIndex(unit: TextRangeUnit): Double
  def getPoint(
    horizontalAlign: HorizontalCharacterAlignment,
    verticalAlign: VerticalCharacterAlignment,
    options: PointOptions
  ): Point
  def getRect(options: PointOptions): Hit
  def getText(options: TextGetOptions): String
  def getTextViaStream(options: TextGetOptions, value: IRandomAccessStream): Unit
  def inRange(range: ITextRange): Boolean
  def inStory(range: ITextRange): Boolean
  def insertImage(
    width: Double,
    height: Double,
    ascent: Double,
    verticalAlign: VerticalCharacterAlignment,
    alternateText: String,
    value: IRandomAccessStream
  ): Unit
  def isEqual(range: ITextRange): Boolean
  def matchSelection(): Unit
  def move(unit: TextRangeUnit, count: Double): Double
  def moveEnd(unit: TextRangeUnit, count: Double): Double
  def moveStart(unit: TextRangeUnit, count: Double): Double
  def paste(format: Double): Unit
  def scrollIntoView(value: PointOptions): Unit
  def setIndex(unit: TextRangeUnit, index: Double, extend: Boolean): Unit
  def setPoint(point: Point, options: PointOptions, extend: Boolean): Unit
  def setRange(startPosition: Double, endPosition: Double): Unit
  def setText(options: TextSetOptions, value: String): Unit
  def setTextViaStream(options: TextSetOptions, value: IRandomAccessStream): Unit
  def startOf(unit: TextRangeUnit, extend: Boolean): Double
}

object ITextRange {
  @scala.inline
  def apply(
    canPaste: Double => Boolean,
    changeCase: LetterCase => Unit,
    character: String,
    characterFormat: ITextCharacterFormat,
    collapse: Boolean => Unit,
    copy: () => Unit,
    cut: () => Unit,
    delete_ : (TextRangeUnit, Double) => Double,
    endOf: (TextRangeUnit, Boolean) => Double,
    endPosition: Double,
    expand: TextRangeUnit => Double,
    findText: (String, Double, FindOptions) => Double,
    formattedText: ITextRange,
    getCharacterUtf32: Double => Double,
    getClone: () => ITextRange,
    getIndex: TextRangeUnit => Double,
    getPoint: (HorizontalCharacterAlignment, VerticalCharacterAlignment, PointOptions) => Point,
    getRect: PointOptions => Hit,
    getText: TextGetOptions => String,
    getTextViaStream: (TextGetOptions, IRandomAccessStream) => Unit,
    gravity: RangeGravity,
    inRange: ITextRange => Boolean,
    inStory: ITextRange => Boolean,
    insertImage: (Double, Double, Double, VerticalCharacterAlignment, String, IRandomAccessStream) => Unit,
    isEqual: ITextRange => Boolean,
    length: Double,
    link: String,
    matchSelection: () => Unit,
    move: (TextRangeUnit, Double) => Double,
    moveEnd: (TextRangeUnit, Double) => Double,
    moveStart: (TextRangeUnit, Double) => Double,
    paragraphFormat: ITextParagraphFormat,
    paste: Double => Unit,
    scrollIntoView: PointOptions => Unit,
    setIndex: (TextRangeUnit, Double, Boolean) => Unit,
    setPoint: (Point, PointOptions, Boolean) => Unit,
    setRange: (Double, Double) => Unit,
    setText: (TextSetOptions, String) => Unit,
    setTextViaStream: (TextSetOptions, IRandomAccessStream) => Unit,
    startOf: (TextRangeUnit, Boolean) => Double,
    startPosition: Double,
    storyLength: Double,
    text: String
  ): ITextRange = {
    val __obj = js.Dynamic.literal(canPaste = js.Any.fromFunction1(canPaste), changeCase = js.Any.fromFunction1(changeCase), character = character.asInstanceOf[js.Any], characterFormat = characterFormat.asInstanceOf[js.Any], collapse = js.Any.fromFunction1(collapse), copy = js.Any.fromFunction0(copy), cut = js.Any.fromFunction0(cut), delete_ = js.Any.fromFunction2(delete_), endOf = js.Any.fromFunction2(endOf), endPosition = endPosition.asInstanceOf[js.Any], expand = js.Any.fromFunction1(expand), findText = js.Any.fromFunction3(findText), formattedText = formattedText.asInstanceOf[js.Any], getCharacterUtf32 = js.Any.fromFunction1(getCharacterUtf32), getClone = js.Any.fromFunction0(getClone), getIndex = js.Any.fromFunction1(getIndex), getPoint = js.Any.fromFunction3(getPoint), getRect = js.Any.fromFunction1(getRect), getText = js.Any.fromFunction1(getText), getTextViaStream = js.Any.fromFunction2(getTextViaStream), gravity = gravity.asInstanceOf[js.Any], inRange = js.Any.fromFunction1(inRange), inStory = js.Any.fromFunction1(inStory), insertImage = js.Any.fromFunction6(insertImage), isEqual = js.Any.fromFunction1(isEqual), length = length.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], matchSelection = js.Any.fromFunction0(matchSelection), move = js.Any.fromFunction2(move), moveEnd = js.Any.fromFunction2(moveEnd), moveStart = js.Any.fromFunction2(moveStart), paragraphFormat = paragraphFormat.asInstanceOf[js.Any], paste = js.Any.fromFunction1(paste), scrollIntoView = js.Any.fromFunction1(scrollIntoView), setIndex = js.Any.fromFunction3(setIndex), setPoint = js.Any.fromFunction3(setPoint), setRange = js.Any.fromFunction2(setRange), setText = js.Any.fromFunction2(setText), setTextViaStream = js.Any.fromFunction2(setTextViaStream), startOf = js.Any.fromFunction2(startOf), startPosition = startPosition.asInstanceOf[js.Any], storyLength = storyLength.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextRange]
  }
}

