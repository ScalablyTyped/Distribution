package typings.wonderDashFrp.distCommonjsMod

import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "ConcatObserver")
@js.native
class ConcatObserver protected ()
  extends typings.wonderDashFrp.distCommonjsObserverConcatObserverMod.ConcatObserver {
  def this(currentObserver: IObserver, startNextStream: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "ConcatObserver")
@js.native
object ConcatObserver extends js.Object {
  def create(currentObserver: IObserver, startNextStream: js.Function): typings.wonderDashFrp.distCommonjsObserverConcatObserverMod.ConcatObserver = js.native
}

