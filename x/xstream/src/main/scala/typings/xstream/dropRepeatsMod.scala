package typings.xstream

import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropRepeatsMod {
  
  @JSImport("xstream/extra/dropRepeats", JSImport.Default)
  @js.native
  def default[T](): js.Function1[/* ins */ Stream[T], Stream[T]] = js.native
  @JSImport("xstream/extra/dropRepeats", JSImport.Default)
  @js.native
  def default[T](isEqual: js.Function2[/* x */ T, /* y */ T, Boolean]): js.Function1[/* ins */ Stream[T], Stream[T]] = js.native
  
  @JSImport("xstream/extra/dropRepeats", "DropRepeatsOperator")
  @js.native
  class DropRepeatsOperator[T] protected () extends Operator[T, T] {
    def this(ins: Stream[T]) = this()
    def this(ins: Stream[T], fn: js.Function2[/* x */ T, /* y */ T, Boolean]) = this()
    
    def isEq(x: T, y: T): Boolean = js.native
    
    var v: js.Any = js.native
  }
}
