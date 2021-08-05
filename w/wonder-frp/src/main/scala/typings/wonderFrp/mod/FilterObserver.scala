package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "FilterObserver")
@js.native
class FilterObserver protected ()
  extends typings.wonderFrp.filterObserverMod.FilterObserver {
  def this(
    prevObserver: IObserver,
    predicate: js.Function1[/* value */ js.Any, Boolean],
    source: typings.wonderFrp.streamMod.Stream
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
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typings.wonderFrp.streamMod.Stream], 
      Boolean
    ],
    source: typings.wonderFrp.streamMod.Stream
  ): typings.wonderFrp.filterObserverMod.FilterObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.filterObserverMod.FilterObserver]
}
