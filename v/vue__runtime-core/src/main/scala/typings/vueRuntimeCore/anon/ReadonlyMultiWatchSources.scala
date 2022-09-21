package typings.vueRuntimeCore.anon

import typings.std.FlatArray
import typings.std.IterableIterator
import typings.vueRuntimeCore.mod.WatchSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@vue/runtime-core.@vue/runtime-core.MultiWatchSources> */
@js.native
trait ReadonlyMultiWatchSources extends StObject {
  
  def at(index: Double): js.UndefOr[WatchSource[Any] | js.Object] = js.native
  
  def concat(items: (js.Array[WatchSource[Any] | js.Object])*): js.Array[WatchSource[Any] | js.Object] = js.native
  
  def copyWithin(target: Double, start: Double): this.type = js.native
  
  def entries(): IterableIterator[js.Tuple2[Double, WatchSource[Any] | js.Object]] = js.native
  
  def every[S /* <: WatchSource[Any] | js.Object */](
    predicate: js.Function3[
      /* value */ WatchSource[Any] | js.Object, 
      /* index */ Double, 
      /* array */ js.Array[WatchSource[Any] | js.Object], 
      /* is S */ Boolean
    ]
  ): /* is std.Array<S> */ Boolean = js.native
  
  def fill(value: js.Object | WatchSource[Any]): this.type = js.native
  
  def filter[S /* <: WatchSource[Any] | js.Object */](
    predicate: js.Function3[
      /* value */ WatchSource[Any] | js.Object, 
      /* index */ Double, 
      /* array */ js.Array[WatchSource[Any] | js.Object], 
      /* is S */ Boolean
    ]
  ): js.Array[S] = js.native
  
  def find[S /* <: WatchSource[Any] | js.Object */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ WatchSource[Any] | js.Object, 
      /* index */ Double, 
      /* obj */ js.Array[WatchSource[Any] | js.Object], 
      /* is S */ Boolean
    ]
  ): js.UndefOr[S] = js.native
  
  def findIndex(
    predicate: js.Function3[
      /* value */ WatchSource[Any] | js.Object, 
      /* index */ Double, 
      /* obj */ js.Array[WatchSource[Any] | js.Object], 
      Any
    ]
  ): Double = js.native
  
  def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
  
  def flatMap[U, This](
    callback: js.ThisFunction3[
      /* this */ This, 
      /* value */ WatchSource[Any] | js.Object, 
      /* index */ Double, 
      /* array */ js.Array[WatchSource[Any] | js.Object], 
      U | js.Array[U]
    ]
  ): js.Array[U] = js.native
  
  def forEach(
    callbackfn: js.Function3[
      /* value */ WatchSource[Any] | js.Object, 
      /* index */ Double, 
      /* array */ js.Array[WatchSource[Any] | js.Object], 
      Unit
    ]
  ): Unit = js.native
  
  def includes(searchElement: js.Object | WatchSource[Any]): Boolean = js.native
  
  def indexOf(searchElement: js.Object | WatchSource[Any]): Double = js.native
  
  def join(): String = js.native
  
  def keys(): IterableIterator[Double] = js.native
  
  def lastIndexOf(searchElement: js.Object | WatchSource[Any]): Double = js.native
  
  val length: Double = js.native
  
  def map[U](
    callbackfn: js.Function3[
      /* value */ WatchSource[Any] | js.Object, 
      /* index */ Double, 
      /* array */ js.Array[WatchSource[Any] | js.Object], 
      U
    ]
  ): js.Array[U] = js.native
  
  def pop(): js.UndefOr[WatchSource[Any] | js.Object] = js.native
  
  def push(items: (WatchSource[Any] | js.Object)*): Double = js.native
  
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ WatchSource[Any] | js.Object, 
      /* currentValue */ WatchSource[Any] | js.Object, 
      /* currentIndex */ Double, 
      /* array */ js.Array[WatchSource[Any] | js.Object], 
      WatchSource[Any] | js.Object
    ]
  ): WatchSource[Any] | js.Object = js.native
  
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ WatchSource[Any] | js.Object, 
      /* currentValue */ WatchSource[Any] | js.Object, 
      /* currentIndex */ Double, 
      /* array */ js.Array[WatchSource[Any] | js.Object], 
      WatchSource[Any] | js.Object
    ]
  ): WatchSource[Any] | js.Object = js.native
  
  def reverse(): js.Array[WatchSource[Any] | js.Object] = js.native
  
  def shift(): js.UndefOr[WatchSource[Any] | js.Object] = js.native
  
  def slice(): js.Array[WatchSource[Any] | js.Object] = js.native
  
  def some(
    predicate: js.Function3[
      /* value */ WatchSource[Any] | js.Object, 
      /* index */ Double, 
      /* array */ js.Array[WatchSource[Any] | js.Object], 
      Any
    ]
  ): Boolean = js.native
  
  def sort(): this.type = js.native
  
  def splice(start: Double): js.Array[WatchSource[Any] | js.Object] = js.native
  
  def unshift(items: (WatchSource[Any] | js.Object)*): Double = js.native
  
  def values(): IterableIterator[WatchSource[Any] | js.Object] = js.native
}
