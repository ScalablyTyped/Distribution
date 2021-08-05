package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastErrorProps
  extends StObject
     with ToastProps {
  
  var color: js.UndefOr[String] = js.undefined
  
  var d: js.UndefOr[String] = js.undefined
  
  var iconfontStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object ToastErrorProps {
  
  inline def apply(onFinish: () => Unit, show: Boolean): ToastErrorProps = {
    val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastErrorProps]
  }
  
  extension [Self <: ToastErrorProps](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setIconfontStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconfontStyle", value.asInstanceOf[js.Any])
    
    inline def setIconfontStyleNull: Self = StObject.set(x, "iconfontStyle", null)
    
    inline def setIconfontStyleUndefined: Self = StObject.set(x, "iconfontStyle", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
