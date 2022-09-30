package typings.tsToolbelt.anon

import typings.tsToolbelt.includesDeepMod._IncludesDeep
import typings.tsToolbelt.internalMod.Match
import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.nextMod.Next
import typings.tsToolbelt.objectUnionOfMod.UnionOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `012`[O, M /* <: Any */, `match` /* <: Match */, limit /* <: Double */, I /* <: Iteration */] extends StObject {
  
  var `0`: _IncludesDeep[O | UnionOf[O], M, `match`, limit, Next[I]]
  
  var `1`: typings.tsToolbelt.tsToolbeltInts.`1`
  
  var `2`: typings.tsToolbelt.tsToolbeltInts.`0`
}
object `012` {
  
  inline def apply[O, M /* <: Any */, `match` /* <: Match */, limit /* <: Double */, I /* <: Iteration */](`0`: _IncludesDeep[O | UnionOf[O], M, `match`, limit, Next[I]]): `012`[O, M, `match`, limit, I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(1)
    __obj.updateDynamic("2")(0)
    __obj.asInstanceOf[`012`[O, M, `match`, limit, I]]
  }
  
  extension [Self <: `012`[?, ?, ?, ?, ?], O, M /* <: Any */, `match` /* <: Match */, limit /* <: Double */, I /* <: Iteration */](x: Self & (`012`[O, M, `match`, limit, I])) {
    
    inline def set0(value: _IncludesDeep[O | UnionOf[O], M, `match`, limit, Next[I]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: typings.tsToolbelt.tsToolbeltInts.`1`): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: typings.tsToolbelt.tsToolbeltInts.`0`): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
  }
}
