package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.themeMod.LinearGradientBackground
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearGradientProps
  extends StObject
     with LinearGradientBackground {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var gradientId: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object LinearGradientProps {
  
  inline def apply(): LinearGradientProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGradientProps]
  }
  
  extension [Self <: LinearGradientProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setGradientId(value: String): Self = StObject.set(x, "gradientId", value.asInstanceOf[js.Any])
    
    inline def setGradientIdUndefined: Self = StObject.set(x, "gradientId", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
