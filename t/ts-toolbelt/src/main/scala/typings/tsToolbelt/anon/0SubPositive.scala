package typings.tsToolbelt.anon

import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outNumberSubMod.SubNegative
import typings.tsToolbelt.outNumberSubMod.SubPositive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0SubPositive`[N1 /* <: Iteration */, N2 /* <: Iteration */] extends StObject {
  
  var `0`: SubPositive[N1, N2]
  
  var `1`: SubNegative[N1, N2]
}
object `0SubPositive` {
  
  inline def apply[N1 /* <: Iteration */, N2 /* <: Iteration */](`0`: SubPositive[N1, N2], `1`: SubNegative[N1, N2]): `0SubPositive`[N1, N2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0SubPositive`[N1, N2]]
  }
  
  extension [Self <: `0SubPositive`[?, ?], N1 /* <: Iteration */, N2 /* <: Iteration */](x: Self & (`0SubPositive`[N1, N2])) {
    
    inline def set0(value: SubPositive[N1, N2]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: SubNegative[N1, N2]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
