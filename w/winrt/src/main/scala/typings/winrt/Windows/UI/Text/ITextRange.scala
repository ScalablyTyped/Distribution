package typings.winrt.Windows.UI.Text

import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import typings.winrt.anon.Hit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextRange extends StObject {
  
  def canPaste(format: Double): Boolean
  
  def changeCase(value: LetterCase): Unit
  
  var character: String
  
  var characterFormat: ITextCharacterFormat
  
  def collapse(value: Boolean): Unit
  
  def copy(): Unit
  
  def cut(): Unit
  
  def delete_(unit: TextRangeUnit, count: Double): Double
  
  def endOf(unit: TextRangeUnit, extend: Boolean): Double
  
  var endPosition: Double
  
  def expand(unit: TextRangeUnit): Double
  
  def findText(value: String, scanLength: Double, options: FindOptions): Double
  
  var formattedText: ITextRange
  
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
  
  var gravity: RangeGravity
  
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
  
  var length: Double
  
  var link: String
  
  def matchSelection(): Unit
  
  def move(unit: TextRangeUnit, count: Double): Double
  
  def moveEnd(unit: TextRangeUnit, count: Double): Double
  
  def moveStart(unit: TextRangeUnit, count: Double): Double
  
  var paragraphFormat: ITextParagraphFormat
  
  def paste(format: Double): Unit
  
  def scrollIntoView(value: PointOptions): Unit
  
  def setIndex(unit: TextRangeUnit, index: Double, extend: Boolean): Unit
  
  def setPoint(point: Point, options: PointOptions, extend: Boolean): Unit
  
  def setRange(startPosition: Double, endPosition: Double): Unit
  
  def setText(options: TextSetOptions, value: String): Unit
  
  def setTextViaStream(options: TextSetOptions, value: IRandomAccessStream): Unit
  
  def startOf(unit: TextRangeUnit, extend: Boolean): Double
  
  var startPosition: Double
  
  var storyLength: Double
  
  var text: String
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
  implicit class ITextRangeMutableBuilder[Self <: ITextRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanPaste(value: Double => Boolean): Self = StObject.set(x, "canPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeCase(value: LetterCase => Unit): Self = StObject.set(x, "changeCase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCharacter(value: String): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterFormat(value: ITextCharacterFormat): Self = StObject.set(x, "characterFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapse(value: Boolean => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopy(value: () => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCut(value: () => Unit): Self = StObject.set(x, "cut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete_(value: (TextRangeUnit, Double) => Double): Self = StObject.set(x, "delete_", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndOf(value: (TextRangeUnit, Boolean) => Double): Self = StObject.set(x, "endOf", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndPosition(value: Double): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand(value: TextRangeUnit => Double): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindText(value: (String, Double, FindOptions) => Double): Self = StObject.set(x, "findText", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormattedText(value: ITextRange): Self = StObject.set(x, "formattedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCharacterUtf32(value: Double => Double): Self = StObject.set(x, "getCharacterUtf32", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetClone(value: () => ITextRange): Self = StObject.set(x, "getClone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: TextRangeUnit => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPoint(value: (HorizontalCharacterAlignment, VerticalCharacterAlignment, PointOptions) => Point): Self = StObject.set(x, "getPoint", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetRect(value: PointOptions => Hit): Self = StObject.set(x, "getRect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetText(value: TextGetOptions => String): Self = StObject.set(x, "getText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTextViaStream(value: (TextGetOptions, IRandomAccessStream) => Unit): Self = StObject.set(x, "getTextViaStream", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGravity(value: RangeGravity): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInRange(value: ITextRange => Boolean): Self = StObject.set(x, "inRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInStory(value: ITextRange => Boolean): Self = StObject.set(x, "inStory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertImage(value: (Double, Double, Double, VerticalCharacterAlignment, String, IRandomAccessStream) => Unit): Self = StObject.set(x, "insertImage", js.Any.fromFunction6(value))
    
    @scala.inline
    def setIsEqual(value: ITextRange => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchSelection(value: () => Unit): Self = StObject.set(x, "matchSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMove(value: (TextRangeUnit, Double) => Double): Self = StObject.set(x, "move", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMoveEnd(value: (TextRangeUnit, Double) => Double): Self = StObject.set(x, "moveEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMoveStart(value: (TextRangeUnit, Double) => Double): Self = StObject.set(x, "moveStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParagraphFormat(value: ITextParagraphFormat): Self = StObject.set(x, "paragraphFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaste(value: Double => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollIntoView(value: PointOptions => Unit): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIndex(value: (TextRangeUnit, Double, Boolean) => Unit): Self = StObject.set(x, "setIndex", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetPoint(value: (Point, PointOptions, Boolean) => Unit): Self = StObject.set(x, "setPoint", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetRange(value: (Double, Double) => Unit): Self = StObject.set(x, "setRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetText(value: (TextSetOptions, String) => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetTextViaStream(value: (TextSetOptions, IRandomAccessStream) => Unit): Self = StObject.set(x, "setTextViaStream", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartOf(value: (TextRangeUnit, Boolean) => Double): Self = StObject.set(x, "startOf", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartPosition(value: Double): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryLength(value: Double): Self = StObject.set(x, "storyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
