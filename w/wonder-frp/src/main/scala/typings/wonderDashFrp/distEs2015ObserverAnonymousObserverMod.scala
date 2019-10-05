package typings.wonderDashFrp

import typings.wonderDashFrp.distEs2015CoreObserverMod.Observer
import typings.wonderDashFrp.distEs2015ObserverAnonymousObserverMod.AnonymousObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/AnonymousObserver", JSImport.Namespace)
@js.native
object distEs2015ObserverAnonymousObserverMod extends js.Object {
  @js.native
  class AnonymousObserver () extends Observer
  
  /* static members */
  @js.native
  object AnonymousObserver extends js.Object {
    def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): AnonymousObserver = js.native
  }
  
}

