package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastSuccessProps
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
    * @description 图标路径
    * @defaultValue <a target="_blank" href="https://github.com/tuya/tuya-panel-kit/blob/master/src/components/res/iconfont.json#L4">iconfont.correct</a>
    */
  /**
    * @language en-US
    * @description 图标路径
    * @defaultValue <a target="_blank" href="https://github.com/tuya/tuya-panel-kit/blob/master/src/components/res/iconfont.json#L4">iconfont.correct</a>
    */
  var d: js.UndefOr[String | js.Array[Any]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Icon style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var iconfontStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标尺寸
    * @defaultValue cx(28)
    */
  /**
    * @language en-US
    * @description Icon size
    * @defaultValue cx(40)
    */
  var size: js.UndefOr[Double] = js.undefined
}
object ToastSuccessProps {
  
  inline def apply(onFinish: () => Unit, show: Boolean): ToastSuccessProps = {
    val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastSuccessProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToastSuccessProps] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setD(value: String | js.Array[Any]): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setDVarargs(value: Any*): Self = StObject.set(x, "d", js.Array(value*))
    
    inline def setIconfontStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconfontStyle", value.asInstanceOf[js.Any])
    
    inline def setIconfontStyleNull: Self = StObject.set(x, "iconfontStyle", null)
    
    inline def setIconfontStyleUndefined: Self = StObject.set(x, "iconfontStyle", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
