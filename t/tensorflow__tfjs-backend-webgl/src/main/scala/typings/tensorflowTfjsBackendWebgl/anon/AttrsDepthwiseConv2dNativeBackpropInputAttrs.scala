package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.DepthwiseConv2dNativeBackpropInputAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.DepthwiseConv2dNativeBackpropInputInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsDepthwiseConv2dNativeBackpropInputAttrs extends StObject {
  
  var attrs: DepthwiseConv2dNativeBackpropInputAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: DepthwiseConv2dNativeBackpropInputInputs
}
object AttrsDepthwiseConv2dNativeBackpropInputAttrs {
  
  inline def apply(
    attrs: DepthwiseConv2dNativeBackpropInputAttrs,
    backend: MathBackendWebGL,
    inputs: DepthwiseConv2dNativeBackpropInputInputs
  ): AttrsDepthwiseConv2dNativeBackpropInputAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsDepthwiseConv2dNativeBackpropInputAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsDepthwiseConv2dNativeBackpropInputAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: DepthwiseConv2dNativeBackpropInputAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: DepthwiseConv2dNativeBackpropInputInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
