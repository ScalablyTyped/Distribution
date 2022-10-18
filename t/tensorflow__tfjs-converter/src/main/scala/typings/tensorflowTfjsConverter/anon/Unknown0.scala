package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unknown0 extends StObject {
  
  var input: TensorShape
  
  @JSName("unknown:0")
  var unknownColon0: ResourceId
}
object Unknown0 {
  
  inline def apply(input: TensorShape, unknownColon0: ResourceId): Unknown0 = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.updateDynamic("unknown:0")(unknownColon0.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unknown0]
  }
  
  extension [Self <: Unknown0](x: Self) {
    
    inline def setInput(value: TensorShape): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setUnknownColon0(value: ResourceId): Self = StObject.set(x, "unknown:0", value.asInstanceOf[js.Any])
  }
}
