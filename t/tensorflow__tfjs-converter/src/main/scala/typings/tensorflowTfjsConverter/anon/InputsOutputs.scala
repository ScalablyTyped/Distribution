package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsOutputs extends StObject {
  
  var inputs: Input10
  
  var outputs: Identity10
}
object InputsOutputs {
  
  inline def apply(inputs: Input10, outputs: Identity10): InputsOutputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsOutputs]
  }
  
  extension [Self <: InputsOutputs](x: Self) {
    
    inline def setInputs(value: Input10): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: Identity10): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
  }
}
