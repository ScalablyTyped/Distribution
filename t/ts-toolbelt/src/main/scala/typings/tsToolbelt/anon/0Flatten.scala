package typings.tsToolbelt.anon

import typings.tsToolbelt.outBooleanInternalMod.Boolean
import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outIterationNextMod.Next
import typings.tsToolbelt.outListFlattenMod.__Flatten
import typings.tsToolbelt.outListUnNestMod._UnNest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0Flatten`[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, strict /* <: Boolean */, limit /* <: Iteration */, I /* <: Iteration */] extends StObject {
  
  var `0`: __Flatten[_UnNest[L, strict], L, strict, limit, Next[I]]
  
  var `1`: L
}
object `0Flatten` {
  
  inline def apply[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, strict /* <: Boolean */, limit /* <: Iteration */, I /* <: Iteration */](`0`: __Flatten[_UnNest[L, strict], L, strict, limit, Next[I]], `1`: L): `0Flatten`[L, strict, limit, I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0Flatten`[L, strict, limit, I]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0Flatten`[?, ?, ?, ?], L /* <: typings.tsToolbelt.outListListMod.List[Any] */, strict /* <: Boolean */, limit /* <: Iteration */, I /* <: Iteration */] (val x: Self & (`0Flatten`[L, strict, limit, I])) extends AnyVal {
    
    inline def set0(value: __Flatten[_UnNest[L, strict], L, strict, limit, Next[I]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: L): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
