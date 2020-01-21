package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/AutoDetachObserver", JSImport.Namespace)
@js.native
object observerAutoDetachObserverMod extends js.Object {
  @js.native
  class AutoDetachObserver () extends Observer
  
  /* static members */
  @js.native
  object AutoDetachObserver extends js.Object {
    def create(observer: IObserver): js.Any = js.native
    def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): js.Any = js.native
  }
  
}

