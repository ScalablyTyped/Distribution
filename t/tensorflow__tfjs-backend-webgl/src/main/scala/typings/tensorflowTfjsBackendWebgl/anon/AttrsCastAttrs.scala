package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.CastAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.CastInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsCastAttrs extends StObject {
  
  var attrs: CastAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: CastInputs
}
object AttrsCastAttrs {
  
  inline def apply(attrs: CastAttrs, backend: MathBackendWebGL, inputs: CastInputs): AttrsCastAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsCastAttrs]
  }
  
  extension [Self <: AttrsCastAttrs](x: Self) {
    
    inline def setAttrs(value: CastAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: CastInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
