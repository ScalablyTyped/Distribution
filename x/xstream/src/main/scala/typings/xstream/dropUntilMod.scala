package typings.xstream

import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropUntilMod {
  
  @JSImport("xstream/extra/dropUntil", JSImport.Default)
  @js.native
  def default[T](other: Stream[_]): js.Function1[/* ins */ Stream[T], Stream[T]] = js.native
  
  @JSImport("xstream/extra/dropUntil", "DropUntilOperator")
  @js.native
  class DropUntilOperator[T] protected () extends Operator[T, T] {
    def this(o: Stream[_], // o = other
    ins: Stream[T]) = this()
    
    var o: Stream[_] = js.native
    
    var oil: js.Any = js.native
    
    var on: js.Any = js.native
    
    def up(): Unit = js.native
  }
}
