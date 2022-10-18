package typings.wonderFrp.distCommonjsMod

import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "DoObserver")
@js.native
open class DoObserver protected ()
  extends typings.wonderFrp.distCommonjsObserverDoObserverMod.DoObserver {
  def this(currentObserver: IObserver, prevObserver: IObserver) = this()
}
/* static members */
object DoObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "DoObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(currentObserver: IObserver, prevObserver: IObserver): typings.wonderFrp.distCommonjsObserverDoObserverMod.DoObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], prevObserver.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsObserverDoObserverMod.DoObserver]
}
