package typings.tsToolbelt.anon

import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outIterationPrevMod.Prev
import typings.tsToolbelt.outListTakeMod.TakeBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakeForth[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */] extends StObject {
  
  @JSName("->")
  var `-Greaterthansign`: typings.tsToolbelt.outListTakeMod.TakeForth[L, N, Prev[N], js.Array[Any]]
  
  @JSName("<-")
  var `Lessthansign-`: TakeBack[L, N]
}
object TakeForth {
  
  inline def apply[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */](
    `-Greaterthansign`: typings.tsToolbelt.outListTakeMod.TakeForth[L, N, Prev[N], js.Array[Any]],
    `Lessthansign-`: TakeBack[L, N]
  ): TakeForth[L, N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("->")(`-Greaterthansign`.asInstanceOf[js.Any])
    __obj.updateDynamic("<-")(`Lessthansign-`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeForth[L, N]]
  }
  
  extension [Self <: TakeForth[?, ?], L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */](x: Self & (TakeForth[L, N])) {
    
    inline def `set-Greaterthansign`(value: typings.tsToolbelt.outListTakeMod.TakeForth[L, N, Prev[N], js.Array[Any]]): Self = StObject.set(x, "->", value.asInstanceOf[js.Any])
    
    inline def `setLessthansign-`(value: TakeBack[L, N]): Self = StObject.set(x, "<-", value.asInstanceOf[js.Any])
  }
}
