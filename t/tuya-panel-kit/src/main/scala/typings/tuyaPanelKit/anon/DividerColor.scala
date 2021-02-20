package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DividerColor extends StObject {
  
  var dividerColor: js.UndefOr[String] = js.native
  
  var fontColor: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var unitFontColor: js.UndefOr[String] = js.native
  
  var unitFontSize: js.UndefOr[Double] = js.native
}
object DividerColor {
  
  @scala.inline
  def apply(): DividerColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DividerColor]
  }
  
  @scala.inline
  implicit class DividerColorMutableBuilder[Self <: DividerColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDividerColor(value: String): Self = StObject.set(x, "dividerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividerColorUndefined: Self = StObject.set(x, "dividerColor", js.undefined)
    
    @scala.inline
    def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setUnitFontColor(value: String): Self = StObject.set(x, "unitFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitFontColorUndefined: Self = StObject.set(x, "unitFontColor", js.undefined)
    
    @scala.inline
    def setUnitFontSize(value: Double): Self = StObject.set(x, "unitFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitFontSizeUndefined: Self = StObject.set(x, "unitFontSize", js.undefined)
  }
}
