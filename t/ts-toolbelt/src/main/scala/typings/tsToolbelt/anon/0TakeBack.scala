package typings.tsToolbelt.anon

import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.prevMod.Prev
import typings.tsToolbelt.tailMod.Tail
import typings.tsToolbelt.takeMod.TakeBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0TakeBack`[L /* <: typings.tsToolbelt.listMod.List[Any] */, N /* <: Iteration */] extends StObject {
  
  var `0`: TakeBack[Tail[L], Prev[N]]
  
  var `1`: L
}
object `0TakeBack` {
  
  inline def apply[L /* <: typings.tsToolbelt.listMod.List[Any] */, N /* <: Iteration */](`0`: TakeBack[Tail[L], Prev[N]], `1`: L): `0TakeBack`[L, N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0TakeBack`[L, N]]
  }
  
  extension [Self <: `0TakeBack`[?, ?], L /* <: typings.tsToolbelt.listMod.List[Any] */, N /* <: Iteration */](x: Self & (`0TakeBack`[L, N])) {
    
    inline def set0(value: TakeBack[Tail[L], Prev[N]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: L): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
