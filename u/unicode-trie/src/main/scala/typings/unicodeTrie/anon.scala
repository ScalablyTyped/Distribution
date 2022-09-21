package typings.unicodeTrie

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.typedarray.Uint32Array
    
    var errorValue: Double
    
    var highStart: Double
  }
  object Data {
    
    inline def apply(data: js.typedarray.Uint32Array, errorValue: Double, highStart: Double): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errorValue = errorValue.asInstanceOf[js.Any], highStart = highStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.typedarray.Uint32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setErrorValue(value: Double): Self = StObject.set(x, "errorValue", value.asInstanceOf[js.Any])
      
      inline def setHighStart(value: Double): Self = StObject.set(x, "highStart", value.asInstanceOf[js.Any])
    }
  }
}
