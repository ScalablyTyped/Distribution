package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/iterator/disposable/Repeater", JSImport.Namespace)
@js.native
object repeaterMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {readonly [ P in keyof tstl.tstl/iterator/IForwardIterator.IForwardIterator<T, tstl.tstl/internal/iterator/disposable/Repeater.Repeater<T>> ]: tstl.tstl/iterator/IForwardIterator.IForwardIterator<T, tstl.tstl/internal/iterator/disposable/Repeater.Repeater<T>>[P]} */ @js.native
  class Repeater[T] protected () extends js.Object {
    def this(index: Double) = this()
    def this(index: Double, value: T) = this()
    var index_ : js.Any = js.native
    var value_ : js.Any = js.native
    def equals(obj: Repeater[T]): Boolean = js.native
    def index(): Double = js.native
    def next(): Repeater[T] = js.native
    def value(): T = js.native
  }
  
}

