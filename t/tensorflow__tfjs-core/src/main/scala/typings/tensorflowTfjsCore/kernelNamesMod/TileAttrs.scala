package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileAttrs extends js.Object {
  
  var reps: js.Array[Double] = js.native
}
object TileAttrs {
  
  @scala.inline
  def apply(reps: js.Array[Double]): TileAttrs = {
    val __obj = js.Dynamic.literal(reps = reps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileAttrs]
  }
  
  @scala.inline
  implicit class TileAttrsOps[Self <: TileAttrs] (val x: Self) extends AnyVal {
    
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
    def setRepsVarargs(value: Double*): Self = this.set("reps", js.Array(value :_*))
    
    @scala.inline
    def setReps(value: js.Array[Double]): Self = this.set("reps", value.asInstanceOf[js.Any])
  }
}
