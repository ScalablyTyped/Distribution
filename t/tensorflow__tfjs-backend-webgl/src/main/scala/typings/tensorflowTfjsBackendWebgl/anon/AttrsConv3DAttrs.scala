package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.Conv3DAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.Conv3DInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsConv3DAttrs extends StObject {
  
  var attrs: Conv3DAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: Conv3DInputs
}
object AttrsConv3DAttrs {
  
  inline def apply(attrs: Conv3DAttrs, backend: MathBackendWebGL, inputs: Conv3DInputs): AttrsConv3DAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConv3DAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsConv3DAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: Conv3DAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: Conv3DInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
