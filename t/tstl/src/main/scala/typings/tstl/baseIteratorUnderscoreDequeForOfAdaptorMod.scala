package typings.tstl

import typings.std.IterableIterator
import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/iterator/_DequeForOfAdaptor", JSImport.Namespace)
@js.native
object baseIteratorUnderscoreDequeForOfAdaptorMod extends js.Object {
  @js.native
  class _DequeForOfAdaptor[T] protected () extends IterableIterator[T] {
    def this(matrix: js.Array[js.Array[T]]) = this()
    var col_ : js.Any = js.native
    var matrix_ : js.Any = js.native
    var row_ : js.Any = js.native
    def next(): IteratorResult[T, _] = js.native
  }
  
}

