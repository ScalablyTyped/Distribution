package typings
package typescriptDashTupleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsMod {
  type Concat[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] = Right | (Prepend[Right, js.Any])
  type ConcatMultiple[TupleSet /* <: js.Array[js.Array[_]] */] = js.Array[js.Any]
  type FillTuple[Tuple /* <: js.Array[_] */, Replacement, Holder /* <: js.Array[_] */] = Holder
  type First[Tuple /* <: js.Array[_] */, Default] = Default | (/* import warning: ImportType.apply Failed type conversion: Tuple[0] */ js.Any)
  type FirstIndexEqual[Type, Tuple /* <: js.Array[_] */, NotFound, Count /* <: js.Array[_] */] = NotFound
  type FirstIndexSubset[Type, Tuple /* <: js.Array[_] */, NotFound, Count /* <: js.Array[_] */] = NotFound
  type FirstIndexSuperset[Type, Tuple /* <: js.Array[_] */, NotFound, Count /* <: js.Array[_] */] = NotFound
  type IsFinite[Tuple /* <: js.Array[_] */, Finite, Infinite] = Finite | Infinite
  type Last[Tuple /* <: js.Array[_] */, Default] = Default
  type LastIndexEqual[Type, Tuple /* <: js.Array[_] */, NotFound] = _LastIndexFirst[_AllIndexesEqual[Type, Tuple, js.Array[js.Any], js.Array[js.Any]], NotFound]
  type LastIndexSubset[Type, Tuple /* <: js.Array[_] */, NotFound] = _LastIndexFirst[_AllIndexesSubset[Type, Tuple, js.Array[js.Any], js.Array[js.Any]], NotFound]
  type LastIndexSuperset[Type, Tuple /* <: js.Array[_] */, NotFound] = _LastIndexFirst[_AllIndexesSuperset[Type, Tuple, js.Array[js.Any], js.Array[js.Any]], NotFound]
  type LongestTuple[TupleSet /* <: js.Array[js.Array[_]] */, Longest] = Longest | (/* import warning: ImportType.apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any)
  type Prepend[Tuple /* <: js.Array[_] */, Addend] = js.Any
  type Repeat[Type, Count /* <: scala.Double */, Holder /* <: js.Array[_] */] = Holder | js.Array[Type]
  type Reverse[Tuple /* <: js.Array[_] */, Prefix /* <: js.Array[_] */] = Prefix
  type ShortestTuple[TupleSet /* <: js.Array[js.Array[_]] */, Shortest] = Shortest | (/* import warning: ImportType.apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Shortest, any, [Shortest, any]>[0] */ js.Any)
  type SingleTupleSet[Types /* <: js.Array[_] */, Holder /* <: js.Array[js.Array[_]] */] = Holder
  type SortTwoTuple[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */, WhenEqual] = /* import warning: ImportType.apply Failed type conversion: typescript-tuple.Anon_Equal<WhenEqual, Left, Right>[typescript-tuple.typescript-tuple/lib/utils.CompareLength<Left, Right>] */ js.Any
  type SplitInfiniteTuple[Tuple /* <: js.Array[_] */] = js.Tuple2[Reverse[js.Any, js.Array[js.Any]], js.Any]
  type _AllIndexesEqual[Type, Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */, Count /* <: js.Array[_] */] = Holder
  type _AllIndexesSubset[Type, Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */, Count /* <: js.Array[_] */] = Holder
  type _AllIndexesSuperset[Type, Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */, Count /* <: js.Array[_] */] = Holder
  type _IndexesNormalize[Indexes /* <: js.Array[_] */] = IsFinite[
    Indexes, 
    Reverse[Indexes, js.Array[js.Any]], 
    Concat[Reverse[js.Any, js.Array[js.Any]], js.Any]
  ]
  type _LastIndexFirst[Tuple /* <: js.Array[_] */, NotFound] = IsFinite[Tuple, First[Tuple, NotFound], js.Any]
  type _SplitInfiniteTuple[Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */] = js.Tuple2[Holder, Tuple]
}
