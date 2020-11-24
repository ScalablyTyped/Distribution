package typings.vis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawThreshold extends js.Object {
  
  var drawThreshold: js.UndefOr[Double] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var maxVisible: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
}
object DrawThreshold {
  
  @scala.inline
  def apply(): DrawThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawThreshold]
  }
  
  @scala.inline
  implicit class DrawThresholdOps[Self <: DrawThreshold] (val x: Self) extends AnyVal {
    
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
    def setDrawThreshold(value: Double): Self = this.set("drawThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawThreshold: Self = this.set("drawThreshold", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxVisible(value: Double): Self = this.set("maxVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxVisible: Self = this.set("maxVisible", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
}
