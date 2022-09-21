package typings.xstream

import typings.xstream.mod.InternalListener
import typings.xstream.mod.MemoryStream
import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flattenConcurrentlyAtMostMod {
  
  @JSImport("xstream/extra/flattenConcurrentlyAtMost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](n: Double): js.Function1[/* ins */ Stream[Stream[T] | MemoryStream[T]], Stream[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ins */ Stream[Stream[T] | MemoryStream[T]], Stream[T]]]
  
  @JSImport("xstream/extra/flattenConcurrentlyAtMost", "FlattenConcAMOperator")
  @js.native
  open class FlattenConcAMOperator[T] protected ()
    extends StObject
       with Operator[Stream[T], T] {
    def this(n: Double, ins: Stream[Stream[T]]) = this()
    
    /* CompleteClass */
    override def _c(): Unit = js.native
    
    /* private */ var _d: Any = js.native
    
    /* CompleteClass */
    override def _e(err: Any): Unit = js.native
    
    /* private */ var _l: Any = js.native
    
    /* CompleteClass */
    override def _n(v: Stream[T]): Unit = js.native
    
    /* private */ var _seq: Any = js.native
    
    /* CompleteClass */
    override def _start(listener: InternalListener[T]): Unit = js.native
    /* CompleteClass */
    override def _start(out: Stream[T]): Unit = js.native
    
    /* CompleteClass */
    override def _stop(): Unit = js.native
    
    /* CompleteClass */
    var ins: Stream[Stream[T]] = js.native
    
    def less(): Unit = js.native
    
    var n: Double = js.native
    
    /* CompleteClass */
    var out: Stream[T] = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
}
