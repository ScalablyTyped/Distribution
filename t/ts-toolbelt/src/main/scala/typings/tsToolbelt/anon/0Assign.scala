package typings.tsToolbelt.anon

import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outIterationNextMod.Next
import typings.tsToolbelt.outObjectAssignMod.__Assign
import typings.tsToolbelt.outObjectInternalMod.Depth
import typings.tsToolbelt.outObjectMergeMod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0Assign`[Os /* <: typings.tsToolbelt.outListListMod.List[js.Object] */, I /* <: Iteration */, O /* <: js.Object */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */] extends StObject {
  
  var `0`: __Assign[
    Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: Os[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any, 
      O, 
      depth, 
      ignore, 
      fill
    ], 
    Os, 
    depth, 
    ignore, 
    fill, 
    Next[I]
  ]
  
  var `1`: O
}
object `0Assign` {
  
  inline def apply[Os /* <: typings.tsToolbelt.outListListMod.List[js.Object] */, I /* <: Iteration */, O /* <: js.Object */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */](
    `0`: __Assign[
      Merge[
        /* import warning: importer.ImportType#apply Failed type conversion: Os[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any, 
        O, 
        depth, 
        ignore, 
        fill
      ], 
      Os, 
      depth, 
      ignore, 
      fill, 
      Next[I]
    ],
    `1`: O
  ): `0Assign`[Os, I, O, depth, ignore, fill] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0Assign`[Os, I, O, depth, ignore, fill]]
  }
  
  extension [Self <: `0Assign`[?, ?, ?, ?, ?, ?], Os /* <: typings.tsToolbelt.outListListMod.List[js.Object] */, I /* <: Iteration */, O /* <: js.Object */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */](x: Self & (`0Assign`[Os, I, O, depth, ignore, fill])) {
    
    inline def set0(
      value: __Assign[
          Merge[
            /* import warning: importer.ImportType#apply Failed type conversion: Os[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any, 
            O, 
            depth, 
            ignore, 
            fill
          ], 
          Os, 
          depth, 
          ignore, 
          fill, 
          Next[I]
        ]
    ): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: O): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
