package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastLoadingProps
  extends StObject
     with ToastProps {
  
  var color: js.UndefOr[String] = js.undefined
  
  var loading: js.UndefOr[Boolean] = js.undefined
  
  var loadingBackgroundColor: js.UndefOr[String] = js.undefined
  
  var loadingStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
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
