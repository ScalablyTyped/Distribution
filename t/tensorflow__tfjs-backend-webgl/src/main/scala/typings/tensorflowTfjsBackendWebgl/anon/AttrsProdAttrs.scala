package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.ProdAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.ProdInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsProdAttrs extends StObject {
  
  var attrs: ProdAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: ProdInputs
}
object AttrsProdAttrs {
  
  inline def apply(attrs: ProdAttrs, backend: MathBackendWebGL, inputs: ProdInputs): AttrsProdAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsProdAttrs]
  }
  
  extension [Self <: AttrsProdAttrs](x: Self) {
    
    inline def setAttrs(value: ProdAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ProdInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
