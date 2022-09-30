package typings.tsToolbelt.anon

import typings.tsToolbelt.iterationOfMod.IterationOf
import typings.tsToolbelt.unNestMod.UnNestLoose
import typings.tsToolbelt.unNestMod.UnNestStrict
import typings.tsToolbelt.unionOfMod.UnionOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0UnNestLoose`[L /* <: typings.tsToolbelt.listMod.List[Any] */] extends StObject {
  
  var `0`: UnNestLoose[L]
  
  var `1`: UnNestStrict[L, js.Array[Any], IterationOf[typings.tsToolbelt.tsToolbeltInts.`0`]]
}
object `0UnNestLoose` {
  
  inline def apply[L /* <: typings.tsToolbelt.listMod.List[Any] */](
    `0`: UnNestLoose[L],
    `1`: UnNestStrict[L, js.Array[Any], IterationOf[typings.tsToolbelt.tsToolbeltInts.`0`]]
  ): `0UnNestLoose`[L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0UnNestLoose`[L]]
  }
  
  extension [Self <: `0UnNestLoose`[?], L /* <: typings.tsToolbelt.listMod.List[Any] */](x: Self & `0UnNestLoose`[L]) {
    
    inline def set0(value: UnNestLoose[L]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set0Varargs(value: UnionOf[Any]*): Self = StObject.set(x, "0", js.Array(value*))
    
    inline def set1(value: UnNestStrict[L, js.Array[Any], IterationOf[typings.tsToolbelt.tsToolbeltInts.`0`]]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
