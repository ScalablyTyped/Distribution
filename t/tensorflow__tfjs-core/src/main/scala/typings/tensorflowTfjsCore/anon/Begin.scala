package typings.tensorflowTfjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Begin extends js.Object {
  
  var begin: js.Array[Double] = js.native
  
  var end: js.Array[Double] = js.native
  
  var strides: js.Array[Double] = js.native
}
object Begin {
  
  @scala.inline
  def apply(begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double]): Begin = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Begin]
  }
  
  @scala.inline
  implicit class BeginOps[Self <: Begin] (val x: Self) extends AnyVal {
    
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
    def setBeginVarargs(value: Double*): Self = this.set("begin", js.Array(value :_*))
    
    @scala.inline
    def setBegin(value: js.Array[Double]): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndVarargs(value: Double*): Self = this.set("end", js.Array(value :_*))
    
    @scala.inline
    def setEnd(value: js.Array[Double]): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStridesVarargs(value: Double*): Self = this.set("strides", js.Array(value :_*))
    
    @scala.inline
    def setStrides(value: js.Array[Double]): Self = this.set("strides", value.asInstanceOf[js.Any])
  }
}
