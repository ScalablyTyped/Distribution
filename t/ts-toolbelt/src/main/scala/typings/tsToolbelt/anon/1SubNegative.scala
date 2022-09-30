package typings.tsToolbelt.anon

import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.subMod.SubNegative
import typings.tsToolbelt.subMod.SubPositive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1SubNegative`[N1 /* <: Iteration */, N2 /* <: Iteration */] extends StObject {
  
  var `0`: SubPositive[N1, N2]
  
  var `1`: SubNegative[N1, N2]
}
object `1SubNegative` {
  
  inline def apply[N1 /* <: Iteration */, N2 /* <: Iteration */](`0`: SubPositive[N1, N2], `1`: SubNegative[N1, N2]): `1SubNegative`[N1, N2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1SubNegative`[N1, N2]]
  }
  
  extension [Self <: `1SubNegative`[?, ?], N1 /* <: Iteration */, N2 /* <: Iteration */](x: Self & (`1SubNegative`[N1, N2])) {
    
    inline def set0(value: SubPositive[N1, N2]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: SubNegative[N1, N2]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
