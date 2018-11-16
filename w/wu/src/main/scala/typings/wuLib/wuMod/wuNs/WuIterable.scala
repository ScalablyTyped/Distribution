package typings
package wuLib.wuMod.wuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WuIterable[T]
  extends stdLib.IterableIterator[T] {
  // invoke<T, U>(name:string, ...t:T[], iter: Iterable<(t:T)=>U>): WuIterable<U>;
  var invoke: js.Any = js.native
  var unzip: js.Any = js.native
  var zipWith: js.Any = js.native
  // generated from section "copied to WuIterable" above via
  // sed -r 's/(, )?iter: Iterable<\w+>//' |
  // sed -r 's/^(\s+\w+)<T>/\1/' |
  // sed -r 's/^(\s+\w+)<T, /\1</'
  def asyncEach(fn: Consumer[_]): js.Any = js.native
  // generated from section "copied to WuIterable" above via
  // sed -r 's/(, )?iter: Iterable<\w+>//' |
  // sed -r 's/^(\s+\w+)<T>/\1/' |
  // sed -r 's/^(\s+\w+)<T, /\1</'
  def asyncEach(fn: Consumer[_], maxBlock: scala.Double): js.Any = js.native
  // generated from section "copied to WuIterable" above via
  // sed -r 's/(, )?iter: Iterable<\w+>//' |
  // sed -r 's/^(\s+\w+)<T>/\1/' |
  // sed -r 's/^(\s+\w+)<T, /\1</'
  def asyncEach(fn: Consumer[_], maxBlock: scala.Double, timeout: scala.Double): js.Any = js.native
  def chunk(n: scala.Double): WuIterable[js.Array[T]] = js.native
  def concatMap[U](fn: js.Function1[/* t */ T, stdLib.Iterable[U]]): WuIterable[U] = js.native
  def cycle(): WuIterable[T] = js.native
  def drop(n: scala.Double): WuIterable[T] = js.native
  def dropWhile(fn: Filter[T]): WuIterable[T] = js.native
  def enumerate(): WuIterable[js.Tuple2[T, scala.Double]] = js.native
  def every(fn: Filter[T]): scala.Boolean = js.native
  def filter(fn: Filter[T]): WuIterable[T] = js.native
  def find(fn: Filter[T]): js.UndefOr[T] = js.native
  def flatten(): WuIterable[_] = js.native
  def flatten(shallow: scala.Boolean): WuIterable[_] = js.native
  def forEach(fn: Consumer[T]): scala.Unit = js.native
  def has(t: T): scala.Boolean = js.native
  def map[U](fn: js.Function1[/* t */ T, U]): WuIterable[U] = js.native
  // pluck<T>(attribute:string, iter: Iterable<{[attribute]: T}>): WuIterable<T>;
  def pluck(attribute: java.lang.String): WuIterable[_] = js.native
  def reduce(fn: js.Function2[/* a */ T, /* b */ T, T]): T = js.native
  def reduce(fn: js.Function2[/* a */ T, /* b */ T, T], initial: T): T = js.native
  @JSName("reduce")
  def reduce_UU[U](fn: js.Function2[/* a */ U, /* b */ T, U]): U = js.native
  @JSName("reduce")
  def reduce_UU[U](fn: js.Function2[/* a */ U, /* b */ T, U], initial: U): U = js.native
  def reductions(fn: js.Function2[/* a */ T, /* b */ T, T]): WuIterable[T] = js.native
  def reductions(fn: js.Function2[/* a */ T, /* b */ T, T], initial: T): WuIterable[T] = js.native
  @JSName("reductions")
  def reductions_U[U](fn: js.Function2[/* a */ U, /* b */ T, U]): WuIterable[U] = js.native
  @JSName("reductions")
  def reductions_U[U](fn: js.Function2[/* a */ U, /* b */ T, U], initial: U): WuIterable[U] = js.native
  def reject(fn: Filter[T]): WuIterable[T] = js.native
  def slice(): WuIterable[T] = js.native
  def slice(start: scala.Double): WuIterable[T] = js.native
  def slice(start: scala.Double, stop: scala.Double): WuIterable[T] = js.native
  def some(fn: Filter[T]): scala.Boolean = js.native
  def spreadMap(fn: js.Function1[/* repeated */js.Any, T], iter: stdLib.Iterable[js.Array[_]]): WuIterable[T] = js.native
  def take(n: scala.Double): WuIterable[T] = js.native
  def takeWhile(fn: Filter[T]): WuIterable[T] = js.native
  def tap(fn: Consumer[T]): WuIterable[T] = js.native
  def tee(): js.Array[WuIterable[T]] = js.native
  def tee(n: scala.Double): js.Array[WuIterable[T]] = js.native
  def unique(): WuIterable[T] = js.native
  // TODO: this makes no sense, where did the second entry come from?
  // tslint:disable-next-line no-unnecessary-generics
  def zip[U](iter2: stdLib.Iterable[T]): WuIterable[js.Tuple2[T, U]] = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def zipLongest[U](iter2: stdLib.Iterable[T]): WuIterable[js.Tuple2[T, U]] = js.native
}

