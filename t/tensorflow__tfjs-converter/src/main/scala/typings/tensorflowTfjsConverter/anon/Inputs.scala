package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inputs extends StObject {
  
  var inputs: Unknown0
  
  var outputs: Output0
}
object Inputs {
  
  inline def apply(inputs: Unknown0, outputs: Output0): Inputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inputs] (val x: Self) extends AnyVal {
    
    inline def setInputs(value: Unknown0): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: Output0): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
  }
}
