package typings.yandexMaps.anon

import typings.yandexMaps.mod.IClassConstructor
import typings.yandexMaps.mod.ISelectableControlLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  var layout: js.UndefOr[String | IClassConstructor[ISelectableControlLayout]] = js.undefined
  
  var selectOnClick: js.UndefOr[Boolean] = js.undefined
  
  var selectableLayout: js.UndefOr[String | IClassConstructor[ISelectableControlLayout]] = js.undefined
  
  var separatorLayout: js.UndefOr[String | IClassConstructor[ISelectableControlLayout]] = js.undefined
  
  var `type`: js.UndefOr["selectable" | "separator"] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Layout {
  
  inline def apply(): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layout]
  }
  
  extension [Self <: Layout](x: Self) {
    
    inline def setLayout(value: String | IClassConstructor[ISelectableControlLayout]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setSelectOnClick(value: Boolean): Self = StObject.set(x, "selectOnClick", value.asInstanceOf[js.Any])
    
    inline def setSelectOnClickUndefined: Self = StObject.set(x, "selectOnClick", js.undefined)
    
    inline def setSelectableLayout(value: String | IClassConstructor[ISelectableControlLayout]): Self = StObject.set(x, "selectableLayout", value.asInstanceOf[js.Any])
    
    inline def setSelectableLayoutUndefined: Self = StObject.set(x, "selectableLayout", js.undefined)
    
    inline def setSeparatorLayout(value: String | IClassConstructor[ISelectableControlLayout]): Self = StObject.set(x, "separatorLayout", value.asInstanceOf[js.Any])
    
    inline def setSeparatorLayoutUndefined: Self = StObject.set(x, "separatorLayout", js.undefined)
    
    inline def setType(value: "selectable" | "separator"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
