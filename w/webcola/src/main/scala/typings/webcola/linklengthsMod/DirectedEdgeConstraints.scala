package typings.webcola.linklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectedEdgeConstraints extends js.Object {
  
  var axis: String = js.native
  
  var gap: Double = js.native
}
object DirectedEdgeConstraints {
  
  @scala.inline
  def apply(axis: String, gap: Double): DirectedEdgeConstraints = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectedEdgeConstraints]
  }
  
  @scala.inline
  implicit class DirectedEdgeConstraintsOps[Self <: DirectedEdgeConstraints] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
  }
}
