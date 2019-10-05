package typings.wonderDashFrp

import typings.wonderDashFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/AutoDetachObserver", JSImport.Namespace)
@js.native
object distCommonjsObserverAutoDetachObserverMod extends js.Object {
  @js.native
  class AutoDetachObserver () extends Observer
  
  /* static members */
  @js.native
  object AutoDetachObserver extends js.Object {
    def create(observer: IObserver): js.Any = js.native
    def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): js.Any = js.native
  }
  
}

