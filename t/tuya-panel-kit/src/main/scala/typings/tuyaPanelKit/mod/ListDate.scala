package typings.tuyaPanelKit.mod

import typings.react.mod.ElementType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDate
  extends StObject
     with TYFlatListData {
  
  var Icon: js.UndefOr[ElementType[js.Any]] = js.undefined
  
  var styles: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var value: js.Any
}
object ListDate {
  
  inline def apply(value: js.Any): ListDate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDate]
  }
  
  extension [Self <: ListDate](x: Self) {
    
    inline def setIcon(value: ElementType[js.Any]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    inline def setStyles(value: StyleProp[ViewStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesNull: Self = StObject.set(x, "styles", null)
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
