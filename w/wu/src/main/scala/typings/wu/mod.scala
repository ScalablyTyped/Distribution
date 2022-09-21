package typings.wu

import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](iterable: js.Iterable[T]): WuIterable[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[WuIterable[T]]
  
  @JSImport("wu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // also copied to WuIterable
  inline def asyncEach(fn: Consumer[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncEach")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def asyncEach(fn: Consumer[Any], maxBlock: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncEach")(fn.asInstanceOf[js.Any], maxBlock.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def asyncEach(fn: Consumer[Any], maxBlock: Double, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncEach")(fn.asInstanceOf[js.Any], maxBlock.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def asyncEach(fn: Consumer[Any], maxBlock: Unit, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncEach")(fn.asInstanceOf[js.Any], maxBlock.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // only static
  inline def chain[T](iters: js.Iterable[T]*): WuIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(iters.asInstanceOf[Seq[js.Any]]*).asInstanceOf[WuIterable[T]]
  
  inline def chunk[T](n: Double, iter: js.Iterable[T]): WuIterable[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("chunk")(n.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[js.Array[T]]]
  
  inline def concatMap[T, U](fn: js.Function1[/* t */ T, js.Iterable[U]], iter: js.Iterable[T]): WuIterable[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[U]]
  
  inline def count(): WuIterable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[WuIterable[Double]]
  inline def count(start: Double): WuIterable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(start.asInstanceOf[js.Any]).asInstanceOf[WuIterable[Double]]
  inline def count(start: Double, step: Double): WuIterable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[WuIterable[Double]]
  inline def count(start: Unit, step: Double): WuIterable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[WuIterable[Double]]
  
  inline def curryable(fun: js.Function1[/* repeated */ Any, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("curryable")(fun.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def curryable(fun: js.Function1[/* repeated */ Any, Any], expected: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("curryable")(fun.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def cycle[T](iter: js.Iterable[T]): WuIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cycle")(iter.asInstanceOf[js.Any]).asInstanceOf[WuIterable[T]]
  
  inline def drop[T](n: Double, iter: js.Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("drop")(n.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
  
  inline def dropWhile[T](fn: Filter_[T], iter: js.Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("dropWhile")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
  
  inline def entries[T](obj: StringDictionary[T]): WuIterable[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(obj.asInstanceOf[js.Any]).asInstanceOf[WuIterable[js.Tuple2[String, T]]]
  
  inline def enumerate[T](iter: js.Iterable[T]): WuIterable[js.Tuple2[T, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")(iter.asInstanceOf[js.Any]).asInstanceOf[WuIterable[js.Tuple2[T, Double]]]
  
  inline def every[T](fn: Filter_[T], iter: js.Iterable[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def filter[T](fn: Filter_[T], iter: js.Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
  
  inline def filter_TS_T[T, S /* <: T */](fn: TypeGuardFilter[T, S], iter: js.Iterable[T]): WuIterable[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[S]]
  
  inline def find[T](fn: Filter_[T], iter: js.Iterable[T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def find_TS_T[T, S /* <: T */](fn: TypeGuardFilter[T, S], iter: js.Iterable[T]): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
  
  inline def flatten(iter: js.Iterable[Any]): WuIterable[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(iter.asInstanceOf[js.Any]).asInstanceOf[WuIterable[Any]]
  inline def flatten(shallow: Boolean, iter: js.Iterable[Any]): WuIterable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(shallow.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[Any]]
  
  inline def forEach[T](fn: Consumer[T], iter: js.Iterable[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def has[T](t: T, iter: js.Iterable[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(t.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  // invoke<T, U>(name:string, ...t:T[], iter: Iterable<(t:T)=>U>): WuIterable<U>;
  @JSImport("wu", "invoke")
  @js.native
  val invoke: Any = js.native
  
  inline def keys(obj: StringDictionary[Any]): WuIterable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[WuIterable[String]]
  
  inline def map[T, U](fn: js.Function1[/* t */ T, U], iter: js.Iterable[T]): WuIterable[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[U]]
  
  // pluck<T>(attribute:string, iter: Iterable<{[attribute]: T}>): WuIterable<T>;
  inline def pluck(attribute: String, iter: js.Iterable[Any]): WuIterable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(attribute.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[Any]]
  
  inline def reduce[T](fn: js.Function2[/* a */ T, /* b */ T, T], initial: T, iter: js.Iterable[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(fn.asInstanceOf[js.Any], initial.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def reduce[T](fn: js.Function2[/* a */ T, /* b */ T, T], iter: js.Iterable[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def reduce_TU_U[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], initial: U, iter: js.Iterable[T]): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(fn.asInstanceOf[js.Any], initial.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[U]
  inline def reduce_TU_U[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], iter: js.Iterable[T]): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[U]
  
  inline def reductions[T](fn: js.Function2[/* a */ T, /* b */ T, T], initial: T, iter: js.Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("reductions")(fn.asInstanceOf[js.Any], initial.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
  inline def reductions[T](fn: js.Function2[/* a */ T, /* b */ T, T], iter: js.Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("reductions")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
  
  inline def reductions_TU[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], initial: U, iter: js.Iterable[T]): WuIterable[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("reductions")(fn.asInstanceOf[js.Any], initial.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[U]]
  inline def reductions_TU[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], iter: js.Iterable[T]): WuIterable[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("reductions")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[U]]
  
  inline def reject[T](fn: Filter_[T], iter: js.Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
  
  inline def repeat[T](obj: T): WuIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(obj.asInstanceOf[js.Any]).asInstanceOf[WuIterable[T]]
  inline def repeat[T](obj: T, times: Double): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(obj.asInstanceOf[js.Any], times.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
  
  inline def slice[T](iter: js.Iterable[T]): WuIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(iter.asInstanceOf[js.Any]).asInstanceOf[WuIterable[T]]
  inline def slice[T](start: Double, iter: js.Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
  inline def slice[T](start: Double, stop: Double, iter: js.Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
  
  inline def some[T](fn: Filter_[T], iter: js.Iterable[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def spreadMap[T](fn: js.Function1[/* repeated */ Any, T], iter: js.Iterable[js.Array[Any]]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("spreadMap")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
  
  inline def take[T](n: Double, iter: js.Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(n.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
  
  inline def takeWhile[T](fn: Filter_[T], iter: js.Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
  
  inline def tap[T](fn: Consumer[T], iter: js.Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
  
  inline def tee[T](iter: js.Iterable[T]): js.Array[WuIterable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tee")(iter.asInstanceOf[js.Any]).asInstanceOf[js.Array[WuIterable[T]]]
  inline def tee[T](n: Double, iter: js.Iterable[T]): js.Array[WuIterable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tee")(n.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[js.Array[WuIterable[T]]]
  
  inline def toArray[T](iter: js.Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iter.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def unique[T](iter: js.Iterable[T]): WuIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(iter.asInstanceOf[js.Any]).asInstanceOf[WuIterable[T]]
  
  @JSImport("wu", "unzip")
  @js.native
  val unzip: Any = js.native
  
  inline def values[T](obj: StringDictionary[T]): WuIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[WuIterable[T]]
  
  inline def zip[T, U](iter2: js.Iterable[T], iter: js.Iterable[U]): WuIterable[js.Tuple2[T, U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(iter2.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[js.Tuple2[T, U]]]
  
  inline def zipLongest[T, U](iter2: js.Iterable[T], iter: js.Iterable[U]): WuIterable[js.Tuple2[T, U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zipLongest")(iter2.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[js.Tuple2[T, U]]]
  
  @JSImport("wu", "zipWith")
  @js.native
  val zipWith: Any = js.native
  
  type Consumer[T] = js.Function1[/* t */ T, Unit]
  
  type Filter_[T] = js.Function1[/* t */ T, Boolean]
  
  type TypeGuardFilter[T, S /* <: T */] = js.Function1[/* t */ T, /* is S */ Boolean]
  
  @js.native
  trait WuIterable[T]
    extends StObject
       with IterableIterator[T] {
    
    // generated from section "copied to WuIterable" above via
    // sed -r 's/(, )?iter: Iterable<\w+>//' |
    // sed -r 's/^(\s+\w+)<T>/\1/' |
    // sed -r 's/^(\s+\w+)<T, /\1</'
    def asyncEach(fn: Consumer[Any]): Any = js.native
    def asyncEach(fn: Consumer[Any], maxBlock: Double): Any = js.native
    def asyncEach(fn: Consumer[Any], maxBlock: Double, timeout: Double): Any = js.native
    def asyncEach(fn: Consumer[Any], maxBlock: Unit, timeout: Double): Any = js.native
    
    def chunk(n: Double): WuIterable[js.Array[T]] = js.native
    
    def concatMap[U](fn: js.Function1[/* t */ T, js.Iterable[U]]): WuIterable[U] = js.native
    
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
    
    def flatten(): WuIterable[Any] = js.native
    def flatten(shallow: Boolean): WuIterable[Any] = js.native
    
    def forEach(fn: Consumer[T]): Unit = js.native
    
    def has(t: T): Boolean = js.native
    
    // invoke<T, U>(name:string, ...t:T[], iter: Iterable<(t:T)=>U>): WuIterable<U>;
    var invoke: Any = js.native
    
    def map[U](fn: js.Function1[/* t */ T, U]): WuIterable[U] = js.native
    
    // pluck<T>(attribute:string, iter: Iterable<{[attribute]: T}>): WuIterable<T>;
    def pluck(attribute: String): WuIterable[Any] = js.native
    
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
    def slice(start: Double): WuIterable[T] = js.native
    def slice(start: Double, stop: Double): WuIterable[T] = js.native
    def slice(start: Unit, stop: Double): WuIterable[T] = js.native
    
    def some(fn: Filter_[T]): Boolean = js.native
    
    def spreadMap(fn: js.Function1[/* repeated */ Any, T], iter: js.Iterable[js.Array[Any]]): WuIterable[T] = js.native
    
    def take(n: Double): WuIterable[T] = js.native
    
    def takeWhile(fn: Filter_[T]): WuIterable[T] = js.native
    
    def tap(fn: Consumer[T]): WuIterable[T] = js.native
    
    def tee(): js.Array[WuIterable[T]] = js.native
    def tee(n: Double): js.Array[WuIterable[T]] = js.native
    
    def toArray(): js.Array[T] = js.native
    
    def unique(): WuIterable[T] = js.native
    
    var unzip: Any = js.native
    
    def zip[U](iter2: js.Iterable[U]): WuIterable[js.Tuple2[T, U]] = js.native
    
    def zipLongest[U](iter2: js.Iterable[U]): WuIterable[js.Tuple2[T, U]] = js.native
    
    var zipWith: Any = js.native
  }
}
