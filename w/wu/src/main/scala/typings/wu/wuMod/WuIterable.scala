package typings.wu.wuMod

import typings.std.Iterable
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WuIterable[T] extends IterableIterator[T] {
  // invoke<T, U>(name:string, ...t:T[], iter: Iterable<(t:T)=>U>): WuIterable<U>;
  var invoke: js.Any = js.native
  var unzip: js.Any = js.native
  var zipWith: js.Any = js.native
  // generated from section "copied to WuIterable" above via
  // sed -r 's/(, )?iter: Iterable<\w+>//' |
  // sed -r 's/^(\s+\w+)<T>/\1/' |
  // sed -r 's/^(\s+\w+)<T, /\1</'
  def asyncEach(fn: Consumer[_]): js.Any = js.native
  def asyncEach(fn: Consumer[_], maxBlock: Double): js.Any = js.native
  def asyncEach(fn: Consumer[_], maxBlock: Double, timeout: Double): js.Any = js.native
  def chunk(n: Double): WuIterable[js.Array[T]] = js.native
  def concatMap[U](fn: js.Function1[/* t */ T, Iterable[U]]): WuIterable[U] = js.native
  def cycle(): WuIterable[T] = js.native
  def drop(n: Double): WuIterable[T] = js.native
  def dropWhile(fn: Filter[T]): WuIterable[T] = js.native
  def enumerate(): WuIterable[js.Tuple2[T, Double]] = js.native
  def every(fn: Filter[T]): Boolean = js.native
  def filter(fn: Filter[T]): WuIterable[T] = js.native
  def find(fn: Filter[T]): js.UndefOr[T] = js.native
  def flatten(): WuIterable[_] = js.native
  def flatten(shallow: Boolean): WuIterable[_] = js.native
  def forEach(fn: Consumer[T]): Unit = js.native
  def has(t: T): Boolean = js.native
  def map[U](fn: js.Function1[/* t */ T, U]): WuIterable[U] = js.native
  // pluck<T>(attribute:string, iter: Iterable<{[attribute]: T}>): WuIterable<T>;
  def pluck(attribute: String): WuIterable[_] = js.native
  def reduce(fn: js.Function2[/* a */ T, /* b */ T, T]): T = js.native
  def reduce(fn: js.Function2[/* a */ T, /* b */ T, T], initial: T): T = js.native
  @JSName("reduce")
  def reduce_U_U[U](fn: js.Function2[/* a */ U, /* b */ T, U]): U = js.native
  @JSName("reduce")
  def reduce_U_U[U](fn: js.Function2[/* a */ U, /* b */ T, U], initial: U): U = js.native
  def reductions(fn: js.Function2[/* a */ T, /* b */ T, T]): WuIterable[T] = js.native
  def reductions(fn: js.Function2[/* a */ T, /* b */ T, T], initial: T): WuIterable[T] = js.native
  @JSName("reductions")
  def reductions_U[U](fn: js.Function2[/* a */ U, /* b */ T, U]): WuIterable[U] = js.native
  @JSName("reductions")
  def reductions_U[U](fn: js.Function2[/* a */ U, /* b */ T, U], initial: U): WuIterable[U] = js.native
  def reject(fn: Filter[T]): WuIterable[T] = js.native
  def slice(): WuIterable[T] = js.native
  def slice(start: Double): WuIterable[T] = js.native
  def slice(start: Double, stop: Double): WuIterable[T] = js.native
  def some(fn: Filter[T]): Boolean = js.native
  def spreadMap(fn: js.Function1[/* repeated */ js.Any, T], iter: Iterable[js.Array[_]]): WuIterable[T] = js.native
  def take(n: Double): WuIterable[T] = js.native
  def takeWhile(fn: Filter[T]): WuIterable[T] = js.native
  def tap(fn: Consumer[T]): WuIterable[T] = js.native
  def tee(): js.Array[WuIterable[T]] = js.native
  def tee(n: Double): js.Array[WuIterable[T]] = js.native
  def toArray(): js.Array[T] = js.native
  def unique(): WuIterable[T] = js.native
  // TODO: this makes no sense, where did the second entry come from?
  // tslint:disable-next-line no-unnecessary-generics
  def zip[U](iter2: Iterable[T]): WuIterable[js.Tuple2[T, U]] = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def zipLongest[U](iter2: Iterable[T]): WuIterable[js.Tuple2[T, U]] = js.native
}

