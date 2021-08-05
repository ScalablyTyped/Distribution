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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var activeColor: js.UndefOr[String] = js.undefined
  
  var activeKey: js.UndefOr[Double | String] = js.undefined
  
  var animationConfig: js.UndefOr[Easing] = js.undefined
  
  var background: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var dataSource: js.Array[TabDataSource]
  
  var defaultActiveKey: js.UndefOr[Double | String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var extraSpace: js.UndefOr[Double] = js.undefined
  
  var maxItem: js.UndefOr[Double] = js.undefined
  
  var onChange: js.UndefOr[js.Function2[/* tab */ TabDataSource, /* idx */ Double, Unit]] = js.undefined
  
  var preload: js.UndefOr[Boolean] = js.undefined
  
  var preloadTimeout: js.UndefOr[Double] = js.undefined
  
  var renderPlaceholder: js.UndefOr[js.Function2[/* activeIndex */ Double, /* child */ ReactNode, ReactNode]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var swipeable: js.UndefOr[Boolean] = js.undefined
  
  var tabActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var tabActiveTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var tabContentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var tabPosition: js.UndefOr[top | bottom] = js.undefined
  
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var tabTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var underlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var underlineWidth: js.UndefOr[Double] = js.undefined
  
  var velocityThreshold: js.UndefOr[Double] = js.undefined
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object TabsProps {
  
  inline def apply(dataSource: js.Array[TabDataSource]): TabsProps = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
  
  extension [Self <: TabsProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
    
    inline def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
    
    inline def setActiveKey(value: Double | String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    
    inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
    
    inline def setAnimationConfig(value: Easing): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDataSource(value: js.Array[TabDataSource]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceVarargs(value: TabDataSource*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    inline def setDefaultActiveKey(value: Double | String): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExtraSpace(value: Double): Self = StObject.set(x, "extraSpace", value.asInstanceOf[js.Any])
    
    inline def setExtraSpaceUndefined: Self = StObject.set(x, "extraSpace", js.undefined)
    
    inline def setMaxItem(value: Double): Self = StObject.set(x, "maxItem", value.asInstanceOf[js.Any])
    
    inline def setMaxItemUndefined: Self = StObject.set(x, "maxItem", js.undefined)
    
    inline def setOnChange(value: (/* tab */ TabDataSource, /* idx */ Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadTimeout(value: Double): Self = StObject.set(x, "preloadTimeout", value.asInstanceOf[js.Any])
    
    inline def setPreloadTimeoutUndefined: Self = StObject.set(x, "preloadTimeout", js.undefined)
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setRenderPlaceholder(value: (/* activeIndex */ Double, /* child */ ReactNode) => ReactNode): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction2(value))
    
    inline def setRenderPlaceholderUndefined: Self = StObject.set(x, "renderPlaceholder", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
    
    inline def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
    
    inline def setTabActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabActiveStyle", value.asInstanceOf[js.Any])
    
    inline def setTabActiveStyleNull: Self = StObject.set(x, "tabActiveStyle", null)
    
    inline def setTabActiveStyleUndefined: Self = StObject.set(x, "tabActiveStyle", js.undefined)
    
    inline def setTabActiveTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabActiveTextStyle", value.asInstanceOf[js.Any])
    
    inline def setTabActiveTextStyleNull: Self = StObject.set(x, "tabActiveTextStyle", null)
    
    inline def setTabActiveTextStyleUndefined: Self = StObject.set(x, "tabActiveTextStyle", js.undefined)
    
    inline def setTabContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabContentStyle", value.asInstanceOf[js.Any])
    
    inline def setTabContentStyleNull: Self = StObject.set(x, "tabContentStyle", null)
    
    inline def setTabContentStyleUndefined: Self = StObject.set(x, "tabContentStyle", js.undefined)
    
    inline def setTabPosition(value: top | bottom): Self = StObject.set(x, "tabPosition", value.asInstanceOf[js.Any])
    
    inline def setTabPositionUndefined: Self = StObject.set(x, "tabPosition", js.undefined)
    
    inline def setTabStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
    
    inline def setTabStyleNull: Self = StObject.set(x, "tabStyle", null)
    
    inline def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
    
    inline def setTabTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabTextStyle", value.asInstanceOf[js.Any])
    
    inline def setTabTextStyleNull: Self = StObject.set(x, "tabTextStyle", null)
    
    inline def setTabTextStyleUndefined: Self = StObject.set(x, "tabTextStyle", js.undefined)
    
    inline def setUnderlineStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
    
    inline def setUnderlineStyleNull: Self = StObject.set(x, "underlineStyle", null)
    
    inline def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
    
    inline def setUnderlineWidth(value: Double): Self = StObject.set(x, "underlineWidth", value.asInstanceOf[js.Any])
    
    inline def setUnderlineWidthUndefined: Self = StObject.set(x, "underlineWidth", js.undefined)
    
    inline def setVelocityThreshold(value: Double): Self = StObject.set(x, "velocityThreshold", value.asInstanceOf[js.Any])
    
    inline def setVelocityThresholdUndefined: Self = StObject.set(x, "velocityThreshold", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
