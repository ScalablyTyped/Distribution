package typings.tsToolbelt.anon

import typings.tsToolbelt.appendMod.Append
import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.nextMod.Next
import typings.tsToolbelt.zipMod.__Zip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0Zip`[L /* <: typings.tsToolbelt.listMod.List[Any] */, L1 /* <: typings.tsToolbelt.listMod.List[Any] */, LN /* <: typings.tsToolbelt.listMod.List[Any] */, I /* <: Iteration */] extends StObject {
  
  var `0`: __Zip[
    L, 
    L1, 
    Append[
      LN, 
      js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: L[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: L1[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
      ]
    ], 
    Next[I]
  ]
  
  var `1`: LN
}
object `0Zip` {
  
  inline def apply[L /* <: typings.tsToolbelt.listMod.List[Any] */, L1 /* <: typings.tsToolbelt.listMod.List[Any] */, LN /* <: typings.tsToolbelt.listMod.List[Any] */, I /* <: Iteration */](
    `0`: __Zip[
      L, 
      L1, 
      Append[
        LN, 
        js.Tuple2[
          /* import warning: importer.ImportType#apply Failed type conversion: L[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: L1[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
        ]
      ], 
      Next[I]
    ],
    `1`: LN
  ): `0Zip`[L, L1, LN, I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0Zip`[L, L1, LN, I]]
  }
  
  extension [Self <: `0Zip`[?, ?, ?, ?], L /* <: typings.tsToolbelt.listMod.List[Any] */, L1 /* <: typings.tsToolbelt.listMod.List[Any] */, LN /* <: typings.tsToolbelt.listMod.List[Any] */, I /* <: Iteration */](x: Self & (`0Zip`[L, L1, LN, I])) {
    
    inline def set0(
      value: __Zip[
          L, 
          L1, 
          Append[
            LN, 
            js.Tuple2[
              /* import warning: importer.ImportType#apply Failed type conversion: L[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: L1[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
            ]
          ], 
          Next[I]
        ]
    ): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: LN): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
