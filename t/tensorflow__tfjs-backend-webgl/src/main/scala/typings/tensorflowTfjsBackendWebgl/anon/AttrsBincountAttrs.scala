package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.BincountAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.BincountInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsBincountAttrs extends StObject {
  
  var attrs: BincountAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: BincountInputs
}
object AttrsBincountAttrs {
  
  inline def apply(attrs: BincountAttrs, backend: MathBackendWebGL, inputs: BincountInputs): AttrsBincountAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBincountAttrs]
  }
  
  extension [Self <: AttrsBincountAttrs](x: Self) {
    
    inline def setAttrs(value: BincountAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: BincountInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
