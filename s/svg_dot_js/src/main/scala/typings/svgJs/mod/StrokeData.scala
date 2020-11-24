package typings.svgJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// sugar.js
@js.native
trait StrokeData extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var dasharray: js.UndefOr[String] = js.native
  
  var dashoffset: js.UndefOr[Double] = js.native
  
  var linecap: js.UndefOr[String] = js.native
  
  var linejoin: js.UndefOr[String] = js.native
  
  var miterlimit: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object StrokeData {
  
  @scala.inline
  def apply(): StrokeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrokeData]
  }
  
  @scala.inline
  implicit class StrokeDataOps[Self <: StrokeData] (val x: Self) extends AnyVal {
    
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
    def setDasharray(value: String): Self = this.set("dasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDasharray: Self = this.set("dasharray", js.undefined)
    
    @scala.inline
    def setDashoffset(value: Double): Self = this.set("dashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashoffset: Self = this.set("dashoffset", js.undefined)
    
    @scala.inline
    def setLinecap(value: String): Self = this.set("linecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinecap: Self = this.set("linecap", js.undefined)
    
    @scala.inline
    def setLinejoin(value: String): Self = this.set("linejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinejoin: Self = this.set("linejoin", js.undefined)
    
    @scala.inline
    def setMiterlimit(value: Double): Self = this.set("miterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiterlimit: Self = this.set("miterlimit", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
