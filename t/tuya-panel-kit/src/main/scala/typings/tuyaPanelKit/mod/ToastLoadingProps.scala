package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastLoadingProps extends ToastProps {
  
  var color: js.UndefOr[String] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  var loadingBackgroundColor: js.UndefOr[String] = js.native
  
  var loadingStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
}
object ToastLoadingProps {
  
  @scala.inline
  def apply(onFinish: () => Unit, show: Boolean): ToastLoadingProps = {
    val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastLoadingProps]
  }
  
  @scala.inline
  implicit class ToastLoadingPropsOps[Self <: ToastLoadingProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setLoadingBackgroundColor(value: String): Self = this.set("loadingBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingBackgroundColor: Self = this.set("loadingBackgroundColor", js.undefined)
    
    @scala.inline
    def setLoadingStyle(value: StyleProp[ViewStyle]): Self = this.set("loadingStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingStyle: Self = this.set("loadingStyle", js.undefined)
    
    @scala.inline
    def setLoadingStyleNull: Self = this.set("loadingStyle", null)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
}
