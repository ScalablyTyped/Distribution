package typings
package underscoreDashKoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArrayFunctions[T] extends js.Object {
  def all(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean]): scala.Boolean = js.native
  def all(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  def any(): scala.Boolean = js.native
  def any(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean]): scala.Boolean = js.native
  def any(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  /* **
    Chaining
    *****/
  def chain(`object`: js.Any): js.Any = js.native
  def collect[TResult](
    iterator: (underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TResult]) | (underscoreLib.underscoreMod.underscoreNs.ObjectIterator[T, TResult])
  ): js.Array[TResult] = js.native
  def collect[TResult](
    iterator: (underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TResult]) | (underscoreLib.underscoreMod.underscoreNs.ObjectIterator[T, TResult]),
    context: js.Any
  ): js.Array[TResult] = js.native
  def compact(): js.Array[T] = js.native
  def `compact_`(): js.Array[T] = js.native
  def contains(value: T): scala.Boolean = js.native
  def countBy(iterator: java.lang.String): underscoreLib.underscoreMod.underscoreNs.Dictionary[js.Array[scala.Double]] = js.native
  def countBy(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, _]): underscoreLib.underscoreMod.underscoreNs.Dictionary[js.Array[scala.Double]] = js.native
  def detect(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean]): T = js.native
  def detect(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean], context: js.Any): T = js.native
  def difference(others: js.Array[T]*): js.Array[T] = js.native
  def `difference_`(others: js.Array[T]*): js.Array[T] = js.native
  def drop(): js.Array[T] = js.native
  def drop(n: scala.Double): js.Array[T] = js.native
  def `drop_`(): js.Array[T] = js.native
  def `drop_`(n: scala.Double): js.Array[T] = js.native
  /* **
    Collections
    *****/
  def each[TResult](
    iterator: (underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TResult]) | (underscoreLib.underscoreMod.underscoreNs.ObjectIterator[T, TResult])
  ): js.Array[TResult] = js.native
  def each[TResult](
    iterator: (underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TResult]) | (underscoreLib.underscoreMod.underscoreNs.ObjectIterator[T, TResult]),
    context: js.Any
  ): js.Array[TResult] = js.native
  def every(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean]): scala.Boolean = js.native
  def every(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  def filter(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean]): js.Array[T] = js.native
  def filter(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean], context: js.Any): js.Array[T] = js.native
  def `filter_`(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean]): js.Array[T] = js.native
  def `filter_`(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean], context: js.Any): js.Array[T] = js.native
  def find(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean]): T = js.native
  def find(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean], context: js.Any): T = js.native
  /* **
    Arrays
    *****/
  def first(): T = js.native
  def first(n: scala.Double): js.Array[T] = js.native
  def flatten(): js.Array[_] = js.native
  def flatten(shallow: scala.Boolean): js.Array[_] = js.native
  def `flatten_`(): js.Array[_] = js.native
  def `flatten_`(shallow: scala.Boolean): js.Array[_] = js.native
  def foldl[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def foldl[TResult](
    iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[T, TResult],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  def foldr[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def foldr[TResult](
    iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[T, TResult],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  def forEach[TResult](
    iterator: (underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TResult]) | (underscoreLib.underscoreMod.underscoreNs.ObjectIterator[T, TResult])
  ): js.Array[TResult] = js.native
  def forEach[TResult](
    iterator: (underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TResult]) | (underscoreLib.underscoreMod.underscoreNs.ObjectIterator[T, TResult]),
    context: js.Any
  ): js.Array[TResult] = js.native
  def groupBy(iterator: java.lang.String): underscoreLib.underscoreMod.underscoreNs.Dictionary[js.Array[T]] = js.native
  def groupBy[TSort](iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TSort]): underscoreLib.underscoreMod.underscoreNs.Dictionary[js.Array[T]] = js.native
  def `groupBy_`(iterator: java.lang.String): underscoreLib.underscoreMod.underscoreNs.Dictionary[js.Array[T]] = js.native
  def `groupBy_`[TSort](iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TSort]): underscoreLib.underscoreMod.underscoreNs.Dictionary[js.Array[T]] = js.native
  def head(): T = js.native
  def head(n: scala.Double): js.Array[T] = js.native
  def include(value: T): scala.Boolean = js.native
  def indexOf(value: T): scala.Double = js.native
  def indexOf(value: T, isSorted: scala.Boolean): scala.Double = js.native
  def initial(): js.Array[T] = js.native
  def initial(n: scala.Double): js.Array[T] = js.native
  def inject[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def inject[TResult](
    iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[T, TResult],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  def intersection(arrays: js.Array[T]*): js.Array[T] = js.native
  def `intersection_`(arrays: js.Array[T]*): js.Array[T] = js.native
  def invoke(methodName: java.lang.String, args: js.Any*): js.Any = js.native
  def `invoke_`(methodName: java.lang.String, args: js.Any*): js.Any = js.native
  def last(): T = js.native
  def last(n: scala.Double): js.Array[T] = js.native
  def lastIndexOf(value: T): scala.Double = js.native
  def lastIndexOf(value: T, fromIndex: scala.Double): scala.Double = js.native
  def lastIndexOf(value: T, isSorted: scala.Boolean): scala.Double = js.native
  def map[TResult](
    iterator: (underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TResult]) | (underscoreLib.underscoreMod.underscoreNs.ObjectIterator[T, TResult])
  ): js.Array[TResult] = js.native
  def map[TResult](
    iterator: (underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TResult]) | (underscoreLib.underscoreMod.underscoreNs.ObjectIterator[T, TResult]),
    context: js.Any
  ): js.Array[TResult] = js.native
  def max(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, _]): js.Any = js.native
  def max(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, _], context: js.Any): js.Any = js.native
  def min(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, _]): js.Any = js.native
  def min(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, _], context: js.Any): js.Any = js.native
  def `object`(): js.Any = js.native
  def pluck(propertyName: java.lang.String): js.Array[T] = js.native
  def range(start: scala.Double, stop: scala.Double): js.Array[_] = js.native
  def range(start: scala.Double, stop: scala.Double, step: scala.Double): js.Array[_] = js.native
  def range(stop: scala.Double): js.Array[_] = js.native
  def reduce[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def reduce[TResult](
    iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[T, TResult],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  def reduceRight[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def reduceRight[TResult](
    iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[T, TResult],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  def reject(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean]): js.Array[T] = js.native
  def reject(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean], context: js.Any): js.Array[T] = js.native
  def `reject_`(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean]): js.Array[T] = js.native
  def `reject_`(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean], context: js.Any): js.Array[T] = js.native
  def rest(): js.Array[T] = js.native
  def rest(n: scala.Double): js.Array[T] = js.native
  def `rest_`(): js.Array[T] = js.native
  def `rest_`(n: scala.Double): js.Array[T] = js.native
  def select(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean]): js.Array[T] = js.native
  def select(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean], context: js.Any): js.Array[T] = js.native
  def `select_`(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean]): js.Array[T] = js.native
  def `select_`(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean], context: js.Any): js.Array[T] = js.native
  def shuffle(): js.Array[T] = js.native
  def `shuffle_`(): js.Array[T] = js.native
  def size(): scala.Double = js.native
  def some(): scala.Boolean = js.native
  def some(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean]): scala.Boolean = js.native
  def some(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  def sortBy(iterator: java.lang.String): js.Array[T] = js.native
  def sortBy(iterator: java.lang.String, context: js.Any): js.Array[T] = js.native
  def sortBy[TSort](iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TSort]): js.Array[T] = js.native
  def sortBy[TSort](iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TSort], context: js.Any): js.Array[T] = js.native
  def `sortBy_`(iterator: java.lang.String): js.Array[T] = js.native
  def `sortBy_`(iterator: java.lang.String, context: js.Any): js.Array[T] = js.native
  def `sortBy_`[TSort](iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TSort]): js.Array[T] = js.native
  def `sortBy_`[TSort](iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TSort], context: js.Any): js.Array[T] = js.native
  def sortedIndex[TSort](value: T): scala.Double = js.native
  def sortedIndex[TSort](value: T, iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TSort]): scala.Double = js.native
  def tail(): js.Array[T] = js.native
  def tail(n: scala.Double): js.Array[T] = js.native
  def `tail_`(): js.Array[T] = js.native
  def `tail_`(n: scala.Double): js.Array[T] = js.native
  def take(): T = js.native
  def take(n: scala.Double): js.Array[T] = js.native
  def union(arrays: js.Array[T]*): js.Array[T] = js.native
  def `union_`(arrays: js.Array[T]*): js.Array[T] = js.native
  def uniq[TSort](): js.Array[T] = js.native
  def uniq[TSort](isSorted: scala.Boolean): js.Array[T] = js.native
  def uniq[TSort](isSorted: scala.Boolean, iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TSort]): js.Array[T] = js.native
  def `uniq_`[TSort](): js.Array[T] = js.native
  def `uniq_`[TSort](isSorted: scala.Boolean): js.Array[T] = js.native
  def `uniq_`[TSort](isSorted: scala.Boolean, iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TSort]): js.Array[T] = js.native
  def unique[TSort](): js.Array[T] = js.native
  def unique[TSort](isSorted: scala.Boolean): js.Array[T] = js.native
  def unique[TSort](isSorted: scala.Boolean, iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TSort]): js.Array[T] = js.native
  def `unique_`[TSort](): js.Array[T] = js.native
  def `unique_`[TSort](isSorted: scala.Boolean): js.Array[T] = js.native
  def `unique_`[TSort](isSorted: scala.Boolean, iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[T, TSort]): js.Array[T] = js.native
  def where[U /* <: js.Object */](properties: U): js.Array[T] = js.native
  def without(values: T*): js.Array[T] = js.native
  def `without_`(values: T*): js.Array[T] = js.native
  def zip(arrays: js.Any*): js.Array[_] = js.native
  def `zip_`(arrays: js.Any*): js.Array[_] = js.native
}

