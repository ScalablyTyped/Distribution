package typings.tuyaPanelKit.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveStyle extends StObject {
  
  /**
    * @language zh-CN
    * @description 激活的 Tab 样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Active tab style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 激活状态下的文本样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Active text style
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue undefined
    */
  var activeTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 索引值
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Key Value
    * @defaultValue undefined
    */
  var key: String
  
  /**
    * @language zh-CN
    * @description 当 type: 'radio' 时，触发单个 Tab 点击回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description When type: 'radio', a single tab click callback is triggered
    * @defaultValue () => {}
    */
  var onItemPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 触发单个 Tab 点击回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Trigger a single tab click callback
    * @defaultValue () => {}
    */
  var onPress: js.UndefOr[js.Function1[/* index */ String, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description Tab 内容样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Tab content style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 文本样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Text style
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue undefined
    */
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description Tab 里文本
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Text in tab
    * @defaultValue undefined
    */
  var title: String
}
object ActiveStyle {
  
  inline def apply(key: String, title: String): ActiveStyle = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveStyle]
  }
  
  extension [Self <: ActiveStyle](x: Self) {
    
    inline def setActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
    
    inline def setActiveStyleNull: Self = StObject.set(x, "activeStyle", null)
    
    inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
    
    inline def setActiveTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "activeTextStyle", value.asInstanceOf[js.Any])
    
    inline def setActiveTextStyleNull: Self = StObject.set(x, "activeTextStyle", null)
    
    inline def setActiveTextStyleUndefined: Self = StObject.set(x, "activeTextStyle", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnItemPress(value: () => Unit): Self = StObject.set(x, "onItemPress", js.Any.fromFunction0(value))
    
    inline def setOnItemPressUndefined: Self = StObject.set(x, "onItemPress", js.undefined)
    
    inline def setOnPress(value: /* index */ String => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
