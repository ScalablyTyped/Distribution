package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficParams extends _FormatterParams {
  
  var color: js.UndefOr[Color] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  // Traffic
  var min: js.UndefOr[Double] = js.native
}
object TrafficParams {
  
  @scala.inline
  def apply(): TrafficParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficParams]
  }
  
  @scala.inline
  implicit class TrafficParamsOps[Self <: TrafficParams] (val x: Self) extends AnyVal {
    
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
    def setColorVarargs(value: js.Any*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColorFunction1(value: /* value */ js.Any => String): Self = this.set("color", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
}
