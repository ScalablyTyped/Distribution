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

