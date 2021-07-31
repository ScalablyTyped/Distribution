package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Delay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<tuya-panel-kit.tuya-panel-kit.MotionProps, 'onHide'> */
trait MotionToastProps extends StObject {
  
  var animationConfig: js.UndefOr[Delay] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var hideDuration: js.UndefOr[Double] = js.undefined
  
  var initScale: js.UndefOr[Double] = js.undefined
  
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var showDuration: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object MotionToastProps {
  
  @scala.inline
  def apply(): MotionToastProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionToastProps]
  }
  
  @scala.inline
  implicit class MotionToastPropsMutableBuilder[Self <: MotionToastProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationConfig(value: Delay): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setHideDuration(value: Double): Self = StObject.set(x, "hideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDurationUndefined: Self = StObject.set(x, "hideDuration", js.undefined)
    
    @scala.inline
    def setInitScale(value: Double): Self = StObject.set(x, "initScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitScaleUndefined: Self = StObject.set(x, "initScale", js.undefined)
    
    @scala.inline
    def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDuration(value: Double): Self = StObject.set(x, "showDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDurationUndefined: Self = StObject.set(x, "showDuration", js.undefined)
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
