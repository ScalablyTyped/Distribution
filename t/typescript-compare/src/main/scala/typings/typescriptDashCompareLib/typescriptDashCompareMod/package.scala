package typings
package typescriptDashCompareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typescriptDashCompareMod {
  type Any[Type] = typescriptDashLogicLib.typescriptDashLogicMod.And[
    typescriptDashCompareLib.typescriptDashCompareMod.prvNs.Extends[Type, typescriptDashCompareLib.typescriptDashCompareLibNumbers.`0`], 
    typescriptDashCompareLib.typescriptDashCompareMod.prvNs.Extends[Type, typescriptDashCompareLib.typescriptDashCompareLibNumbers.`1`]
  ]
  type Compare[A, B, Options /* <: typescriptDashCompareLib.typescriptDashCompareMod.CompareNs.Options */] = typescriptDashLogicLib.typescriptDashLogicMod.If[
    Extends[A, B], 
    typescriptDashLogicLib.typescriptDashLogicMod.If[
      Extends[B, A], 
      /* import warning: ImportType.apply Failed type conversion: Options['equal' | 'broaderRight' | 'broaderLeft'] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: Options['broaderRight'] */ js.Any
    ], 
    typescriptDashLogicLib.typescriptDashLogicMod.If[
      Extends[B, A], 
      /* import warning: ImportType.apply Failed type conversion: Options['broaderLeft'] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: Options['mismatch'] */ js.Any
    ]
  ]
  type Equal[A, B] = typescriptDashLogicLib.typescriptDashLogicMod.Or[
    typescriptDashLogicLib.typescriptDashLogicMod.And[Any[A], Any[B]], 
    typescriptDashLogicLib.typescriptDashLogicMod.And[
      typescriptDashLogicLib.typescriptDashLogicMod.And[
        NotAny[
          A, 
          typescriptDashCompareLib.typescriptDashCompareLibNumbers.`true`, 
          typescriptDashCompareLib.typescriptDashCompareLibNumbers.`true`
        ], 
        NotAny[
          B, 
          typescriptDashCompareLib.typescriptDashCompareLibNumbers.`true`, 
          typescriptDashCompareLib.typescriptDashCompareLibNumbers.`true`
        ]
      ], 
      typescriptDashLogicLib.typescriptDashLogicMod.And[Extends[A, B], Extends[B, A]]
    ]
  ]
  type Extends[A, B] = typescriptDashLogicLib.typescriptDashLogicMod.Or[
    Any[B], 
    typescriptDashLogicLib.typescriptDashLogicMod.If[
      Any[A], 
      Any[B], 
      typescriptDashCompareLib.typescriptDashCompareMod.prvNs.Extends[A, B]
    ]
  ]
  type NotAny[Type, True, False] = typescriptDashLogicLib.typescriptDashLogicMod.Not[Any[Type]]
  type NotEqual[A, B] = typescriptDashLogicLib.typescriptDashLogicMod.Not[Equal[A, B]]
}
