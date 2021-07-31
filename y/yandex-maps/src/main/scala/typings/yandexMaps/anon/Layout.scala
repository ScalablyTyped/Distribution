package typings.yandexMaps.anon

import typings.yandexMaps.mod.IClassConstructor
import typings.yandexMaps.mod.ISelectableControlLayout
import typings.yandexMaps.yandexMapsStrings.selectable
import typings.yandexMaps.yandexMapsStrings.separator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  var layout: js.UndefOr[String | IClassConstructor[ISelectableControlLayout]] = js.undefined
  
  var selectOnClick: js.UndefOr[Boolean] = js.undefined
  
  var selectableLayout: js.UndefOr[String | IClassConstructor[ISelectableControlLayout]] = js.undefined
  
  var separatorLayout: js.UndefOr[String | IClassConstructor[ISelectableControlLayout]] = js.undefined
  
  var `type`: js.UndefOr[selectable | separator] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Layout {
  
  @scala.inline
  def apply(): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  implicit class LayoutMutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: String | IClassConstructor[ISelectableControlLayout]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setSelectOnClick(value: Boolean): Self = StObject.set(x, "selectOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectOnClickUndefined: Self = StObject.set(x, "selectOnClick", js.undefined)
    
    @scala.inline
    def setSelectableLayout(value: String | IClassConstructor[ISelectableControlLayout]): Self = StObject.set(x, "selectableLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableLayoutUndefined: Self = StObject.set(x, "selectableLayout", js.undefined)
    
    @scala.inline
    def setSeparatorLayout(value: String | IClassConstructor[ISelectableControlLayout]): Self = StObject.set(x, "separatorLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorLayoutUndefined: Self = StObject.set(x, "separatorLayout", js.undefined)
    
    @scala.inline
    def setType(value: selectable | separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
