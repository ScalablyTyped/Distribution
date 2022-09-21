package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionTypesType[P, B, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Defaults] extends StObject {
  
  var B: B
  
  var C: C
  
  var D: D
  
  var Defaults: Defaults
  
  var M: M
  
  var P: P
}
object OptionTypesType {
  
  inline def apply[P, B, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Defaults](B: B, C: C, D: D, Defaults: Defaults, M: M, P: P): OptionTypesType[P, B, D, C, M, Defaults] = {
    val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], C = C.asInstanceOf[js.Any], D = D.asInstanceOf[js.Any], Defaults = Defaults.asInstanceOf[js.Any], M = M.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionTypesType[P, B, D, C, M, Defaults]]
  }
  
  extension [Self <: OptionTypesType[?, ?, ?, ?, ?, ?], P, B, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Defaults](x: Self & (OptionTypesType[P, B, D, C, M, Defaults])) {
    
    inline def setB(value: B): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
    
    inline def setC(value: C): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
    
    inline def setD(value: D): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
    
    inline def setDefaults(value: Defaults): Self = StObject.set(x, "Defaults", value.asInstanceOf[js.Any])
    
    inline def setM(value: M): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
    
    inline def setP(value: P): Self = StObject.set(x, "P", value.asInstanceOf[js.Any])
  }
}
