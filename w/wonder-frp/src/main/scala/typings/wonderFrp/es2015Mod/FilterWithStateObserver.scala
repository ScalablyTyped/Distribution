package typings.wonderFrp.es2015Mod

import typings.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "FilterWithStateObserver")
@js.native
class FilterWithStateObserver ()
  extends typings.wonderFrp.observerFilterWithStateObserverMod.FilterWithStateObserver

/* static members */
@JSImport("wonder-frp/dist/es2015", "FilterWithStateObserver")
@js.native
object FilterWithStateObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typings.wonderFrp.coreStreamMod.Stream], 
      Boolean
    ],
    source: typings.wonderFrp.coreStreamMod.Stream
  ): typings.wonderFrp.observerFilterWithStateObserverMod.FilterWithStateObserver = js.native
}

