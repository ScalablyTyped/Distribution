package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemableDecorationRenderOptions extends StObject {
  
  /**
    * Defines the rendering options of the attachment that is inserted after the decorated text.
    */
  var after: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.undefined
  
  /**
    * Background color of the decoration. Use rgba() and define transparent background colors to play well with other decorations.
    * Alternatively a color from the color registry can be {@link ThemeColor referenced}.
    */
  var backgroundColor: js.UndefOr[String | ThemeColor] = js.undefined
  
  /**
    * Defines the rendering options of the attachment that is inserted before the decorated text.
    */
  var before: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var border: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'border' for setting one or more of the individual border properties.
    */
  var borderColor: js.UndefOr[String | ThemeColor] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'border' for setting one or more of the individual border properties.
    */
  var borderRadius: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'border' for setting one or more of the individual border properties.
    */
  var borderSpacing: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'border' for setting one or more of the individual border properties.
    */
  var borderStyle: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'border' for setting one or more of the individual border properties.
    */
  var borderWidth: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var color: js.UndefOr[String | ThemeColor] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var cursor: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  
  /**
    * An **absolute path** or an URI to an image to be rendered in the gutter.
    */
  var gutterIconPath: js.UndefOr[String | Uri] = js.undefined
  
  /**
    * Specifies the size of the gutter icon.
    * Available values are 'auto', 'contain', 'cover' and any percentage value.
    * For further information: https://msdn.microsoft.com/en-us/library/jj127316(v=vs.85).aspx
    */
  var gutterIconSize: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var letterSpacing: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var opacity: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var outline: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'outline' for setting one or more of the individual outline properties.
    */
  var outlineColor: js.UndefOr[String | ThemeColor] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'outline' for setting one or more of the individual outline properties.
    */
  var outlineStyle: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'outline' for setting one or more of the individual outline properties.
    */
  var outlineWidth: js.UndefOr[String] = js.undefined
  
  /**
    * The color of the decoration in the overview ruler. Use rgba() and define transparent colors to play well with other decorations.
    */
  var overviewRulerColor: js.UndefOr[String | ThemeColor] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var textDecoration: js.UndefOr[String] = js.undefined
}
object ThemableDecorationRenderOptions {
  
  inline def apply(): ThemableDecorationRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemableDecorationRenderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemableDecorationRenderOptions] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: ThemableDecorationAttachmentRenderOptions): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBackgroundColor(value: String | ThemeColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBefore(value: ThemableDecorationAttachmentRenderOptions): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String | ThemeColor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderSpacing(value: String): Self = StObject.set(x, "borderSpacing", value.asInstanceOf[js.Any])
    
    inline def setBorderSpacingUndefined: Self = StObject.set(x, "borderSpacing", js.undefined)
    
    inline def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setBorderWidth(value: String): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColor(value: String | ThemeColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setGutterIconPath(value: String | Uri): Self = StObject.set(x, "gutterIconPath", value.asInstanceOf[js.Any])
    
    inline def setGutterIconPathUndefined: Self = StObject.set(x, "gutterIconPath", js.undefined)
    
    inline def setGutterIconSize(value: String): Self = StObject.set(x, "gutterIconSize", value.asInstanceOf[js.Any])
    
    inline def setGutterIconSizeUndefined: Self = StObject.set(x, "gutterIconSize", js.undefined)
    
    inline def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineColor(value: String | ThemeColor): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setOutlineStyle(value: String): Self = StObject.set(x, "outlineStyle", value.asInstanceOf[js.Any])
    
    inline def setOutlineStyleUndefined: Self = StObject.set(x, "outlineStyle", js.undefined)
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setOutlineWidth(value: String): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    inline def setOverviewRulerColor(value: String | ThemeColor): Self = StObject.set(x, "overviewRulerColor", value.asInstanceOf[js.Any])
    
    inline def setOverviewRulerColorUndefined: Self = StObject.set(x, "overviewRulerColor", js.undefined)
    
    inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
  }
}
