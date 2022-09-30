package typings.tsToolbelt.anon

import typings.tsToolbelt.concatMod.Concat
import typings.tsToolbelt.curryMod.GapOf
import typings.tsToolbelt.curryMod.JoinParams
import typings.tsToolbelt.curryMod._GapsOf
import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.nextMod.Next
import typings.tsToolbelt.tailMod.Tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0GapsOf`[L1 /* <: typings.tsToolbelt.listMod.List[Any] */, L2 /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */, LN /* <: typings.tsToolbelt.listMod.List[Any] */, I /* <: Iteration */, L2D /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */] extends StObject {
  
  var `0`: _GapsOf[L1, L2, GapOf[L1, L2, LN, I], Tail[L2D], Next[I]]
  
  var `1`: Concat[LN, JoinParams[L2D]]
}
object `0GapsOf` {
  
  inline def apply[L1 /* <: typings.tsToolbelt.listMod.List[Any] */, L2 /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */, LN /* <: typings.tsToolbelt.listMod.List[Any] */, I /* <: Iteration */, L2D /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */](`0`: _GapsOf[L1, L2, GapOf[L1, L2, LN, I], Tail[L2D], Next[I]], `1`: Concat[LN, JoinParams[L2D]]): `0GapsOf`[L1, L2, LN, I, L2D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0GapsOf`[L1, L2, LN, I, L2D]]
  }
  
  extension [Self <: `0GapsOf`[?, ?, ?, ?, ?], L1 /* <: typings.tsToolbelt.listMod.List[Any] */, L2 /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */, LN /* <: typings.tsToolbelt.listMod.List[Any] */, I /* <: Iteration */, L2D /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */](x: Self & (`0GapsOf`[L1, L2, LN, I, L2D])) {
    
    inline def set0(value: _GapsOf[L1, L2, GapOf[L1, L2, LN, I], Tail[L2D], Next[I]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: Concat[LN, JoinParams[L2D]]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set1Varargs(value: LN*): Self = StObject.set(x, "1", js.Array(value*))
  }
}
