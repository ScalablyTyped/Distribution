package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastSuccessProps extends ToastProps {
  
  var color: js.UndefOr[String] = js.native
  
  var d: js.UndefOr[String | js.Array[_]] = js.native
  
  var iconfontStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object ToastSuccessProps {
  
  @scala.inline
  def apply(onFinish: () => Unit, show: Boolean): ToastSuccessProps = {
    val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastSuccessProps]
  }
  
  @scala.inline
  implicit class ToastSuccessPropsOps[Self <: ToastSuccessProps] (val x: Self) extends AnyVal {
    
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
    def setDVarargs(value: js.Any*): Self = this.set("d", js.Array(value :_*))
    
    @scala.inline
    def setD(value: String | js.Array[_]): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    
    @scala.inline
    def setIconfontStyle(value: StyleProp[ViewStyle]): Self = this.set("iconfontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconfontStyle: Self = this.set("iconfontStyle", js.undefined)
    
    @scala.inline
    def setIconfontStyleNull: Self = this.set("iconfontStyle", null)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
