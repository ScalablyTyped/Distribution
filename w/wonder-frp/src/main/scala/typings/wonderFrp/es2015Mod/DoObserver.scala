package typings.wonderFrp.es2015Mod

import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "DoObserver")
@js.native
open class DoObserver protected ()
  extends typings.wonderFrp.observerDoObserverMod.DoObserver {
  def this(currentObserver: IObserver, prevObserver: IObserver) = this()
}
/* static members */
object DoObserver {
  
  @JSImport("wonder-frp/dist/es2015", "DoObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(currentObserver: IObserver, prevObserver: IObserver): typings.wonderFrp.observerDoObserverMod.DoObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], prevObserver.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.observerDoObserverMod.DoObserver]
}
