package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.SoftmaxAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.SoftmaxInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsSoftmaxAttrs extends StObject {
  
  var attrs: SoftmaxAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: SoftmaxInputs
}
object AttrsSoftmaxAttrs {
  
  inline def apply(attrs: SoftmaxAttrs, backend: MathBackendWebGL, inputs: SoftmaxInputs): AttrsSoftmaxAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSoftmaxAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsSoftmaxAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: SoftmaxAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SoftmaxInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
