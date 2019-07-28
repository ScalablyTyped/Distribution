package typings.wonderDashFrp.distEs2015ObserverAutoDetachObserverMod

import typings.wonderDashFrp.distEs2015CoreObserverMod.Observer
import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/AutoDetachObserver", "AutoDetachObserver")
@js.native
class AutoDetachObserver () extends Observer

/* static members */
@JSImport("wonder-frp/dist/es2015/observer/AutoDetachObserver", "AutoDetachObserver")
@js.native
object AutoDetachObserver extends js.Object {
  def create(observer: IObserver): js.Any = js.native
  def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): js.Any = js.native
}

