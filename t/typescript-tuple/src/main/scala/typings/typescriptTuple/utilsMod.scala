package typings.typescriptTuple

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.typescriptTuple.typescriptTupleStrings.shorterRight
    - typings.typescriptTuple.typescriptTupleStrings.shorterLeft
    - typings.typescriptTuple.typescriptTupleStrings.equal
  */
  trait CompareLength[Left /* <: js.Array[Any] */, Right /* <: js.Array[Any] */] extends StObject
  
  type Concat[Left /* <: js.Array[Any] */, Right /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c repeated non-array type: Left */ js.Array[Left]
  
  type ConcatMultiple[TupleSet /* <: js.Array[js.Array[Any]] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.Infinite<TupleSet>[TupleSet extends [] ? 'empty' : typescript-tuple.typescript-tuple/lib/utils.IsFinite<TupleSet, 'nonEmpty', 'infinite'>] */ js.Any
  
  type Drop[Tuple /* <: js.Array[Any] */, Quantity /* <: Double */, Count /* <: js.Array[Any] */] = Any | Tuple
  
  type FillTuple[Tuple /* <: js.Array[Any] */, Replacement, Holder /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.NonEmpty<Holder, Tuple, Replacement>[Tuple extends [] ? 'empty' : typescript-tuple.typescript-tuple/lib/utils.IsFinite<Tuple, 'nonEmpty', 'infinite'>] */ js.Any
  
  type FilterTuple[Tuple /* <: js.Array[Any] */, Mask] = ConcatMultiple[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Tuple ]: Tuple[K] extends Mask? [Tuple[K]] : []}
    */ typings.typescriptTuple.typescriptTupleStrings.FilterTuple & TopLevel[Any]
  ]
  
  type First[Tuple /* <: js.Array[Any] */, Default] = Default | (/* import warning: importer.ImportType#apply Failed type conversion: Tuple[0] */ js.Any)
  
  type IsFinite[Tuple /* <: js.Array[Any] */, Finite, Infinite] = Any | Infinite | Finite
  
  type Last[Tuple /* <: js.Array[Any] */, Default] = Default
  
  type LongestTuple[TupleSet /* <: js.Array[js.Array[Any]] */, Longest] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.EmptyNonEmpty<Longest, TupleSet>[TupleSet extends [] ? 'empty' : 'nonEmpty'] */ js.Any
  
  type Prepend[Tuple /* <: js.Array[Any] */, Addend] = /* import warning: importer.ImportType#apply c repeated non-array type: Tuple */ js.Array[Tuple]
  
  type Repeat[Type, Count /* <: Double */, Holder /* <: js.Array[Any] */] = Any | Holder | js.Array[Type]
  
  type Reverse[Tuple /* <: js.Array[Any] */, Prefix /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.Empty<Prefix, Tuple>[Tuple extends [any, ...std.Array<any>] ? typescript-tuple.typescript-tuple/lib/utils.IsFinite<Tuple, 'nonEmpty', 'infinite'> : 'empty'] */ js.Any
  
  type ShortestTuple[TupleSet /* <: js.Array[js.Array[Any]] */, Shortest /* <: js.Array[Any] */] = (/* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Shortest, any, [Shortest, any]>[0] */ js.Any) | Shortest
  
  type SliceStartQuantity[Tuple /* <: js.Array[Any] */, Start /* <: Double */, Quantity /* <: Double */, Holder /* <: js.Array[Any] */, Count /* <: js.Array[Any] */] = Any | (Reverse[Holder, js.Array[Any]])
  
  type SortTwoTuple[Left /* <: js.Array[Any] */, Right /* <: js.Array[Any] */, WhenEqual] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.Equal<WhenEqual, Left, Right>[typescript-tuple.typescript-tuple/lib/utils.CompareLength<Left, Right>] */ js.Any
  
  type SplitInfiniteTuple[Tuple /* <: js.Array[Any] */, Holder /* <: js.Array[Any] */] = Any | (js.Tuple2[Tuple, Holder])
  
  type Tail[Tuple /* <: js.Array[Any] */] = Any
}
