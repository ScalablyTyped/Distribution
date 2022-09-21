package typings.wonderFrp.es2015Mod

import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "TakeUntilObserver")
@js.native
open class TakeUntilObserver protected ()
  extends typings.wonderFrp.observerTakeUntilObserverMod.TakeUntilObserver {
  def this(prevObserver: IObserver) = this()
}
/* static members */
object TakeUntilObserver {
  
  @JSImport("wonder-frp/dist/es2015", "TakeUntilObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(prevObserver: IObserver): typings.wonderFrp.observerTakeUntilObserverMod.TakeUntilObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.observerTakeUntilObserverMod.TakeUntilObserver]
}
