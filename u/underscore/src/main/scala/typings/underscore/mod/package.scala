package typings.underscore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typings.underscore.underscoreBooleans.`false`
    - typings.underscore.underscoreStrings._empty
    - typings.underscore.underscoreNumbers.`0`
  */
  type AnyFalsy = js.UndefOr[typings.underscore.mod._AnyFalsy | scala.Null]
  
  type ChainSingle[V] = typings.underscore.mod.Chain[typings.underscore.mod.TypeOfCollection[V, scala.Nothing], V]
  
  type Collection[T] = typings.underscore.mod.List[T] | typings.underscore.mod.Dictionary[T]
  
  type CollectionIterator[T /* <: typings.underscore.mod.TypeOfList[V] | (typings.underscore.mod.TypeOfDictionary[V, _]) */, TResult, V] = js.Function3[
    /* element */ T, 
    /* key */ typings.underscore.mod.CollectionKey[V], 
    /* collection */ V, 
    TResult
  ]
  
  type CollectionKey[V] = js.UndefOr[java.lang.String | scala.Double]
  
  // unfortunately it's not possible to recursively collapse all possible list dimensions to T[] at this time,
  // so give up after one dimension since that's likely the most common case
  // '& object' prevents strings from being matched by list checks so types like string[] don't end up resulting in any
  type DeepestListItemOrSelf[T] = T | js.Any
  
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type Iteratee[V, R, T /* <: typings.underscore.mod.TypeOfCollection[V, _] */] = js.UndefOr[
    (typings.underscore.mod.CollectionIterator[T, R, V]) | java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]) | typings.std.Partial[T] | scala.Null
  ]
  
  type IterateeResult[I, T] = T | scala.Boolean | (/* import warning: importer.ImportType#apply Failed type conversion: T[I] */ js.Any)
  
  type ListItemOrSelf[T] = T
  
  type ListIterator[T /* <: typings.underscore.mod.TypeOfList[V] */, TResult, V] = typings.underscore.mod.CollectionIterator[T, TResult, V]
  
  type MemoCollectionIterator[T /* <: typings.underscore.mod.TypeOfList[V] | (typings.underscore.mod.TypeOfDictionary[V, _]) */, TResult, V] = js.Function4[
    /* prev */ TResult, 
    /* curr */ T, 
    /* key */ typings.underscore.mod.CollectionKey[V], 
    /* collection */ V, 
    TResult
  ]
  
  type MemoIterator[T /* <: typings.underscore.mod.TypeOfList[V] */, TResult, V] = typings.underscore.mod.MemoCollectionIterator[T, TResult, V]
  
  type MemoObjectIterator[T /* <: typings.underscore.mod.TypeOfDictionary[V, scala.Nothing] */, TResult, V] = typings.underscore.mod.MemoCollectionIterator[T, TResult, V]
  
  type ObjectIterator[T /* <: typings.underscore.mod.TypeOfDictionary[V, _] */, TResult, V] = typings.underscore.mod.CollectionIterator[T, TResult, V]
  
  // switch to Omit when the minimum TS version moves past 3.5
  type Omit[V, K /* <: java.lang.String */] = (typings.std.Pick[V, typings.std.Exclude[/* keyof V */ java.lang.String, K]]) | typings.std.Partial[V]
  
  // if T is an inferrable pair, the value type for the pair
  // if T is a list, assume that it contains pairs of some type, so any
  // if T isn't a list, there's no way that it can provide pairs, so never
  type PairValue[T] = js.Any
  
  type Pick[V, K /* <: java.lang.String */] = (typings.std.Pick[V, typings.std.Extract[K, /* keyof V */ java.lang.String]]) | typings.std.Partial[V]
  
  type Predicate[T] = js.Function1[/* value */ T, scala.Boolean]
  
  type PropertyTypeOrAny[T, K] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  
  type Truthy[T] = typings.std.Exclude[T, typings.underscore.mod.AnyFalsy]
  
  type TypeOfCollection[V, TObjectDefault] = (typings.underscore.mod.TypeOfDictionary[V, TObjectDefault]) | typings.underscore.mod.TypeOfList[V]
  
  type TypeOfDictionary[V, TDefault] = TDefault
  
  type TypeOfList[V] = js.Any
}
