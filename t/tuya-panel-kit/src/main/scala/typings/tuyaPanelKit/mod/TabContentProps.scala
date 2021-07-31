package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Easing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabContentProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var activeIndex: Double
  
  var animationConfig: js.UndefOr[Easing] = js.undefined
  
  var children: ReactNode
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var onMove: js.UndefOr[
    js.Function3[/* gestureState */ js.Object, /* index */ Double, /* percent */ Double, Unit]
  ] = js.undefined
  
  var onRelease: js.UndefOr[
    js.Function3[/* gestureState */ js.Object, /* index */ Double, /* percent */ Double, Unit]
  ] = js.undefined
  
  var preload: js.UndefOr[Boolean] = js.undefined
  
  var preloadTimeout: js.UndefOr[Double] = js.undefined
  
  var renderPlaceholder: js.UndefOr[js.Function2[/* activeIndex */ Double, /* child */ ReactNode, ReactNode]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var velocityThreshold: js.UndefOr[Double] = js.undefined
}
object TabContentProps {
  
  @scala.inline
  def apply(activeIndex: Double): TabContentProps = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabContentProps]
  }
  
  @scala.inline
  implicit class TabContentPropsMutableBuilder[Self <: TabContentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationConfig(value: Easing): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setOnMove(value: (/* gestureState */ js.Object, /* index */ Double, /* percent */ Double) => Unit): Self = StObject.set(x, "onMove", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
    
    @scala.inline
    def setOnRelease(value: (/* gestureState */ js.Object, /* index */ Double, /* percent */ Double) => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadTimeout(value: Double): Self = StObject.set(x, "preloadTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadTimeoutUndefined: Self = StObject.set(x, "preloadTimeout", js.undefined)
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    @scala.inline
    def setRenderPlaceholder(value: (/* activeIndex */ Double, /* child */ ReactNode) => ReactNode): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderPlaceholderUndefined: Self = StObject.set(x, "renderPlaceholder", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setVelocityThreshold(value: Double): Self = StObject.set(x, "velocityThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityThresholdUndefined: Self = StObject.set(x, "velocityThreshold", js.undefined)
  }
}
