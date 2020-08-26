package typings.winrt.Windows.UI.Text

import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import typings.winrt.anon.Hit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextRange extends js.Object {
  var character: String = js.native
  var characterFormat: ITextCharacterFormat = js.native
  var endPosition: Double = js.native
  var formattedText: ITextRange = js.native
  var gravity: RangeGravity = js.native
  var length: Double = js.native
  var link: String = js.native
  var paragraphFormat: ITextParagraphFormat = js.native
  var startPosition: Double = js.native
  var storyLength: Double = js.native
  var text: String = js.native
  def canPaste(format: Double): Boolean = js.native
  def changeCase(value: LetterCase): Unit = js.native
  def collapse(value: Boolean): Unit = js.native
  def copy(): Unit = js.native
  def cut(): Unit = js.native
  def delete_(unit: TextRangeUnit, count: Double): Double = js.native
  def endOf(unit: TextRangeUnit, extend: Boolean): Double = js.native
  def expand(unit: TextRangeUnit): Double = js.native
  def findText(value: String, scanLength: Double, options: FindOptions): Double = js.native
  def getCharacterUtf32(offset: Double): Double = js.native
  def getClone(): ITextRange = js.native
  def getIndex(unit: TextRangeUnit): Double = js.native
  def getPoint(
    horizontalAlign: HorizontalCharacterAlignment,
    verticalAlign: VerticalCharacterAlignment,
    options: PointOptions
  ): Point = js.native
  def getRect(options: PointOptions): Hit = js.native
  def getText(options: TextGetOptions): String = js.native
  def getTextViaStream(options: TextGetOptions, value: IRandomAccessStream): Unit = js.native
  def inRange(range: ITextRange): Boolean = js.native
  def inStory(range: ITextRange): Boolean = js.native
  def insertImage(
    width: Double,
    height: Double,
    ascent: Double,
    verticalAlign: VerticalCharacterAlignment,
    alternateText: String,
    value: IRandomAccessStream
  ): Unit = js.native
  def isEqual(range: ITextRange): Boolean = js.native
  def matchSelection(): Unit = js.native
  def move(unit: TextRangeUnit, count: Double): Double = js.native
  def moveEnd(unit: TextRangeUnit, count: Double): Double = js.native
  def moveStart(unit: TextRangeUnit, count: Double): Double = js.native
  def paste(format: Double): Unit = js.native
  def scrollIntoView(value: PointOptions): Unit = js.native
  def setIndex(unit: TextRangeUnit, index: Double, extend: Boolean): Unit = js.native
  def setPoint(point: Point, options: PointOptions, extend: Boolean): Unit = js.native
  def setRange(startPosition: Double, endPosition: Double): Unit = js.native
  def setText(options: TextSetOptions, value: String): Unit = js.native
  def setTextViaStream(options: TextSetOptions, value: IRandomAccessStream): Unit = js.native
  def startOf(unit: TextRangeUnit, extend: Boolean): Double = js.native
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
  @scala.inline
  implicit class ITextRangeOps[Self <: ITextRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCanPaste(value: Double => Boolean): Self = this.set("canPaste", js.Any.fromFunction1(value))
    @scala.inline
    def setChangeCase(value: LetterCase => Unit): Self = this.set("changeCase", js.Any.fromFunction1(value))
    @scala.inline
    def setCharacter(value: String): Self = this.set("character", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharacterFormat(value: ITextCharacterFormat): Self = this.set("characterFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapse(value: Boolean => Unit): Self = this.set("collapse", js.Any.fromFunction1(value))
    @scala.inline
    def setCopy(value: () => Unit): Self = this.set("copy", js.Any.fromFunction0(value))
    @scala.inline
    def setCut(value: () => Unit): Self = this.set("cut", js.Any.fromFunction0(value))
    @scala.inline
    def setDelete_(value: (TextRangeUnit, Double) => Double): Self = this.set("delete_", js.Any.fromFunction2(value))
    @scala.inline
    def setEndOf(value: (TextRangeUnit, Boolean) => Double): Self = this.set("endOf", js.Any.fromFunction2(value))
    @scala.inline
    def setEndPosition(value: Double): Self = this.set("endPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpand(value: TextRangeUnit => Double): Self = this.set("expand", js.Any.fromFunction1(value))
    @scala.inline
    def setFindText(value: (String, Double, FindOptions) => Double): Self = this.set("findText", js.Any.fromFunction3(value))
    @scala.inline
    def setFormattedText(value: ITextRange): Self = this.set("formattedText", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCharacterUtf32(value: Double => Double): Self = this.set("getCharacterUtf32", js.Any.fromFunction1(value))
    @scala.inline
    def setGetClone(value: () => ITextRange): Self = this.set("getClone", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIndex(value: TextRangeUnit => Double): Self = this.set("getIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPoint(value: (HorizontalCharacterAlignment, VerticalCharacterAlignment, PointOptions) => Point): Self = this.set("getPoint", js.Any.fromFunction3(value))
    @scala.inline
    def setGetRect(value: PointOptions => Hit): Self = this.set("getRect", js.Any.fromFunction1(value))
    @scala.inline
    def setGetText(value: TextGetOptions => String): Self = this.set("getText", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTextViaStream(value: (TextGetOptions, IRandomAccessStream) => Unit): Self = this.set("getTextViaStream", js.Any.fromFunction2(value))
    @scala.inline
    def setGravity(value: RangeGravity): Self = this.set("gravity", value.asInstanceOf[js.Any])
    @scala.inline
    def setInRange(value: ITextRange => Boolean): Self = this.set("inRange", js.Any.fromFunction1(value))
    @scala.inline
    def setInStory(value: ITextRange => Boolean): Self = this.set("inStory", js.Any.fromFunction1(value))
    @scala.inline
    def setInsertImage(value: (Double, Double, Double, VerticalCharacterAlignment, String, IRandomAccessStream) => Unit): Self = this.set("insertImage", js.Any.fromFunction6(value))
    @scala.inline
    def setIsEqual(value: ITextRange => Boolean): Self = this.set("isEqual", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchSelection(value: () => Unit): Self = this.set("matchSelection", js.Any.fromFunction0(value))
    @scala.inline
    def setMove(value: (TextRangeUnit, Double) => Double): Self = this.set("move", js.Any.fromFunction2(value))
    @scala.inline
    def setMoveEnd(value: (TextRangeUnit, Double) => Double): Self = this.set("moveEnd", js.Any.fromFunction2(value))
    @scala.inline
    def setMoveStart(value: (TextRangeUnit, Double) => Double): Self = this.set("moveStart", js.Any.fromFunction2(value))
    @scala.inline
    def setParagraphFormat(value: ITextParagraphFormat): Self = this.set("paragraphFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaste(value: Double => Unit): Self = this.set("paste", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollIntoView(value: PointOptions => Unit): Self = this.set("scrollIntoView", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIndex(value: (TextRangeUnit, Double, Boolean) => Unit): Self = this.set("setIndex", js.Any.fromFunction3(value))
    @scala.inline
    def setSetPoint(value: (Point, PointOptions, Boolean) => Unit): Self = this.set("setPoint", js.Any.fromFunction3(value))
    @scala.inline
    def setSetRange(value: (Double, Double) => Unit): Self = this.set("setRange", js.Any.fromFunction2(value))
    @scala.inline
    def setSetText(value: (TextSetOptions, String) => Unit): Self = this.set("setText", js.Any.fromFunction2(value))
    @scala.inline
    def setSetTextViaStream(value: (TextSetOptions, IRandomAccessStream) => Unit): Self = this.set("setTextViaStream", js.Any.fromFunction2(value))
    @scala.inline
    def setStartOf(value: (TextRangeUnit, Boolean) => Double): Self = this.set("startOf", js.Any.fromFunction2(value))
    @scala.inline
    def setStartPosition(value: Double): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoryLength(value: Double): Self = this.set("storyLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

