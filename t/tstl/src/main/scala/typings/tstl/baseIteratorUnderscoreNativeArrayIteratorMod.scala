package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/iterator/_NativeArrayIterator", JSImport.Namespace)
@js.native
object baseIteratorUnderscoreNativeArrayIteratorMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {readonly [ P in keyof tstl.tstl/iterator/IForwardIterator.IForwardIterator<T, tstl.tstl/base/iterator/_NativeArrayIterator._NativeArrayIterator<T>> ]: tstl.tstl/iterator/IForwardIterator.IForwardIterator<T, tstl.tstl/base/iterator/_NativeArrayIterator._NativeArrayIterator<T>>[P]} */ @js.native
  class _NativeArrayIterator[T] protected () extends js.Object {
    def this(data: js.Array[T], index: Double) = this()
    var data_ : js.Any = js.native
    var index_ : js.Any = js.native
    def advance(n: Double): _NativeArrayIterator[T] = js.native
    def equals(obj: _NativeArrayIterator[T]): Boolean = js.native
    def index(): Double = js.native
    def next(): _NativeArrayIterator[T] = js.native
    def prev(): _NativeArrayIterator[T] = js.native
    def swap(obj: _NativeArrayIterator[T]): Unit = js.native
    def value(): T = js.native
  }
  
}

