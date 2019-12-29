package typings.typescriptDashCompare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typescriptDashCompareMod {
  import typings.typescriptDashCompare.typescriptDashCompareBooleans.`true`
  import typings.typescriptDashCompare.typescriptDashCompareMod.Compare.Options
  import typings.typescriptDashCompare.typescriptDashCompareNumbers.`0`
  import typings.typescriptDashCompare.typescriptDashCompareNumbers.`1`
  import typings.typescriptDashLogic.typescriptDashLogicMod.And
  import typings.typescriptDashLogic.typescriptDashLogicMod.If
  import typings.typescriptDashLogic.typescriptDashLogicMod.Not
  import typings.typescriptDashLogic.typescriptDashLogicMod.Or

  type Any[Type] = And[
    typings.typescriptDashCompare.typescriptDashCompareMod.prv.Extends[Type, `0`], 
    typings.typescriptDashCompare.typescriptDashCompareMod.prv.Extends[Type, `1`]
  ]
  type Compare[A, B, Options /* <: Options */] = If[
    Extends[A, B], 
    If[
      Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['equal' | 'broaderRight' | 'broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderRight'] */ js.Any
    ], 
    If[
      Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['mismatch'] */ js.Any
    ]
  ]
  type Equal[A, B] = Or[
    And[Any[A], Any[B]], 
    And[
      And[NotAny[A, `true`, `true`], NotAny[B, `true`, `true`]], 
      And[Extends[A, B], Extends[B, A]]
    ]
  ]
  type Extends[A, B] = Or[
    Any[B], 
    If[
      Any[A], 
      Any[B], 
      typings.typescriptDashCompare.typescriptDashCompareMod.prv.Extends[A, B]
    ]
  ]
  type NotAny[Type, True, False] = Not[Any[Type]]
  type NotEqual[A, B] = Not[Equal[A, B]]
}
