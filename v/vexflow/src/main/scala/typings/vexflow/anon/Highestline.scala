package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Highestline extends js.Object {
  
  var highest_line: Double = js.native
  
  var lowest_line: Double = js.native
  
  var y_bottom: Double = js.native
  
  var y_top: Double = js.native
}
object Highestline {
  
  @scala.inline
  def apply(highest_line: Double, lowest_line: Double, y_bottom: Double, y_top: Double): Highestline = {
    val __obj = js.Dynamic.literal(highest_line = highest_line.asInstanceOf[js.Any], lowest_line = lowest_line.asInstanceOf[js.Any], y_bottom = y_bottom.asInstanceOf[js.Any], y_top = y_top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highestline]
  }
  
  @scala.inline
  implicit class HighestlineOps[Self <: Highestline] (val x: Self) extends AnyVal {
    
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
    def setHighest_line(value: Double): Self = this.set("highest_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowest_line(value: Double): Self = this.set("lowest_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY_bottom(value: Double): Self = this.set("y_bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY_top(value: Double): Self = this.set("y_top", value.asInstanceOf[js.Any])
  }
}
