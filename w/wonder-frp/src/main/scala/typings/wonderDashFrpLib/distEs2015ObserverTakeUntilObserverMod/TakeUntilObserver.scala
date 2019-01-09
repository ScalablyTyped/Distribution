package typings
package wonderDashFrpLib.distEs2015ObserverTakeUntilObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/TakeUntilObserver", "TakeUntilObserver")
@js.native
class TakeUntilObserver protected ()
  extends wonderDashFrpLib.distEs2015CoreObserverMod.Observer {
  def this(prevObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver) = this()
  var _prevObserver: js.Any = js.native
}

@JSImport("wonder-frp/dist/es2015/observer/TakeUntilObserver", "TakeUntilObserver")
@js.native
object TakeUntilObserver extends js.Object {
  def create(prevObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver): wonderDashFrpLib.distEs2015ObserverTakeUntilObserverMod.TakeUntilObserver = js.native
}

