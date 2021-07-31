package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.IFFTInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsIFFTInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: IFFTInputs
}
object InputsIFFTInputs {
  
  @scala.inline
  def apply(backend: MathBackendWebGL, inputs: IFFTInputs): InputsIFFTInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsIFFTInputs]
  }
  
  @scala.inline
  implicit class InputsIFFTInputsMutableBuilder[Self <: InputsIFFTInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: IFFTInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
