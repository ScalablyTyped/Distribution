package typings.typescriptDashCompare.typescriptDashCompareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CompareNs {
  import typings.typescriptDashCompare.typescriptDashCompareMod.Extends
  import typings.typescriptDashLogic.typescriptDashLogicMod.If

  type Strict[A, B, Options /* <: Options */] = If[
    Extends[A, B], 
    If[
      Extends[B, A], 
      /* import warning: ImportType.apply Failed type conversion: Options['equal'] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: Options['broaderRight'] */ js.Any
    ], 
    If[
      Extends[B, A], 
      /* import warning: ImportType.apply Failed type conversion: Options['broaderLeft'] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: Options['mismatch'] */ js.Any
    ]
  ]
}
