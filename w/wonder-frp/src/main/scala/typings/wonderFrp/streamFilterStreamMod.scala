package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.coreStreamMod.Stream
import typings.wonderFrp.observerIobserverMod.IObserver
import typings.wonderFrp.streamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamFilterStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/FilterStream", "FilterStream")
  @js.native
  class FilterStream protected () extends BaseStream {
    def this(
      source: Stream,
      predicate: js.Function3[
            /* value */ js.Any, 
            /* index */ js.UndefOr[Double], 
            /* source */ js.UndefOr[Stream], 
            Boolean
          ],
      thisArg: js.Any
    ) = this()
    
    /* private */ def _innerPredicate(predicate: js.Any, self: js.Any): js.Any = js.native
    
    /* private */ var _source: js.Any = js.native
    
    /* protected */ def createObserver(observer: IObserver): Observer = js.native
    
    /* protected */ def createStreamForInternalFilter(source: Stream, innerPredicate: js.Any, thisArg: js.Any): Stream = js.native
    
    def internalFilter(
      predicate: js.Function3[
          /* value */ js.Any, 
          /* index */ js.UndefOr[Double], 
          /* source */ js.UndefOr[Stream], 
          Boolean
        ],
      thisArg: js.Any
    ): Stream = js.native
    
    def predicate(value: js.Any): Boolean = js.native
    def predicate(value: js.Any, index: Double): Boolean = js.native
    def predicate(value: js.Any, index: Double, source: Stream): Boolean = js.native
    def predicate(value: js.Any, index: Unit, source: Stream): Boolean = js.native
  }
  /* static members */
  object FilterStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/FilterStream", "FilterStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(
      source: Stream,
      predicate: js.Function3[
          /* value */ js.Any, 
          /* index */ js.UndefOr[Double], 
          /* source */ js.UndefOr[Stream], 
          Boolean
        ],
      thisArg: js.Any
    ): FilterStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[FilterStream]
  }
}
