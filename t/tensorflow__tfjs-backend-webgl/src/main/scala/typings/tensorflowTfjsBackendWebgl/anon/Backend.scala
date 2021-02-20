package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolBackpropAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolBackpropInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backend extends StObject {
  
  var attrs: AvgPoolBackpropAttrs = js.native
  
  var backend: MathBackendWebGL = js.native
  
  var inputs: AvgPoolBackpropInputs = js.native
}
object Backend {
  
  @scala.inline
  def apply(attrs: AvgPoolBackpropAttrs, backend: MathBackendWebGL, inputs: AvgPoolBackpropInputs): Backend = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backend]
  }
  
  @scala.inline
  implicit class BackendMutableBuilder[Self <: Backend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: AvgPoolBackpropAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: AvgPoolBackpropInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
