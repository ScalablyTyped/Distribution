package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Delay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionProps extends StObject {
  
  var animationConfig: js.UndefOr[Delay] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var hideDuration: js.UndefOr[Double] = js.undefined
  
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var showDuration: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object MotionProps {
  
  inline def apply(): MotionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionProps]
  }
  
  extension [Self <: MotionProps](x: Self) {
    
    inline def setAnimationConfig(value: Delay): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setHideDuration(value: Double): Self = StObject.set(x, "hideDuration", value.asInstanceOf[js.Any])
    
    inline def setHideDurationUndefined: Self = StObject.set(x, "hideDuration", js.undefined)
    
    inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowDuration(value: Double): Self = StObject.set(x, "showDuration", value.asInstanceOf[js.Any])
    
    inline def setShowDurationUndefined: Self = StObject.set(x, "showDuration", js.undefined)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
