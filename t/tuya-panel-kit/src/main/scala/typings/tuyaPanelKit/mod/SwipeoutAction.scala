package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.delete
import typings.tuyaPanelKit.tuyaPanelKitStrings.primary
import typings.tuyaPanelKit.tuyaPanelKitStrings.secondary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeoutAction extends StObject {
  
  /**
    * @language zh-CN
    * @description 设置按钮背景色
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Set the button color.
    * @defaultValue undefined
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮的文本颜色
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Set the font color in the button.
    * @defaultValue undefined
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 自定义按钮。如果设置了内容，则以下属性无效。
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Custom button. If content is set, the following properties are invalid.
    * @defaultValue undefined
    */
  var content: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮是否被禁用
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether the button can be clicked.
    * @defaultValue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 字体大小
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Font size
    * @defaultValue undefined
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮索引值
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Button key.
    * @defaultValue undefined
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 点击按钮的回调
    * @types (event: <a target='_blank' href='https://reactnative.dev/docs/pressevent'>GestureResponderEvent</a>) => void
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Callback of clicking the button.
    * @types (event: <a target='_blank' href='https://reactnative.dev/docs/pressevent'>GestureResponderEvent</a>) => void
    * @defaultValue () => {}
    */
  var onPress: js.UndefOr[js.Function1[/* e */ GestureResponderEvent, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮上的文本
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Set the text in the button.
    * @defaultValue undefined
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 文本样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Text Style
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue undefined
    */
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮的类型
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Set the button type
    * @defaultValue undefined
    */
  var `type`: js.UndefOr[delete | primary | secondary] = js.undefined
}
object SwipeoutAction {
  
  inline def apply(): SwipeoutAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeoutAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwipeoutAction] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnPress(value: /* e */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: delete | primary | secondary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
