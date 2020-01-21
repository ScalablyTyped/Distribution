package typings.underscoreKo

import typings.underscore.mod.Dictionary
import typings.underscore.mod.ListIterator
import typings.underscore.mod.MemoIterator
import typings.underscore.mod.ObjectIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArrayFunctions[T] extends js.Object {
  def all(iterator: ListIterator[T, Boolean]): Boolean = js.native
  def all(iterator: ListIterator[T, Boolean], context: js.Any): Boolean = js.native
  def any(): Boolean = js.native
  def any(iterator: ListIterator[T, Boolean]): Boolean = js.native
  def any(iterator: ListIterator[T, Boolean], context: js.Any): Boolean = js.native
  /* **
    Chaining
    *****/
  def chain(`object`: js.Any): js.Any = js.native
  def collect[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult])): js.Array[TResult] = js.native
  def collect[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult]), context: js.Any): js.Array[TResult] = js.native
  def compact(): js.Array[T] = js.native
  def compact_(): js.Array[T] = js.native
  def contains(value: T): Boolean = js.native
  def countBy(iterator: String): Dictionary[js.Array[Double]] = js.native
  def countBy(iterator: ListIterator[T, _]): Dictionary[js.Array[Double]] = js.native
  def detect(iterator: ListIterator[T, Boolean]): T = js.native
  def detect(iterator: ListIterator[T, Boolean], context: js.Any): T = js.native
  def difference(others: js.Array[T]*): js.Array[T] = js.native
  def difference_(others: js.Array[T]*): js.Array[T] = js.native
  def drop(): js.Array[T] = js.native
  def drop(n: Double): js.Array[T] = js.native
  def drop_(): js.Array[T] = js.native
  def drop_(n: Double): js.Array[T] = js.native
  /* **
    Collections
    *****/
  def each[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult])): js.Array[TResult] = js.native
  def each[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult]), context: js.Any): js.Array[TResult] = js.native
  def every(iterator: ListIterator[T, Boolean]): Boolean = js.native
  def every(iterator: ListIterator[T, Boolean], context: js.Any): Boolean = js.native
  def filter(iterator: ListIterator[T, Boolean]): js.Array[T] = js.native
  def filter(iterator: ListIterator[T, Boolean], context: js.Any): js.Array[T] = js.native
  def filter_(iterator: ListIterator[T, Boolean]): js.Array[T] = js.native
  def filter_(iterator: ListIterator[T, Boolean], context: js.Any): js.Array[T] = js.native
  def find(iterator: ListIterator[T, Boolean]): T = js.native
  def find(iterator: ListIterator[T, Boolean], context: js.Any): T = js.native
  /* **
    Arrays
    *****/
  def first(): T = js.native
  def first(n: Double): js.Array[T] = js.native
  def flatten(): js.Array[_] = js.native
  def flatten(shallow: Boolean): js.Array[_] = js.native
  def flatten_(): js.Array[_] = js.native
  def flatten_(shallow: Boolean): js.Array[_] = js.native
  def foldl[TResult](iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def foldl[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  def foldr[TResult](iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def foldr[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  def forEach[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult])): js.Array[TResult] = js.native
  def forEach[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult]), context: js.Any): js.Array[TResult] = js.native
  def groupBy(iterator: String): Dictionary[js.Array[T]] = js.native
  def groupBy[TSort](iterator: ListIterator[T, TSort]): Dictionary[js.Array[T]] = js.native
  def groupBy_(iterator: String): Dictionary[js.Array[T]] = js.native
  def groupBy_[TSort](iterator: ListIterator[T, TSort]): Dictionary[js.Array[T]] = js.native
  def head(): T = js.native
  def head(n: Double): js.Array[T] = js.native
  def include(value: T): Boolean = js.native
  def indexOf(value: T): Double = js.native
  def indexOf(value: T, isSorted: Boolean): Double = js.native
  def initial(): js.Array[T] = js.native
  def initial(n: Double): js.Array[T] = js.native
  def inject[TResult](iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def inject[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  def intersection(arrays: js.Array[T]*): js.Array[T] = js.native
  def intersection_(arrays: js.Array[T]*): js.Array[T] = js.native
  def invoke(methodName: String, args: js.Any*): js.Any = js.native
  def invoke_(methodName: String, args: js.Any*): js.Any = js.native
  def last(): T = js.native
  def last(n: Double): js.Array[T] = js.native
  def lastIndexOf(value: T): Double = js.native
  def lastIndexOf(value: T, fromIndex: Double): Double = js.native
  def lastIndexOf(value: T, isSorted: Boolean): Double = js.native
  def map[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult])): js.Array[TResult] = js.native
  def map[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult]), context: js.Any): js.Array[TResult] = js.native
  def max(iterator: ListIterator[T, _]): js.Any = js.native
  def max(iterator: ListIterator[T, _], context: js.Any): js.Any = js.native
  def min(iterator: ListIterator[T, _]): js.Any = js.native
  def min(iterator: ListIterator[T, _], context: js.Any): js.Any = js.native
  def `object`(): js.Any = js.native
  def pluck(propertyName: String): js.Array[T] = js.native
  def range(start: Double, stop: Double): js.Array[_] = js.native
  def range(start: Double, stop: Double, step: Double): js.Array[_] = js.native
  def range(stop: Double): js.Array[_] = js.native
  def reduce[TResult](iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def reduce[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  def reduceRight[TResult](iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def reduceRight[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  def reject(iterator: ListIterator[T, Boolean]): js.Array[T] = js.native
  def reject(iterator: ListIterator[T, Boolean], context: js.Any): js.Array[T] = js.native
  def reject_(iterator: ListIterator[T, Boolean]): js.Array[T] = js.native
  def reject_(iterator: ListIterator[T, Boolean], context: js.Any): js.Array[T] = js.native
  def rest(): js.Array[T] = js.native
  def rest(n: Double): js.Array[T] = js.native
  def rest_(): js.Array[T] = js.native
  def rest_(n: Double): js.Array[T] = js.native
  def select(iterator: ListIterator[T, Boolean]): js.Array[T] = js.native
  def select(iterator: ListIterator[T, Boolean], context: js.Any): js.Array[T] = js.native
  def select_(iterator: ListIterator[T, Boolean]): js.Array[T] = js.native
  def select_(iterator: ListIterator[T, Boolean], context: js.Any): js.Array[T] = js.native
  def shuffle(): js.Array[T] = js.native
  def shuffle_(): js.Array[T] = js.native
  def size(): Double = js.native
  def some(): Boolean = js.native
  def some(iterator: ListIterator[T, Boolean]): Boolean = js.native
  def some(iterator: ListIterator[T, Boolean], context: js.Any): Boolean = js.native
  def sortBy(iterator: String): js.Array[T] = js.native
  def sortBy(iterator: String, context: js.Any): js.Array[T] = js.native
  def sortBy[TSort](iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  def sortBy[TSort](iterator: ListIterator[T, TSort], context: js.Any): js.Array[T] = js.native
  def sortBy_(iterator: String): js.Array[T] = js.native
  def sortBy_(iterator: String, context: js.Any): js.Array[T] = js.native
  def sortBy_[TSort](iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  def sortBy_[TSort](iterator: ListIterator[T, TSort], context: js.Any): js.Array[T] = js.native
  def sortedIndex[TSort](value: T): Double = js.native
  def sortedIndex[TSort](value: T, iterator: ListIterator[T, TSort]): Double = js.native
  def tail(): js.Array[T] = js.native
  def tail(n: Double): js.Array[T] = js.native
  def tail_(): js.Array[T] = js.native
  def tail_(n: Double): js.Array[T] = js.native
  def take(): T = js.native
  def take(n: Double): js.Array[T] = js.native
  def union(arrays: js.Array[T]*): js.Array[T] = js.native
  def union_(arrays: js.Array[T]*): js.Array[T] = js.native
  def uniq[TSort](): js.Array[T] = js.native
  def uniq[TSort](isSorted: Boolean): js.Array[T] = js.native
  def uniq[TSort](isSorted: Boolean, iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  def uniq_[TSort](): js.Array[T] = js.native
  def uniq_[TSort](isSorted: Boolean): js.Array[T] = js.native
  def uniq_[TSort](isSorted: Boolean, iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  def unique[TSort](): js.Array[T] = js.native
  def unique[TSort](isSorted: Boolean): js.Array[T] = js.native
  def unique[TSort](isSorted: Boolean, iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  def unique_[TSort](): js.Array[T] = js.native
  def unique_[TSort](isSorted: Boolean): js.Array[T] = js.native
  def unique_[TSort](isSorted: Boolean, iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  def where[U /* <: js.Object */](properties: U): js.Array[T] = js.native
  def without(values: T*): js.Array[T] = js.native
  def without_(values: T*): js.Array[T] = js.native
  def zip(arrays: js.Any*): js.Array[_] = js.native
  def zip_(arrays: js.Any*): js.Array[_] = js.native
}

