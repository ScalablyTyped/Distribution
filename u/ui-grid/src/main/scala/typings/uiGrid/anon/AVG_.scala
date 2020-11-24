package typings.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AVG_ extends js.Object {
  
  var AVG: String = js.native
  
  var COUNT: String = js.native
  
  var MAX: String = js.native
  
  var MIN: String = js.native
  
  var SUM: String = js.native
}
object AVG_ {
  
  @scala.inline
  def apply(AVG: String, COUNT: String, MAX: String, MIN: String, SUM: String): AVG_ = {
    val __obj = js.Dynamic.literal(AVG = AVG.asInstanceOf[js.Any], COUNT = COUNT.asInstanceOf[js.Any], MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any], SUM = SUM.asInstanceOf[js.Any])
    __obj.asInstanceOf[AVG_]
  }
  
  @scala.inline
  implicit class AVG_Ops[Self <: AVG_] (val x: Self) extends AnyVal {
    
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
    def setAVG(value: String): Self = this.set("AVG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOUNT(value: String): Self = this.set("COUNT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAX(value: String): Self = this.set("MAX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIN(value: String): Self = this.set("MIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUM(value: String): Self = this.set("SUM", value.asInstanceOf[js.Any])
  }
}
