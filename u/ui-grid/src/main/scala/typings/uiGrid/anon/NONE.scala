package typings.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NONE extends js.Object {
  
  var LEFT: String = js.native
  
  var NONE: String = js.native
  
  var RIGHT: String = js.native
}
object NONE {
  
  @scala.inline
  def apply(LEFT: String, NONE: String, RIGHT: String): NONE = {
    val __obj = js.Dynamic.literal(LEFT = LEFT.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[NONE]
  }
  
  @scala.inline
  implicit class NONEOps[Self <: NONE] (val x: Self) extends AnyVal {
    
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
    def setLEFT(value: String): Self = this.set("LEFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: String): Self = this.set("NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIGHT(value: String): Self = this.set("RIGHT", value.asInstanceOf[js.Any])
  }
}
