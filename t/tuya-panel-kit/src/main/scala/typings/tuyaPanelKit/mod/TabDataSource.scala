package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabDataSource
  extends StObject
     with ViewProps {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var renderTab: js.UndefOr[
    js.Function3[/* isActive */ Boolean, /* state */ js.Object, /* props */ js.Object, ReactNode]
  ] = js.undefined
  
  var value: String
}
object TabDataSource {
  
  inline def apply(value: String): TabDataSource = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabDataSource]
  }
  
  extension [Self <: TabDataSource](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRenderTab(value: (/* isActive */ Boolean, /* state */ js.Object, /* props */ js.Object) => ReactNode): Self = StObject.set(x, "renderTab", js.Any.fromFunction3(value))
    
    inline def setRenderTabUndefined: Self = StObject.set(x, "renderTab", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
