package typings.winrt.Windows.UI.Text

import typings.winrt.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextCharacterFormat extends js.Object {
  
  var allCaps: FormatEffect = js.native
  
  var backgroundColor: Color = js.native
  
  var bold: FormatEffect = js.native
  
  var fontStretch: FontStretch = js.native
  
  var fontStyle: FontStyle = js.native
  
  var foregroundColor: Color = js.native
  
  def getClone(): ITextCharacterFormat = js.native
  
  var hidden: FormatEffect = js.native
  
  def isEqual(format: ITextCharacterFormat): Boolean = js.native
  
  var italic: FormatEffect = js.native
  
  var kerning: Double = js.native
  
  var languageTag: String = js.native
  
  var linkType: LinkType = js.native
  
  var name: String = js.native
  
  var outline: FormatEffect = js.native
  
  var position: Double = js.native
  
  var protectedText: FormatEffect = js.native
  
  def setClone(value: ITextCharacterFormat): Unit = js.native
  
  var size: Double = js.native
  
  var smallCaps: FormatEffect = js.native
  
  var spacing: Double = js.native
  
  var strikethrough: FormatEffect = js.native
  
  var subscript: FormatEffect = js.native
  
  var superscript: FormatEffect = js.native
  
  var textScript: TextScript = js.native
  
  var underline: UnderlineType = js.native
  
  var weight: Double = js.native
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
    val __obj = js.Dynamic.literal(allCaps = allCaps.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], fontStretch = fontStretch.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any], getClone = js.Any.fromFunction0(getClone), hidden = hidden.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), italic = italic.asInstanceOf[js.Any], kerning = kerning.asInstanceOf[js.Any], languageTag = languageTag.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], protectedText = protectedText.asInstanceOf[js.Any], setClone = js.Any.fromFunction1(setClone), size = size.asInstanceOf[js.Any], smallCaps = smallCaps.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], strikethrough = strikethrough.asInstanceOf[js.Any], subscript = subscript.asInstanceOf[js.Any], superscript = superscript.asInstanceOf[js.Any], textScript = textScript.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextCharacterFormat]
  }
  
  @scala.inline
  implicit class ITextCharacterFormatOps[Self <: ITextCharacterFormat] (val x: Self) extends AnyVal {
    
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
    def setAllCaps(value: FormatEffect): Self = this.set("allCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBold(value: FormatEffect): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStretch(value: FontStretch): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyle(value: FontStyle): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColor(value: Color): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClone(value: () => ITextCharacterFormat): Self = this.set("getClone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHidden(value: FormatEffect): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEqual(value: ITextCharacterFormat => Boolean): Self = this.set("isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItalic(value: FormatEffect): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerning(value: Double): Self = this.set("kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageTag(value: String): Self = this.set("languageTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkType(value: LinkType): Self = this.set("linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutline(value: FormatEffect): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedText(value: FormatEffect): Self = this.set("protectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetClone(value: ITextCharacterFormat => Unit): Self = this.set("setClone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallCaps(value: FormatEffect): Self = this.set("smallCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethrough(value: FormatEffect): Self = this.set("strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscript(value: FormatEffect): Self = this.set("subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperscript(value: FormatEffect): Self = this.set("superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextScript(value: TextScript): Self = this.set("textScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: UnderlineType): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
}
