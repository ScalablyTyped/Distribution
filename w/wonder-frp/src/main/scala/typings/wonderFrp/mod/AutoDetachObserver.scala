package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "AutoDetachObserver")
@js.native
class AutoDetachObserver ()
  extends typings.wonderFrp.autoDetachObserverMod.AutoDetachObserver

/* static members */
@JSImport("wonder-frp/dist/commonjs", "AutoDetachObserver")
@js.native
object AutoDetachObserver extends js.Object {
  def create(observer: IObserver): js.Any = js.native
  def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): js.Any = js.native
}

