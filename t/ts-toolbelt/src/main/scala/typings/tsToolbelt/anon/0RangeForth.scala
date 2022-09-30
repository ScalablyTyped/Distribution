package typings.tsToolbelt.anon

import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.posMod.Pos
import typings.tsToolbelt.prependMod.Prepend
import typings.tsToolbelt.prevMod.Prev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0RangeForth`[From /* <: Iteration */, To /* <: Iteration */, L /* <: typings.tsToolbelt.listMod.List[Any] */] extends StObject {
  
  var `0`: typings.tsToolbelt.rangeMod.RangeForth[Prev[From], To, Prepend[L, Pos[From]]]
  
  var `1`: L
}
object `0RangeForth` {
  
  inline def apply[From /* <: Iteration */, To /* <: Iteration */, L /* <: typings.tsToolbelt.listMod.List[Any] */](`0`: typings.tsToolbelt.rangeMod.RangeForth[Prev[From], To, Prepend[L, Pos[From]]], `1`: L): `0RangeForth`[From, To, L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0RangeForth`[From, To, L]]
  }
  
  extension [Self <: `0RangeForth`[?, ?, ?], From /* <: Iteration */, To /* <: Iteration */, L /* <: typings.tsToolbelt.listMod.List[Any] */](x: Self & (`0RangeForth`[From, To, L])) {
    
    inline def set0(value: typings.tsToolbelt.rangeMod.RangeForth[Prev[From], To, Prepend[L, Pos[From]]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: L): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
