package typings.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayMap extends js.Object {
  
  var R0: Double = js.native
  
  var R1: js.Array[Double] = js.native
  
  var R2: js.Array[js.Array[Double]] = js.native
  
  var R3: js.Array[js.Array[js.Array[Double]]] = js.native
  
  var R4: js.Array[js.Array[js.Array[js.Array[Double]]]] = js.native
  
  var R5: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]] = js.native
  
  var R6: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]] = js.native
}
object ArrayMap {
  
  @scala.inline
  def apply(
    R0: Double,
    R1: js.Array[Double],
    R2: js.Array[js.Array[Double]],
    R3: js.Array[js.Array[js.Array[Double]]],
    R4: js.Array[js.Array[js.Array[js.Array[Double]]]],
    R5: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]],
    R6: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]]
  ): ArrayMap = {
    val __obj = js.Dynamic.literal(R0 = R0.asInstanceOf[js.Any], R1 = R1.asInstanceOf[js.Any], R2 = R2.asInstanceOf[js.Any], R3 = R3.asInstanceOf[js.Any], R4 = R4.asInstanceOf[js.Any], R5 = R5.asInstanceOf[js.Any], R6 = R6.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayMap]
  }
  
  @scala.inline
  implicit class ArrayMapOps[Self <: ArrayMap] (val x: Self) extends AnyVal {
    
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
    def setR0(value: Double): Self = this.set("R0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR1Varargs(value: Double*): Self = this.set("R1", js.Array(value :_*))
    
    @scala.inline
    def setR1(value: js.Array[Double]): Self = this.set("R1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR2Varargs(value: js.Array[Double]*): Self = this.set("R2", js.Array(value :_*))
    
    @scala.inline
    def setR2(value: js.Array[js.Array[Double]]): Self = this.set("R2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR3Varargs(value: js.Array[js.Array[Double]]*): Self = this.set("R3", js.Array(value :_*))
    
    @scala.inline
    def setR3(value: js.Array[js.Array[js.Array[Double]]]): Self = this.set("R3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR4Varargs(value: js.Array[js.Array[js.Array[Double]]]*): Self = this.set("R4", js.Array(value :_*))
    
    @scala.inline
    def setR4(value: js.Array[js.Array[js.Array[js.Array[Double]]]]): Self = this.set("R4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR5Varargs(value: js.Array[js.Array[js.Array[js.Array[Double]]]]*): Self = this.set("R5", js.Array(value :_*))
    
    @scala.inline
    def setR5(value: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]): Self = this.set("R5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR6Varargs(value: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]*): Self = this.set("R6", js.Array(value :_*))
    
    @scala.inline
    def setR6(value: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]]): Self = this.set("R6", value.asInstanceOf[js.Any])
  }
}
