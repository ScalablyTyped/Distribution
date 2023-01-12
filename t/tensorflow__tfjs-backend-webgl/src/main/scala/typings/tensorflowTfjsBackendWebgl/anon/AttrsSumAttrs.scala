package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.SumAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.SumInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsSumAttrs extends StObject {
  
  var attrs: SumAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: SumInputs
}
object AttrsSumAttrs {
  
  inline def apply(attrs: SumAttrs, backend: MathBackendWebGL, inputs: SumInputs): AttrsSumAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSumAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsSumAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: SumAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SumInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
