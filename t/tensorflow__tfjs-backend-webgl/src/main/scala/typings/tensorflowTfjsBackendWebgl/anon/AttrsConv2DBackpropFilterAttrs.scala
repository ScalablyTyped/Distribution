package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.Conv2DBackpropFilterAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.Conv2DBackpropFilterInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsConv2DBackpropFilterAttrs extends StObject {
  
  var attrs: Conv2DBackpropFilterAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: Conv2DBackpropFilterInputs
}
object AttrsConv2DBackpropFilterAttrs {
  
  inline def apply(attrs: Conv2DBackpropFilterAttrs, backend: MathBackendWebGL, inputs: Conv2DBackpropFilterInputs): AttrsConv2DBackpropFilterAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConv2DBackpropFilterAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsConv2DBackpropFilterAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: Conv2DBackpropFilterAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: Conv2DBackpropFilterInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
