package typings.xstream

import typings.xstream.mod.InternalListener
import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extraDropRepeatsMod {
  
  @JSImport("xstream/extra/dropRepeats", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): js.Function1[/* ins */ Stream[T], Stream[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* ins */ Stream[T], Stream[T]]]
  inline def default[T](isEqual: js.Function2[/* x */ T, /* y */ T, Boolean]): js.Function1[/* ins */ Stream[T], Stream[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(isEqual.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ins */ Stream[T], Stream[T]]]
  
  @JSImport("xstream/extra/dropRepeats", "DropRepeatsOperator")
  @js.native
  open class DropRepeatsOperator[T] protected ()
    extends StObject
       with Operator[T, T] {
    def this(ins: Stream[T]) = this()
    def this(ins: Stream[T], fn: js.Function2[/* x */ T, /* y */ T, Boolean]) = this()
    
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
    
    def isEq(x: T, y: T): Boolean = js.native
    
    /* CompleteClass */
    var out: Stream[T] = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* private */ var v: Any = js.native
  }
}
