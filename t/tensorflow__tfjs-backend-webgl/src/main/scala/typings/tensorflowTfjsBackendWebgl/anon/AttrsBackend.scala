package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.CastAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.CastInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsBackend extends StObject {
  
  var attrs: CastAttrs = js.native
  
  var backend: MathBackendWebGL = js.native
  
  var inputs: CastInputs = js.native
}
object AttrsBackend {
  
  @scala.inline
  def apply(attrs: CastAttrs, backend: MathBackendWebGL, inputs: CastInputs): AttrsBackend = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBackend]
  }
  
  @scala.inline
  implicit class AttrsBackendMutableBuilder[Self <: AttrsBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: CastAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: CastInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
