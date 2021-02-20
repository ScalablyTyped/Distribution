package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attrs extends StObject {
  
  var attrs: AvgPoolAttrs = js.native
  
  var backend: MathBackendWebGL = js.native
  
  var inputs: AvgPoolInputs = js.native
}
object Attrs {
  
  @scala.inline
  def apply(attrs: AvgPoolAttrs, backend: MathBackendWebGL, inputs: AvgPoolInputs): Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
  
  @scala.inline
  implicit class AttrsMutableBuilder[Self <: Attrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: AvgPoolAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: AvgPoolInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
