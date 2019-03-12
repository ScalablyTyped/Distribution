package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextCharacterFormat extends js.Object {
  var allCaps: FormatEffect
  var backgroundColor: winrtLib.WindowsNs.UINs.Color
  var bold: FormatEffect
  var fontStretch: FontStretch
  var fontStyle: FontStyle
  var foregroundColor: winrtLib.WindowsNs.UINs.Color
  var hidden: FormatEffect
  var italic: FormatEffect
  var kerning: scala.Double
  var languageTag: java.lang.String
  var linkType: LinkType
  var name: java.lang.String
  var outline: FormatEffect
  var position: scala.Double
  var protectedText: FormatEffect
  var size: scala.Double
  var smallCaps: FormatEffect
  var spacing: scala.Double
  var strikethrough: FormatEffect
  var subscript: FormatEffect
  var superscript: FormatEffect
  var textScript: TextScript
  var underline: UnderlineType
  var weight: scala.Double
  def getClone(): ITextCharacterFormat
  def isEqual(format: ITextCharacterFormat): scala.Boolean
  def setClone(value: ITextCharacterFormat): scala.Unit
}

object ITextCharacterFormat {
  @scala.inline
  def apply(
    allCaps: FormatEffect,
    backgroundColor: winrtLib.WindowsNs.UINs.Color,
    bold: FormatEffect,
    fontStretch: FontStretch,
    fontStyle: FontStyle,
    foregroundColor: winrtLib.WindowsNs.UINs.Color,
    getClone: () => ITextCharacterFormat,
    hidden: FormatEffect,
    isEqual: ITextCharacterFormat => scala.Boolean,
    italic: FormatEffect,
    kerning: scala.Double,
    languageTag: java.lang.String,
    linkType: LinkType,
    name: java.lang.String,
    outline: FormatEffect,
    position: scala.Double,
    protectedText: FormatEffect,
    setClone: ITextCharacterFormat => scala.Unit,
    size: scala.Double,
    smallCaps: FormatEffect,
    spacing: scala.Double,
    strikethrough: FormatEffect,
    subscript: FormatEffect,
    superscript: FormatEffect,
    textScript: TextScript,
    underline: UnderlineType,
    weight: scala.Double
  ): ITextCharacterFormat = {
    val __obj = js.Dynamic.literal(allCaps = allCaps, backgroundColor = backgroundColor, bold = bold, fontStretch = fontStretch, fontStyle = fontStyle, foregroundColor = foregroundColor, getClone = js.Any.fromFunction0(getClone), hidden = hidden, isEqual = js.Any.fromFunction1(isEqual), italic = italic, kerning = kerning, languageTag = languageTag, linkType = linkType, name = name, outline = outline, position = position, protectedText = protectedText, setClone = js.Any.fromFunction1(setClone), size = size, smallCaps = smallCaps, spacing = spacing, strikethrough = strikethrough, subscript = subscript, superscript = superscript, textScript = textScript, underline = underline, weight = weight)
  
    __obj.asInstanceOf[ITextCharacterFormat]
  }
}

