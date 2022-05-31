package typings.wu

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.wu.mod.Consumer
import typings.wu.mod.Filter_
import typings.wu.mod.TypeGuardFilter
import typings.wu.mod.WuIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object wu {
    
    inline def apply[T](iterable: Iterable[T]): WuIterable[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[WuIterable[T]]
    
    @JSGlobal("wu")
    @js.native
    val ^ : js.Any = js.native
    
    // also copied to WuIterable
    inline def asyncEach(fn: Consumer[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncEach")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def asyncEach(fn: Consumer[js.Any], maxBlock: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncEach")(fn.asInstanceOf[js.Any], maxBlock.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def asyncEach(fn: Consumer[js.Any], maxBlock: Double, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncEach")(fn.asInstanceOf[js.Any], maxBlock.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def asyncEach(fn: Consumer[js.Any], maxBlock: Unit, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncEach")(fn.asInstanceOf[js.Any], maxBlock.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    // only static
    inline def chain[T](iters: Iterable[T]*): WuIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(iters.asInstanceOf[js.Any]).asInstanceOf[WuIterable[T]]
    
    inline def chunk[T](n: Double, iter: Iterable[T]): WuIterable[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("chunk")(n.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[js.Array[T]]]
    
    inline def concatMap[T, U](fn: js.Function1[/* t */ T, Iterable[U]], iter: Iterable[T]): WuIterable[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[U]]
    
    inline def count(): WuIterable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[WuIterable[Double]]
    inline def count(start: Double): WuIterable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(start.asInstanceOf[js.Any]).asInstanceOf[WuIterable[Double]]
    inline def count(start: Double, step: Double): WuIterable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[WuIterable[Double]]
    inline def count(start: Unit, step: Double): WuIterable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[WuIterable[Double]]
    
    inline def curryable(fun: js.Function1[/* repeated */ js.Any, js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("curryable")(fun.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def curryable(fun: js.Function1[/* repeated */ js.Any, js.Any], expected: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("curryable")(fun.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def cycle[T](iter: Iterable[T]): WuIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cycle")(iter.asInstanceOf[js.Any]).asInstanceOf[WuIterable[T]]
    
    inline def drop[T](n: Double, iter: Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("drop")(n.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
    
    inline def dropWhile[T](fn: Filter_[T], iter: Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("dropWhile")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
    
    inline def entries[T](obj: StringDictionary[T]): WuIterable[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(obj.asInstanceOf[js.Any]).asInstanceOf[WuIterable[js.Tuple2[String, T]]]
    
    inline def enumerate[T](iter: Iterable[T]): WuIterable[js.Tuple2[T, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")(iter.asInstanceOf[js.Any]).asInstanceOf[WuIterable[js.Tuple2[T, Double]]]
    
    inline def every[T](fn: Filter_[T], iter: Iterable[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def filter[T](fn: Filter_[T], iter: Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
    
    inline def filter_TS_T[T, S /* <: T */](fn: TypeGuardFilter[T, S], iter: Iterable[T]): WuIterable[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[S]]
    
    inline def find[T](fn: Filter_[T], iter: Iterable[T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
    
    inline def find_TS_T[T, S /* <: T */](fn: TypeGuardFilter[T, S], iter: Iterable[T]): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
    
    inline def flatten(iter: Iterable[js.Any]): WuIterable[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(iter.asInstanceOf[js.Any]).asInstanceOf[WuIterable[js.Any]]
    inline def flatten(shallow: Boolean, iter: Iterable[js.Any]): WuIterable[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(shallow.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[js.Any]]
    
    inline def forEach[T](fn: Consumer[T], iter: Iterable[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def has[T](t: T, iter: Iterable[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(t.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    // invoke<T, U>(name:string, ...t:T[], iter: Iterable<(t:T)=>U>): WuIterable<U>;
    @JSGlobal("wu.invoke")
    @js.native
    val invoke: js.Any = js.native
    
    inline def keys(obj: StringDictionary[js.Any]): WuIterable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[WuIterable[String]]
    
    inline def map[T, U](fn: js.Function1[/* t */ T, U], iter: Iterable[T]): WuIterable[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[U]]
    
    // pluck<T>(attribute:string, iter: Iterable<{[attribute]: T}>): WuIterable<T>;
    inline def pluck(attribute: String, iter: Iterable[js.Any]): WuIterable[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(attribute.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[js.Any]]
    
    inline def reduce[T](fn: js.Function2[/* a */ T, /* b */ T, T], initial: T, iter: Iterable[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(fn.asInstanceOf[js.Any], initial.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def reduce[T](fn: js.Function2[/* a */ T, /* b */ T, T], iter: Iterable[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def reduce_TU_U[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], initial: U, iter: Iterable[T]): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(fn.asInstanceOf[js.Any], initial.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[U]
    inline def reduce_TU_U[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], iter: Iterable[T]): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[U]
    
    inline def reductions[T](fn: js.Function2[/* a */ T, /* b */ T, T], initial: T, iter: Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("reductions")(fn.asInstanceOf[js.Any], initial.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
    inline def reductions[T](fn: js.Function2[/* a */ T, /* b */ T, T], iter: Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("reductions")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
    
    inline def reductions_TU[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], initial: U, iter: Iterable[T]): WuIterable[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("reductions")(fn.asInstanceOf[js.Any], initial.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[U]]
    inline def reductions_TU[T, U](fn: js.Function2[/* a */ U, /* b */ T, U], iter: Iterable[T]): WuIterable[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("reductions")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[U]]
    
    inline def reject[T](fn: Filter_[T], iter: Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
    
    inline def repeat[T](obj: T): WuIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(obj.asInstanceOf[js.Any]).asInstanceOf[WuIterable[T]]
    inline def repeat[T](obj: T, times: Double): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(obj.asInstanceOf[js.Any], times.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
    
    inline def slice[T](iter: Iterable[T]): WuIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(iter.asInstanceOf[js.Any]).asInstanceOf[WuIterable[T]]
    inline def slice[T](start: Double, iter: Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
    inline def slice[T](start: Double, stop: Double, iter: Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
    
    inline def some[T](fn: Filter_[T], iter: Iterable[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def spreadMap[T](fn: js.Function1[/* repeated */ js.Any, T], iter: Iterable[js.Array[js.Any]]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("spreadMap")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
    
    inline def take[T](n: Double, iter: Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(n.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
    
    inline def takeWhile[T](fn: Filter_[T], iter: Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
    
    inline def tap[T](fn: Consumer[T], iter: Iterable[T]): WuIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(fn.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[T]]
    
    inline def tee[T](iter: Iterable[T]): js.Array[WuIterable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tee")(iter.asInstanceOf[js.Any]).asInstanceOf[js.Array[WuIterable[T]]]
    inline def tee[T](n: Double, iter: Iterable[T]): js.Array[WuIterable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tee")(n.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[js.Array[WuIterable[T]]]
    
    inline def toArray[T](iter: Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iter.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    inline def unique[T](iter: Iterable[T]): WuIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(iter.asInstanceOf[js.Any]).asInstanceOf[WuIterable[T]]
    
    @JSGlobal("wu.unzip")
    @js.native
    val unzip: js.Any = js.native
    
    inline def values[T](obj: StringDictionary[T]): WuIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[WuIterable[T]]
    
    inline def zip[T, U](iter2: Iterable[T], iter: Iterable[U]): WuIterable[js.Tuple2[T, U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(iter2.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[js.Tuple2[T, U]]]
    
    inline def zipLongest[T, U](iter2: Iterable[T], iter: Iterable[U]): WuIterable[js.Tuple2[T, U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zipLongest")(iter2.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[WuIterable[js.Tuple2[T, U]]]
    
    @JSGlobal("wu.zipWith")
    @js.native
    val zipWith: js.Any = js.native
  }
}
