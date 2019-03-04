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
    canPaste: js.Function1[scala.Double, scala.Boolean],
    changeCase: js.Function1[LetterCase, scala.Unit],
    character: java.lang.String,
    characterFormat: ITextCharacterFormat,
    collapse: js.Function1[scala.Boolean, scala.Unit],
    copy: js.Function0[scala.Unit],
    cut: js.Function0[scala.Unit],
    delete_ : js.Function2[TextRangeUnit, scala.Double, scala.Double],
    endKey: js.Function2[TextRangeUnit, scala.Boolean, scala.Double],
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
    homeKey: js.Function2[TextRangeUnit, scala.Boolean, scala.Double],
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
    moveDown: js.Function3[TextRangeUnit, scala.Double, scala.Boolean, scala.Double],
    moveEnd: js.Function2[TextRangeUnit, scala.Double, scala.Double],
    moveLeft: js.Function3[TextRangeUnit, scala.Double, scala.Boolean, scala.Double],
    moveRight: js.Function3[TextRangeUnit, scala.Double, scala.Boolean, scala.Double],
    moveStart: js.Function2[TextRangeUnit, scala.Double, scala.Double],
    moveUp: js.Function3[TextRangeUnit, scala.Double, scala.Boolean, scala.Double],
    options: SelectionOptions,
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
    text: java.lang.String,
    `type`: SelectionType,
    typeText: js.Function1[java.lang.String, scala.Unit]
  ): ITextSelection = {
    val __obj = js.Dynamic.literal(canPaste = canPaste, changeCase = changeCase, character = character, characterFormat = characterFormat, collapse = collapse, copy = copy, cut = cut, delete_ = delete_, endKey = endKey, endOf = endOf, endPosition = endPosition, expand = expand, findText = findText, formattedText = formattedText, getCharacterUtf32 = getCharacterUtf32, getClone = getClone, getIndex = getIndex, getPoint = getPoint, getRect = getRect, getText = getText, getTextViaStream = getTextViaStream, gravity = gravity, homeKey = homeKey, inRange = inRange, inStory = inStory, insertImage = insertImage, isEqual = isEqual, length = length, link = link, matchSelection = matchSelection, move = move, moveDown = moveDown, moveEnd = moveEnd, moveLeft = moveLeft, moveRight = moveRight, moveStart = moveStart, moveUp = moveUp, options = options, paragraphFormat = paragraphFormat, paste = paste, scrollIntoView = scrollIntoView, setIndex = setIndex, setPoint = setPoint, setRange = setRange, setText = setText, setTextViaStream = setTextViaStream, startOf = startOf, startPosition = startPosition, storyLength = storyLength, text = text, typeText = typeText)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ITextSelection]
  }
}

