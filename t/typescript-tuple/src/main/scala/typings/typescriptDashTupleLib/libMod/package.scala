package typings
package typescriptDashTupleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMod {
  type AllIndexesEqual[Type, Tuple /* <: js.Array[_] */] = typescriptDashTupleLib.libUtilsMod._IndexesNormalize[
    typescriptDashTupleLib.libUtilsMod._AllIndexesEqual[Type, Tuple, js.Array[js.Any], js.Array[js.Any]]
  ]
  type AllIndexesSubset[Type, Tuple /* <: js.Array[_] */] = typescriptDashTupleLib.libUtilsMod._IndexesNormalize[
    typescriptDashTupleLib.libUtilsMod._AllIndexesSubset[Type, Tuple, js.Array[js.Any], js.Array[js.Any]]
  ]
  type AllIndexesSuperset[Type, Tuple /* <: js.Array[_] */] = typescriptDashTupleLib.libUtilsMod._IndexesNormalize[
    typescriptDashTupleLib.libUtilsMod._AllIndexesSuperset[Type, Tuple, js.Array[js.Any], js.Array[js.Any]]
  ]
  type Append[Tuple /* <: js.Array[_] */, Addend] = Reverse[Prepend[Reverse[Tuple], Addend]]
  type CompareLength[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] = typescriptDashTupleLib.libUtilsMod.CompareLength[Left, Right]
  type Concat[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] = typescriptDashTupleLib.libUtilsMod.Concat[Left, Right]
  type ConcatMultiple[TupleSet /* <: js.Array[js.Array[_]] */] = typescriptDashTupleLib.libUtilsMod.ConcatMultiple[TupleSet]
  type FillTuple[Tuple /* <: js.Array[_] */, Replacement] = typescriptDashTupleLib.libUtilsMod.FillTuple[Tuple, Replacement, js.Array[js.Any]]
  type First[Tuple /* <: js.Array[_] */] = /* import warning: ImportType.apply Failed type conversion: Tuple[0] */ js.Any
  type FirstIndexEqual[Type, Tuple /* <: js.Array[_] */, NotFound] = typescriptDashTupleLib.libUtilsMod.FirstIndexEqual[Type, Tuple, NotFound, js.Array[js.Any]]
  type FirstIndexSubset[Type, Tuple /* <: js.Array[_] */, NotFound] = typescriptDashTupleLib.libUtilsMod.FirstIndexSubset[Type, Tuple, NotFound, js.Array[js.Any]]
  type FirstIndexSuperset[Type, Tuple /* <: js.Array[_] */, NotFound] = typescriptDashTupleLib.libUtilsMod.FirstIndexSuperset[Type, Tuple, NotFound, js.Array[js.Any]]
  type IsFinite[Tuple /* <: js.Array[_] */, Finite, Infinite] = typescriptDashTupleLib.libUtilsMod.IsFinite[Tuple, Finite, Infinite]
  type Last[Tuple /* <: js.Array[_] */] = typescriptDashTupleLib.libUtilsMod.Last[Tuple, scala.Nothing]
  type LastIndexEqual[Type, Tuple /* <: js.Array[_] */, NotFound] = typescriptDashTupleLib.libUtilsMod.LastIndexEqual[Type, Tuple, NotFound]
  type LastIndexSubset[Type, Tuple /* <: js.Array[_] */, NotFound] = typescriptDashTupleLib.libUtilsMod.LastIndexSubset[Type, Tuple, NotFound]
  type LastIndexSuperset[Type, Tuple /* <: js.Array[_] */, NotFound] = typescriptDashTupleLib.libUtilsMod.LastIndexSuperset[Type, Tuple, NotFound]
  type LongestTuple[TupleSet /* <: js.Array[js.Array[_]] */] = typescriptDashTupleLib.libUtilsMod.LongestTuple[TupleSet, js.Array[js.Any]]
  type Prepend[Tuple /* <: js.Array[_] */, Addend] = typescriptDashTupleLib.libUtilsMod.Prepend[Tuple, Addend]
  type Repeat[Type, Count /* <: scala.Double */] = typescriptDashTupleLib.libUtilsMod.Repeat[Type, Count, js.Array[js.Any]]
  type Reverse[Tuple /* <: js.Array[_] */] = typescriptDashTupleLib.libUtilsMod.Reverse[Tuple, js.Array[js.Any]]
  type ShortestTuple[TupleSet /* <: js.Array[js.Array[_]] */] = typescriptDashTupleLib.libUtilsMod.ShortestTuple[TupleSet, js.Array[js.Any]]
  type SingleTupleSet[Types /* <: js.Array[_] */] = typescriptDashTupleLib.libUtilsMod.SingleTupleSet[Types, js.Array[js.Any]]
  type SliceStartQuantity[Tuple /* <: js.Array[_] */, Start /* <: scala.Double */, Quantity /* <: scala.Double */] = typescriptDashTupleLib.libUtilsMod.SliceStartQuantity[Tuple, Start, Quantity, js.Array[js.Any], js.Array[js.Any]]
  type SortTwoTuple[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */, WhenEqual] = typescriptDashTupleLib.libUtilsMod.SortTwoTuple[Left, Right, WhenEqual]
  type SplitInfiniteTuple[Tuple /* <: js.Array[_] */] = typescriptDashTupleLib.libUtilsMod.SplitInfiniteTuple[Tuple]
  type Tail[Tuple /* <: js.Array[_] */] = typescriptDashTupleLib.libUtilsMod.Tail[Tuple]
}
