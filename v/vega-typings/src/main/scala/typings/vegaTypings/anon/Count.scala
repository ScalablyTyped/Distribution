package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecEncodeMod._ColorValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count
  extends StObject
     with _ColorValueRef {
  
  var count: js.UndefOr[Double] = js.undefined
  
  var gradient: typings.vegaTypings.typesSpecEncodeMod.Field
  
  var start: js.UndefOr[js.Array[Double]] = js.undefined
  
  var stop: js.UndefOr[js.Array[Double]] = js.undefined
}
object Count {
  
  inline def apply(gradient: typings.vegaTypings.typesSpecEncodeMod.Field): Count = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setGradient(value: typings.vegaTypings.typesSpecEncodeMod.Field): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setStart(value: js.Array[Double]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStartVarargs(value: Double*): Self = StObject.set(x, "start", js.Array(value*))
    
    inline def setStop(value: js.Array[Double]): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setStopVarargs(value: Double*): Self = StObject.set(x, "stop", js.Array(value*))
  }
}
