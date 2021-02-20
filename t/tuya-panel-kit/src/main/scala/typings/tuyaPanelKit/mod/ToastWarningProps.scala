package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastWarningProps extends ToastProps {
  
  var color: js.UndefOr[String] = js.native
  
  var d: js.UndefOr[String] = js.native
  
  var iconfontStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object ToastWarningProps {
  
  @scala.inline
  def apply(onFinish: () => Unit, show: Boolean): ToastWarningProps = {
    val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastWarningProps]
  }
  
  @scala.inline
  implicit class ToastWarningPropsMutableBuilder[Self <: ToastWarningProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    @scala.inline
    def setIconfontStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconfontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconfontStyleNull: Self = StObject.set(x, "iconfontStyle", null)
    
    @scala.inline
    def setIconfontStyleUndefined: Self = StObject.set(x, "iconfontStyle", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
