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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Outputs] (val x: Self) extends AnyVal {
    
    inline def setOutputs(value: Identity0): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
  }
}
