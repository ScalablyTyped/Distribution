package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerLabel extends StObject {
  
  /**
    * The color of the label. Default to: black.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The font size of the label in pixels. Default to: 14px.
    */
  var fontSize: js.UndefOr[String] = js.undefined
  
  var parsedFontSize: Double
  
  /**
    * The text to be displayed in the label.
    */
  var text: String
}
object MarkerLabel {
  
  inline def apply(parsedFontSize: Double, text: String): MarkerLabel = {
    val __obj = js.Dynamic.literal(parsedFontSize = parsedFontSize.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerLabel] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setParsedFontSize(value: Double): Self = StObject.set(x, "parsedFontSize", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
