package typings
package wonderDashFrpLib.distCommonjsObserverTakeUntilObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/TakeUntilObserver", "TakeUntilObserver")
@js.native
class TakeUntilObserver protected ()
  extends wonderDashFrpLib.distCommonjsCoreObserverMod.Observer {
  def this(prevObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver) = this()
  var _prevObserver: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/observer/TakeUntilObserver", "TakeUntilObserver")
@js.native
object TakeUntilObserver extends js.Object {
  def create(prevObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver): wonderDashFrpLib.distCommonjsObserverTakeUntilObserverMod.TakeUntilObserver = js.native
}

