package typings.xstream

import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/dropRepeats", JSImport.Namespace)
@js.native
object dropRepeatsMod extends js.Object {
  @js.native
  class DropRepeatsOperator[T] protected () extends Operator[T, T] {
    def this(ins: Stream[T]) = this()
    def this(ins: Stream[T], fn: js.Function2[/* x */ T, /* y */ T, Boolean]) = this()
    var v: js.Any = js.native
    def isEq(x: T, y: T): Boolean = js.native
  }
  
  def default[T](): js.Function1[/* ins */ Stream[T], Stream[T]] = js.native
  def default[T](isEqual: js.Function2[/* x */ T, /* y */ T, Boolean]): js.Function1[/* ins */ Stream[T], Stream[T]] = js.native
}

