package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DividerColor extends StObject {
  
  var dividerColor: js.UndefOr[String] = js.undefined
  
  var fontColor: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var unitFontColor: js.UndefOr[String] = js.undefined
  
  var unitFontSize: js.UndefOr[Double] = js.undefined
}
object DividerColor {
  
  inline def apply(): DividerColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DividerColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DividerColor] (val x: Self) extends AnyVal {
    
    inline def setDividerColor(value: String): Self = StObject.set(x, "dividerColor", value.asInstanceOf[js.Any])
    
    inline def setDividerColorUndefined: Self = StObject.set(x, "dividerColor", js.undefined)
    
    inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setUnitFontColor(value: String): Self = StObject.set(x, "unitFontColor", value.asInstanceOf[js.Any])
    
    inline def setUnitFontColorUndefined: Self = StObject.set(x, "unitFontColor", js.undefined)
    
    inline def setUnitFontSize(value: Double): Self = StObject.set(x, "unitFontSize", value.asInstanceOf[js.Any])
    
    inline def setUnitFontSizeUndefined: Self = StObject.set(x, "unitFontSize", js.undefined)
  }
}
