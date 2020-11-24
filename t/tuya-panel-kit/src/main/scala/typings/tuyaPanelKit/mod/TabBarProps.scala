package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabBarProps extends js.Object {
  
  var activeColor: js.UndefOr[String] = js.native
  
  var activeIndex: js.UndefOr[Double] = js.native
  
  var activeKey: js.UndefOr[String | Double] = js.native
  
  var defaultActiveIndex: js.UndefOr[Double] = js.native
  
  var defaultActiveKey: js.UndefOr[String | Double] = js.native
  
  var gutter: js.UndefOr[Double] = js.native
  
  var isUnderlineCenter: js.UndefOr[Boolean] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* index */ String, Unit]] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var tabActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var tabActiveTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var tabTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var tabs: js.Array[TabBarArr] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var underlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object TabBarProps {
  
  @scala.inline
  def apply(tabs: js.Array[TabBarArr]): TabBarProps = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarProps]
  }
  
  @scala.inline
  implicit class TabBarPropsOps[Self <: TabBarProps] (val x: Self) extends AnyVal {
    
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
    def setTabsVarargs(value: TabBarArr*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: js.Array[TabBarArr]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveColor(value: String): Self = this.set("activeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveColor: Self = this.set("activeColor", js.undefined)
    
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    
    @scala.inline
    def setActiveKey(value: String | Double): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    
    @scala.inline
    def setDefaultActiveIndex(value: Double): Self = this.set("defaultActiveIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveIndex: Self = this.set("defaultActiveIndex", js.undefined)
    
    @scala.inline
    def setDefaultActiveKey(value: String | Double): Self = this.set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveKey: Self = this.set("defaultActiveKey", js.undefined)
    
    @scala.inline
    def setGutter(value: Double): Self = this.set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    
    @scala.inline
    def setIsUnderlineCenter(value: Boolean): Self = this.set("isUnderlineCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUnderlineCenter: Self = this.set("isUnderlineCenter", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* index */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnderlineStyle(value: StyleProp[ViewStyle]): Self = this.set("underlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineStyle: Self = this.set("underlineStyle", js.undefined)
    
    @scala.inline
    def setUnderlineStyleNull: Self = this.set("underlineStyle", null)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
    
    @scala.inline
    def setWrapperStyleNull: Self = this.set("wrapperStyle", null)
  }
}
