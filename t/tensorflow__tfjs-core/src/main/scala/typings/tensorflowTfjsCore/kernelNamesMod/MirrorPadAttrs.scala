package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reflect
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.symmetric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MirrorPadAttrs extends js.Object {
  
  var mode: reflect | symmetric = js.native
  
  var paddings: js.Array[js.Tuple2[Double, Double]] = js.native
}
object MirrorPadAttrs {
  
  @scala.inline
  def apply(mode: reflect | symmetric, paddings: js.Array[js.Tuple2[Double, Double]]): MirrorPadAttrs = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], paddings = paddings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MirrorPadAttrs]
  }
  
  @scala.inline
  implicit class MirrorPadAttrsOps[Self <: MirrorPadAttrs] (val x: Self) extends AnyVal {
    
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
    def setMode(value: reflect | symmetric): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingsVarargs(value: (js.Tuple2[Double, Double])*): Self = this.set("paddings", js.Array(value :_*))
    
    @scala.inline
    def setPaddings(value: js.Array[js.Tuple2[Double, Double]]): Self = this.set("paddings", value.asInstanceOf[js.Any])
  }
}
