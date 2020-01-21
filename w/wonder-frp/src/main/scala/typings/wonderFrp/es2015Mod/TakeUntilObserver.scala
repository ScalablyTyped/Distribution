package typings.wonderFrp.es2015Mod

import typings.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "TakeUntilObserver")
@js.native
class TakeUntilObserver protected ()
  extends typings.wonderFrp.observerTakeUntilObserverMod.TakeUntilObserver {
  def this(prevObserver: IObserver) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "TakeUntilObserver")
@js.native
object TakeUntilObserver extends js.Object {
  def create(prevObserver: IObserver): typings.wonderFrp.observerTakeUntilObserverMod.TakeUntilObserver = js.native
}

