package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerLabelOptions extends StObject {
  
  /**
    * A custom className property to be applied to the label's element.
    */
  var className: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The color of the label text. (black by default).
    */
  var color: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The font family for the label.
    */
  var fontFamily: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The font size for the label.
    */
  var fontSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The font weight for the label.
    */
  var fontWeight: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The text to be displayed in the label.
    */
  var text: String
}
object MarkerLabelOptions {
  
  inline def apply(text: String): MarkerLabelOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerLabelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerLabelOptions] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameNull: Self = StObject.set(x, "className", null)
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyNull: Self = StObject.set(x, "fontFamily", null)
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightNull: Self = StObject.set(x, "fontWeight", null)
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
