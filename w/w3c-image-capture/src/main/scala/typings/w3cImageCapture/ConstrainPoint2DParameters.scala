package typings.w3cImageCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstrainPoint2DParameters extends js.Object {
  
  var exact: js.Array[Point2D] = js.native
  
  var ideal: js.Array[Point2D] = js.native
}
object ConstrainPoint2DParameters {
  
  @scala.inline
  def apply(exact: js.Array[Point2D], ideal: js.Array[Point2D]): ConstrainPoint2DParameters = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], ideal = ideal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainPoint2DParameters]
  }
  
  @scala.inline
  implicit class ConstrainPoint2DParametersOps[Self <: ConstrainPoint2DParameters] (val x: Self) extends AnyVal {
    
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
    def setExactVarargs(value: Point2D*): Self = this.set("exact", js.Array(value :_*))
    
    @scala.inline
    def setExact(value: js.Array[Point2D]): Self = this.set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdealVarargs(value: Point2D*): Self = this.set("ideal", js.Array(value :_*))
    
    @scala.inline
    def setIdeal(value: js.Array[Point2D]): Self = this.set("ideal", value.asInstanceOf[js.Any])
  }
}
