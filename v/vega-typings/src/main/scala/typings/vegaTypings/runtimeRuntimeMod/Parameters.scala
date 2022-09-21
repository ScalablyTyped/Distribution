package typings.vegaTypings.runtimeRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters
  extends StObject
     with /* name */ StringDictionary[Parameter] {
  
  /**
    * If pulse is a param, it must be a ref
    */
  var pulse: js.UndefOr[OperatorParam | js.Array[OperatorParam]] = js.undefined
}
object Parameters {
  
  inline def apply(): Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameters]
  }
  
  extension [Self <: Parameters](x: Self) {
    
    inline def setPulse(value: OperatorParam | js.Array[OperatorParam]): Self = StObject.set(x, "pulse", value.asInstanceOf[js.Any])
    
    inline def setPulseUndefined: Self = StObject.set(x, "pulse", js.undefined)
    
    inline def setPulseVarargs(value: OperatorParam*): Self = StObject.set(x, "pulse", js.Array(value*))
  }
}
