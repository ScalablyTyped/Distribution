package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typings.tuyaPanelKit.tuyaPanelKitStrings.center
import typings.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 嵌套子元素
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Nested sub elements
    * @defaultValue null
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * @language zh-CN
    * @description 内层包裹样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Inner wrapping style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图片
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Image
    * @defaultValue null
    */
  var image: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图片样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/image-style-props">StyleProp<ImageStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Image style
    * @types <a target="_blank" href="https://reactnative.dev/docs/image-style-props">StyleProp<ImageStyle></a>
    * @defaultValue null
    */
  var imageStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 动画结束回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Animation end callback
    * @defaultValue () => {}
    */
  def onFinish(): Unit
  
  /**
    * @language zh-CN
    * @description 是否显示提示框
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Display prompt box
    * @defaultValue null
    */
  var show: Boolean
  
  /**
    * @language zh-CN
    * @description 显示位置
    * @defaultValue 'bottom'
    */
  /**
    * @language en-US
    * @description Display position
    * @defaultValue 'bottom'
    */
  var showPosition: js.UndefOr[top | bottom | center] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最外层样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Outermost style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 提示文字
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description Text
    * @defaultValue ''
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 文字样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Text style
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}
object ToastProps {
  
  inline def apply(onFinish: () => Unit, show: Boolean): ToastProps = {
    val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastProps]
  }
  
  extension [Self <: ToastProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setImage(value: Double): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    inline def setImageStyleNull: Self = StObject.set(x, "imageStyle", null)
    
    inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowPosition(value: top | bottom | center): Self = StObject.set(x, "showPosition", value.asInstanceOf[js.Any])
    
    inline def setShowPositionUndefined: Self = StObject.set(x, "showPosition", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
