package typings.tsToolbelt.anon

import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outIterationNextMod.Next
import typings.tsToolbelt.outListPrependMod.Prepend
import typings.tsToolbelt.outListRepeatMod.__Repeat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0Repeat`[N /* <: Double */, A, L /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */] extends StObject {
  
  var `0`: __Repeat[N, A, Prepend[L, A], Next[I]]
  
  var `1`: L
}
object `0Repeat` {
  
  inline def apply[N /* <: Double */, A, L /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */](`0`: __Repeat[N, A, Prepend[L, A], Next[I]], `1`: L): `0Repeat`[N, A, L, I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0Repeat`[N, A, L, I]]
  }
  
  extension [Self <: `0Repeat`[?, ?, ?, ?], N /* <: Double */, A, L /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */](x: Self & (`0Repeat`[N, A, L, I])) {
    
    inline def set0(value: __Repeat[N, A, Prepend[L, A], Next[I]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: L): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
