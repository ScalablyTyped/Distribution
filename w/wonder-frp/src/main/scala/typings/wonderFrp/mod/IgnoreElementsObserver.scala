package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "IgnoreElementsObserver")
@js.native
class IgnoreElementsObserver protected ()
  extends typings.wonderFrp.ignoreElementsObserverMod.IgnoreElementsObserver {
  def this(currentObserver: IObserver) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "IgnoreElementsObserver")
@js.native
object IgnoreElementsObserver extends js.Object {
  def create(currentObserver: IObserver): typings.wonderFrp.ignoreElementsObserverMod.IgnoreElementsObserver = js.native
}

