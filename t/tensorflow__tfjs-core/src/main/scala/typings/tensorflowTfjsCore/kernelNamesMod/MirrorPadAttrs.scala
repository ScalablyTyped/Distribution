package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reflect
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.symmetric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MirrorPadAttrs extends StObject {
  
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
  implicit class MirrorPadAttrsMutableBuilder[Self <: MirrorPadAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: reflect | symmetric): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddings(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "paddings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "paddings", js.Array(value :_*))
  }
}
