package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.anon.A
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoffused extends StObject {
  
  val conv2d: Typeofconv2d
  
  val depthwiseConv2d: TypeofdepthwiseConv2d
  
  def matMul(param0: A): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
}
object Typeoffused {
  
  inline def apply(
    conv2d: Typeofconv2d,
    depthwiseConv2d: TypeofdepthwiseConv2d,
    matMul: A => typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): Typeoffused = {
    val __obj = js.Dynamic.literal(conv2d = conv2d.asInstanceOf[js.Any], depthwiseConv2d = depthwiseConv2d.asInstanceOf[js.Any], matMul = js.Any.fromFunction1(matMul))
    __obj.asInstanceOf[Typeoffused]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeoffused] (val x: Self) extends AnyVal {
    
    inline def setConv2d(value: Typeofconv2d): Self = StObject.set(x, "conv2d", value.asInstanceOf[js.Any])
    
    inline def setDepthwiseConv2d(value: TypeofdepthwiseConv2d): Self = StObject.set(x, "depthwiseConv2d", value.asInstanceOf[js.Any])
    
    inline def setMatMul(value: A => typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): Self = StObject.set(x, "matMul", js.Any.fromFunction1(value))
  }
}
