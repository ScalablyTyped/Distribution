package typings.tsToolbelt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0L1`[L1 /* <: typings.tsToolbelt.listMod.List[Any] */, L /* <: typings.tsToolbelt.listMod.List[Any] */] extends StObject {
  
  var `0`: L1
  
  var `1`: L
}
object `0L1` {
  
  inline def apply[L1 /* <: typings.tsToolbelt.listMod.List[Any] */, L /* <: typings.tsToolbelt.listMod.List[Any] */](`0`: L1, `1`: L): `0L1`[L1, L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0L1`[L1, L]]
  }
  
  extension [Self <: `0L1`[?, ?], L1 /* <: typings.tsToolbelt.listMod.List[Any] */, L /* <: typings.tsToolbelt.listMod.List[Any] */](x: Self & (`0L1`[L1, L])) {
    
    inline def set0(value: L1): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: L): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
