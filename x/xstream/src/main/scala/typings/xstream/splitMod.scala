package typings.xstream

import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitMod {
  
  @JSImport("xstream/extra/split", JSImport.Default)
  @js.native
  def default[T](separator: Stream[_]): js.Function1[/* ins */ Stream[T], Stream[Stream[T]]] = js.native
  
  @JSImport("xstream/extra/split", "SplitOperator")
  @js.native
  class SplitOperator[T] protected () extends Operator[T, Stream[T]] {
    def this(s: Stream[_], // s = separator
    ins: Stream[T]) = this()
    
    var curr: Stream[T] = js.native
    
    var s: Stream[_] = js.native
    
    var sil: js.Any = js.native
    
    def up(): Unit = js.native
  }
}
