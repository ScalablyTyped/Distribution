package typings.vara.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakPoints extends js.Object {
  
  var breakPoints: js.Array[js.Array[String | Double]] = js.native
  
  var width: Double = js.native
}
object BreakPoints {
  
  @scala.inline
  def apply(breakPoints: js.Array[js.Array[String | Double]], width: Double): BreakPoints = {
    val __obj = js.Dynamic.literal(breakPoints = breakPoints.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakPoints]
  }
  
  @scala.inline
  implicit class BreakPointsOps[Self <: BreakPoints] (val x: Self) extends AnyVal {
    
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
    def setBreakPointsVarargs(value: (js.Array[String | Double])*): Self = this.set("breakPoints", js.Array(value :_*))
    
    @scala.inline
    def setBreakPoints(value: js.Array[js.Array[String | Double]]): Self = this.set("breakPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
