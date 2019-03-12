package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextSelection extends ITextRange {
  var options: SelectionOptions
  var `type`: SelectionType
  def endKey(unit: TextRangeUnit, extend: scala.Boolean): scala.Double
  def homeKey(unit: TextRangeUnit, extend: scala.Boolean): scala.Double
  def moveDown(unit: TextRangeUnit, count: scala.Double, extend: scala.Boolean): scala.Double
  def moveLeft(unit: TextRangeUnit, count: scala.Double, extend: scala.Boolean): scala.Double
  def moveRight(unit: TextRangeUnit, count: scala.Double, extend: scala.Boolean): scala.Double
  def moveUp(unit: TextRangeUnit, count: scala.Double, extend: scala.Boolean): scala.Double
  def typeText(value: java.lang.String): scala.Unit
}

object ITextSelection {
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
    endKey: (TextRangeUnit, scala.Boolean) => scala.Double,
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
    homeKey: (TextRangeUnit, scala.Boolean) => scala.Double,
    inRange: ITextRange => scala.Boolean,
    inStory: ITextRange => scala.Boolean,
    insertImage: (scala.Double, scala.Double, scala.Double, VerticalCharacterAlignment, java.lang.String, winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream) => scala.Unit,
    isEqual: ITextRange => scala.Boolean,
    length: scala.Double,
    link: java.lang.String,
    matchSelection: () => scala.Unit,
    move: (TextRangeUnit, scala.Double) => scala.Double,
    moveDown: (TextRangeUnit, scala.Double, scala.Boolean) => scala.Double,
    moveEnd: (TextRangeUnit, scala.Double) => scala.Double,
    moveLeft: (TextRangeUnit, scala.Double, scala.Boolean) => scala.Double,
    moveRight: (TextRangeUnit, scala.Double, scala.Boolean) => scala.Double,
    moveStart: (TextRangeUnit, scala.Double) => scala.Double,
    moveUp: (TextRangeUnit, scala.Double, scala.Boolean) => scala.Double,
    options: SelectionOptions,
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
    text: java.lang.String,
    `type`: SelectionType,
    typeText: java.lang.String => scala.Unit
  ): ITextSelection = {
    val __obj = js.Dynamic.literal(canPaste = js.Any.fromFunction1(canPaste), changeCase = js.Any.fromFunction1(changeCase), character = character, characterFormat = characterFormat, collapse = js.Any.fromFunction1(collapse), copy = js.Any.fromFunction0(copy), cut = js.Any.fromFunction0(cut), delete_ = js.Any.fromFunction2(delete_), endKey = js.Any.fromFunction2(endKey), endOf = js.Any.fromFunction2(endOf), endPosition = endPosition, expand = js.Any.fromFunction1(expand), findText = js.Any.fromFunction3(findText), formattedText = formattedText, getCharacterUtf32 = js.Any.fromFunction1(getCharacterUtf32), getClone = js.Any.fromFunction0(getClone), getIndex = js.Any.fromFunction1(getIndex), getPoint = js.Any.fromFunction3(getPoint), getRect = js.Any.fromFunction1(getRect), getText = js.Any.fromFunction1(getText), getTextViaStream = js.Any.fromFunction2(getTextViaStream), gravity = gravity, homeKey = js.Any.fromFunction2(homeKey), inRange = js.Any.fromFunction1(inRange), inStory = js.Any.fromFunction1(inStory), insertImage = js.Any.fromFunction6(insertImage), isEqual = js.Any.fromFunction1(isEqual), length = length, link = link, matchSelection = js.Any.fromFunction0(matchSelection), move = js.Any.fromFunction2(move), moveDown = js.Any.fromFunction3(moveDown), moveEnd = js.Any.fromFunction2(moveEnd), moveLeft = js.Any.fromFunction3(moveLeft), moveRight = js.Any.fromFunction3(moveRight), moveStart = js.Any.fromFunction2(moveStart), moveUp = js.Any.fromFunction3(moveUp), options = options, paragraphFormat = paragraphFormat, paste = js.Any.fromFunction1(paste), scrollIntoView = js.Any.fromFunction1(scrollIntoView), setIndex = js.Any.fromFunction3(setIndex), setPoint = js.Any.fromFunction3(setPoint), setRange = js.Any.fromFunction2(setRange), setText = js.Any.fromFunction2(setText), setTextViaStream = js.Any.fromFunction2(setTextViaStream), startOf = js.Any.fromFunction2(startOf), startPosition = startPosition, storyLength = storyLength, text = text, typeText = js.Any.fromFunction1(typeText))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ITextSelection]
  }
}

