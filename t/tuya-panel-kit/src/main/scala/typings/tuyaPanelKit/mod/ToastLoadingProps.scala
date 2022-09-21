package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastLoadingProps
  extends StObject
     with ToastProps {
  
  /**
    * @language zh-CN
    * @description 图标颜色
    * @defaultValue '#FFF'
    */
  /**
    * @language en-US
    * @description Icon color
    * @defaultValue '#FFF'
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标是否转动
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Does the icon rotate
    * @defaultValue true
    */
  var loading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 加载图标背景色
    * @defaultValue 'rgba(255,255,255,.1)'
    */
  /**
    * @language en-US
    * @description Loading icon background color
    * @defaultValue 'rgba(255,255,255,.1)'
    */
  var loadingBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 加载图标样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Loading icon styles
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var loadingStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标尺寸
    * @defaultValue cx(28)
    */
  /**
    * @language en-US
    * @description Icon size
    * @defaultValue cx(28)
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description  图标填充宽度
    * @defaultValue cx(4)
    */
  /**
    * @language en-US
    * @description The fill width of the icon
    * @defaultValue cx(4)
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object ToastLoadingProps {
  
  inline def apply(onFinish: () => Unit, show: Boolean): ToastLoadingProps = {
    val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastLoadingProps]
  }
  
  extension [Self <: ToastLoadingProps](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingBackgroundColor(value: String): Self = StObject.set(x, "loadingBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setLoadingBackgroundColorUndefined: Self = StObject.set(x, "loadingBackgroundColor", js.undefined)
    
    inline def setLoadingStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "loadingStyle", value.asInstanceOf[js.Any])
    
    inline def setLoadingStyleNull: Self = StObject.set(x, "loadingStyle", null)
    
    inline def setLoadingStyleUndefined: Self = StObject.set(x, "loadingStyle", js.undefined)
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
