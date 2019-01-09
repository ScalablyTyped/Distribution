package typings
package wonderDashFrpLib.distEs2015ObserverConcatObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/ConcatObserver", "ConcatObserver")
@js.native
class ConcatObserver protected ()
  extends wonderDashFrpLib.distEs2015CoreObserverMod.Observer {
  def this(currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver, startNextStream: js.Function) = this()
  var _startNextStream: js.Any = js.native
  var currentObserver: js.Any = js.native
}

@JSImport("wonder-frp/dist/es2015/observer/ConcatObserver", "ConcatObserver")
@js.native
object ConcatObserver extends js.Object {
  def create(
    currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver,
    startNextStream: js.Function
  ): wonderDashFrpLib.distEs2015ObserverConcatObserverMod.ConcatObserver = js.native
}

