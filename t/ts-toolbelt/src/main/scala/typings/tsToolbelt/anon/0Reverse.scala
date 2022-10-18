package typings.tsToolbelt.anon

import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outIterationNextMod.Next
import typings.tsToolbelt.outListPrependMod.Prepend
import typings.tsToolbelt.outListReverseMod.__Reverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0Reverse`[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, LO /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */] extends StObject {
  
  var `0`: __Reverse[
    L, 
    Prepend[
      LO, 
      /* import warning: importer.ImportType#apply Failed type conversion: L[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
    ], 
    Next[I]
  ]
  
  var `1`: LO
}
object `0Reverse` {
  
  inline def apply[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, LO /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */](
    `0`: __Reverse[
      L, 
      Prepend[
        LO, 
        /* import warning: importer.ImportType#apply Failed type conversion: L[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
      ], 
      Next[I]
    ],
    `1`: LO
  ): `0Reverse`[L, LO, I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0Reverse`[L, LO, I]]
  }
  
  extension [Self <: `0Reverse`[?, ?, ?], L /* <: typings.tsToolbelt.outListListMod.List[Any] */, LO /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */](x: Self & (`0Reverse`[L, LO, I])) {
    
    inline def set0(
      value: __Reverse[
          L, 
          Prepend[
            LO, 
            /* import warning: importer.ImportType#apply Failed type conversion: L[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
          ], 
          Next[I]
        ]
    ): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: LO): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
