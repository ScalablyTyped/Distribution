package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastSuccessProps
  extends StObject
     with ToastProps {
  
  var color: js.UndefOr[String] = js.undefined
  
  var d: js.UndefOr[String | js.Array[js.Any]] = js.undefined
  
  var iconfontStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object ToastSuccessProps {
  
  inline def apply(onFinish: () => Unit, show: Boolean): ToastSuccessProps = {
    val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastSuccessProps]
  }
  
  extension [Self <: ToastSuccessProps](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setD(value: String | js.Array[js.Any]): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setDVarargs(value: js.Any*): Self = StObject.set(x, "d", js.Array(value :_*))
    
    inline def setIconfontStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconfontStyle", value.asInstanceOf[js.Any])
    
    inline def setIconfontStyleNull: Self = StObject.set(x, "iconfontStyle", null)
    
    inline def setIconfontStyleUndefined: Self = StObject.set(x, "iconfontStyle", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
