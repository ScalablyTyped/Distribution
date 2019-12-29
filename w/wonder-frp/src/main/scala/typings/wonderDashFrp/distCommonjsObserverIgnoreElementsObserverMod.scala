package typings.wonderDashFrp

import typings.wonderDashFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/IgnoreElementsObserver", JSImport.Namespace)
@js.native
object distCommonjsObserverIgnoreElementsObserverMod extends js.Object {
  @js.native
  class IgnoreElementsObserver protected () extends Observer {
    def this(currentObserver: IObserver) = this()
    var _currentObserver: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object IgnoreElementsObserver extends js.Object {
    def create(currentObserver: IObserver): IgnoreElementsObserver = js.native
  }
  
}

