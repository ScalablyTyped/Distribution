package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MapObserver")
@js.native
class MapObserver protected ()
  extends typings.wonderFrp.mapObserverMod.MapObserver {
  def this(currentObserver: IObserver, selector: js.Function) = this()
}
/* static members */
object MapObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "MapObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(currentObserver: IObserver, selector: js.Function): typings.wonderFrp.mapObserverMod.MapObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.mapObserverMod.MapObserver]
}
