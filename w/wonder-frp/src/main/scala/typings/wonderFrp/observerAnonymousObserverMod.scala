package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/AnonymousObserver", JSImport.Namespace)
@js.native
object observerAnonymousObserverMod extends js.Object {
  @js.native
  class AnonymousObserver () extends Observer
  
  /* static members */
  @js.native
  object AnonymousObserver extends js.Object {
    def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): AnonymousObserver = js.native
  }
  
}

