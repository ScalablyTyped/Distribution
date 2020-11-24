package typings.victory.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CornerRadius extends js.Object {
  
  var cornerRadius: js.UndefOr[Double] = js.native
  
  var flyoutStyle: js.UndefOr[CSSProperties] = js.native
  
  var pointerLength: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object CornerRadius {
  
  @scala.inline
  def apply(): CornerRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CornerRadius]
  }
  
  @scala.inline
  implicit class CornerRadiusOps[Self <: CornerRadius] (val x: Self) extends AnyVal {
    
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
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    
    @scala.inline
    def setFlyoutStyle(value: CSSProperties): Self = this.set("flyoutStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlyoutStyle: Self = this.set("flyoutStyle", js.undefined)
    
    @scala.inline
    def setPointerLength(value: Double): Self = this.set("pointerLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerLength: Self = this.set("pointerLength", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
