package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemableDecorationRenderOptions extends StObject {
  
  /**
    * Defines the rendering options of the attachment that is inserted after the decorated text.
    */
  var after: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.native
  
  /**
    * Background color of the decoration. Use rgba() and define transparent background colors to play well with other decorations.
    * Alternatively a color from the color registry can be [referenced](#ThemeColor).
    */
  var backgroundColor: js.UndefOr[String | ThemeColor] = js.native
  
  /**
    * Defines the rendering options of the attachment that is inserted before the decorated text.
    */
  var before: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var border: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'border' for setting one or more of the individual border properties.
    */
  var borderColor: js.UndefOr[String | ThemeColor] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'border' for setting one or more of the individual border properties.
    */
  var borderRadius: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'border' for setting one or more of the individual border properties.
    */
  var borderSpacing: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'border' for setting one or more of the individual border properties.
    */
  var borderStyle: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'border' for setting one or more of the individual border properties.
    */
  var borderWidth: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var color: js.UndefOr[String | ThemeColor] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var fontStyle: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var fontWeight: js.UndefOr[String] = js.native
  
  /**
    * An **absolute path** or an URI to an image to be rendered in the gutter.
    */
  var gutterIconPath: js.UndefOr[String | Uri] = js.native
  
  /**
    * Specifies the size of the gutter icon.
    * Available values are 'auto', 'contain', 'cover' and any percentage value.
    * For further information: https://msdn.microsoft.com/en-us/library/jj127316(v=vs.85).aspx
    */
  var gutterIconSize: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var letterSpacing: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var opacity: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var outline: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'outline' for setting one or more of the individual outline properties.
    */
  var outlineColor: js.UndefOr[String | ThemeColor] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'outline' for setting one or more of the individual outline properties.
    */
  var outlineStyle: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'outline' for setting one or more of the individual outline properties.
    */
  var outlineWidth: js.UndefOr[String] = js.native
  
  /**
    * The color of the decoration in the overview ruler. Use rgba() and define transparent colors to play well with other decorations.
    */
  var overviewRulerColor: js.UndefOr[String | ThemeColor] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var textDecoration: js.UndefOr[String] = js.native
}
object ThemableDecorationRenderOptions {
  
  @scala.inline
  def apply(): ThemableDecorationRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemableDecorationRenderOptions]
  }
  
  @scala.inline
  implicit class ThemableDecorationRenderOptionsMutableBuilder[Self <: ThemableDecorationRenderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: ThemableDecorationAttachmentRenderOptions): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String | ThemeColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBefore(value: ThemableDecorationAttachmentRenderOptions): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: String | ThemeColor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBorderSpacing(value: String): Self = StObject.set(x, "borderSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderSpacingUndefined: Self = StObject.set(x, "borderSpacing", js.undefined)
    
    @scala.inline
    def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: String): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: String | ThemeColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setGutterIconPath(value: String | Uri): Self = StObject.set(x, "gutterIconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterIconPathUndefined: Self = StObject.set(x, "gutterIconPath", js.undefined)
    
    @scala.inline
    def setGutterIconSize(value: String): Self = StObject.set(x, "gutterIconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterIconSizeUndefined: Self = StObject.set(x, "gutterIconSize", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColor(value: String | ThemeColor): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    @scala.inline
    def setOutlineStyle(value: String): Self = StObject.set(x, "outlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineStyleUndefined: Self = StObject.set(x, "outlineStyle", js.undefined)
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setOutlineWidth(value: String): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    @scala.inline
    def setOverviewRulerColor(value: String | ThemeColor): Self = StObject.set(x, "overviewRulerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewRulerColorUndefined: Self = StObject.set(x, "overviewRulerColor", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
  }
}
