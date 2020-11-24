package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Easing
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typings.tuyaPanelKit.tuyaPanelKitStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsProps extends js.Object {
  
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
  implicit class TabsPropsOps[Self <: TabsProps] (val x: Self) extends AnyVal {
    
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
    def setDataSourceVarargs(value: TabDataSource*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Array[TabDataSource]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setActiveColor(value: String): Self = this.set("activeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveColor: Self = this.set("activeColor", js.undefined)
    
    @scala.inline
    def setActiveKey(value: Double | String): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    
    @scala.inline
    def setAnimationConfig(value: Easing): Self = this.set("animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationConfig: Self = this.set("animationConfig", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDefaultActiveKey(value: Double | String): Self = this.set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveKey: Self = this.set("defaultActiveKey", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setExtraSpace(value: Double): Self = this.set("extraSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraSpace: Self = this.set("extraSpace", js.undefined)
    
    @scala.inline
    def setMaxItem(value: Double): Self = this.set("maxItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItem: Self = this.set("maxItem", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* tab */ TabDataSource, /* idx */ Double) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
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
    def setSwipeable(value: Boolean): Self = this.set("swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeable: Self = this.set("swipeable", js.undefined)
    
    @scala.inline
    def setTabActiveStyle(value: StyleProp[ViewStyle]): Self = this.set("tabActiveStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabActiveStyle: Self = this.set("tabActiveStyle", js.undefined)
    
    @scala.inline
    def setTabActiveStyleNull: Self = this.set("tabActiveStyle", null)
    
    @scala.inline
    def setTabActiveTextStyle(value: StyleProp[TextStyle]): Self = this.set("tabActiveTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabActiveTextStyle: Self = this.set("tabActiveTextStyle", js.undefined)
    
    @scala.inline
    def setTabActiveTextStyleNull: Self = this.set("tabActiveTextStyle", null)
    
    @scala.inline
    def setTabContentStyle(value: StyleProp[ViewStyle]): Self = this.set("tabContentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabContentStyle: Self = this.set("tabContentStyle", js.undefined)
    
    @scala.inline
    def setTabContentStyleNull: Self = this.set("tabContentStyle", null)
    
    @scala.inline
    def setTabPosition(value: top | bottom): Self = this.set("tabPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabPosition: Self = this.set("tabPosition", js.undefined)
    
    @scala.inline
    def setTabStyle(value: StyleProp[ViewStyle]): Self = this.set("tabStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabStyle: Self = this.set("tabStyle", js.undefined)
    
    @scala.inline
    def setTabStyleNull: Self = this.set("tabStyle", null)
    
    @scala.inline
    def setTabTextStyle(value: StyleProp[TextStyle]): Self = this.set("tabTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabTextStyle: Self = this.set("tabTextStyle", js.undefined)
    
    @scala.inline
    def setTabTextStyleNull: Self = this.set("tabTextStyle", null)
    
    @scala.inline
    def setUnderlineStyle(value: StyleProp[ViewStyle]): Self = this.set("underlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineStyle: Self = this.set("underlineStyle", js.undefined)
    
    @scala.inline
    def setUnderlineStyleNull: Self = this.set("underlineStyle", null)
    
    @scala.inline
    def setUnderlineWidth(value: Double): Self = this.set("underlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineWidth: Self = this.set("underlineWidth", js.undefined)
    
    @scala.inline
    def setVelocityThreshold(value: Double): Self = this.set("velocityThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVelocityThreshold: Self = this.set("velocityThreshold", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
    
    @scala.inline
    def setWrapperStyleNull: Self = this.set("wrapperStyle", null)
  }
}
