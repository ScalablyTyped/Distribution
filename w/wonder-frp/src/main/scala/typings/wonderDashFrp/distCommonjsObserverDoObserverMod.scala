package typings.wonderDashFrp

import typings.wonderDashFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderDashFrp.distCommonjsObserverDoObserverMod.DoObserver
import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/DoObserver", JSImport.Namespace)
@js.native
object distCommonjsObserverDoObserverMod extends js.Object {
  @js.native
  class DoObserver protected () extends Observer {
    def this(currentObserver: IObserver, prevObserver: IObserver) = this()
    var _currentObserver: js.Any = js.native
    var _prevObserver: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object DoObserver extends js.Object {
    def create(currentObserver: IObserver, prevObserver: IObserver): DoObserver = js.native
  }
  
}

