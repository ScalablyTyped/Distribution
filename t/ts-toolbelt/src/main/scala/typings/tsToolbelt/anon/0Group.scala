package typings.tsToolbelt.anon

import typings.tsToolbelt.outListAppendMod.Append
import typings.tsToolbelt.outListDropMod._Drop
import typings.tsToolbelt.outListGroupMod.__Group
import typings.tsToolbelt.outListTakeMod._Take
import typings.tsToolbelt.tsToolbeltStrings.`-Greaterthansign`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0Group`[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Double */, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */] extends StObject {
  
  var `0`: __Group[_Drop[L, N, `-Greaterthansign`], N, Append[LN, _Take[L, N, `-Greaterthansign`]]]
  
  var `1`: LN
}
object `0Group` {
  
  inline def apply[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Double */, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */](
    `0`: __Group[_Drop[L, N, `-Greaterthansign`], N, Append[LN, _Take[L, N, `-Greaterthansign`]]],
    `1`: LN
  ): `0Group`[L, N, LN] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0Group`[L, N, LN]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0Group`[?, ?, ?], L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Double */, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */] (val x: Self & (`0Group`[L, N, LN])) extends AnyVal {
    
    inline def set0(value: __Group[_Drop[L, N, `-Greaterthansign`], N, Append[LN, _Take[L, N, `-Greaterthansign`]]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: LN): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
