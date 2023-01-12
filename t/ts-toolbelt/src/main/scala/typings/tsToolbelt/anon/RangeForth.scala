package typings.tsToolbelt.anon

import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outIterationNextMod.Next
import typings.tsToolbelt.outIterationPrevMod.Prev
import typings.tsToolbelt.outNumberRangeMod.RangeBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeForth[To /* <: Iteration */, From /* <: Iteration */] extends StObject {
  
  @JSName("->")
  var `-Greaterthansign`: typings.tsToolbelt.outNumberRangeMod.RangeForth[To, Prev[From], js.Array[Any]]
  
  @JSName("<-")
  var `Lessthansign-`: RangeBack[From, Next[To], js.Array[Any]]
}
object RangeForth {
  
  inline def apply[To /* <: Iteration */, From /* <: Iteration */](
    `-Greaterthansign`: typings.tsToolbelt.outNumberRangeMod.RangeForth[To, Prev[From], js.Array[Any]],
    `Lessthansign-`: RangeBack[From, Next[To], js.Array[Any]]
  ): RangeForth[To, From] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("->")(`-Greaterthansign`.asInstanceOf[js.Any])
    __obj.updateDynamic("<-")(`Lessthansign-`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeForth[To, From]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeForth[?, ?], To /* <: Iteration */, From /* <: Iteration */] (val x: Self & (RangeForth[To, From])) extends AnyVal {
    
    inline def `set-Greaterthansign`(value: typings.tsToolbelt.outNumberRangeMod.RangeForth[To, Prev[From], js.Array[Any]]): Self = StObject.set(x, "->", value.asInstanceOf[js.Any])
    
    inline def `setLessthansign-`(value: RangeBack[From, Next[To], js.Array[Any]]): Self = StObject.set(x, "<-", value.asInstanceOf[js.Any])
  }
}
