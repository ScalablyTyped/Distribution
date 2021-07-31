package typings.wonderFrp.es2015Mod

import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "FilterObserver")
@js.native
class FilterObserver protected ()
  extends typings.wonderFrp.observerFilterObserverMod.FilterObserver {
  def this(
    prevObserver: IObserver,
    predicate: js.Function1[/* value */ js.Any, Boolean],
    source: typings.wonderFrp.coreStreamMod.Stream
  ) = this()
}
/* static members */
object FilterObserver {
  
  @JSImport("wonder-frp/dist/es2015", "FilterObserver")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(
    prevObserver: IObserver,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typings.wonderFrp.coreStreamMod.Stream], 
      Boolean
    ],
    source: typings.wonderFrp.coreStreamMod.Stream
  ): typings.wonderFrp.observerFilterObserverMod.FilterObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.observerFilterObserverMod.FilterObserver]
}
