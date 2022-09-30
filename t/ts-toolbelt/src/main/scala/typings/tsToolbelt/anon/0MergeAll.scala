package typings.tsToolbelt.anon

import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.nextMod.Next
import typings.tsToolbelt.objectInternalMod.Depth
import typings.tsToolbelt.objectMergeAllMod.__MergeAll
import typings.tsToolbelt.objectMergeMod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0MergeAll`[O /* <: js.Object */, Os /* <: typings.tsToolbelt.listMod.List[js.Object] */, I /* <: Iteration */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */] extends StObject {
  
  var `0`: __MergeAll[
    Merge[
      O, 
      /* import warning: importer.ImportType#apply Failed type conversion: Os[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any, 
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
object `0MergeAll` {
  
  inline def apply[O /* <: js.Object */, Os /* <: typings.tsToolbelt.listMod.List[js.Object] */, I /* <: Iteration */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */](
    `0`: __MergeAll[
      Merge[
        O, 
        /* import warning: importer.ImportType#apply Failed type conversion: Os[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any, 
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
  ): `0MergeAll`[O, Os, I, depth, ignore, fill] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0MergeAll`[O, Os, I, depth, ignore, fill]]
  }
  
  extension [Self <: `0MergeAll`[?, ?, ?, ?, ?, ?], O /* <: js.Object */, Os /* <: typings.tsToolbelt.listMod.List[js.Object] */, I /* <: Iteration */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */](x: Self & (`0MergeAll`[O, Os, I, depth, ignore, fill])) {
    
    inline def set0(
      value: __MergeAll[
          Merge[
            O, 
            /* import warning: importer.ImportType#apply Failed type conversion: Os[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any, 
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
