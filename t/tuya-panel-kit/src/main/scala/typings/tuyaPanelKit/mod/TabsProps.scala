package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Easing
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typings.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var activeColor: js.UndefOr[String] = js.native
  
  var activeKey: js.UndefOr[Double | String] = js.native
  
  var animationConfig: js.UndefOr[Easing] = js.native
  
  var background: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var dataSource: js.Array[TabDataSource] = js.native
  
  var defaultActiveKey: js.UndefOr[Double | String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var extraSpace: js.UndefOr[Double] = js.native
  
  var maxItem: js.UndefOr[Double] = js.native
  
  var onChange: js.UndefOr[js.Function2[/* tab */ TabDataSource, /* idx */ Double, Unit]] = js.native
  
  var preload: js.UndefOr[Boolean] = js.native
  
  var preloadTimeout: js.UndefOr[Double] = js.native
  
  var renderPlaceholder: js.UndefOr[js.Function2[/* activeIndex */ Double, /* child */ ReactNode, ReactNode]] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var swipeable: js.UndefOr[Boolean] = js.native
  
  var tabActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var tabActiveTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var tabContentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var tabPosition: js.UndefOr[top | bottom] = js.native
  
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var tabTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var underlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var underlineWidth: js.UndefOr[Double] = js.native
  
  var velocityThreshold: js.UndefOr[Double] = js.native
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object TabsProps {
  
  @scala.inline
  def apply(dataSource: js.Array[TabDataSource]): TabsProps = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
  
  @scala.inline
  implicit class TabsPropsMutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
    
    @scala.inline
    def setActiveKey(value: Double | String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
    
    @scala.inline
    def setAnimationConfig(value: Easing): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Array[TabDataSource]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceVarargs(value: TabDataSource*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDefaultActiveKey(value: Double | String): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setExtraSpace(value: Double): Self = StObject.set(x, "extraSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraSpaceUndefined: Self = StObject.set(x, "extraSpace", js.undefined)
    
    @scala.inline
    def setMaxItem(value: Double): Self = StObject.set(x, "maxItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemUndefined: Self = StObject.set(x, "maxItem", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* tab */ TabDataSource, /* idx */ Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
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
    def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
    
    @scala.inline
    def setTabActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabActiveStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabActiveStyleNull: Self = StObject.set(x, "tabActiveStyle", null)
    
    @scala.inline
    def setTabActiveStyleUndefined: Self = StObject.set(x, "tabActiveStyle", js.undefined)
    
    @scala.inline
    def setTabActiveTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabActiveTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabActiveTextStyleNull: Self = StObject.set(x, "tabActiveTextStyle", null)
    
    @scala.inline
    def setTabActiveTextStyleUndefined: Self = StObject.set(x, "tabActiveTextStyle", js.undefined)
    
    @scala.inline
    def setTabContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabContentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabContentStyleNull: Self = StObject.set(x, "tabContentStyle", null)
    
    @scala.inline
    def setTabContentStyleUndefined: Self = StObject.set(x, "tabContentStyle", js.undefined)
    
    @scala.inline
    def setTabPosition(value: top | bottom): Self = StObject.set(x, "tabPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabPositionUndefined: Self = StObject.set(x, "tabPosition", js.undefined)
    
    @scala.inline
    def setTabStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabStyleNull: Self = StObject.set(x, "tabStyle", null)
    
    @scala.inline
    def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
    
    @scala.inline
    def setTabTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabTextStyleNull: Self = StObject.set(x, "tabTextStyle", null)
    
    @scala.inline
    def setTabTextStyleUndefined: Self = StObject.set(x, "tabTextStyle", js.undefined)
    
    @scala.inline
    def setUnderlineStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineStyleNull: Self = StObject.set(x, "underlineStyle", null)
    
    @scala.inline
    def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
    
    @scala.inline
    def setUnderlineWidth(value: Double): Self = StObject.set(x, "underlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineWidthUndefined: Self = StObject.set(x, "underlineWidth", js.undefined)
    
    @scala.inline
    def setVelocityThreshold(value: Double): Self = StObject.set(x, "velocityThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityThresholdUndefined: Self = StObject.set(x, "velocityThreshold", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    @scala.inline
    def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
