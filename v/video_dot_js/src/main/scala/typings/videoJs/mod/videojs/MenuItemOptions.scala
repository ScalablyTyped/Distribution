package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItemOptions
  extends StObject
     with ComponentOptions {
  
  var label: js.UndefOr[String] = js.undefined
  
  var multiSelectable: js.UndefOr[Boolean] = js.undefined
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
}
object MenuItemOptions {
  
  inline def apply(): MenuItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemOptions]
  }
  
  extension [Self <: MenuItemOptions](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMultiSelectable(value: Boolean): Self = StObject.set(x, "multiSelectable", value.asInstanceOf[js.Any])
    
    inline def setMultiSelectableUndefined: Self = StObject.set(x, "multiSelectable", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
