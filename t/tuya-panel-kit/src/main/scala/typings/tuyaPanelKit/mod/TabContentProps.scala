package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Easing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabContentProps extends js.Object {
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var activeIndex: Double = js.native
  
  var animationConfig: js.UndefOr[Easing] = js.native
  
  var children: ReactNode = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var onMove: js.UndefOr[
    js.Function3[/* gestureState */ js.Object, /* index */ Double, /* percent */ Double, Unit]
  ] = js.native
  
  var onRelease: js.UndefOr[
    js.Function3[/* gestureState */ js.Object, /* index */ Double, /* percent */ Double, Unit]
  ] = js.native
  
  var preload: js.UndefOr[Boolean] = js.native
  
  var preloadTimeout: js.UndefOr[Double] = js.native
  
  var renderPlaceholder: js.UndefOr[js.Function2[/* activeIndex */ Double, /* child */ ReactNode, ReactNode]] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var velocityThreshold: js.UndefOr[Double] = js.native
}
object TabContentProps {
  
  @scala.inline
  def apply(activeIndex: Double): TabContentProps = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabContentProps]
  }
  
  @scala.inline
  implicit class TabContentPropsOps[Self <: TabContentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAnimationConfig(value: Easing): Self = this.set("animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationConfig: Self = this.set("animationConfig", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setOnMove(value: (/* gestureState */ js.Object, /* index */ Double, /* percent */ Double) => Unit): Self = this.set("onMove", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnMove: Self = this.set("onMove", js.undefined)
    
    @scala.inline
    def setOnRelease(value: (/* gestureState */ js.Object, /* index */ Double, /* percent */ Double) => Unit): Self = this.set("onRelease", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnRelease: Self = this.set("onRelease", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setPreloadTimeout(value: Double): Self = this.set("preloadTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloadTimeout: Self = this.set("preloadTimeout", js.undefined)
    
    @scala.inline
    def setRenderPlaceholder(value: (/* activeIndex */ Double, /* child */ ReactNode) => ReactNode): Self = this.set("renderPlaceholder", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderPlaceholder: Self = this.set("renderPlaceholder", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setVelocityThreshold(value: Double): Self = this.set("velocityThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVelocityThreshold: Self = this.set("velocityThreshold", js.undefined)
  }
}
