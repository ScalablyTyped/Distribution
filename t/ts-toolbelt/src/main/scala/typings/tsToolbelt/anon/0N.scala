package typings.tsToolbelt.anon

import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.negateMod._Negate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0N`[N /* <: Iteration */] extends StObject {
  
  var `0`: N
  
  var `1`: _Negate[N]
}
object `0N` {
  
  inline def apply[N /* <: Iteration */](`0`: N, `1`: _Negate[N]): `0N`[N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0N`[N]]
  }
  
  extension [Self <: `0N`[?], N /* <: Iteration */](x: Self & `0N`[N]) {
    
    inline def set0(value: N): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: _Negate[N]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
