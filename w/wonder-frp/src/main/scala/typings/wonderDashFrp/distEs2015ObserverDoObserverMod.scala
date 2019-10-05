package typings.wonderDashFrp

import typings.wonderDashFrp.distEs2015CoreObserverMod.Observer
import typings.wonderDashFrp.distEs2015ObserverDoObserverMod.DoObserver
import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/DoObserver", JSImport.Namespace)
@js.native
object distEs2015ObserverDoObserverMod extends js.Object {
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

