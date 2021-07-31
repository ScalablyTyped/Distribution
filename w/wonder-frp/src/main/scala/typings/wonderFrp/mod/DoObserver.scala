package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "DoObserver")
@js.native
class DoObserver protected ()
  extends typings.wonderFrp.doObserverMod.DoObserver {
  def this(currentObserver: IObserver, prevObserver: IObserver) = this()
}
/* static members */
object DoObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "DoObserver")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(currentObserver: IObserver, prevObserver: IObserver): typings.wonderFrp.doObserverMod.DoObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], prevObserver.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.doObserverMod.DoObserver]
}
