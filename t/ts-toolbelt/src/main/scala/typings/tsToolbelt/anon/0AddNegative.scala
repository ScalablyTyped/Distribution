package typings.tsToolbelt.anon

import typings.tsToolbelt.addMod._AddNegative
import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.nextMod.Next
import typings.tsToolbelt.prevMod.Prev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0AddNegative`[N1 /* <: Iteration */, N2 /* <: Iteration */] extends StObject {
  
  var `0`: _AddNegative[Prev[N1], Next[N2]]
  
  var `1`: N1
  
  var `2`: Double
}
object `0AddNegative` {
  
  inline def apply[N1 /* <: Iteration */, N2 /* <: Iteration */](`0`: _AddNegative[Prev[N1], Next[N2]], `1`: N1, `2`: Double): `0AddNegative`[N1, N2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0AddNegative`[N1, N2]]
  }
  
  extension [Self <: `0AddNegative`[?, ?], N1 /* <: Iteration */, N2 /* <: Iteration */](x: Self & (`0AddNegative`[N1, N2])) {
    
    inline def set0(value: _AddNegative[Prev[N1], Next[N2]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: N1): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: Double): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
  }
}
