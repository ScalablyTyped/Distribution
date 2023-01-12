package typings.tsToolbelt.anon

import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outIterationNextMod.Next
import typings.tsToolbelt.outObjectInternalMod.Depth
import typings.tsToolbelt.outObjectPatchAllMod.__PatchAll
import typings.tsToolbelt.outObjectPatchMod.Patch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0PatchAll`[O /* <: js.Object */, Os /* <: typings.tsToolbelt.outListListMod.List[js.Object] */, I /* <: Iteration */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */] extends StObject {
  
  var `0`: __PatchAll[
    Patch[
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
object `0PatchAll` {
  
  inline def apply[O /* <: js.Object */, Os /* <: typings.tsToolbelt.outListListMod.List[js.Object] */, I /* <: Iteration */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */](
    `0`: __PatchAll[
      Patch[
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
  ): `0PatchAll`[O, Os, I, depth, ignore, fill] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0PatchAll`[O, Os, I, depth, ignore, fill]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0PatchAll`[?, ?, ?, ?, ?, ?], O /* <: js.Object */, Os /* <: typings.tsToolbelt.outListListMod.List[js.Object] */, I /* <: Iteration */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */] (val x: Self & (`0PatchAll`[O, Os, I, depth, ignore, fill])) extends AnyVal {
    
    inline def set0(
      value: __PatchAll[
          Patch[
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
