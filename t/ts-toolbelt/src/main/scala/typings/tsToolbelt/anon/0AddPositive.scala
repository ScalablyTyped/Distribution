package typings.tsToolbelt.anon

import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outIterationIterationOfMod.IterationOf
import typings.tsToolbelt.outIterationNextMod.Next
import typings.tsToolbelt.outIterationPrevMod.Prev
import typings.tsToolbelt.outNumberAddMod._AddPositive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0AddPositive`[N1 /* <: Iteration */, N2 /* <: Iteration */] extends StObject {
  
  var `0`: _AddPositive[Next[N1], Prev[N2]]
  
  var `1`: N1
  
  var `2`: IterationOf[Double]
}
object `0AddPositive` {
  
  inline def apply[N1 /* <: Iteration */, N2 /* <: Iteration */](`0`: _AddPositive[Next[N1], Prev[N2]], `1`: N1, `2`: IterationOf[Double]): `0AddPositive`[N1, N2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0AddPositive`[N1, N2]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0AddPositive`[?, ?], N1 /* <: Iteration */, N2 /* <: Iteration */] (val x: Self & (`0AddPositive`[N1, N2])) extends AnyVal {
    
    inline def set0(value: _AddPositive[Next[N1], Prev[N2]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: N1): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: IterationOf[Double]): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
  }
}
