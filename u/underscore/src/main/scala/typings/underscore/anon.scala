package typings.underscore

import org.scalablytyped.runtime.TopLevel
import typings.underscore.mod.Chain
import typings.underscore.mod.ChainIteratee
import typings.underscore.mod.ChainSingle
import typings.underscore.mod.Collection
import typings.underscore.mod.CollectionIterator
import typings.underscore.mod.EnumerableKey
import typings.underscore.mod.Iteratee
import typings.underscore.mod.IterateeResult
import typings.underscore.mod.List
import typings.underscore.mod.MemoCollectionIterator
import typings.underscore.mod.TypeOfCollection
import typings.underscore.mod.TypeOfList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Fn0[T, V] extends js.Object {
    def apply(): Chain[IterateeResult[Null, T], js.Array[IterateeResult[Null, T]]] = js.native
    def apply(iteratee: js.UndefOr[scala.Nothing], context: js.Any): Chain[
        IterateeResult[js.UndefOr[scala.Nothing], T], 
        js.Array[IterateeResult[js.UndefOr[scala.Nothing], T]]
      ] = js.native
    def apply(iteratee: String): Chain[IterateeResult[String, T], js.Array[IterateeResult[String, T]]] = js.native
    def apply(iteratee: String, context: js.Any): Chain[IterateeResult[String, T], js.Array[IterateeResult[String, T]]] = js.native
    def apply(iteratee: js.Array[EnumerableKey]): Chain[
        IterateeResult[js.Array[EnumerableKey], T], 
        js.Array[IterateeResult[js.Array[EnumerableKey], T]]
      ] = js.native
    def apply(iteratee: js.Array[EnumerableKey], context: js.Any): Chain[
        IterateeResult[js.Array[EnumerableKey], T], 
        js.Array[IterateeResult[js.Array[EnumerableKey], T]]
      ] = js.native
    def apply(iteratee: Double): Chain[IterateeResult[Double, T], js.Array[IterateeResult[Double, T]]] = js.native
    def apply(iteratee: Double, context: js.Any): Chain[IterateeResult[Double, T], js.Array[IterateeResult[Double, T]]] = js.native
    def apply(iteratee: Null, context: js.Any): Chain[IterateeResult[Null, T], js.Array[IterateeResult[Null, T]]] = js.native
    def apply[I /* <: (CollectionIterator[TypeOfCollection[js.Array[T] | V], _, js.Array[T] | V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V extends underscore.underscore.Collection<T>? V : std.Array<T>> ]:? underscore.underscore.TypeOfCollection<V extends underscore.underscore.Collection<T>? V : std.Array<T>>[P]}
      */ typings.underscore.underscoreStrings.Fn0 with (TopLevel[TypeOfCollection[js.Array[T] | V]])) */](iteratee: I): Chain[IterateeResult[I, T], js.Array[IterateeResult[I, T]]] = js.native
    def apply[I /* <: (CollectionIterator[TypeOfCollection[js.Array[T] | V], _, js.Array[T] | V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V extends underscore.underscore.Collection<T>? V : std.Array<T>> ]:? underscore.underscore.TypeOfCollection<V extends underscore.underscore.Collection<T>? V : std.Array<T>>[P]}
      */ typings.underscore.underscoreStrings.Fn0 with (TopLevel[TypeOfCollection[js.Array[T] | V]])) */](iteratee: I, context: js.Any): Chain[IterateeResult[I, T], js.Array[IterateeResult[I, T]]] = js.native
  }
  
  @js.native
  trait Fn1[V] extends js.Object {
    def apply[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult | TypeOfCollection[V], V]): ChainSingle[js.UndefOr[TResult | TypeOfCollection[V]]] = js.native
    def apply[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult): ChainSingle[TResult] = js.native
    def apply[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult, context: js.Any): ChainSingle[TResult] = js.native
  }
  
  @js.native
  trait Fn2[T] extends js.Object {
    def apply(): ChainSingle[js.UndefOr[T]] = js.native
    def apply(n: Double): Chain[T, js.Array[T]] = js.native
  }
  
  @js.native
  trait FnCall extends js.Object {
    def apply[V /* <: Collection[_] */](collection: V): js.Array[IterateeResult[Null, TypeOfCollection[V]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: js.UndefOr[scala.Nothing], context: js.Any): js.Array[IterateeResult[js.UndefOr[scala.Nothing], TypeOfCollection[V]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: String): js.Array[IterateeResult[String, TypeOfCollection[V]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: String, context: js.Any): js.Array[IterateeResult[String, TypeOfCollection[V]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: js.Array[EnumerableKey]): js.Array[IterateeResult[js.Array[EnumerableKey], TypeOfCollection[V]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: js.Array[EnumerableKey], context: js.Any): js.Array[IterateeResult[js.Array[EnumerableKey], TypeOfCollection[V]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: Double): js.Array[IterateeResult[Double, TypeOfCollection[V]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: Double, context: js.Any): js.Array[IterateeResult[Double, TypeOfCollection[V]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: Null, context: js.Any): js.Array[IterateeResult[Null, TypeOfCollection[V]]] = js.native
    def apply[V /* <: Collection[_] */, I /* <: (CollectionIterator[TypeOfCollection[V], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V> ]:? underscore.underscore.TypeOfCollection<V>[P]}
      */ typings.underscore.underscoreStrings.FnCall with TopLevel[TypeOfCollection[V]]) */](collection: V, iteratee: I): js.Array[IterateeResult[I, TypeOfCollection[V]]] = js.native
    def apply[V /* <: Collection[_] */, I /* <: (CollectionIterator[TypeOfCollection[V], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V> ]:? underscore.underscore.TypeOfCollection<V>[P]}
      */ typings.underscore.underscoreStrings.FnCall with TopLevel[TypeOfCollection[V]]) */](collection: V, iteratee: I, context: js.Any): js.Array[IterateeResult[I, TypeOfCollection[V]]] = js.native
  }
  
  @js.native
  trait FnCallCollectionIterateeMemoContext extends js.Object {
    def apply[V /* <: Collection[_] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult | TypeOfCollection[V], V]
    ): js.UndefOr[TResult | TypeOfCollection[V]] = js.native
    def apply[V /* <: Collection[_] */, TResult](collection: V, iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult): TResult = js.native
    def apply[V /* <: Collection[_] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V],
      memo: TResult,
      context: js.Any
    ): TResult = js.native
  }
  
  @js.native
  trait FnCallIsSortedIterateeContext[V, T] extends js.Object {
    def apply(): Chain[T, js.Array[T]] = js.native
    def apply(isSorted: js.UndefOr[scala.Nothing], iteratee: js.UndefOr[ChainIteratee[V, _, T]], context: js.Any): Chain[T, js.Array[T]] = js.native
    def apply(isSorted: js.UndefOr[scala.Nothing], iteratee: ChainIteratee[V, _, T]): Chain[T, js.Array[T]] = js.native
    def apply(isSorted: Boolean): Chain[T, js.Array[T]] = js.native
    def apply(isSorted: Boolean, iteratee: js.UndefOr[ChainIteratee[V, _, T]], context: js.Any): Chain[T, js.Array[T]] = js.native
    def apply(isSorted: Boolean, iteratee: ChainIteratee[V, _, T]): Chain[T, js.Array[T]] = js.native
    def apply(iteratee: js.UndefOr[ChainIteratee[V, _, T]], context: js.Any): Chain[T, js.Array[T]] = js.native
    def apply(iteratee: ChainIteratee[V, _, T]): Chain[T, js.Array[T]] = js.native
  }
  
  @js.native
  trait FnCallIsSortedIterateeCotext[V, T] extends js.Object {
    def apply(): js.Array[T] = js.native
    def apply(
      isSorted: js.UndefOr[scala.Nothing],
      iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V]]],
      cotext: js.Any
    ): js.Array[T] = js.native
    def apply(isSorted: js.UndefOr[scala.Nothing], iteratee: Iteratee[V, _, TypeOfCollection[V]]): js.Array[T] = js.native
    def apply(isSorted: Boolean): js.Array[T] = js.native
    def apply(isSorted: Boolean, iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V]]], cotext: js.Any): js.Array[T] = js.native
    def apply(isSorted: Boolean, iteratee: Iteratee[V, _, TypeOfCollection[V]]): js.Array[T] = js.native
    def apply(iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V]]], context: js.Any): js.Array[T] = js.native
    def apply(iteratee: Iteratee[V, _, TypeOfCollection[V]]): js.Array[T] = js.native
  }
  
  @js.native
  trait FnCallIterateeContext[T, V] extends js.Object {
    def apply(): js.Array[IterateeResult[Null, T]] = js.native
    def apply(iteratee: js.UndefOr[scala.Nothing], context: js.Any): js.Array[IterateeResult[js.UndefOr[scala.Nothing], T]] = js.native
    def apply(iteratee: String): js.Array[IterateeResult[String, T]] = js.native
    def apply(iteratee: String, context: js.Any): js.Array[IterateeResult[String, T]] = js.native
    def apply(iteratee: js.Array[EnumerableKey]): js.Array[IterateeResult[js.Array[EnumerableKey], T]] = js.native
    def apply(iteratee: js.Array[EnumerableKey], context: js.Any): js.Array[IterateeResult[js.Array[EnumerableKey], T]] = js.native
    def apply(iteratee: Double): js.Array[IterateeResult[Double, T]] = js.native
    def apply(iteratee: Double, context: js.Any): js.Array[IterateeResult[Double, T]] = js.native
    def apply(iteratee: Null, context: js.Any): js.Array[IterateeResult[Null, T]] = js.native
    def apply[I /* <: (CollectionIterator[TypeOfCollection[V], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V> ]:? underscore.underscore.TypeOfCollection<V>[P]}
      */ typings.underscore.underscoreStrings.FnCallIterateeContext with TopLevel[TypeOfCollection[V]]) */](iteratee: I): js.Array[IterateeResult[I, T]] = js.native
    def apply[I /* <: (CollectionIterator[TypeOfCollection[V], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V> ]:? underscore.underscore.TypeOfCollection<V>[P]}
      */ typings.underscore.underscoreStrings.FnCallIterateeContext with TopLevel[TypeOfCollection[V]]) */](iteratee: I, context: js.Any): js.Array[IterateeResult[I, T]] = js.native
  }
  
  @js.native
  trait FnCallIterateeMemoContext[V] extends js.Object {
    def apply[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult | TypeOfCollection[V], V]): js.UndefOr[TResult | TypeOfCollection[V]] = js.native
    def apply[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult): TResult = js.native
    def apply[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult, context: js.Any): TResult = js.native
  }
  
  @js.native
  trait FnCallListIsSortedIterateeContext extends js.Object {
    def apply[V /* <: List[_] */](list: V): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](
      list: V,
      isSorted: js.UndefOr[scala.Nothing],
      iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V]]],
      context: js.Any
    ): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](list: V, isSorted: js.UndefOr[scala.Nothing], iteratee: Iteratee[V, _, TypeOfCollection[V]]): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](list: V, isSorted: Boolean): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](
      list: V,
      isSorted: Boolean,
      iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V]]],
      context: js.Any
    ): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](list: V, isSorted: Boolean, iteratee: Iteratee[V, _, TypeOfCollection[V]]): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](list: V, iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V]]], context: js.Any): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](list: V, iteratee: Iteratee[V, _, TypeOfCollection[V]]): js.Array[TypeOfList[V]] = js.native
  }
  
  @js.native
  trait FnCallListN extends js.Object {
    def apply[V /* <: List[_] */](list: V): js.UndefOr[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](list: V, n: Double): js.Array[TypeOfList[V]] = js.native
  }
  
  @js.native
  trait FnCallN[T] extends js.Object {
    def apply(): js.UndefOr[T] = js.native
    def apply(n: Double): js.Array[T] = js.native
  }
  
}

