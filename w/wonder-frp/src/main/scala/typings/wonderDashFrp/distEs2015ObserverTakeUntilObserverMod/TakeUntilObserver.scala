package typings.wonderDashFrp.distEs2015ObserverTakeUntilObserverMod

import typings.wonderDashFrp.distEs2015CoreObserverMod.Observer
import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/TakeUntilObserver", "TakeUntilObserver")
@js.native
class TakeUntilObserver protected () extends Observer {
  def this(prevObserver: IObserver) = this()
  var _prevObserver: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/observer/TakeUntilObserver", "TakeUntilObserver")
@js.native
object TakeUntilObserver extends js.Object {
  def create(prevObserver: IObserver): TakeUntilObserver = js.native
}

