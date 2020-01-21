package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "DoObserver")
@js.native
class DoObserver protected ()
  extends typings.wonderFrp.doObserverMod.DoObserver {
  def this(currentObserver: IObserver, prevObserver: IObserver) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "DoObserver")
@js.native
object DoObserver extends js.Object {
  def create(currentObserver: IObserver, prevObserver: IObserver): typings.wonderFrp.doObserverMod.DoObserver = js.native
}

