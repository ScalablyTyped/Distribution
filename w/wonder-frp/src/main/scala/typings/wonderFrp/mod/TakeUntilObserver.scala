package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "TakeUntilObserver")
@js.native
class TakeUntilObserver protected ()
  extends typings.wonderFrp.takeUntilObserverMod.TakeUntilObserver {
  def this(prevObserver: IObserver) = this()
}
/* static members */
object TakeUntilObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "TakeUntilObserver")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(prevObserver: IObserver): typings.wonderFrp.takeUntilObserverMod.TakeUntilObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.takeUntilObserverMod.TakeUntilObserver]
}
