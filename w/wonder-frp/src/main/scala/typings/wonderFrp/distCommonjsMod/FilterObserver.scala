package typings.wonderFrp.distCommonjsMod

import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "FilterObserver")
@js.native
open class FilterObserver protected ()
  extends typings.wonderFrp.distCommonjsObserverFilterObserverMod.FilterObserver {
  def this(
    prevObserver: IObserver,
    predicate: js.Function1[/* value */ Any, Boolean],
    source: typings.wonderFrp.distCommonjsCoreStreamMod.Stream
  ) = this()
}
/* static members */
object FilterObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "FilterObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    prevObserver: IObserver,
    predicate: js.Function3[
      /* value */ Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typings.wonderFrp.distCommonjsCoreStreamMod.Stream], 
      Boolean
    ],
    source: typings.wonderFrp.distCommonjsCoreStreamMod.Stream
  ): typings.wonderFrp.distCommonjsObserverFilterObserverMod.FilterObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsObserverFilterObserverMod.FilterObserver]
}
