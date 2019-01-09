package typings
package wonderDashFrpLib.distCommonjsObserverConcatObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/ConcatObserver", "ConcatObserver")
@js.native
class ConcatObserver protected ()
  extends wonderDashFrpLib.distCommonjsCoreObserverMod.Observer {
  def this(currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver, startNextStream: js.Function) = this()
  var _startNextStream: js.Any = js.native
  var currentObserver: js.Any = js.native
}

@JSImport("wonder-frp/dist/commonjs/observer/ConcatObserver", "ConcatObserver")
@js.native
object ConcatObserver extends js.Object {
  def create(
    currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    startNextStream: js.Function
  ): wonderDashFrpLib.distCommonjsObserverConcatObserverMod.ConcatObserver = js.native
}

