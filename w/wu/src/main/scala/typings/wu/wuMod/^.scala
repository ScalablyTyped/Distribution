package typings.wu.wuMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
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
  def apply[T](iterable: Iterable[T]): WuIterable[T] = js.native
  // also copied to WuIterable
  def asyncEach(fn: Consumer[_]): Unit = js.native
  def asyncEach(fn: Consumer[_], maxBlock: Double): Unit = js.native
  def asyncEach(fn: Consumer[_], maxBlock: Double, timeout: Double): Unit = js.native
  // only static
  def chain[T](iters: Iterable[T]*): WuIterable[T] = js.native
  def chunk[T](n: Double, iter: Iterable[T]): WuIterable[js.Array[T]] = js.native
  def concatMap[T, U](fn: js.Function1[/* t */ T, Iterable[U]], iter: Iterable[T]): WuIterable[U] = js.native
  def count(): WuIterable[Double] = js.native
  def count(start: Double): WuIterable[Double] = js.native
  def count(start: Double, step: Double): WuIterable[Double] = js.native
  def curryable(fun: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def curryable(fun: js.Function1[/* repeated */ js.Any, _], expected: Double): js.Any = js.native
  def cycle[T](iter: Iterable[T]): WuIterable[T] = js.native
  def drop[T](n: Double, iter: Iterable[T]): WuIterable[T] = js.native
  def dropWhile[T](fn: Filter[T], iter: Iterable[T]): WuIterable[T] = js.native
  def entries[T](obj: StringDictionary[T]): WuIterable[js.Tuple2[String, T]] = js.native
  def enumerate[T](iter: Iterable[T]): WuIterable[js.Tuple2[T, Double]] = js.native
  def every[T](fn: Filter[T], iter: Iterable[T]): Boolean = js.native
  def filter[T](fn: Filter[T], iter: Iterable[T]): WuIterable[T] = js.native
  def find[T](fn: Filter[T], iter: Iterable[T]): js.UndefOr[T] = js.native
  def flatten(iter: Iterable[_]): WuIterable[_] = js.native
  def flatten(shallow: Boolean, iter: Iterable[_]): WuIterable[_] = js.native
  def forEach[T](fn: Consumer[T], iter: Iterable[T]): Unit = js.native
  def has[T](t: T, iter: Iterable[T]): Boolean = js.native
  def keys(obj: StringDictionary[js.Any]): WuIterable[String] = js.native
  def map[T, U](fn: js.Function1[/* t */ T, U], iter: Iterable[T]): WuIterable[U] = js.native
  // pluck<T>(attribute:string, iter: Iterable<{[attribute]: T}>): WuIterable<T>;
  def pluck(attribute: String, iter: Iterable[_]): WuIterable[_] = js.native
  def reduce[T](fn: js.Function2[/* a */ T, /* b */ T, T], initial: T, iter: Iterable[T]): T = js.native
  def reduce[T](fn: js.Function2[/* a */ T, /* b */ T, T], iter: Iterable[T]): T = js.native
  @JSName("reduce")
  def reduce_TU_U[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], initial: U, iter: Iterable[T]): U = js.native
  @JSName("reduce")
  def reduce_TU_U[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], iter: Iterable[T]): U = js.native
  def reductions[T](fn: js.Function2[/* a */ T, /* b */ T, T], initial: T, iter: Iterable[T]): WuIterable[T] = js.native
  def reductions[T](fn: js.Function2[/* a */ T, /* b */ T, T], iter: Iterable[T]): WuIterable[T] = js.native
  @JSName("reductions")
  def reductions_TU[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], initial: U, iter: Iterable[T]): WuIterable[U] = js.native
  @JSName("reductions")
  def reductions_TU[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], iter: Iterable[T]): WuIterable[U] = js.native
  def reject[T](fn: Filter[T], iter: Iterable[T]): WuIterable[T] = js.native
  def repeat[T](obj: T): WuIterable[T] = js.native
  def repeat[T](obj: T, times: Double): WuIterable[T] = js.native
  def slice[T](iter: Iterable[T]): WuIterable[T] = js.native
  def slice[T](start: Double, iter: Iterable[T]): WuIterable[T] = js.native
  def slice[T](start: Double, stop: Double, iter: Iterable[T]): WuIterable[T] = js.native
  def some[T](fn: Filter[T], iter: Iterable[T]): Boolean = js.native
  def spreadMap[T](fn: js.Function1[/* repeated */ js.Any, T], iter: Iterable[js.Array[_]]): WuIterable[T] = js.native
  def take[T](n: Double, iter: Iterable[T]): WuIterable[T] = js.native
  def takeWhile[T](fn: Filter[T], iter: Iterable[T]): WuIterable[T] = js.native
  def tap[T](fn: Consumer[T], iter: Iterable[T]): WuIterable[T] = js.native
  def tee[T](iter: Iterable[T]): js.Array[WuIterable[T]] = js.native
  def tee[T](n: Double, iter: Iterable[T]): js.Array[WuIterable[T]] = js.native
  def toArray[T](iter: Iterable[T]): js.Array[T] = js.native
  def unique[T](iter: Iterable[T]): WuIterable[T] = js.native
  def values[T](obj: StringDictionary[T]): WuIterable[T] = js.native
  def zip[T, U](iter2: Iterable[T], iter: Iterable[U]): WuIterable[js.Tuple2[T, U]] = js.native
  def zipLongest[T, U](iter2: Iterable[T], iter: Iterable[U]): WuIterable[js.Tuple2[T, U]] = js.native
}

