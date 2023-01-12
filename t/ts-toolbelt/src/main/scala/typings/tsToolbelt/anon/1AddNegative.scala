package typings.tsToolbelt.anon

import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outNumberAddMod.AddNegative
import typings.tsToolbelt.outNumberAddMod.AddPositive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1AddNegative`[N1 /* <: Iteration */, N2 /* <: Iteration */] extends StObject {
  
  var `0`: AddPositive[N1, N2]
  
  var `1`: AddNegative[N1, N2]
}
object `1AddNegative` {
  
  inline def apply[N1 /* <: Iteration */, N2 /* <: Iteration */](`0`: AddPositive[N1, N2], `1`: AddNegative[N1, N2]): `1AddNegative`[N1, N2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1AddNegative`[N1, N2]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1AddNegative`[?, ?], N1 /* <: Iteration */, N2 /* <: Iteration */] (val x: Self & (`1AddNegative`[N1, N2])) extends AnyVal {
    
    inline def set0(value: AddPositive[N1, N2]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: AddNegative[N1, N2]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
