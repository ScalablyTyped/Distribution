package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BgBorder extends js.Object {
  
  var bgBorder: js.UndefOr[String] = js.native
  
  var bgBorderWidth: js.UndefOr[Double] = js.native
  
  var bgColor: js.UndefOr[String] = js.native
  
  var bgHeight: js.UndefOr[Double] = js.native
  
  var bgRadius: js.UndefOr[Double] = js.native
  
  var bgWidth: js.UndefOr[Double] = js.native
  
  var fontColor: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var loadingBackground: js.UndefOr[String] = js.native
  
  var loadingColor: js.UndefOr[String] = js.native
  
  var margin: js.UndefOr[js.Array[Double]] = js.native
  
  var padding: js.UndefOr[js.Array[Double]] = js.native
}
object BgBorder {
  
  @scala.inline
  def apply(): BgBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BgBorder]
  }
  
  @scala.inline
  implicit class BgBorderOps[Self <: BgBorder] (val x: Self) extends AnyVal {
    
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
    def setBgBorder(value: String): Self = this.set("bgBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgBorder: Self = this.set("bgBorder", js.undefined)
    
    @scala.inline
    def setBgBorderWidth(value: Double): Self = this.set("bgBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgBorderWidth: Self = this.set("bgBorderWidth", js.undefined)
    
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
    def setLoadingBackground(value: String): Self = this.set("loadingBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingBackground: Self = this.set("loadingBackground", js.undefined)
    
    @scala.inline
    def setLoadingColor(value: String): Self = this.set("loadingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingColor: Self = this.set("loadingColor", js.undefined)
    
    @scala.inline
    def setMarginVarargs(value: Double*): Self = this.set("margin", js.Array(value :_*))
    
    @scala.inline
    def setMargin(value: js.Array[Double]): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: js.Array[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
}
