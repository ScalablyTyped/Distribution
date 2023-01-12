package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemableDecorationAttachmentRenderOptions extends StObject {
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var backgroundColor: js.UndefOr[String | ThemeColor] = js.undefined
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var border: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var borderColor: js.UndefOr[String | ThemeColor] = js.undefined
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var color: js.UndefOr[String | ThemeColor] = js.undefined
  
  /**
    * An **absolute path** or an URI to an image to be rendered in the attachment. Either an icon
    * or a text can be shown, but not both.
    */
  var contentIconPath: js.UndefOr[String | Uri] = js.undefined
  
  /**
    * Defines a text content that is shown in the attachment. Either an icon or a text can be shown, but not both.
    */
  var contentText: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var margin: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var textDecoration: js.UndefOr[String] = js.undefined
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var width: js.UndefOr[String] = js.undefined
}
object ThemableDecorationAttachmentRenderOptions {
  
  inline def apply(): ThemableDecorationAttachmentRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemableDecorationAttachmentRenderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemableDecorationAttachmentRenderOptions] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String | ThemeColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String | ThemeColor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String | ThemeColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContentIconPath(value: String | Uri): Self = StObject.set(x, "contentIconPath", value.asInstanceOf[js.Any])
    
    inline def setContentIconPathUndefined: Self = StObject.set(x, "contentIconPath", js.undefined)
    
    inline def setContentText(value: String): Self = StObject.set(x, "contentText", value.asInstanceOf[js.Any])
    
    inline def setContentTextUndefined: Self = StObject.set(x, "contentText", js.undefined)
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
