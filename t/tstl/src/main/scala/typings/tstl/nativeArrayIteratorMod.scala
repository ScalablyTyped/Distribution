package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/iterator/disposable/NativeArrayIterator", JSImport.Namespace)
@js.native
object nativeArrayIteratorMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {readonly [ P in keyof tstl.tstl/iterator/IForwardIterator.IForwardIterator<T, tstl.tstl/internal/iterator/disposable/NativeArrayIterator.NativeArrayIterator<T>> ]: tstl.tstl/iterator/IForwardIterator.IForwardIterator<T, tstl.tstl/internal/iterator/disposable/NativeArrayIterator.NativeArrayIterator<T>>[P]} */ @js.native
  class NativeArrayIterator[T] protected () extends js.Object {
    def this(data: js.Array[T], index: Double) = this()
    var data_ : js.Any = js.native
    var index_ : js.Any = js.native
    def advance(n: Double): NativeArrayIterator[T] = js.native
    def equals(obj: NativeArrayIterator[T]): Boolean = js.native
    def index(): Double = js.native
    def next(): NativeArrayIterator[T] = js.native
    def prev(): NativeArrayIterator[T] = js.native
    def swap(obj: NativeArrayIterator[T]): Unit = js.native
    def value: T = js.native
  }
  
}

