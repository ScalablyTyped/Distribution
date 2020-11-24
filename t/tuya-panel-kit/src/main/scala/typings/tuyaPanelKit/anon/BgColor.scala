package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BgColor extends js.Object {
  
  var bgColor: js.UndefOr[String] = js.native
  
  var bgHeight: js.UndefOr[Double] = js.native
  
  var bgRadius: js.UndefOr[Double] = js.native
  
  var bgWidth: js.UndefOr[Double] = js.native
  
  var fontColor: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var iconColor: js.UndefOr[String] = js.native
  
  var iconSize: js.UndefOr[Double] = js.native
  
  var margin: js.UndefOr[js.Array[Double]] = js.native
}
object BgColor {
  
  @scala.inline
  def apply(): BgColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BgColor]
  }
  
  @scala.inline
  implicit class BgColorOps[Self <: BgColor] (val x: Self) extends AnyVal {
    
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
    def setBgColor(value: String): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    
    @scala.inline
    def setBgHeight(value: Double): Self = this.set("bgHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgHeight: Self = this.set("bgHeight", js.undefined)
    
    @scala.inline
    def setBgRadius(value: Double): Self = this.set("bgRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgRadius: Self = this.set("bgRadius", js.undefined)
    
    @scala.inline
    def setBgWidth(value: Double): Self = this.set("bgWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgWidth: Self = this.set("bgWidth", js.undefined)
    
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    
    @scala.inline
    def setMarginVarargs(value: Double*): Self = this.set("margin", js.Array(value :_*))
    
    @scala.inline
    def setMargin(value: js.Array[Double]): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
  }
}
