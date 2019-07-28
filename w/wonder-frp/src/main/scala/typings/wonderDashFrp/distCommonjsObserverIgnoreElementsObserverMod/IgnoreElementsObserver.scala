package typings.wonderDashFrp.distCommonjsObserverIgnoreElementsObserverMod

import typings.wonderDashFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/IgnoreElementsObserver", "IgnoreElementsObserver")
@js.native
class IgnoreElementsObserver protected () extends Observer {
  def this(currentObserver: IObserver) = this()
  var _currentObserver: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/observer/IgnoreElementsObserver", "IgnoreElementsObserver")
@js.native
object IgnoreElementsObserver extends js.Object {
  def create(currentObserver: IObserver): IgnoreElementsObserver = js.native
}

