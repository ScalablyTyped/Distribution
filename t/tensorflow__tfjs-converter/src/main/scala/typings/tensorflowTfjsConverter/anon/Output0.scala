package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Output0 extends StObject {
  
  var output_0: TensorShape
}
object Output0 {
  
  inline def apply(output_0: TensorShape): Output0 = {
    val __obj = js.Dynamic.literal(output_0 = output_0.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output0]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Output0] (val x: Self) extends AnyVal {
    
    inline def setOutput_0(value: TensorShape): Self = StObject.set(x, "output_0", value.asInstanceOf[js.Any])
  }
}
