package typings.xstream

import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstream/extra/dropUntil", JSImport.Namespace)
@js.native
object dropUntilMod extends js.Object {
  
  def default[T](other: Stream[_]): js.Function1[/* ins */ Stream[T], Stream[T]] = js.native
  
  @js.native
  class DropUntilOperator[T] protected () extends Operator[T, T] {
    def this( // o = other
    o: Stream[_], ins: Stream[T]) = this()
    
    var o: Stream[_] = js.native
    
    var oil: js.Any = js.native
    
    var on: js.Any = js.native
    
    def up(): Unit = js.native
  }
}
