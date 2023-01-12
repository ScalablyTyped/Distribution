package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.DepthwiseConv2dNativeAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.DepthwiseConv2dNativeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsDepthwiseConv2dNativeAttrs extends StObject {
  
  var attrs: DepthwiseConv2dNativeAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: DepthwiseConv2dNativeInputs
}
object AttrsDepthwiseConv2dNativeAttrs {
  
  inline def apply(attrs: DepthwiseConv2dNativeAttrs, backend: MathBackendWebGL, inputs: DepthwiseConv2dNativeInputs): AttrsDepthwiseConv2dNativeAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsDepthwiseConv2dNativeAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsDepthwiseConv2dNativeAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: DepthwiseConv2dNativeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: DepthwiseConv2dNativeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
