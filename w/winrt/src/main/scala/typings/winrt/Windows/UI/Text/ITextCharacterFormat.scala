package typings.winrt.Windows.UI.Text

import typings.winrt.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextCharacterFormat extends StObject {
  
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
  implicit class ITextCharacterFormatMutableBuilder[Self <: ITextCharacterFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllCaps(value: FormatEffect): Self = StObject.set(x, "allCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBold(value: FormatEffect): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStretch(value: FontStretch): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColor(value: Color): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClone(value: () => ITextCharacterFormat): Self = StObject.set(x, "getClone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHidden(value: FormatEffect): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEqual(value: ITextCharacterFormat => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItalic(value: FormatEffect): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerning(value: Double): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageTag(value: String): Self = StObject.set(x, "languageTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkType(value: LinkType): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutline(value: FormatEffect): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedText(value: FormatEffect): Self = StObject.set(x, "protectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetClone(value: ITextCharacterFormat => Unit): Self = StObject.set(x, "setClone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallCaps(value: FormatEffect): Self = StObject.set(x, "smallCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethrough(value: FormatEffect): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscript(value: FormatEffect): Self = StObject.set(x, "subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperscript(value: FormatEffect): Self = StObject.set(x, "superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextScript(value: TextScript): Self = StObject.set(x, "textScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: UnderlineType): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
