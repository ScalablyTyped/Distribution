package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Areas extends js.Object {
  
  var areas: scala.Double = js.native
  
  var iterations: scala.Double = js.native
}
object Areas {
  
  @scala.inline
  def apply(areas: scala.Double, iterations: scala.Double): Areas = {
    val __obj = js.Dynamic.literal(areas = areas.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Areas]
  }
  
  @scala.inline
  implicit class AreasOps[Self <: Areas] (val x: Self) extends AnyVal {
    
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
    def setAreas(value: scala.Double): Self = this.set("areas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: scala.Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
  }
}
