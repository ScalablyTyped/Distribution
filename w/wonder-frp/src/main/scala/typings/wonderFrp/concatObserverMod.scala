package typings.wonderFrp

import typings.wonderFrp.iobserverMod.IObserver
import typings.wonderFrp.observerMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/ConcatObserver", JSImport.Namespace)
@js.native
object concatObserverMod extends js.Object {
  @js.native
  class ConcatObserver protected () extends Observer {
    def this(currentObserver: IObserver, startNextStream: js.Function) = this()
    var _startNextStream: js.Any = js.native
    var currentObserver: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ConcatObserver extends js.Object {
    def create(currentObserver: IObserver, startNextStream: js.Function): ConcatObserver = js.native
  }
  
}

