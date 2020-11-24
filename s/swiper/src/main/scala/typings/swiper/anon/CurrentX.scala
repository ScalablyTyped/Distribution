package typings.swiper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentX extends js.Object {
  
  var currentX: Double = js.native
  
  var currentY: Double = js.native
  
  var diff: Double = js.native
  
  var startX: Double = js.native
  
  var startY: Double = js.native
}
object CurrentX {
  
  @scala.inline
  def apply(currentX: Double, currentY: Double, diff: Double, startX: Double, startY: Double): CurrentX = {
    val __obj = js.Dynamic.literal(currentX = currentX.asInstanceOf[js.Any], currentY = currentY.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentX]
  }
  
  @scala.inline
  implicit class CurrentXOps[Self <: CurrentX] (val x: Self) extends AnyVal {
    
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
    def setCurrentX(value: Double): Self = this.set("currentX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentY(value: Double): Self = this.set("currentY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiff(value: Double): Self = this.set("diff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartX(value: Double): Self = this.set("startX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartY(value: Double): Self = this.set("startY", value.asInstanceOf[js.Any])
  }
}
