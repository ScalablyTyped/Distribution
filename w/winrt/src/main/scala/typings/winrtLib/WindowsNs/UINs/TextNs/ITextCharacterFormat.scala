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
    getClone: js.Function0[ITextCharacterFormat],
    hidden: FormatEffect,
    isEqual: js.Function1[ITextCharacterFormat, scala.Boolean],
    italic: FormatEffect,
    kerning: scala.Double,
    languageTag: java.lang.String,
    linkType: LinkType,
    name: java.lang.String,
    outline: FormatEffect,
    position: scala.Double,
    protectedText: FormatEffect,
    setClone: js.Function1[ITextCharacterFormat, scala.Unit],
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allCaps")(allCaps)
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("bold")(bold)
    __obj.updateDynamic("fontStretch")(fontStretch)
    __obj.updateDynamic("fontStyle")(fontStyle)
    __obj.updateDynamic("foregroundColor")(foregroundColor)
    __obj.updateDynamic("getClone")(getClone)
    __obj.updateDynamic("hidden")(hidden)
    __obj.updateDynamic("isEqual")(isEqual)
    __obj.updateDynamic("italic")(italic)
    __obj.updateDynamic("kerning")(kerning)
    __obj.updateDynamic("languageTag")(languageTag)
    __obj.updateDynamic("linkType")(linkType)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("outline")(outline)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("protectedText")(protectedText)
    __obj.updateDynamic("setClone")(setClone)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("smallCaps")(smallCaps)
    __obj.updateDynamic("spacing")(spacing)
    __obj.updateDynamic("strikethrough")(strikethrough)
    __obj.updateDynamic("subscript")(subscript)
    __obj.updateDynamic("superscript")(superscript)
    __obj.updateDynamic("textScript")(textScript)
    __obj.updateDynamic("underline")(underline)
    __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[ITextCharacterFormat]
  }
}

