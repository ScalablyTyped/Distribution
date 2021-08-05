package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogCheckbox
  extends StObject
     with TYFlatListData {
  
  var Icon: js.UndefOr[String] = js.undefined
  
  var hideOnUnselect: js.UndefOr[Boolean] = js.undefined
  
  var iconSize: js.UndefOr[Double] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String | Double] = js.undefined
}
object DialogCheckbox {
  
  inline def apply(): DialogCheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogCheckbox]
  }
  
  extension [Self <: DialogCheckbox](x: Self) {
    
    inline def setHideOnUnselect(value: Boolean): Self = StObject.set(x, "hideOnUnselect", value.asInstanceOf[js.Any])
    
    inline def setHideOnUnselectUndefined: Self = StObject.set(x, "hideOnUnselect", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
