package typings.tsToolbelt.anon

import typings.tsToolbelt.outFunctionCurryMod.GapOf
import typings.tsToolbelt.outFunctionCurryMod.JoinParams
import typings.tsToolbelt.outFunctionCurryMod._GapsOf
import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outIterationNextMod.Next
import typings.tsToolbelt.outListConcatMod.Concat
import typings.tsToolbelt.outListTailMod.Tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0GapsOf`[L1 /* <: typings.tsToolbelt.outListListMod.List[Any] */, L2 /* <: js.Array[typings.tsToolbelt.outListListMod.List[Any]] */, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */, L2D /* <: js.Array[typings.tsToolbelt.outListListMod.List[Any]] */] extends StObject {
  
  var `0`: _GapsOf[L1, L2, GapOf[L1, L2, LN, I], Tail[L2D], Next[I]]
  
  var `1`: Concat[LN, JoinParams[L2D]]
}
object `0GapsOf` {
  
  inline def apply[L1 /* <: typings.tsToolbelt.outListListMod.List[Any] */, L2 /* <: js.Array[typings.tsToolbelt.outListListMod.List[Any]] */, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */, L2D /* <: js.Array[typings.tsToolbelt.outListListMod.List[Any]] */](`0`: _GapsOf[L1, L2, GapOf[L1, L2, LN, I], Tail[L2D], Next[I]], `1`: Concat[LN, JoinParams[L2D]]): `0GapsOf`[L1, L2, LN, I, L2D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0GapsOf`[L1, L2, LN, I, L2D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0GapsOf`[?, ?, ?, ?, ?], L1 /* <: typings.tsToolbelt.outListListMod.List[Any] */, L2 /* <: js.Array[typings.tsToolbelt.outListListMod.List[Any]] */, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */, L2D /* <: js.Array[typings.tsToolbelt.outListListMod.List[Any]] */] (val x: Self & (`0GapsOf`[L1, L2, LN, I, L2D])) extends AnyVal {
    
    inline def set0(value: _GapsOf[L1, L2, GapOf[L1, L2, LN, I], Tail[L2D], Next[I]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: Concat[LN, JoinParams[L2D]]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set1Varargs(value: LN*): Self = StObject.set(x, "1", js.Array(value*))
  }
}
