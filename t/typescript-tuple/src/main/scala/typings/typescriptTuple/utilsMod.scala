package typings.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-tuple/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  type AllIndexesEqual[Type, Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */, Count /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.EmptyInfiniteNonEmpty<Holder, Tuple>[Tuple extends [] ? 'empty' : typescript-tuple.typescript-tuple/lib/utils.IsFinite<Tuple, 'nonEmpty', 'infinite'>] */ js.Any
  type AllIndexesSubset[Type, Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */, Count /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.EmptyInfiniteNonEmpty<Holder, Tuple>[Tuple extends [] ? 'empty' : typescript-tuple.typescript-tuple/lib/utils.IsFinite<Tuple, 'nonEmpty', 'infinite'>] */ js.Any
  type AllIndexesSuperset[Type, Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */, Count /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.EmptyInfiniteNonEmpty<Holder, Tuple>[Tuple extends [] ? 'empty' : typescript-tuple.typescript-tuple/lib/utils.IsFinite<Tuple, 'nonEmpty', 'infinite'>] */ js.Any
  type CompareLength[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.FitBoth<Left, Right>[Left['length'] extends Right['length'] ? 'fitBoth' : Left extends [] ? 'fitLeft' : Right extends [] ? 'fitRight' : 'unfit'] */ js.Any
  type Concat[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.EmptyLeft<Right, Left>[Left extends [] ? 'emptyLeft' : Left extends [any] ? 'singleLeft' : typescript-tuple.typescript-tuple/lib/utils.IsFinite<Left, 'multiLeft', 'infiniteLeft'>] */ js.Any
  type ConcatMultiple[TupleSet /* <: js.Array[js.Array[_]] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.InfiniteCODENAMEERROR<TupleSet>[TupleSet extends [] ? 'empty' : typescript-tuple.typescript-tuple/lib/utils.IsFinite<TupleSet, 'nonEmpty', 'infinite'>] */ js.Any
  type FillTuple[Tuple /* <: js.Array[_] */, Replacement, Holder /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.InfiniteArray<Holder, Tuple, Replacement>[Tuple extends [] ? 'empty' : typescript-tuple.typescript-tuple/lib/utils.IsFinite<Tuple, 'nonEmpty', 'infinite'>] */ js.Any
  type First[Tuple /* <: js.Array[_] */, Default] = Default | (/* import warning: importer.ImportType#apply Failed type conversion: Tuple[0] */ js.Any)
  type FirstIndexEqual[Type, Tuple /* <: js.Array[_] */, NotFound, Count /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.NonEmpty<NotFound, Tuple, Type, Count>[Tuple extends [] ? 'empty' : typescript-tuple.typescript-tuple/lib/utils.IsFinite<Tuple, 'nonEmpty', 'infinite'>] */ js.Any
  type FirstIndexSubset[Type, Tuple /* <: js.Array[_] */, NotFound, Count /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.EmptyInfinite<NotFound, Tuple, Type, Count>[Tuple extends [] ? 'empty' : typescript-tuple.typescript-tuple/lib/utils.IsFinite<Tuple, 'nonEmpty', 'infinite'>] */ js.Any
  type FirstIndexSuperset[Type, Tuple /* <: js.Array[_] */, NotFound, Count /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.InfiniteNonEmpty<NotFound, Tuple, Type, Count>[Tuple extends [] ? 'empty' : typescript-tuple.typescript-tuple/lib/utils.IsFinite<Tuple, 'nonEmpty', 'infinite'>] */ js.Any
  type IndexesNormalize[Indexes /* <: js.Array[_] */] = IsFinite[
    Indexes, 
    Reverse[Indexes, js.Array[js.Any]], 
    Concat[Reverse[js.Any, js.Array[js.Any]], js.Any]
  ]
  type IsFinite[Tuple /* <: js.Array[_] */, Finite, Infinite] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.Empty<Finite, Tuple, Infinite>[Tuple extends [] ? 'empty' : Tuple extends std.Array<infer Element> ? std.Array<any> extends Tuple ? 'infinite' : 'nonEmpty' : never] */ js.Any
  type Last[Tuple /* <: js.Array[_] */, Default] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.Infinite<Default, Tuple>[Tuple extends [] ? 'empty' : Tuple extends [any] ? 'single' : Tuple extends std.Array<infer Element> ? std.Array<any> extends Tuple ? 'infinite' : 'multi' : never] */ js.Any
  type LastIndexEqual[Type, Tuple /* <: js.Array[_] */, NotFound] = LastIndexFirst[AllIndexesEqual[Type, Tuple, js.Array[js.Any], js.Array[js.Any]], NotFound]
  type LastIndexFirst[Tuple /* <: js.Array[_] */, NotFound] = IsFinite[Tuple, First[Tuple, NotFound], js.Any]
  type LastIndexSubset[Type, Tuple /* <: js.Array[_] */, NotFound] = LastIndexFirst[AllIndexesSubset[Type, Tuple, js.Array[js.Any], js.Array[js.Any]], NotFound]
  type LastIndexSuperset[Type, Tuple /* <: js.Array[_] */, NotFound] = LastIndexFirst[AllIndexesSuperset[Type, Tuple, js.Array[js.Any], js.Array[js.Any]], NotFound]
  type LongestTuple[TupleSet /* <: js.Array[js.Array[_]] */, Longest] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.EmptyLongest<Longest, TupleSet>[TupleSet extends [] ? 'empty' : 'nonEmpty'] */ js.Any
  type Prepend[Tuple /* <: js.Array[_] */, Addend] = js.Any
  type Repeat[Type, Count /* <: Double */, Holder /* <: js.Array[_] */] = (/* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.Fit<Holder, Count>[Holder['length'] extends Count ? Count extends Holder['length'] ? 'fit' : 'union' : 'unfit'] */ js.Any) | js.Array[Type]
  type Reverse[Tuple /* <: js.Array[_] */, Prefix /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.EmptyPrefix<Prefix, Tuple>[Tuple extends [any, ...std.Array<any>] ? typescript-tuple.typescript-tuple/lib/utils.IsFinite<Tuple, 'nonEmpty', 'infinite'> : 'empty'] */ js.Any
  type ShortestTuple[TupleSet /* <: js.Array[js.Array[_]] */, Shortest] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.EmptyNonEmpty<Shortest, TupleSet>[TupleSet extends [] ? 'empty' : 'nonEmpty'] */ js.Any
  type SingleTupleSet[Types /* <: js.Array[_] */, Holder /* <: js.Array[js.Array[_]] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.EmptyHolder<Holder, Types>[Types extends [] ? 'empty' : typescript-tuple.typescript-tuple/lib/utils.IsFinite<Types, 'nonEmpty', 'infinite'>] */ js.Any
  type SliceStartQuantity[Tuple /* <: js.Array[_] */, Start /* <: Double */, Quantity /* <: Double */, Holder /* <: js.Array[_] */, Count /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.Before<Tuple, Holder>[Tuple extends [] ? 'end' : Quantity extends Holder['length'] ? 'end' : Start extends Count['length'] ? 'start' : 'before'] */ js.Any
  type SortTwoTuple[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */, WhenEqual] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.Equal<WhenEqual, Left, Right>[typescript-tuple.typescript-tuple/lib/utils.CompareLength<Left, Right>] */ js.Any
  type SplitInfiniteTuple[Tuple /* <: js.Array[_] */] = js.Tuple2[Reverse[js.Any, js.Array[js.Any]], js.Any]
  type Tail[Tuple /* <: js.Array[_] */] = js.Any
  type _SplitInfiniteTuple[Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.Finite<Holder, Tuple>[Tuple extends std.Array<infer Element> ? std.Array<any> extends Tuple ? 'matched' : 'unmatched' : never] */ js.Any
}

