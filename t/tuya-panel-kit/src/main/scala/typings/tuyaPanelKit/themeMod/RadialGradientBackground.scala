package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialGradientBackground extends _BackgroundProps {
  
  var cx: js.UndefOr[String] = js.native
  
  var cy: js.UndefOr[String] = js.native
  
  var fx: js.UndefOr[String] = js.native
  
  var fy: js.UndefOr[String] = js.native
  
  var rx: js.UndefOr[String] = js.native
  
  var ry: js.UndefOr[String] = js.native
  
  var stops: js.UndefOr[js.Array[StopsProps]] = js.native
}
object RadialGradientBackground {
  
  @scala.inline
  def apply(): RadialGradientBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGradientBackground]
  }
  
  @scala.inline
  implicit class RadialGradientBackgroundOps[Self <: RadialGradientBackground] (val x: Self) extends AnyVal {
    
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
    def setCx(value: String): Self = this.set("cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    
    @scala.inline
    def setCy(value: String): Self = this.set("cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    
    @scala.inline
    def setFx(value: String): Self = this.set("fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFx: Self = this.set("fx", js.undefined)
    
    @scala.inline
    def setFy(value: String): Self = this.set("fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFy: Self = this.set("fy", js.undefined)
    
    @scala.inline
    def setRx(value: String): Self = this.set("rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    
    @scala.inline
    def setRy(value: String): Self = this.set("ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: StopsProps*): Self = this.set("stops", js.Array(value :_*))
    
    @scala.inline
    def setStops(value: js.Array[StopsProps]): Self = this.set("stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
  }
}
