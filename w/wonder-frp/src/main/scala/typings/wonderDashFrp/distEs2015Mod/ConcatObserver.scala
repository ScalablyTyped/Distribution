package typings.wonderDashFrp.distEs2015Mod

import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "ConcatObserver")
@js.native
class ConcatObserver protected ()
  extends typings.wonderDashFrp.distEs2015ObserverConcatObserverMod.ConcatObserver {
  def this(currentObserver: IObserver, startNextStream: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "ConcatObserver")
@js.native
object ConcatObserver extends js.Object {
  def create(currentObserver: IObserver, startNextStream: js.Function): typings.wonderDashFrp.distEs2015ObserverConcatObserverMod.ConcatObserver = js.native
}

