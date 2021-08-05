package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typings.tuyaPanelKit.tuyaPanelKitStrings.center
import typings.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsibleProps extends StObject {
  
  var align: js.UndefOr[top | center | bottom] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  var collapsedHeight: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[String | js.Function0[Unit]] = js.undefined
  
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object CollapsibleProps {
  
  inline def apply(): CollapsibleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleProps]
  }
  
  extension [Self <: CollapsibleProps](x: Self) {
    
    inline def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedHeight(value: Double): Self = StObject.set(x, "collapsedHeight", value.asInstanceOf[js.Any])
    
    inline def setCollapsedHeightUndefined: Self = StObject.set(x, "collapsedHeight", js.undefined)
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String | js.Function0[Unit]): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingFunction0(value: () => Unit): Self = StObject.set(x, "easing", js.Any.fromFunction0(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
