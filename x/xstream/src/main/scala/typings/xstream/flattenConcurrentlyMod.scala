package typings.xstream

import typings.xstream.mod.MemoryStream
import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flattenConcurrentlyMod {
  
  @JSImport("xstream/extra/flattenConcurrently", JSImport.Default)
  @js.native
  def default[T](ins: Stream[Stream[T] | MemoryStream[T]]): Stream[T] = js.native
  
  @JSImport("xstream/extra/flattenConcurrently", "FlattenConcOperator")
  @js.native
  class FlattenConcOperator[T] protected () extends Operator[Stream[T], T] {
    def this(ins: Stream[Stream[T]]) = this()
    
    var active: js.Any = js.native
    
    def less(): Unit = js.native
  }
}
