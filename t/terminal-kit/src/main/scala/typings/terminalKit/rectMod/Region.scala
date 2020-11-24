package typings.terminalKit.rectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Region extends Options {
  
  var xmax: Double = js.native
  
  var xmin: Double = js.native
  
  var ymax: Double = js.native
  
  var ymin: Double = js.native
}
object Region {
  
  @scala.inline
  def apply(xmax: Double, xmin: Double, ymax: Double, ymin: Double): Region = {
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit class RegionOps[Self <: Region] (val x: Self) extends AnyVal {
    
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
    def setXmax(value: Double): Self = this.set("xmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmin(value: Double): Self = this.set("xmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYmax(value: Double): Self = this.set("ymax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYmin(value: Double): Self = this.set("ymin", value.asInstanceOf[js.Any])
  }
}
