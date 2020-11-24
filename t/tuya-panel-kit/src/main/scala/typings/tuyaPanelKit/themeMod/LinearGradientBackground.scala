package typings.tuyaPanelKit.themeMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearGradientBackground extends _BackgroundProps {
  
  var stops: js.UndefOr[Record[String, String]] = js.native
  
  var x1: js.UndefOr[String] = js.native
  
  var x2: js.UndefOr[String] = js.native
  
  var y1: js.UndefOr[String] = js.native
  
  var y2: js.UndefOr[String] = js.native
}
object LinearGradientBackground {
  
  @scala.inline
  def apply(): LinearGradientBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGradientBackground]
  }
  
  @scala.inline
  implicit class LinearGradientBackgroundOps[Self <: LinearGradientBackground] (val x: Self) extends AnyVal {
    
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
    def setStops(value: Record[String, String]): Self = this.set("stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
    
    @scala.inline
    def setX1(value: String): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX1: Self = this.set("x1", js.undefined)
    
    @scala.inline
    def setX2(value: String): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX2: Self = this.set("x2", js.undefined)
    
    @scala.inline
    def setY1(value: String): Self = this.set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
    
    @scala.inline
    def setY2(value: String): Self = this.set("y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
  }
}
