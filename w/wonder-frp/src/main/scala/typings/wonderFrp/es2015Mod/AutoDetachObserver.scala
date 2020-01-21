package typings.wonderFrp.es2015Mod

import typings.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "AutoDetachObserver")
@js.native
class AutoDetachObserver ()
  extends typings.wonderFrp.observerAutoDetachObserverMod.AutoDetachObserver

/* static members */
@JSImport("wonder-frp/dist/es2015", "AutoDetachObserver")
@js.native
object AutoDetachObserver extends js.Object {
  def create(observer: IObserver): js.Any = js.native
  def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): js.Any = js.native
}

