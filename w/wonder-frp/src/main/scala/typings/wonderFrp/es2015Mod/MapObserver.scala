package typings.wonderFrp.es2015Mod

import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "MapObserver")
@js.native
class MapObserver protected ()
  extends typings.wonderFrp.observerMapObserverMod.MapObserver {
  def this(currentObserver: IObserver, selector: js.Function) = this()
}
/* static members */
object MapObserver {
  
  @JSImport("wonder-frp/dist/es2015", "MapObserver")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(currentObserver: IObserver, selector: js.Function): typings.wonderFrp.observerMapObserverMod.MapObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.observerMapObserverMod.MapObserver]
}
