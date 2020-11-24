package typings.vanillaSwipe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsSwiping extends js.Object {
  
  var isSwiping: Boolean = js.native
  
  var start: Double = js.native
  
  var traceX: js.Array[scala.Nothing] = js.native
  
  var traceY: js.Array[scala.Nothing] = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object IsSwiping {
  
  @scala.inline
  def apply(
    isSwiping: Boolean,
    start: Double,
    traceX: js.Array[scala.Nothing],
    traceY: js.Array[scala.Nothing],
    x: Double,
    y: Double
  ): IsSwiping = {
    val __obj = js.Dynamic.literal(isSwiping = isSwiping.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], traceX = traceX.asInstanceOf[js.Any], traceY = traceY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSwiping]
  }
  
  @scala.inline
  implicit class IsSwipingOps[Self <: IsSwiping] (val x: Self) extends AnyVal {
    
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
    def setIsSwiping(value: Boolean): Self = this.set("isSwiping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceXVarargs(value: scala.Nothing*): Self = this.set("traceX", js.Array(value :_*))
    
    @scala.inline
    def setTraceX(value: js.Array[scala.Nothing]): Self = this.set("traceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceYVarargs(value: scala.Nothing*): Self = this.set("traceY", js.Array(value :_*))
    
    @scala.inline
    def setTraceY(value: js.Array[scala.Nothing]): Self = this.set("traceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
