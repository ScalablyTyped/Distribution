package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outputs extends StObject {
  
  var outputs: Identity0
}
object Outputs {
  
  inline def apply(outputs: Identity0): Outputs = {
    val __obj = js.Dynamic.literal(outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outputs]
  }
  
  extension [Self <: Outputs](x: Self) {
    
    inline def setOutputs(value: Identity0): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
  }
}
