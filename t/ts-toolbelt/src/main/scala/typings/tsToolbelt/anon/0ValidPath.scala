package typings.tsToolbelt.anon

import typings.tsToolbelt.outAnyAtMod.At
import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outFunctionValidPathMod.ValidatePath
import typings.tsToolbelt.outFunctionValidPathMod.__ValidPath
import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outIterationNextMod.Next
import typings.tsToolbelt.outUnionNonNullableMod.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0ValidPath`[O, Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, I /* <: Iteration */] extends StObject {
  
  var `0`: __ValidPath[
    NonNullable[
      At[
        O, 
        /* import warning: importer.ImportType#apply Failed type conversion: Path[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
      ]
    ], 
    ValidatePath[O, Path, I], 
    Next[I]
  ]
  
  var `1`: Path
}
object `0ValidPath` {
  
  inline def apply[O, Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, I /* <: Iteration */](
    `0`: __ValidPath[
      NonNullable[
        At[
          O, 
          /* import warning: importer.ImportType#apply Failed type conversion: Path[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
        ]
      ], 
      ValidatePath[O, Path, I], 
      Next[I]
    ],
    `1`: Path
  ): `0ValidPath`[O, Path, I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0ValidPath`[O, Path, I]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0ValidPath`[?, ?, ?], O, Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, I /* <: Iteration */] (val x: Self & (`0ValidPath`[O, Path, I])) extends AnyVal {
    
    inline def set0(
      value: __ValidPath[
          NonNullable[
            At[
              O, 
              /* import warning: importer.ImportType#apply Failed type conversion: Path[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
            ]
          ], 
          ValidatePath[O, Path, I], 
          Next[I]
        ]
    ): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: Path): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
