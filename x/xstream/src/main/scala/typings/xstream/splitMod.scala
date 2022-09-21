package typings.xstream

import typings.xstream.mod.InternalListener
import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitMod {
  
  @JSImport("xstream/extra/split", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](separator: Stream[Any]): js.Function1[/* ins */ Stream[T], Stream[Stream[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(separator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ins */ Stream[T], Stream[Stream[T]]]]
  
  @JSImport("xstream/extra/split", "SplitOperator")
  @js.native
  open class SplitOperator[T] protected ()
    extends StObject
       with Operator[T, Stream[T]] {
    def this(s: Stream[Any], // s = separator
    ins: Stream[T]) = this()
    
    /* CompleteClass */
    override def _c(): Unit = js.native
    
    /* CompleteClass */
    override def _e(err: Any): Unit = js.native
    
    /* CompleteClass */
    override def _n(v: T): Unit = js.native
    
    /* CompleteClass */
    override def _start(listener: InternalListener[Stream[T]]): Unit = js.native
    /* CompleteClass */
    override def _start(out: Stream[Stream[T]]): Unit = js.native
    
    /* CompleteClass */
    override def _stop(): Unit = js.native
    
    var curr: Stream[T] = js.native
    
    /* CompleteClass */
    var ins: Stream[T] = js.native
    
    /* CompleteClass */
    var out: Stream[Stream[T]] = js.native
    
    var s: Stream[Any] = js.native
    
    /* private */ var sil: Any = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    def up(): Unit = js.native
  }
}
