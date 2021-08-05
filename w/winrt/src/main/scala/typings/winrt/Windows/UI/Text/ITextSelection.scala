package typings.winrt.Windows.UI.Text

import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import typings.winrt.anon.Hit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextSelection
  extends StObject
     with ITextRange {
  
  def endKey(unit: TextRangeUnit, extend: Boolean): Double
  
  def homeKey(unit: TextRangeUnit, extend: Boolean): Double
  
  def moveDown(unit: TextRangeUnit, count: Double, extend: Boolean): Double
  
  def moveLeft(unit: TextRangeUnit, count: Double, extend: Boolean): Double
  
  def moveRight(unit: TextRangeUnit, count: Double, extend: Boolean): Double
  
  def moveUp(unit: TextRangeUnit, count: Double, extend: Boolean): Double
  
  var options: SelectionOptions
  
  var `type`: SelectionType
  
  def typeText(value: String): Unit
}
object ITextSelection {
  
  inline def apply(
    canPaste: Double => Boolean,
    changeCase: LetterCase => Unit,
    character: String,
    characterFormat: ITextCharacterFormat,
    collapse: Boolean => Unit,
    copy: () => Unit,
    cut: () => Unit,
    delete_ : (TextRangeUnit, Double) => Double,
    endKey: (TextRangeUnit, Boolean) => Double,
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
    homeKey: (TextRangeUnit, Boolean) => Double,
    inRange: ITextRange => Boolean,
    inStory: ITextRange => Boolean,
    insertImage: (Double, Double, Double, VerticalCharacterAlignment, String, IRandomAccessStream) => Unit,
    isEqual: ITextRange => Boolean,
    length: Double,
    link: String,
    matchSelection: () => Unit,
    move: (TextRangeUnit, Double) => Double,
    moveDown: (TextRangeUnit, Double, Boolean) => Double,
    moveEnd: (TextRangeUnit, Double) => Double,
    moveLeft: (TextRangeUnit, Double, Boolean) => Double,
    moveRight: (TextRangeUnit, Double, Boolean) => Double,
    moveStart: (TextRangeUnit, Double) => Double,
    moveUp: (TextRangeUnit, Double, Boolean) => Double,
    options: SelectionOptions,
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
    text: String,
    `type`: SelectionType,
    typeText: String => Unit
  ): ITextSelection = {
    val __obj = js.Dynamic.literal(canPaste = js.Any.fromFunction1(canPaste), changeCase = js.Any.fromFunction1(changeCase), character = character.asInstanceOf[js.Any], characterFormat = characterFormat.asInstanceOf[js.Any], collapse = js.Any.fromFunction1(collapse), copy = js.Any.fromFunction0(copy), cut = js.Any.fromFunction0(cut), delete_ = js.Any.fromFunction2(delete_), endKey = js.Any.fromFunction2(endKey), endOf = js.Any.fromFunction2(endOf), endPosition = endPosition.asInstanceOf[js.Any], expand = js.Any.fromFunction1(expand), findText = js.Any.fromFunction3(findText), formattedText = formattedText.asInstanceOf[js.Any], getCharacterUtf32 = js.Any.fromFunction1(getCharacterUtf32), getClone = js.Any.fromFunction0(getClone), getIndex = js.Any.fromFunction1(getIndex), getPoint = js.Any.fromFunction3(getPoint), getRect = js.Any.fromFunction1(getRect), getText = js.Any.fromFunction1(getText), getTextViaStream = js.Any.fromFunction2(getTextViaStream), gravity = gravity.asInstanceOf[js.Any], homeKey = js.Any.fromFunction2(homeKey), inRange = js.Any.fromFunction1(inRange), inStory = js.Any.fromFunction1(inStory), insertImage = js.Any.fromFunction6(insertImage), isEqual = js.Any.fromFunction1(isEqual), length = length.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], matchSelection = js.Any.fromFunction0(matchSelection), move = js.Any.fromFunction2(move), moveDown = js.Any.fromFunction3(moveDown), moveEnd = js.Any.fromFunction2(moveEnd), moveLeft = js.Any.fromFunction3(moveLeft), moveRight = js.Any.fromFunction3(moveRight), moveStart = js.Any.fromFunction2(moveStart), moveUp = js.Any.fromFunction3(moveUp), options = options.asInstanceOf[js.Any], paragraphFormat = paragraphFormat.asInstanceOf[js.Any], paste = js.Any.fromFunction1(paste), scrollIntoView = js.Any.fromFunction1(scrollIntoView), setIndex = js.Any.fromFunction3(setIndex), setPoint = js.Any.fromFunction3(setPoint), setRange = js.Any.fromFunction2(setRange), setText = js.Any.fromFunction2(setText), setTextViaStream = js.Any.fromFunction2(setTextViaStream), startOf = js.Any.fromFunction2(startOf), startPosition = startPosition.asInstanceOf[js.Any], storyLength = storyLength.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], typeText = js.Any.fromFunction1(typeText))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextSelection]
  }
  
  extension [Self <: ITextSelection](x: Self) {
    
    inline def setEndKey(value: (TextRangeUnit, Boolean) => Double): Self = StObject.set(x, "endKey", js.Any.fromFunction2(value))
    
    inline def setHomeKey(value: (TextRangeUnit, Boolean) => Double): Self = StObject.set(x, "homeKey", js.Any.fromFunction2(value))
    
    inline def setMoveDown(value: (TextRangeUnit, Double, Boolean) => Double): Self = StObject.set(x, "moveDown", js.Any.fromFunction3(value))
    
    inline def setMoveLeft(value: (TextRangeUnit, Double, Boolean) => Double): Self = StObject.set(x, "moveLeft", js.Any.fromFunction3(value))
    
    inline def setMoveRight(value: (TextRangeUnit, Double, Boolean) => Double): Self = StObject.set(x, "moveRight", js.Any.fromFunction3(value))
    
    inline def setMoveUp(value: (TextRangeUnit, Double, Boolean) => Double): Self = StObject.set(x, "moveUp", js.Any.fromFunction3(value))
    
    inline def setOptions(value: SelectionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: SelectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeText(value: String => Unit): Self = StObject.set(x, "typeText", js.Any.fromFunction1(value))
  }
}
