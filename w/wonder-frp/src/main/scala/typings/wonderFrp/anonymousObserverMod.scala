package typings.wonderFrp

import typings.wonderFrp.observerMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/AnonymousObserver", JSImport.Namespace)
@js.native
object anonymousObserverMod extends js.Object {
  @js.native
  class AnonymousObserver () extends Observer
  
  /* static members */
  @js.native
  object AnonymousObserver extends js.Object {
    def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): AnonymousObserver = js.native
  }
  
}

