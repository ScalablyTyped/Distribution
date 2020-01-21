package typings.typescriptCompare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Any[Type] = typings.typescriptLogic.mod.And[
    typings.typescriptCompare.mod.prv.Extends[Type, typings.typescriptCompare.typescriptCompareNumbers.`0`], 
    typings.typescriptCompare.mod.prv.Extends[Type, typings.typescriptCompare.typescriptCompareNumbers.`1`]
  ]
  type Compare[A, B, Options /* <: typings.typescriptCompare.mod.Compare.Options */] = typings.typescriptLogic.mod.If[
    typings.typescriptCompare.mod.Extends[A, B], 
    typings.typescriptLogic.mod.If[
      typings.typescriptCompare.mod.Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['equal' | 'broaderRight' | 'broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderRight'] */ js.Any
    ], 
    typings.typescriptLogic.mod.If[
      typings.typescriptCompare.mod.Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['mismatch'] */ js.Any
    ]
  ]
  type Equal[A, B] = typings.typescriptLogic.mod.Or[
    typings.typescriptLogic.mod.And[typings.typescriptCompare.mod.Any[A], typings.typescriptCompare.mod.Any[B]], 
    typings.typescriptLogic.mod.And[
      typings.typescriptLogic.mod.And[
        typings.typescriptCompare.mod.NotAny[
          A, 
          typings.typescriptCompare.typescriptCompareBooleans.`true`, 
          typings.typescriptCompare.typescriptCompareBooleans.`true`
        ], 
        typings.typescriptCompare.mod.NotAny[
          B, 
          typings.typescriptCompare.typescriptCompareBooleans.`true`, 
          typings.typescriptCompare.typescriptCompareBooleans.`true`
        ]
      ], 
      typings.typescriptLogic.mod.And[
        typings.typescriptCompare.mod.Extends[A, B], 
        typings.typescriptCompare.mod.Extends[B, A]
      ]
    ]
  ]
  type Extends[A, B] = typings.typescriptLogic.mod.Or[
    typings.typescriptCompare.mod.Any[B], 
    typings.typescriptLogic.mod.If[
      typings.typescriptCompare.mod.Any[A], 
      typings.typescriptCompare.mod.Any[B], 
      typings.typescriptCompare.mod.prv.Extends[A, B]
    ]
  ]
  type NotAny[Type, True, False] = typings.typescriptLogic.mod.Not[typings.typescriptCompare.mod.Any[Type]]
  type NotEqual[A, B] = typings.typescriptLogic.mod.Not[typings.typescriptCompare.mod.Equal[A, B]]
}
