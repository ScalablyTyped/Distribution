package typings.wu

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wu", JSImport.Namespace)
  @js.native
  def apply[T](iterable: Iterable[T]): WuIterable[T] = js.native
  
  // also copied to WuIterable
  @JSImport("wu", "asyncEach")
  @js.native
  def asyncEach(fn: Consumer[_]): Unit = js.native
  @JSImport("wu", "asyncEach")
  @js.native
  def asyncEach(fn: Consumer[_], maxBlock: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  @JSImport("wu", "asyncEach")
  @js.native
  def asyncEach(fn: Consumer[_], maxBlock: Double): Unit = js.native
  @JSImport("wu", "asyncEach")
  @js.native
  def asyncEach(fn: Consumer[_], maxBlock: Double, timeout: Double): Unit = js.native
  
  // only static
  @JSImport("wu", "chain")
  @js.native
  def chain[T](iters: Iterable[T]*): WuIterable[T] = js.native
  
  @JSImport("wu", "chunk")
  @js.native
  def chunk[T](n: Double, iter: Iterable[T]): WuIterable[js.Array[T]] = js.native
  
  @JSImport("wu", "concatMap")
  @js.native
  def concatMap[T, U](fn: js.Function1[/* t */ T, Iterable[U]], iter: Iterable[T]): WuIterable[U] = js.native
  
  @JSImport("wu", "count")
  @js.native
  def count(): WuIterable[Double] = js.native
  @JSImport("wu", "count")
  @js.native
  def count(start: js.UndefOr[scala.Nothing], step: Double): WuIterable[Double] = js.native
  @JSImport("wu", "count")
  @js.native
  def count(start: Double): WuIterable[Double] = js.native
  @JSImport("wu", "count")
  @js.native
  def count(start: Double, step: Double): WuIterable[Double] = js.native
  
  @JSImport("wu", "curryable")
  @js.native
  def curryable(fun: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  @JSImport("wu", "curryable")
  @js.native
  def curryable(fun: js.Function1[/* repeated */ js.Any, _], expected: Double): js.Any = js.native
  
  @JSImport("wu", "cycle")
  @js.native
  def cycle[T](iter: Iterable[T]): WuIterable[T] = js.native
  
  @JSImport("wu", "drop")
  @js.native
  def drop[T](n: Double, iter: Iterable[T]): WuIterable[T] = js.native
  
  @JSImport("wu", "dropWhile")
  @js.native
  def dropWhile[T](fn: Filter_[T], iter: Iterable[T]): WuIterable[T] = js.native
  
  @JSImport("wu", "entries")
  @js.native
  def entries[T](obj: StringDictionary[T]): WuIterable[js.Tuple2[String, T]] = js.native
  
  @JSImport("wu", "enumerate")
  @js.native
  def enumerate[T](iter: Iterable[T]): WuIterable[js.Tuple2[T, Double]] = js.native
  
  @JSImport("wu", "every")
  @js.native
  def every[T](fn: Filter_[T], iter: Iterable[T]): Boolean = js.native
  
  @JSImport("wu", "filter")
  @js.native
  def filter[T](fn: Filter_[T], iter: Iterable[T]): WuIterable[T] = js.native
  @JSImport("wu", "filter")
  @js.native
  def filter_TS_T[T, S /* <: T */](fn: TypeGuardFilter[T, S], iter: Iterable[T]): WuIterable[S] = js.native
  
  @JSImport("wu", "find")
  @js.native
  def find[T](fn: Filter_[T], iter: Iterable[T]): js.UndefOr[T] = js.native
  @JSImport("wu", "find")
  @js.native
  def find_TS_T[T, S /* <: T */](fn: TypeGuardFilter[T, S], iter: Iterable[T]): js.UndefOr[S] = js.native
  
  @JSImport("wu", "flatten")
  @js.native
  def flatten(iter: Iterable[_]): WuIterable[_] = js.native
  @JSImport("wu", "flatten")
  @js.native
  def flatten(shallow: Boolean, iter: Iterable[_]): WuIterable[_] = js.native
  
  @JSImport("wu", "forEach")
  @js.native
  def forEach[T](fn: Consumer[T], iter: Iterable[T]): Unit = js.native
  
  @JSImport("wu", "has")
  @js.native
  def has[T](t: T, iter: Iterable[T]): Boolean = js.native
  
  // invoke<T, U>(name:string, ...t:T[], iter: Iterable<(t:T)=>U>): WuIterable<U>;
  @JSImport("wu", "invoke")
  @js.native
  val invoke: js.Any = js.native
  
  @JSImport("wu", "keys")
  @js.native
  def keys(obj: StringDictionary[js.Any]): WuIterable[String] = js.native
  
  @JSImport("wu", "map")
  @js.native
  def map[T, U](fn: js.Function1[/* t */ T, U], iter: Iterable[T]): WuIterable[U] = js.native
  
  // pluck<T>(attribute:string, iter: Iterable<{[attribute]: T}>): WuIterable<T>;
  @JSImport("wu", "pluck")
  @js.native
  def pluck(attribute: String, iter: Iterable[_]): WuIterable[_] = js.native
  
  @JSImport("wu", "reduce")
  @js.native
  def reduce[T](fn: js.Function2[/* a */ T, /* b */ T, T], initial: T, iter: Iterable[T]): T = js.native
  @JSImport("wu", "reduce")
  @js.native
  def reduce[T](fn: js.Function2[/* a */ T, /* b */ T, T], iter: Iterable[T]): T = js.native
  @JSImport("wu", "reduce")
  @js.native
  def reduce_TU_U[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], initial: U, iter: Iterable[T]): U = js.native
  @JSImport("wu", "reduce")
  @js.native
  def reduce_TU_U[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], iter: Iterable[T]): U = js.native
  
  @JSImport("wu", "reductions")
  @js.native
  def reductions[T](fn: js.Function2[/* a */ T, /* b */ T, T], initial: T, iter: Iterable[T]): WuIterable[T] = js.native
  @JSImport("wu", "reductions")
  @js.native
  def reductions[T](fn: js.Function2[/* a */ T, /* b */ T, T], iter: Iterable[T]): WuIterable[T] = js.native
  @JSImport("wu", "reductions")
  @js.native
  def reductions_TU[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], initial: U, iter: Iterable[T]): WuIterable[U] = js.native
  @JSImport("wu", "reductions")
  @js.native
  def reductions_TU[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], iter: Iterable[T]): WuIterable[U] = js.native
  
  @JSImport("wu", "reject")
  @js.native
  def reject[T](fn: Filter_[T], iter: Iterable[T]): WuIterable[T] = js.native
  
  @JSImport("wu", "repeat")
  @js.native
  def repeat[T](obj: T): WuIterable[T] = js.native
  @JSImport("wu", "repeat")
  @js.native
  def repeat[T](obj: T, times: Double): WuIterable[T] = js.native
  
  @JSImport("wu", "slice")
  @js.native
  def slice[T](iter: Iterable[T]): WuIterable[T] = js.native
  @JSImport("wu", "slice")
  @js.native
  def slice[T](start: Double, iter: Iterable[T]): WuIterable[T] = js.native
  @JSImport("wu", "slice")
  @js.native
  def slice[T](start: Double, stop: Double, iter: Iterable[T]): WuIterable[T] = js.native
  
  @JSImport("wu", "some")
  @js.native
  def some[T](fn: Filter_[T], iter: Iterable[T]): Boolean = js.native
  
  @JSImport("wu", "spreadMap")
  @js.native
  def spreadMap[T](fn: js.Function1[/* repeated */ js.Any, T], iter: Iterable[js.Array[_]]): WuIterable[T] = js.native
  
  @JSImport("wu", "take")
  @js.native
  def take[T](n: Double, iter: Iterable[T]): WuIterable[T] = js.native
  
  @JSImport("wu", "takeWhile")
  @js.native
  def takeWhile[T](fn: Filter_[T], iter: Iterable[T]): WuIterable[T] = js.native
  
  @JSImport("wu", "tap")
  @js.native
  def tap[T](fn: Consumer[T], iter: Iterable[T]): WuIterable[T] = js.native
  
  @JSImport("wu", "tee")
  @js.native
  def tee[T](iter: Iterable[T]): js.Array[WuIterable[T]] = js.native
  @JSImport("wu", "tee")
  @js.native
  def tee[T](n: Double, iter: Iterable[T]): js.Array[WuIterable[T]] = js.native
  
  @JSImport("wu", "toArray")
  @js.native
  def toArray[T](iter: Iterable[T]): js.Array[T] = js.native
  
  @JSImport("wu", "unique")
  @js.native
  def unique[T](iter: Iterable[T]): WuIterable[T] = js.native
  
  @JSImport("wu", "unzip")
  @js.native
  val unzip: js.Any = js.native
  
  @JSImport("wu", "values")
  @js.native
  def values[T](obj: StringDictionary[T]): WuIterable[T] = js.native
  
  @JSImport("wu", "zip")
  @js.native
  def zip[T, U](iter2: Iterable[T], iter: Iterable[U]): WuIterable[js.Tuple2[T, U]] = js.native
  
  @JSImport("wu", "zipLongest")
  @js.native
  def zipLongest[T, U](iter2: Iterable[T], iter: Iterable[U]): WuIterable[js.Tuple2[T, U]] = js.native
  
  @JSImport("wu", "zipWith")
  @js.native
  val zipWith: js.Any = js.native
  
  type Consumer[T] = js.Function1[/* t */ T, Unit]
  
  type Filter_[T] = js.Function1[/* t */ T, Boolean]
  
  type TypeGuardFilter[T, S /* <: T */] = js.Function1[/* t */ T, /* is S */ Boolean]
  
  @js.native
  trait WuIterable[T] extends IterableIterator[T] {
    
    // generated from section "copied to WuIterable" above via
    // sed -r 's/(, )?iter: Iterable<\w+>//' |
    // sed -r 's/^(\s+\w+)<T>/\1/' |
    // sed -r 's/^(\s+\w+)<T, /\1</'
    def asyncEach(fn: Consumer[_]): js.Any = js.native
    def asyncEach(fn: Consumer[_], maxBlock: js.UndefOr[scala.Nothing], timeout: Double): js.Any = js.native
    def asyncEach(fn: Consumer[_], maxBlock: Double): js.Any = js.native
    def asyncEach(fn: Consumer[_], maxBlock: Double, timeout: Double): js.Any = js.native
    
    def chunk(n: Double): WuIterable[js.Array[T]] = js.native
    
    def concatMap[U](fn: js.Function1[/* t */ T, Iterable[U]]): WuIterable[U] = js.native
    
    def cycle(): WuIterable[T] = js.native
    
    def drop(n: Double): WuIterable[T] = js.native
    
    def dropWhile(fn: Filter_[T]): WuIterable[T] = js.native
    
    def enumerate(): WuIterable[js.Tuple2[T, Double]] = js.native
    
    def every(fn: Filter_[T]): Boolean = js.native
    
    def filter(fn: Filter_[T]): WuIterable[T] = js.native
    @JSName("filter")
    def filter_S_T[S /* <: T */](fn: TypeGuardFilter[T, S]): WuIterable[S] = js.native
    
    def find(fn: Filter_[T]): js.UndefOr[T] = js.native
    @JSName("find")
    def find_S_T[S /* <: T */](fn: TypeGuardFilter[T, S]): js.UndefOr[S] = js.native
    
    def flatten(): WuIterable[_] = js.native
    def flatten(shallow: Boolean): WuIterable[_] = js.native
    
    def forEach(fn: Consumer[T]): Unit = js.native
    
    def has(t: T): Boolean = js.native
    
    // invoke<T, U>(name:string, ...t:T[], iter: Iterable<(t:T)=>U>): WuIterable<U>;
    var invoke: js.Any = js.native
    
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
    
    def reject(fn: Filter_[T]): WuIterable[T] = js.native
    
    def slice(): WuIterable[T] = js.native
    def slice(start: js.UndefOr[scala.Nothing], stop: Double): WuIterable[T] = js.native
    def slice(start: Double): WuIterable[T] = js.native
    def slice(start: Double, stop: Double): WuIterable[T] = js.native
    
    def some(fn: Filter_[T]): Boolean = js.native
    
    def spreadMap(fn: js.Function1[/* repeated */ js.Any, T], iter: Iterable[js.Array[_]]): WuIterable[T] = js.native
    
    def take(n: Double): WuIterable[T] = js.native
    
    def takeWhile(fn: Filter_[T]): WuIterable[T] = js.native
    
    def tap(fn: Consumer[T]): WuIterable[T] = js.native
    
    def tee(): js.Array[WuIterable[T]] = js.native
    def tee(n: Double): js.Array[WuIterable[T]] = js.native
    
    def toArray(): js.Array[T] = js.native
    
    def unique(): WuIterable[T] = js.native
    
    var unzip: js.Any = js.native
    
    def zip[U](iter2: Iterable[U]): WuIterable[js.Tuple2[T, U]] = js.native
    
    def zipLongest[U](iter2: Iterable[U]): WuIterable[js.Tuple2[T, U]] = js.native
    
    var zipWith: js.Any = js.native
  }
}
