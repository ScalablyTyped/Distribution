package typings.typescriptDashTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMod {
  import typings.typescriptDashTuple.libUtilsMod._AllIndexesEqual
  import typings.typescriptDashTuple.libUtilsMod._AllIndexesSubset
  import typings.typescriptDashTuple.libUtilsMod._AllIndexesSuperset
  import typings.typescriptDashTuple.libUtilsMod._IndexesNormalize

  type AllIndexesEqual[Type, Tuple /* <: js.Array[_] */] = _IndexesNormalize[_AllIndexesEqual[Type, Tuple, js.Array[js.Any], js.Array[js.Any]]]
  type AllIndexesSubset[Type, Tuple /* <: js.Array[_] */] = _IndexesNormalize[_AllIndexesSubset[Type, Tuple, js.Array[js.Any], js.Array[js.Any]]]
  type AllIndexesSuperset[Type, Tuple /* <: js.Array[_] */] = _IndexesNormalize[_AllIndexesSuperset[Type, Tuple, js.Array[js.Any], js.Array[js.Any]]]
  type Append[Tuple /* <: js.Array[_] */, Addend] = Reverse[Prepend[Reverse[Tuple], Addend]]
  type CompareLength[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] = typings.typescriptDashTuple.libUtilsMod.CompareLength[Left, Right]
  type Concat[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] = typings.typescriptDashTuple.libUtilsMod.Concat[Left, Right]
  type ConcatMultiple[TupleSet /* <: js.Array[js.Array[_]] */] = typings.typescriptDashTuple.libUtilsMod.ConcatMultiple[TupleSet]
  type FillTuple[Tuple /* <: js.Array[_] */, Replacement] = typings.typescriptDashTuple.libUtilsMod.FillTuple[Tuple, Replacement, js.Array[js.Any]]
  type First[Tuple /* <: js.Array[_] */] = /* import warning: ImportType.apply Failed type conversion: Tuple[0] */ js.Any
  type FirstIndexEqual[Type, Tuple /* <: js.Array[_] */, NotFound] = typings.typescriptDashTuple.libUtilsMod.FirstIndexEqual[Type, Tuple, NotFound, js.Array[js.Any]]
  type FirstIndexSubset[Type, Tuple /* <: js.Array[_] */, NotFound] = typings.typescriptDashTuple.libUtilsMod.FirstIndexSubset[Type, Tuple, NotFound, js.Array[js.Any]]
  type FirstIndexSuperset[Type, Tuple /* <: js.Array[_] */, NotFound] = typings.typescriptDashTuple.libUtilsMod.FirstIndexSuperset[Type, Tuple, NotFound, js.Array[js.Any]]
  type IsFinite[Tuple /* <: js.Array[_] */, Finite, Infinite] = typings.typescriptDashTuple.libUtilsMod.IsFinite[Tuple, Finite, Infinite]
  type Last[Tuple /* <: js.Array[_] */] = typings.typescriptDashTuple.libUtilsMod.Last[Tuple, scala.Nothing]
  type LastIndexEqual[Type, Tuple /* <: js.Array[_] */, NotFound] = typings.typescriptDashTuple.libUtilsMod.LastIndexEqual[Type, Tuple, NotFound]
  type LastIndexSubset[Type, Tuple /* <: js.Array[_] */, NotFound] = typings.typescriptDashTuple.libUtilsMod.LastIndexSubset[Type, Tuple, NotFound]
  type LastIndexSuperset[Type, Tuple /* <: js.Array[_] */, NotFound] = typings.typescriptDashTuple.libUtilsMod.LastIndexSuperset[Type, Tuple, NotFound]
  type LongestTuple[TupleSet /* <: js.Array[js.Array[_]] */] = typings.typescriptDashTuple.libUtilsMod.LongestTuple[TupleSet, js.Array[js.Any]]
  type Prepend[Tuple /* <: js.Array[_] */, Addend] = typings.typescriptDashTuple.libUtilsMod.Prepend[Tuple, Addend]
  type Repeat[Type, Count /* <: Double */] = typings.typescriptDashTuple.libUtilsMod.Repeat[Type, Count, js.Array[js.Any]]
  type Reverse[Tuple /* <: js.Array[_] */] = typings.typescriptDashTuple.libUtilsMod.Reverse[Tuple, js.Array[js.Any]]
  type ShortestTuple[TupleSet /* <: js.Array[js.Array[_]] */] = typings.typescriptDashTuple.libUtilsMod.ShortestTuple[TupleSet, js.Array[js.Any]]
  type SingleTupleSet[Types /* <: js.Array[_] */] = typings.typescriptDashTuple.libUtilsMod.SingleTupleSet[Types, js.Array[js.Any]]
  type SliceStartQuantity[Tuple /* <: js.Array[_] */, Start /* <: Double */, Quantity /* <: Double */] = typings.typescriptDashTuple.libUtilsMod.SliceStartQuantity[Tuple, Start, Quantity, js.Array[js.Any], js.Array[js.Any]]
  type SortTwoTuple[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */, WhenEqual] = typings.typescriptDashTuple.libUtilsMod.SortTwoTuple[Left, Right, WhenEqual]
  type SplitInfiniteTuple[Tuple /* <: js.Array[_] */] = typings.typescriptDashTuple.libUtilsMod.SplitInfiniteTuple[Tuple]
  type Tail[Tuple /* <: js.Array[_] */] = typings.typescriptDashTuple.libUtilsMod.Tail[Tuple]
}
