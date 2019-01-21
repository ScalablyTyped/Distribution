package typings
package typescriptDashCompareLib.typescriptDashCompareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CompareNs {
  type Strict[A, B, Options /* <: Options */] = typescriptDashLogicLib.typescriptDashLogicMod.If[
    typescriptDashCompareLib.typescriptDashCompareMod.Extends[A, B], 
    typescriptDashLogicLib.typescriptDashLogicMod.If[
      typescriptDashCompareLib.typescriptDashCompareMod.Extends[B, A], 
      /* import warning: ImportType.apply Failed type conversion: Options['equal'] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: Options['broaderRight'] */ js.Any
    ], 
    typescriptDashLogicLib.typescriptDashLogicMod.If[
      typescriptDashCompareLib.typescriptDashCompareMod.Extends[B, A], 
      /* import warning: ImportType.apply Failed type conversion: Options['broaderLeft'] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: Options['mismatch'] */ js.Any
    ]
  ]
}
