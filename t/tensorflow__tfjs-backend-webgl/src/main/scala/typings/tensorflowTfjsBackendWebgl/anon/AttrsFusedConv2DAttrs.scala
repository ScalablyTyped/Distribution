package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.FusedConv2DAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.FusedConv2DInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsFusedConv2DAttrs extends StObject {
  
  var attrs: FusedConv2DAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: FusedConv2DInputs
}
object AttrsFusedConv2DAttrs {
  
  inline def apply(attrs: FusedConv2DAttrs, backend: MathBackendWebGL, inputs: FusedConv2DInputs): AttrsFusedConv2DAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsFusedConv2DAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsFusedConv2DAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: FusedConv2DAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: FusedConv2DInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
