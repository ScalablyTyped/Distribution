package typings.tsToolbelt.anon

import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outIterationPrevMod.Prev
import typings.tsToolbelt.outListDropMod.DropForth
import typings.tsToolbelt.outListTailMod.Tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0DropForth`[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */] extends StObject {
  
  var `0`: DropForth[Tail[L], Prev[N]]
  
  var `1`: L
}
object `0DropForth` {
  
  inline def apply[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */](`0`: DropForth[Tail[L], Prev[N]], `1`: L): `0DropForth`[L, N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0DropForth`[L, N]]
  }
  
  extension [Self <: `0DropForth`[?, ?], L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */](x: Self & (`0DropForth`[L, N])) {
    
    inline def set0(value: DropForth[Tail[L], Prev[N]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: L): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
