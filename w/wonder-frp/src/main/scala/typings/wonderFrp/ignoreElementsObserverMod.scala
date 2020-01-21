package typings.wonderFrp

import typings.wonderFrp.iobserverMod.IObserver
import typings.wonderFrp.observerMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/IgnoreElementsObserver", JSImport.Namespace)
@js.native
object ignoreElementsObserverMod extends js.Object {
  @js.native
  class IgnoreElementsObserver protected () extends Observer {
    def this(currentObserver: IObserver) = this()
    var _currentObserver: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object IgnoreElementsObserver extends js.Object {
    def create(currentObserver: IObserver): IgnoreElementsObserver = js.native
  }
  
}

