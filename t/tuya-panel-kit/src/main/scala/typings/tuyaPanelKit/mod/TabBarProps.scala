package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.radio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabBarProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 当 type: 'radio' 时，激活 Tab 的背景色
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description When type: 'radio', activate the background color of tab
    * @defaultValue ''
    */
  var activeColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 当 type: 'radio' 时，激活索引值 （如果给定了则成为受控组件）
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description When type: 'radio', activate the index value (if given, it becomes a controlled component)
    * @defaultValue 0
    */
  var activeIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 激活值，如果给定了则成为受控组件，需搭配 onChange 使用
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Activation value. If the parameter value is set, it becomes a controlled component. It needs to be used with onChange.
    * @defaultValue undefined
    */
  var activeKey: js.UndefOr[String | Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 当 type: 'radio' 时，默认高亮 tab 的索引值
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description When type: 'radio', the index value of the highlighted tab is highlighted by default
    * @defaultValue 0
    */
  var defaultActiveIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 默认的激活值，想成为非受控组件时使用
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description The default activation value. It is used when it is set to uncontrolled components
    * @defaultValue 0
    */
  var defaultActiveKey: js.UndefOr[String | Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 制表符间距
    * @defaultValue 2
    */
  /**
    * @language en-US
    * @description The spacing between tab
    * @defaultValue 2
    */
  var gutter: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 下划线是否居中
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Is the underline centered
    * @defaultValue true
    */
  var isUnderlineCenter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description Tab 切换的回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Callback of tab switching.
    * @defaultValue () => {}
    */
  var onChange: js.UndefOr[js.Function1[/* index */ String, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description Tab 外层容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Outer container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 单个激活 Tab 的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description The style of a single active tab
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var tabActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 激活的文本样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description The selected text style.
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue {}
    */
  var tabActiveTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 单个 Tab 的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description The style of a single tab
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 未激活的文本样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description he text style of the unselected Tab.
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue {}
    */
  var tabTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 数据源
    * @types <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/3a07a00d4e5e3400adeee9c4857b5799d41e53d7/types/tuya-panel-kit/index.d.ts#L7047'>TabBarArr[]</a>
    * @defaultValue []
    */
  /**
    * @language en-US
    * @description data Source
    * @types <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/3a07a00d4e5e3400adeee9c4857b5799d41e53d7/types/tuya-panel-kit/index.d.ts#L7047'>TabBarArr[]</a>
    * @defaultValue []
    */
  var tabs: js.Array[TabBarArr]
  
  /**
    * @language zh-CN
    * @description 类型
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Tab type
    * @defaultValue undefined
    */
  var `type`: js.UndefOr[radio | String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 下划线的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Style of the underline.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var underlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description Tab 内层容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Tab inner container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object TabBarProps {
  
  inline def apply(tabs: js.Array[TabBarArr]): TabBarProps = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabBarProps] (val x: Self) extends AnyVal {
    
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
    
    inline def setTabsVarargs(value: TabBarArr*): Self = StObject.set(x, "tabs", js.Array(value*))
    
    inline def setType(value: radio | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnderlineStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
    
    inline def setUnderlineStyleNull: Self = StObject.set(x, "underlineStyle", null)
    
    inline def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
