package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.CumprodAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.CumprodInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsCumprodAttrs extends StObject {
  
  var attrs: CumprodAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: CumprodInputs
}
object AttrsCumprodAttrs {
  
  inline def apply(attrs: CumprodAttrs, backend: MathBackendWebGL, inputs: CumprodInputs): AttrsCumprodAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsCumprodAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsCumprodAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: CumprodAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: CumprodInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
