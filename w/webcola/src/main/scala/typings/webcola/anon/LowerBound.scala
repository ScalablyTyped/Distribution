package typings.webcola.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LowerBound extends js.Object {
  
  var lowerBound: Double = js.native
  
  var newCenters: js.Array[Double] = js.native
  
  var upperBound: Double = js.native
}
object LowerBound {
  
  @scala.inline
  def apply(lowerBound: Double, newCenters: js.Array[Double], upperBound: Double): LowerBound = {
    val __obj = js.Dynamic.literal(lowerBound = lowerBound.asInstanceOf[js.Any], newCenters = newCenters.asInstanceOf[js.Any], upperBound = upperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowerBound]
  }
  
  @scala.inline
  implicit class LowerBoundOps[Self <: LowerBound] (val x: Self) extends AnyVal {
    
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
    def setLowerBound(value: Double): Self = this.set("lowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewCentersVarargs(value: Double*): Self = this.set("newCenters", js.Array(value :_*))
    
    @scala.inline
    def setNewCenters(value: js.Array[Double]): Self = this.set("newCenters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperBound(value: Double): Self = this.set("upperBound", value.asInstanceOf[js.Any])
  }
}
