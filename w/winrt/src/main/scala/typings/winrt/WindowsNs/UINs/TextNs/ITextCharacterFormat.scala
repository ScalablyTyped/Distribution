package typings.winrt.WindowsNs.UINs.TextNs

import typings.winrt.WindowsNs.UINs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextCharacterFormat extends js.Object {
  var allCaps: FormatEffect
  var backgroundColor: Color
  var bold: FormatEffect
  var fontStretch: FontStretch
  var fontStyle: FontStyle
  var foregroundColor: Color
  var hidden: FormatEffect
  var italic: FormatEffect
  var kerning: Double
  var languageTag: String
  var linkType: LinkType
  var name: String
  var outline: FormatEffect
  var position: Double
  var protectedText: FormatEffect
  var size: Double
  var smallCaps: FormatEffect
  var spacing: Double
  var strikethrough: FormatEffect
  var subscript: FormatEffect
  var superscript: FormatEffect
  var textScript: TextScript
  var underline: UnderlineType
  var weight: Double
  def getClone(): ITextCharacterFormat
  def isEqual(format: ITextCharacterFormat): Boolean
  def setClone(value: ITextCharacterFormat): Unit
}

object ITextCharacterFormat {
  @scala.inline
  def apply(
    allCaps: FormatEffect,
    backgroundColor: Color,
    bold: FormatEffect,
    fontStretch: FontStretch,
    fontStyle: FontStyle,
    foregroundColor: Color,
    getClone: () => ITextCharacterFormat,
    hidden: FormatEffect,
    isEqual: ITextCharacterFormat => Boolean,
    italic: FormatEffect,
    kerning: Double,
    languageTag: String,
    linkType: LinkType,
    name: String,
    outline: FormatEffect,
    position: Double,
    protectedText: FormatEffect,
    setClone: ITextCharacterFormat => Unit,
    size: Double,
    smallCaps: FormatEffect,
    spacing: Double,
    strikethrough: FormatEffect,
    subscript: FormatEffect,
    superscript: FormatEffect,
    textScript: TextScript,
    underline: UnderlineType,
    weight: Double
  ): ITextCharacterFormat = {
    val __obj = js.Dynamic.literal(allCaps = allCaps, backgroundColor = backgroundColor, bold = bold, fontStretch = fontStretch, fontStyle = fontStyle, foregroundColor = foregroundColor, getClone = js.Any.fromFunction0(getClone), hidden = hidden, isEqual = js.Any.fromFunction1(isEqual), italic = italic, kerning = kerning, languageTag = languageTag, linkType = linkType, name = name, outline = outline, position = position, protectedText = protectedText, setClone = js.Any.fromFunction1(setClone), size = size, smallCaps = smallCaps, spacing = spacing, strikethrough = strikethrough, subscript = subscript, superscript = superscript, textScript = textScript, underline = underline, weight = weight)
  
    __obj.asInstanceOf[ITextCharacterFormat]
  }
}

