package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabBarProps extends StObject {
  
  var activeColor: js.UndefOr[String] = js.undefined
  
  var activeIndex: js.UndefOr[Double] = js.undefined
  
  var activeKey: js.UndefOr[String | Double] = js.undefined
  
  var defaultActiveIndex: js.UndefOr[Double] = js.undefined
  
  var defaultActiveKey: js.UndefOr[String | Double] = js.undefined
  
  var gutter: js.UndefOr[Double] = js.undefined
  
  var isUnderlineCenter: js.UndefOr[Boolean] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* index */ String, Unit]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var tabActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var tabActiveTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var tabTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var tabs: js.Array[TabBarArr]
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var underlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object TabBarProps {
  
  inline def apply(tabs: js.Array[TabBarArr]): TabBarProps = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarProps]
  }
  
  extension [Self <: TabBarProps](x: Self) {
    
    inline def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
    
    inline def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    inline def setActiveKey(value: String | Double): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    
    inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
    
    inline def setDefaultActiveIndex(value: Double): Self = StObject.set(x, "defaultActiveIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultActiveIndexUndefined: Self = StObject.set(x, "defaultActiveIndex", js.undefined)
    
    inline def setDefaultActiveKey(value: String | Double): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
    
    inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
    
    inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
    
    inline def setIsUnderlineCenter(value: Boolean): Self = StObject.set(x, "isUnderlineCenter", value.asInstanceOf[js.Any])
    
    inline def setIsUnderlineCenterUndefined: Self = StObject.set(x, "isUnderlineCenter", js.undefined)
    
    inline def setOnChange(value: /* index */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTabActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabActiveStyle", value.asInstanceOf[js.Any])
    
    inline def setTabActiveStyleNull: Self = StObject.set(x, "tabActiveStyle", null)
    
    inline def setTabActiveStyleUndefined: Self = StObject.set(x, "tabActiveStyle", js.undefined)
    
    inline def setTabActiveTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabActiveTextStyle", value.asInstanceOf[js.Any])
    
    inline def setTabActiveTextStyleNull: Self = StObject.set(x, "tabActiveTextStyle", null)
    
    inline def setTabActiveTextStyleUndefined: Self = StObject.set(x, "tabActiveTextStyle", js.undefined)
    
    inline def setTabStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
    
    inline def setTabStyleNull: Self = StObject.set(x, "tabStyle", null)
    
    inline def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
    
    inline def setTabTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabTextStyle", value.asInstanceOf[js.Any])
    
    inline def setTabTextStyleNull: Self = StObject.set(x, "tabTextStyle", null)
    
    inline def setTabTextStyleUndefined: Self = StObject.set(x, "tabTextStyle", js.undefined)
    
    inline def setTabs(value: js.Array[TabBarArr]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsVarargs(value: TabBarArr*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnderlineStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
    
    inline def setUnderlineStyleNull: Self = StObject.set(x, "underlineStyle", null)
    
    inline def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
