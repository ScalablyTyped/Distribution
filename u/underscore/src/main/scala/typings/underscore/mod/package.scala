package typings.underscore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typings.underscore.underscoreBooleans.`false`
    - typings.underscore.underscoreStrings._empty
    - typings.underscore.underscoreNumbers.`0`
  */
  type AnyFalsy = js.UndefOr[typings.underscore.mod._AnyFalsy | scala.Null]
  // temporary iteratee type for _Chain until _Chain return types have been fixed
  type ChainIteratee[V, R, T] = typings.underscore.mod.Iteratee[js.Array[T] | V, R, typings.underscore.mod.TypeOfCollection[js.Array[T] | V]]
  type ChainSingle[V] = typings.underscore.mod.Chain[typings.underscore.mod.TypeOfCollection[V], V]
  type Collection[T] = typings.underscore.mod.List[T] | typings.underscore.mod.Dictionary[T]
  type CollectionIterator[T /* <: typings.underscore.mod.TypeOfCollection[V] */, TResult, V] = js.Function3[
    /* element */ T, 
    /* key */ typings.underscore.mod.CollectionKey[V], 
    /* collection */ V, 
    TResult
  ]
  type CollectionKey[V] = java.lang.String | scala.Double
  // unfortunately it's not possible to recursively collapse all possible list dimensions to T[] at this time,
  // so give up after one dimension since that's likely the most common case
  // '& object' prevents strings from being matched by list checks so types like string[] don't end up resulting in any
  type DeepestListItemOrSelf[T] = T | js.Any
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type EnumerableKey = java.lang.String | scala.Double
  type Iteratee[V, R, T /* <: typings.underscore.mod.TypeOfCollection[V] */] = js.UndefOr[
    (typings.underscore.mod.CollectionIterator[T, R, V]) | typings.underscore.mod.EnumerableKey | js.Array[typings.underscore.mod.EnumerableKey] | typings.std.Partial[T] | scala.Null
  ]
  type IterateeResult[I, T] = T | scala.Boolean | (/* import warning: importer.ImportType#apply Failed type conversion: T[I] */ js.Any)
  type ListItemOrSelf[T] = T
  type ListIterator[T /* <: typings.underscore.mod.TypeOfList[V] */, TResult, V] = typings.underscore.mod.CollectionIterator[T, TResult, V]
  type MemoCollectionIterator[T /* <: typings.underscore.mod.TypeOfCollection[V] */, TResult, V] = js.Function4[
    /* prev */ TResult, 
    /* curr */ T, 
    /* key */ typings.underscore.mod.CollectionKey[V], 
    /* collection */ V, 
    TResult
  ]
  type MemoIterator[T /* <: typings.underscore.mod.TypeOfList[V] */, TResult, V] = typings.underscore.mod.MemoCollectionIterator[T, TResult, V]
  type MemoObjectIterator[T /* <: typings.underscore.mod.TypeOfDictionary[V] */, TResult, V] = typings.underscore.mod.MemoCollectionIterator[T, TResult, V]
  type ObjectIterator[T /* <: typings.underscore.mod.TypeOfDictionary[V] */, TResult, V] = typings.underscore.mod.CollectionIterator[T, TResult, V]
  type Predicate[T] = js.Function1[/* value */ T, scala.Boolean]
  type PropertyTypeOrAny[T, K] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  type Truthy[T] = typings.std.Exclude[T, typings.underscore.mod.AnyFalsy]
  type TypeOfCollection[V] = typings.underscore.mod.TypeOfList[V] | typings.underscore.mod.TypeOfDictionary[V]
  type TypeOfDictionary[V] = js.Any
  type TypeOfList[V] = js.Any
}
