package typings.tsToolbelt.anon

import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outIterationPrevMod.Prev
import typings.tsToolbelt.outListDropMod.DropBack
import typings.tsToolbelt.outListDropMod.DropForth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */] extends StObject {
  
  @JSName("->")
  var `-Greaterthansign`: DropForth[L, N]
  
  @JSName("<-")
  var `Lessthansign-`: DropBack[L, N, Prev[N], js.Array[Any]]
}
object _empty {
  
  inline def apply[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */](`-Greaterthansign`: DropForth[L, N], `Lessthansign-`: DropBack[L, N, Prev[N], js.Array[Any]]): _empty[L, N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("->")(`-Greaterthansign`.asInstanceOf[js.Any])
    __obj.updateDynamic("<-")(`Lessthansign-`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty[L, N]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: _empty[?, ?], L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */] (val x: Self & (_empty[L, N])) extends AnyVal {
    
    inline def `set-Greaterthansign`(value: DropForth[L, N]): Self = StObject.set(x, "->", value.asInstanceOf[js.Any])
    
    inline def `setLessthansign-`(value: DropBack[L, N, Prev[N], js.Array[Any]]): Self = StObject.set(x, "<-", value.asInstanceOf[js.Any])
  }
}
