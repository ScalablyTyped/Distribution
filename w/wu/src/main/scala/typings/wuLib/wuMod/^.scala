package typings
package wuLib.wuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wu", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // invoke<T, U>(name:string, ...t:T[], iter: Iterable<(t:T)=>U>): WuIterable<U>;
  val invoke: js.Any = js.native
  val unzip: js.Any = js.native
  val zipWith: js.Any = js.native
  def apply[T](iterable: stdLib.Iterable[T]): WuIterable[T] = js.native
  // also copied to WuIterable
  def asyncEach(fn: Consumer[_]): scala.Unit = js.native
  def asyncEach(fn: Consumer[_], maxBlock: scala.Double): scala.Unit = js.native
  def asyncEach(fn: Consumer[_], maxBlock: scala.Double, timeout: scala.Double): scala.Unit = js.native
  // only static
  def chain[T](iters: stdLib.Iterable[T]*): WuIterable[T] = js.native
  def chunk[T](n: scala.Double, iter: stdLib.Iterable[T]): WuIterable[js.Array[T]] = js.native
  def concatMap[T, U](fn: js.Function1[/* t */ T, stdLib.Iterable[U]], iter: stdLib.Iterable[T]): WuIterable[U] = js.native
  def count(): WuIterable[scala.Double] = js.native
  def count(start: scala.Double): WuIterable[scala.Double] = js.native
  def count(start: scala.Double, step: scala.Double): WuIterable[scala.Double] = js.native
  def curryable(fun: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def curryable(fun: js.Function1[/* repeated */ js.Any, _], expected: scala.Double): js.Any = js.native
  def cycle[T](iter: stdLib.Iterable[T]): WuIterable[T] = js.native
  def drop[T](n: scala.Double, iter: stdLib.Iterable[T]): WuIterable[T] = js.native
  def dropWhile[T](fn: Filter[T], iter: stdLib.Iterable[T]): WuIterable[T] = js.native
  def entries[T](obj: org.scalablytyped.runtime.StringDictionary[T]): WuIterable[js.Tuple2[java.lang.String, T]] = js.native
  def enumerate[T](iter: stdLib.Iterable[T]): WuIterable[js.Tuple2[T, scala.Double]] = js.native
  def every[T](fn: Filter[T], iter: stdLib.Iterable[T]): scala.Boolean = js.native
  def filter[T](fn: Filter[T], iter: stdLib.Iterable[T]): WuIterable[T] = js.native
  def find[T](fn: Filter[T], iter: stdLib.Iterable[T]): js.UndefOr[T] = js.native
  def flatten(iter: stdLib.Iterable[_]): WuIterable[_] = js.native
  def flatten(shallow: scala.Boolean, iter: stdLib.Iterable[_]): WuIterable[_] = js.native
  def forEach[T](fn: Consumer[T], iter: stdLib.Iterable[T]): scala.Unit = js.native
  def has[T](t: T, iter: stdLib.Iterable[T]): scala.Boolean = js.native
  def keys(obj: org.scalablytyped.runtime.StringDictionary[js.Any]): WuIterable[java.lang.String] = js.native
  def map[T, U](fn: js.Function1[/* t */ T, U], iter: stdLib.Iterable[T]): WuIterable[U] = js.native
  // pluck<T>(attribute:string, iter: Iterable<{[attribute]: T}>): WuIterable<T>;
  def pluck(attribute: java.lang.String, iter: stdLib.Iterable[_]): WuIterable[_] = js.native
  def reduce[T](fn: js.Function2[/* a */ T, /* b */ T, T], initial: T, iter: stdLib.Iterable[T]): T = js.native
  def reduce[T](fn: js.Function2[/* a */ T, /* b */ T, T], iter: stdLib.Iterable[T]): T = js.native
  @JSName("reduce")
  def reduce_TUU[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], initial: U, iter: stdLib.Iterable[T]): U = js.native
  @JSName("reduce")
  def reduce_TUU[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], iter: stdLib.Iterable[T]): U = js.native
  def reductions[T](fn: js.Function2[/* a */ T, /* b */ T, T], initial: T, iter: stdLib.Iterable[T]): WuIterable[T] = js.native
  def reductions[T](fn: js.Function2[/* a */ T, /* b */ T, T], iter: stdLib.Iterable[T]): WuIterable[T] = js.native
  @JSName("reductions")
  def reductions_TU[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], initial: U, iter: stdLib.Iterable[T]): WuIterable[U] = js.native
  @JSName("reductions")
  def reductions_TU[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], iter: stdLib.Iterable[T]): WuIterable[U] = js.native
  def reject[T](fn: Filter[T], iter: stdLib.Iterable[T]): WuIterable[T] = js.native
  def repeat[T](obj: T): WuIterable[T] = js.native
  def repeat[T](obj: T, times: scala.Double): WuIterable[T] = js.native
  def slice[T](iter: stdLib.Iterable[T]): WuIterable[T] = js.native
  def slice[T](start: scala.Double, iter: stdLib.Iterable[T]): WuIterable[T] = js.native
  def slice[T](start: scala.Double, stop: scala.Double, iter: stdLib.Iterable[T]): WuIterable[T] = js.native
  def some[T](fn: Filter[T], iter: stdLib.Iterable[T]): scala.Boolean = js.native
  def spreadMap[T](fn: js.Function1[/* repeated */ js.Any, T], iter: stdLib.Iterable[js.Array[_]]): WuIterable[T] = js.native
  def take[T](n: scala.Double, iter: stdLib.Iterable[T]): WuIterable[T] = js.native
  def takeWhile[T](fn: Filter[T], iter: stdLib.Iterable[T]): WuIterable[T] = js.native
  def tap[T](fn: Consumer[T], iter: stdLib.Iterable[T]): WuIterable[T] = js.native
  def tee[T](iter: stdLib.Iterable[T]): js.Array[WuIterable[T]] = js.native
  def tee[T](n: scala.Double, iter: stdLib.Iterable[T]): js.Array[WuIterable[T]] = js.native
  def toArray[T](iter: stdLib.Iterable[T]): js.Array[T] = js.native
  def unique[T](iter: stdLib.Iterable[T]): WuIterable[T] = js.native
  def values[T](obj: org.scalablytyped.runtime.StringDictionary[T]): WuIterable[T] = js.native
  def zip[T, U](iter2: stdLib.Iterable[T], iter: stdLib.Iterable[U]): WuIterable[js.Tuple2[T, U]] = js.native
  def zipLongest[T, U](iter2: stdLib.Iterable[T], iter: stdLib.Iterable[U]): WuIterable[js.Tuple2[T, U]] = js.native
}

