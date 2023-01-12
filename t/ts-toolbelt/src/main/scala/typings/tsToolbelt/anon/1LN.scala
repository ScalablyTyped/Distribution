package typings.tsToolbelt.anon

import typings.tsToolbelt.outListPrependMod.Prepend
import typings.tsToolbelt.outUnionExcludeMod.Exclude
import typings.tsToolbelt.outUnionLastMod.Last
import typings.tsToolbelt.outUnionListOfMod._ListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1LN`[U, LastU, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */] extends StObject {
  
  var `0`: _ListOf[Exclude[U, LastU], Prepend[LN, LastU], Last[Exclude[U, LastU]]]
  
  var `1`: LN
}
object `1LN` {
  
  inline def apply[U, LastU, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */](`0`: _ListOf[Exclude[U, LastU], Prepend[LN, LastU], Last[Exclude[U, LastU]]], `1`: LN): `1LN`[U, LastU, LN] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1LN`[U, LastU, LN]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1LN`[?, ?, ?], U, LastU, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */] (val x: Self & (`1LN`[U, LastU, LN])) extends AnyVal {
    
    inline def set0(value: _ListOf[Exclude[U, LastU], Prepend[LN, LastU], Last[Exclude[U, LastU]]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: LN): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
