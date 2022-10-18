package typings.wonderFrp

import typings.wonderFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderFrp.distCommonjsCoreStreamMod.Stream
import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import typings.wonderFrp.distCommonjsStreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsStreamFilterStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/FilterStream", "FilterStream")
  @js.native
  open class FilterStream protected () extends BaseStream {
    def this(
      source: Stream,
      predicate: js.Function3[
            /* value */ Any, 
            /* index */ js.UndefOr[Double], 
            /* source */ js.UndefOr[Stream], 
            Boolean
          ],
      thisArg: Any
    ) = this()
    
    /* private */ def _innerPredicate(predicate: Any, self: Any): Any = js.native
    
    /* private */ var _source: Any = js.native
    
    /* protected */ def createObserver(observer: IObserver): Observer = js.native
    
    /* protected */ def createStreamForInternalFilter(source: Stream, innerPredicate: Any, thisArg: Any): Stream = js.native
    
    def internalFilter(
      predicate: js.Function3[
          /* value */ Any, 
          /* index */ js.UndefOr[Double], 
          /* source */ js.UndefOr[Stream], 
          Boolean
        ],
      thisArg: Any
    ): Stream = js.native
    
    def predicate(value: Any): Boolean = js.native
    def predicate(value: Any, index: Double): Boolean = js.native
    def predicate(value: Any, index: Double, source: Stream): Boolean = js.native
    def predicate(value: Any, index: Unit, source: Stream): Boolean = js.native
  }
  /* static members */
  object FilterStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/FilterStream", "FilterStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(
      source: Stream,
      predicate: js.Function3[
          /* value */ Any, 
          /* index */ js.UndefOr[Double], 
          /* source */ js.UndefOr[Stream], 
          Boolean
        ],
      thisArg: Any
    ): FilterStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[FilterStream]
  }
}
