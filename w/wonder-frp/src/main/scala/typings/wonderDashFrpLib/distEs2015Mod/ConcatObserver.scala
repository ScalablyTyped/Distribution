package typings
package wonderDashFrpLib.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "ConcatObserver")
@js.native
class ConcatObserver protected ()
  extends wonderDashFrpLib.distEs2015ObserverConcatObserverMod.ConcatObserver {
  def this(currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver, startNextStream: js.Function) = this()
}

@JSImport("wonder-frp/dist/es2015", "ConcatObserver")
@js.native
object ConcatObserver extends js.Object {
  def create(
    currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver,
    startNextStream: js.Function
  ): wonderDashFrpLib.distEs2015ObserverConcatObserverMod.ConcatObserver = js.native
}

