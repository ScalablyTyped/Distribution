package typings.xstream

import typings.xstream.mod.InternalListener
import typings.xstream.mod.MemoryStream
import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extraFlattenConcurrentlyMod {
  
  @JSImport("xstream/extra/flattenConcurrently", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](ins: Stream[Stream[T] | MemoryStream[T]]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ins.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
  
  @JSImport("xstream/extra/flattenConcurrently", "FlattenConcOperator")
  @js.native
  open class FlattenConcOperator[T] protected ()
    extends StObject
       with Operator[Stream[T], T] {
    def this(ins: Stream[Stream[T]]) = this()
    
    /* CompleteClass */
    override def _c(): Unit = js.native
    
    /* CompleteClass */
    override def _e(err: Any): Unit = js.native
    
    /* CompleteClass */
    override def _n(v: Stream[T]): Unit = js.native
    
    /* CompleteClass */
    override def _start(listener: InternalListener[T]): Unit = js.native
    /* CompleteClass */
    override def _start(out: Stream[T]): Unit = js.native
    
    /* CompleteClass */
    override def _stop(): Unit = js.native
    
    /* private */ var active: Any = js.native
    
    /* CompleteClass */
    var ins: Stream[Stream[T]] = js.native
    
    def less(): Unit = js.native
    
    /* CompleteClass */
    var out: Stream[T] = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
}
