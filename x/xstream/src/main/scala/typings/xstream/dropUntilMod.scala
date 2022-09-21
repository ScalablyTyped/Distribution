package typings.xstream

import typings.xstream.mod.InternalListener
import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropUntilMod {
  
  @JSImport("xstream/extra/dropUntil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](other: Stream[Any]): js.Function1[/* ins */ Stream[T], Stream[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(other.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ins */ Stream[T], Stream[T]]]
  
  @JSImport("xstream/extra/dropUntil", "DropUntilOperator")
  @js.native
  open class DropUntilOperator[T] protected ()
    extends StObject
       with Operator[T, T] {
    def this(o: Stream[Any], // o = other
    ins: Stream[T]) = this()
    
    /* CompleteClass */
    override def _c(): Unit = js.native
    
    /* CompleteClass */
    override def _e(err: Any): Unit = js.native
    
    /* CompleteClass */
    override def _n(v: T): Unit = js.native
    
    /* CompleteClass */
    override def _start(listener: InternalListener[T]): Unit = js.native
    /* CompleteClass */
    override def _start(out: Stream[T]): Unit = js.native
    
    /* CompleteClass */
    override def _stop(): Unit = js.native
    
    /* CompleteClass */
    var ins: Stream[T] = js.native
    
    var o: Stream[Any] = js.native
    
    /* private */ var oil: Any = js.native
    
    /* private */ var on: Any = js.native
    
    /* CompleteClass */
    var out: Stream[T] = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    def up(): Unit = js.native
  }
}
