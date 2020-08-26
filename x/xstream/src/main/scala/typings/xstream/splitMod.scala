package typings.xstream

import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/split", JSImport.Namespace)
@js.native
object splitMod extends js.Object {
  @js.native
  class SplitOperator[T] protected () extends Operator[T, Stream[T]] {
    def this( // s = separator
    s: Stream[_], ins: Stream[T]) = this()
    var curr: Stream[T] = js.native
    var s: Stream[_] = js.native
    var sil: js.Any = js.native
    def up(): Unit = js.native
  }
  
  def default[T](separator: Stream[_]): js.Function1[/* ins */ Stream[T], Stream[Stream[T]]] = js.native
}

